package com.example.uts10119254;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.example.uts10119254.Model.Database;
import com.example.uts10119254.Present.CreateActivity;
import com.example.uts10119254.view.Beranda;
import com.example.uts10119254.view.Catatan;
import com.example.uts10119254.view.Profile;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemReselectedListener navigation = new BottomNavigationView.OnNavigationItemReselectedListener() {
        @Override
        public void onNavigationItemReselected(@NonNull MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()){
                case R.id.menu_beranda:
                    f = new Beranda();
                    break;
                case R.id.menu_profile:
                    f = new Profile();
                    break;
                case R.id.menu_catatan:
                    f = new Catatan();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment, f).commit();
            return;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_nav_menu);
        bottomNavigationView.setOnNavigationItemReselectedListener(navigation);
    }
}

//10119254_IkhlasulFZ_IF7