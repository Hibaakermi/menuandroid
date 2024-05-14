package com.example.pourmenu;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if (drawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open_nav,R.string.close_nav);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {


            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.nav_home:
                    {
                        Toast.makeText(MainActivity.this,"Home Selected",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.nav_localisation:
                    {
                        Toast.makeText(MainActivity.this,"Localisatin Selected",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.nav_calendrier:
                    {
                        Toast.makeText(MainActivity.this,"calendrier Selected",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.nav_profil:
                    {
                        Toast.makeText(MainActivity.this,"Profil Selected",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.nav_login:
                    {
                        Toast.makeText(MainActivity.this,"Login Selected",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.nav_logout:
                    {
                        Toast.makeText(MainActivity.this,"Logout Selected",Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
                return false;
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
