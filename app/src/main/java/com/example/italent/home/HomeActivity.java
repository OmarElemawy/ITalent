package com.example.italent.home;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.italent.R;
import com.example.italent.add.AddActivity;
import com.example.italent.competition.CompetitionActivity;
import com.example.italent.profile.ProfileActivity;
import com.example.italent.settings.SettingActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportFragmentManager().beginTransaction().replace(R.id.home_container,new HomeFragment()).commit();

        setupBottomNavigationView();
    }

    private void setupBottomNavigationView() {

        BottomNavigationView bottomNavigationView=findViewById(R.id.buttonNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home_icon:
                        Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.competition_icon:
                        Intent intent1 = new Intent(HomeActivity.this, CompetitionActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.add_icon:
                        Intent intent2 = new Intent(HomeActivity.this, AddActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.profile_icon:
                        Intent intent3 = new Intent(HomeActivity.this, ProfileActivity.class);
                        startActivity(intent3);
                        break;
                    case R.id.settings_icon:
                        Intent intent4 = new Intent(HomeActivity.this, SettingActivity.class);
                        startActivity(intent4);
                        break;
                }
                return false;
            }
        });
        MenuItem item = bottomNavigationView.getMenu().getItem(0);
        item.setChecked(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
