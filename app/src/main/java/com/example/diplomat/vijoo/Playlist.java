package com.example.diplomat.vijoo;

import java.util.ArrayList;

/**
 * Created by diplomat on 5/24/17.
 */

public class Playlist {


    private String mTitle;

    public Playlist() {
    }

    public Playlist(String title){
        mTitle = title;
    }

    public Playlist(String title, Boolean working){
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    private static int lastPlaylistId=0;

    public static ArrayList<Playlist> createPlaylistsList(int numPlaylists) {
        ArrayList<Playlist> playlists = new ArrayList<Playlist>();

        for (int i = 1; i <= numPlaylists; i++) {
            playlists.add(new Playlist("Playlist " + ++lastPlaylistId, i <= numPlaylists / 2));
        }

        return playlists;
    }
}
