package com.example.mimex;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.hardware.Camera;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    Camera camera;
    FrameLayout frameLayout;
    ShowCamera showCamera;
    ImageButton add,spacebar,speak,clear;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.navigationOpen,R.string.navigationClose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        frameLayout = (FrameLayout) findViewById(R.id.camLayout);

        //open the camera

        camera = Camera.open();

        showCamera = new ShowCamera(this, camera);
        frameLayout.addView(showCamera);

        add = findViewById(R.id.add);
        spacebar = findViewById(R.id.spacebar);
        speak = findViewById(R.id.speak);
        clear = findViewById(R.id.clear);
    }
}

