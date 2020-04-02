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
        TextView lingkaran=findViewById(R.id.TV_lingkaran);
        TextView panjang=findViewById(R.id.TV_persegipanjang);
        TextView segitiga=findViewById(R.id.TV_segitiga);

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu ppMenu = new PopupMenu(Menu_Hitung.this, v);
                ppMenu.setOnMenuItemClickListener(Menu_Hitung.this);

                ppMenu.inflate(R.menu.menuhitung);
                ppMenu.show();
            }
        });

        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu ppMenu = new PopupMenu(Menu_Hitung.this, v);
                ppMenu.setOnMenuItemClickListener(Menu_Hitung.this);

                ppMenu.inflate(R.menu.menuhitung);
                ppMenu.show();
            }
        });

        panjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu ppMenu = new PopupMenu(Menu_Hitung.this, v);
                ppMenu.setOnMenuItemClickListener(Menu_Hitung.this);

                ppMenu.inflate(R.menu.menuhitung);
                ppMenu.show();
            }
        });

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu ppMenu = new PopupMenu(Menu_Hitung.this, v);
                ppMenu.setOnMenuItemClickListener(Menu_Hitung.this);

                ppMenu.inflate(R.menu.menuhitung);
                ppMenu.show();
            }
        });
    }
    public boolean onMenuItemClick (MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.menu1:
                Toast.makeText(getApplicationContext(), "luas",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu2:
                Toast.makeText(getApplicationContext(),"keliling"
                        ,Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
