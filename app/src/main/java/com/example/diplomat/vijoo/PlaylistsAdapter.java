package com.example.diplomat.vijoo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by diplomat on 5/24/17.
 */

public class PlaylistsAdapter extends
        RecyclerView.Adapter<PlaylistsAdapter.ViewHolder> {


    // Create the basic adapter extending from RecyclerView.Adapter
// Note that we specify the custom ViewHolder which gives us access to our views


    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView mTitle;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            mTitle = (TextView) itemView.findViewById(R.id.playlistTitle);
        }
    }


    private List<Playlist> mPlaylists;
    private Context mContext;

    public PlaylistsAdapter(Context context, List<Playlist> playlists) {
        mPlaylists = playlists;
        mContext = context;
    }

    private Context getContext() {
        return mContext;
    }


    @Override
    public PlaylistsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View playlistView = inflater.inflate(R.layout.playlist__item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(playlistView);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(PlaylistsAdapter.ViewHolder viewHolder, int position) {
        // Get the data model based on position
        Playlist playlist = mPlaylists.get(position);

        // Set item views based on your views and data model
        TextView textView = viewHolder.mTitle;
        textView.setText(playlist.getTitle());

    }

    @Override
    public int getItemCount() {
        return mPlaylists.size();
    }

}
