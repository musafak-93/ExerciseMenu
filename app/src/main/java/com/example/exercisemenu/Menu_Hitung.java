package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        TextView trapesium=findViewById(R.id.TV_trapesium);

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

                ppMenu.inflate(R.menu.menu_lingkaran);
                ppMenu.show();
            }
        });

        panjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu ppMenu = new PopupMenu(Menu_Hitung.this, v);
                ppMenu.setOnMenuItemClickListener(Menu_Hitung.this);

                ppMenu.inflate(R.menu.menu_persegi_panjang);
                ppMenu.show();
            }
        });

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu ppMenu = new PopupMenu(Menu_Hitung.this, v);
                ppMenu.setOnMenuItemClickListener(Menu_Hitung.this);

                ppMenu.inflate(R.menu.menu_segitiga);
                ppMenu.show();
            }
        });

        trapesium.setOnClickListener(new View.OnClickListener() {
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
                Intent a = new Intent(Menu_Hitung.this, luas_persegi.class);
                startActivity(a);
                break;
            case R.id.menu2:
                Intent b = new Intent(Menu_Hitung.this, keliling_persegi.class);
                startActivity(b);
                break;
            case R.id.menu3:
                Intent c = new Intent(Menu_Hitung.this, luas_lingkaran.class);
                startActivity(c);
                break;
            case R.id.menu4:
                Intent d = new Intent(Menu_Hitung.this, keliling_lingkaran.class);
                startActivity(d);
                break;
            case R.id.menu5:
                Intent e = new Intent(Menu_Hitung.this, luas_pp.class);
                startActivity(e);
                break;
            case R.id.menu6:
                Intent f = new Intent(Menu_Hitung.this, keliling_pp.class);
                startActivity(f);
                break;
            case R.id.menu7:
                Intent g = new Intent(Menu_Hitung.this, luas_segitiga.class);
                startActivity(g);
                break;
            case R.id.menu8:
                Intent h = new Intent(Menu_Hitung.this, keliling_segitiga.class);
                startActivity(h);
                break;
        }
        return true;
    }

}
