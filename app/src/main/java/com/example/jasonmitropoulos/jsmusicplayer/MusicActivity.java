package com.example.jasonmitropoulos.jsmusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nowplaying);
// Find the button
        Button MainScreen = findViewById(R.id.main_screen);
        // Set a click listener on that button
        MainScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the main screen activity
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }
}
