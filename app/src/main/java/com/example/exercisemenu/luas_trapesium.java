package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class luas_trapesium extends AppCompatActivity {

    EditText ab,ef,t;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_trapesium);

        ab = (EditText)findViewById(R.id.Et_ab);
        ef = (EditText)findViewById(R.id.Et_ef);
        t = (EditText)findViewById(R.id.Et_tinggi);
        hitung = (Button)findViewById(R.id.btn_luas_trapesium);
        hasil = (TextView)findViewById(R.id.hsl_luas_trapesium);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //jika tidak mengisi sisi ab, sisi ef dan tinggi sekaligus maka akan tampil notifikasi
                if(ab.length()==0 && ef.length()==0 && t.length()==0){
                    Toast.makeText(getApplication(),"sisi ab dan sisi ef dan tinggi tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika sisi ab tidak diisi
                else if (ab.length()==0){
                    Toast.makeText(getApplication(),"Sisi AB tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika sisi EF tidak diisi
                else if (ef.length()==0){
                    Toast.makeText(getApplication(),"Sisi EF tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi jika tinggi tidak diisi
                else if (t.length()==0){
                    Toast.makeText(getApplication(),"Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String sisiab = ab.getText().toString();
                    String sisief = ef.getText().toString();
                    String tinggi = t.getText().toString();
                    double ab = Double.parseDouble(sisiab);
                    double ef = Double.parseDouble(sisief);
                    double t = Double.parseDouble(tinggi);
                    double hs = LuasTrapesium(ab,ef,t);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double LuasTrapesium(double ab, double ef, double t){return (ab+ef)*t/2;}
}
