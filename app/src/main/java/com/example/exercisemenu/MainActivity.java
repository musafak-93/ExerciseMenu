package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edname, edpass;
    Button bkirim;
    String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edname = findViewById(R.id.Et_Username);
        edpass = findViewById(R.id.Et_password);
        bkirim = findViewById(R.id.btnok);

        bkirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = edname.getText().toString();
                pass = edpass.getText().toString();

                if (user.equals("admin") || pass.equals("123") ) {
                    Intent intent = new Intent(MainActivity.this, Menu_Hitung.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(),
                            "Login Gagal", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this, Menu_Hitung.class);
        startActivity(intent);
    }
}
