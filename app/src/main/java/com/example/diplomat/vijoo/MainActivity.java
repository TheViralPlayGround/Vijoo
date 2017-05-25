package com.example.diplomat.vijoo;


import android.app.FragmentManager;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;


/**
 * Created by diplomat on 5/22/17.
 */





    public class MainActivity extends BaseActivity {

        BaseActivity mBaseActivity;
        SharedPreferences settings;
        RecyclerView rView;


        FragmentManager fm;

        LinearLayoutManager linearLayoutManager;
        String userID = "jv";

        private static final int CONTENT_VIEW_ID = 10101010;


        ArrayList<Playlist> playlists;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.content_home);
            android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.dijooToolbar);
//            setSupportActionBar(toolbar);
            final String PREFS_NAME = "MyPrefsFile";

            context = this.getApplicationContext();
            settings = getSharedPreferences(PREFS_NAME, 0);
            mBaseActivity = new BaseActivity();
            context = getApplicationContext();
            linearLayoutManager = new LinearLayoutManager(context);

            rView = (RecyclerView) findViewById(R.id.vijoo_recycler_view);

            playlists = Playlist.createPlaylistsList(30);

            PlaylistsAdapter adapter = new PlaylistsAdapter( this, playlists);
            rView.setAdapter(adapter);
            rView.setLayoutManager(new LinearLayoutManager(this));

        }




        private void buildToolBar(android.support.v7.widget.Toolbar toolbar) {

            Resources resources = this.getResources();
            int white = resources.getColor(R.color.white);
            int blue = resources.getColor(R.color.material_green_200);
            toolbar.setSubtitleTextColor(white);
            toolbar.setTitleTextColor(white);
            toolbar.setBackgroundColor(blue);
            toolbar.setTextAlignment(View.TEXT_ALIGNMENT_GRAVITY);
        }


        @Override
        public void onDestroy(){
            super.onDestroy();
         //   mAdapter.cleanup();
        }



        @Override
        protected void onResume() {
            super.onResume();
        }

    }



