package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class luas_persegi extends AppCompatActivity {

    EditText s;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi);

        s=(EditText)findViewById(R.id.Et_sisi);
        hitung = (Button)findViewById(R.id.btn_luas_persegi);
        hasil = (TextView)findViewById(R.id.hsl_luas_persegi);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //notifikasi jika s tidak diisi
                if(s.length()==0){
                    Toast.makeText(getApplication(),"Sisi tidak boleh kosong",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    String sisi = s.getText().toString();
                    double s = Double.parseDouble(sisi);
                    double hs = LuasPersegi(s);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double LuasPersegi(double s) {return s*s;}
}
