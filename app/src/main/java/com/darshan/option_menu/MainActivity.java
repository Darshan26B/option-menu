package com.darshan.option_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView icon;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        icon = findViewById(R.id.icon);
        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, icon);
                popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());
                popupMenu.show();

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.Setting:
                                Toast.makeText(MainActivity.this, "Setting", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.menu:
                                Toast.makeText(MainActivity.this, "menu", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.help:
                                Toast.makeText(MainActivity.this, "help", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.report:
                                Toast.makeText(MainActivity.this, "report", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.Account:
                                Toast.makeText(MainActivity.this, "Account", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.Notifications:
                                Toast.makeText(MainActivity.this, "Notifications", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.privacy:
                                Toast.makeText(MainActivity.this, "privacy", Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return false;
                    }
                });
            }
        });
    }
}