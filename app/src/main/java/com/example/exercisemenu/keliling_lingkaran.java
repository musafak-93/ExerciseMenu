package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class keliling_lingkaran extends AppCompatActivity {

    EditText jari;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_lingkaran);

        jari = (EditText) findViewById(R.id.Et_keliling_jari);
        hitung = (Button) findViewById(R.id.btn_klingkaran);
        hasil = (TextView) findViewById(R.id.hsl_keliling_lingkaran);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jari.length()==0){
                    Toast.makeText(getApplication(),"Jari-jari tidak boleh kosong",
                            Toast.LENGTH_LONG).show();
                }else {
                    String j = jari.getText().toString();
                    double jari = Double.parseDouble(j);
                    double hs = KelilingLingkaran(jari);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double KelilingLingkaran(double jari) {return 2*3.14*jari;}
}
