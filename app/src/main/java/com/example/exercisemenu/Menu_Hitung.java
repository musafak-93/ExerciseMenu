package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class Menu_Hitung extends AppCompatActivity implements
        PopupMenu.OnMenuItemClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__hitung);

        TextView persegi=findViewById(R.id.TV_persegi);

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu ppMenu = new PopupMenu(Menu_Hitung.this, v);
                ppMenu.setOnMenuItemClickListener(Menu_Hitung.this);

                ppMenu.inflate(R.menu.menuhitung);
                ppMenu.show();
            }
        });
    }
}
