package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class keliling_segitiga extends AppCompatActivity {
    EditText a,t,m;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_segitiga);

        a = (EditText)findViewById(R.id.Et_alas);
        t = (EditText)findViewById(R.id.Et_tinggi);
        m = (EditText)findViewById(R.id.Et_sisimiring);
        hitung = (Button) findViewById(R.id.btn_keliling_segitiga);
        hasil = (TextView)findViewById(R.id.hsl_keliling_segitiga);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //jika tidak mengisi panjang dan lebar sekaligus maka akan tampil notifikasi
                if(a.length()==0 && t.length()==0 && m.length()==0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (a.length()==0){
                    Toast.makeText(getApplication(),"Alas tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (t.length()==0){
                    Toast.makeText(getApplication(),"Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi jika sisi miring tidak diisi
                else if (m.length()==0){
                    Toast.makeText(getApplication(),"Sisi Miring tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String alas = a.getText().toString();
                    String tinggi = t.getText().toString();
                    String miring = m.getText().toString();
                    double a = Double.parseDouble(alas);
                    double t = Double.parseDouble(tinggi);
                    double m = Double.parseDouble(miring);
                    double hs = KelilingSegitiga(a,t,m);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double KelilingSegitiga(double a, double t, double m){return a+t+m;}
}
