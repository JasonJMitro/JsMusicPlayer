package com.example.jasonmitropoulos.jsmusicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class MusicPlayerAdapter extends ArrayAdapter<MusicPlayer> {


    public MusicPlayerAdapter(Activity context, ArrayList<MusicPlayer> musicPlayers) {
        super(context, 0, musicPlayers);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the MusicPlayer object located at this position in the list
        MusicPlayer currentMusicPlayer = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID artist
        TextView nameTextView = listItemView.findViewById(R.id.artist);
        // Get the artist from the current MusicPlayer object and
        // set this text on the name TextView
        nameTextView.setText(currentMusicPlayer.getArtist());

        // Find the TextView in the list_item.xml layout with the ID song
        TextView numberTextView = listItemView.findViewById(R.id.song);
        // Get the song from the current MusicPlayer object and
        // set this text on the number TextView
        numberTextView.setText(currentMusicPlayer.getSong());

        return listItemView;
    }

}

