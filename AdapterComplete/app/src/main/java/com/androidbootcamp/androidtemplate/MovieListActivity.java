package com.androidbootcamp.androidtemplate;

import android.os.Bundle;
import android.widget.ListView;

public class MovieListActivity extends BaseActivity {

    private ListView listViewMovies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);
        enabledBack();

        listViewMovies= findViewById(R.id.listViewMovies);
    }
}
