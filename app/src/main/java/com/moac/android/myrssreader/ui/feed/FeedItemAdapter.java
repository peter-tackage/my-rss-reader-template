package com.moac.android.myrssreader.ui.feed;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Creates View items to be displayed in a RecyclerView, populated with data.
 */
public class FeedItemAdapter extends RecyclerView.Adapter<FeedItemAdapter.ViewHolder> {

    // TODO Create a constructor that uses a List<Item> and an OnFeedItemClickListener

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                         int viewType) {
        // Create a new View instances from the XML layout definition

        // TODO Inflate view_feed_item and return a new ViewHolder using the View
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // TODO Get the data items and bind it to the ViewHolder (set the value!)
    }

    // Returns the size of the dataset
    @Override
    public int getItemCount() {
        // TODO Make this return the dataset size
        return 0;
    }

    /*
     * TODO Add own OnFeedItemClickListener interface definition
     */


    /**
     * A recyclable representation of a View entity
     */
    static class ViewHolder extends RecyclerView.ViewHolder {

        ViewHolder(View view) {
            super(view);
            // TODO Get references to the root, title and description Views
        }

        // TODO Add a bind((FeedItem, OnFeedItemClickListener)) method assign the values to the fields (and the click listener!)

    }
}
