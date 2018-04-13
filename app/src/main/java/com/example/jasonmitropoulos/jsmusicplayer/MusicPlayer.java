package com.example.jasonmitropoulos.jsmusicplayer;


public class MusicPlayer {

    // Name of artist
    private String mArtist;

    // Name of song
    private String mSong;

    /*
    * Create a new Music Player object.
    *
    * @param mArtist is the name of the Artist
    * @param vNumber is the name of the song
    * */
    public MusicPlayer(String vArtist, String vSong) {
        mArtist = vArtist;
        mSong = vSong;
    }

    /**
     * Get the name of the Artist
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get the name of the song
     */
    public String getSong() {
        return mSong;
    }


}
