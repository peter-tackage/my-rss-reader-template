package com.moac.android.myrssreader.ui.article;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.moac.android.myrssreader.R;

public class ArticleActivity extends AppCompatActivity {

    // TODO Write a static launcher method that passes the URL String to the ArticleActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        // TODO Retrieve the Article URL from the Intent parameters

        // TODO Load the URL into the WebView

    }
}
