package com.androidbootcamp.androidtemplate;

import android.os.Bundle;
import android.widget.GridView;

public class MovieGridActivity extends BaseActivity {

    private GridView gridViewMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_grid);
        enabledBack();
        gridViewMovies=findViewById(R.id.gridViewMovies);
    }
}
