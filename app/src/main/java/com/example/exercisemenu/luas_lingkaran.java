package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class luas_lingkaran extends AppCompatActivity {

    EditText jari;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);

        jari = (EditText) findViewById(R.id.Et_jari);
        hitung = (Button) findViewById(R.id.btn_luas_lingkaran);
        hasil = (TextView) findViewById(R.id.hsl_luas_lingkaran);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jari.length()==0){
                    Toast.makeText(getApplication(),"Jari-jari tidak boleh kosong",
                            Toast.LENGTH_LONG).show();
                }else {
                    String j = jari.getText().toString();
                    double jari = Double.parseDouble(j);
                    double hs = LuasLingkaran(jari);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double LuasLingkaran(double jari) {return 3.14*jari*jari;}
}
