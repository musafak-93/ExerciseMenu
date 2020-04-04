package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class keliling_trapesium extends AppCompatActivity {

    EditText ab,ef,ae;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_trapesium);

        ab = (EditText)findViewById(R.id.Et_ab);
        ef = (EditText)findViewById(R.id.Et_ef);
        ae = (EditText)findViewById(R.id.Et_ae);
        hitung = (Button)findViewById(R.id.btn_keliling_trapesium);
        hasil = (TextView)findViewById(R.id.hsl_keliling_trapesium);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //jika tidak mengisi sisi ab, sisi ef dan tinggi sekaligus maka akan tampil notifikasi
                if(ab.length()==0 && ef.length()==0 && ae.length()==0){
                    Toast.makeText(getApplication(),"sisi AB dan sisi EF dan sisi AE tidak boleh Kosong",Toast.LENGTH_LONG).show();
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
                else if (ae.length()==0){
                    Toast.makeText(getApplication(),"Sisi AE tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String sisiab = ab.getText().toString();
                    String sisief = ef.getText().toString();
                    String sisiae = ae.getText().toString();
                    double ab = Double.parseDouble(sisiab);
                    double ef = Double.parseDouble(sisief);
                    double ae = Double.parseDouble(sisiae);
                    double hs = KelilingTrapesium(ab,ef,ae);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double KelilingTrapesium(double ab, double ef, double ae){return ab+ef+(2*ae);}
}
