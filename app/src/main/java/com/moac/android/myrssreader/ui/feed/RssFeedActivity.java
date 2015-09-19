package com.moac.android.myrssreader.ui.feed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.moac.android.myrssreader.R;

/**
 * This is our main Activity, it will show a list item RSS feed items retrieved from the internet.
 */
public class RssFeedActivity extends AppCompatActivity {

    private static final String TAG = RssFeedActivity.class.getSimpleName();

    // TODO A reference to the RecyclerView
    // TODO A single onClickListener which launches the ArticleActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the Activity UI.
        setContentView(R.layout.activity_rss_feed);

        // TODO Invoke the initFeedView()
        // TODO Invoke the loadFeed()
    }

    private void initFeedView() {
        // TODO Get a reference to the RecyclerView widget and set the LayoutManager
    }

    /**
     * Loads an RSS Feed into the UI.
     */
    // TODO Trigger the loading of the feed.
    private void loadFeed() {
        // TODO Use Retrofit to fetch the feed items - this is asynchronous, so supply a set of callbacks, one for success and one for error.
        // TODO Report success to the UI using a Snackbar.
        // TODO Report failure to the UI using a Snackbar and log it.
        // TODO Report the failure to application logs
    }

}
