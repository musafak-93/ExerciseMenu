package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

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
    }
}
