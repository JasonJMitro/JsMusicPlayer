package com.example.jasonmitropoulos.jsmusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Find the now playing view
        TextView nowplaying = findViewById(R.id.nowplaying);

        // Set a click listener on that View
        nowplaying.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open now playing activity
                Intent nowplayingIntent = new Intent(MainActivity.this, MusicActivity.class);

                startActivity(nowplayingIntent);
            }
        });
        // Create an ArrayList of MusicPlayer objects
        ArrayList<MusicPlayer> musicPlayers = new ArrayList<>();
        musicPlayers.add(new MusicPlayer(getString(R.string.Imaginary_Artist1), getString(R.string.Imaginary_Song1)));
        musicPlayers.add(new MusicPlayer(getString(R.string.Imaginary_Artist2), getString(R.string.Imaginary_Song2)));
        musicPlayers.add(new MusicPlayer(getString(R.string.Imaginary_Artist3), getString(R.string.Imaginary_Song3)));
        musicPlayers.add(new MusicPlayer(getString(R.string.Imaginary_Artist4), getString(R.string.Imaginary_Song4)));
        musicPlayers.add(new MusicPlayer(getString(R.string.Imaginary_Artist5), getString(R.string.Imaginary_Song5)));
        musicPlayers.add(new MusicPlayer(getString(R.string.Imaginary_Artist6), getString(R.string.Imaginary_Song6)));
        musicPlayers.add(new MusicPlayer(getString(R.string.Imaginary_Artist7), getString(R.string.Imaginary_Song7)));
        musicPlayers.add(new MusicPlayer(getString(R.string.Imaginary_Artist8), getString(R.string.Imaginary_Song8)));
        musicPlayers.add(new MusicPlayer(getString(R.string.Imaginary_Artist9), getString(R.string.Imaginary_Song9)));
        musicPlayers.add(new MusicPlayer(getString(R.string.Imaginary_Artist10), getString(R.string.Imaginary_Song10)));
        musicPlayers.add(new MusicPlayer(getString(R.string.Imaginary_Artist11), getString(R.string.Imaginary_Song11)));
        musicPlayers.add(new MusicPlayer(getString(R.string.Imaginary_Artist12), getString(R.string.Imaginary_Song12)));


        // Create a MusicPlayerAdapter
        MusicPlayerAdapter playerAdapter = new MusicPlayerAdapter(this, musicPlayers);

        // Find the ListView, and attach the adapter to the listView.
        ListView listView = findViewById(R.id.listview_flavor);
        listView.setAdapter(playerAdapter);


    }

}
