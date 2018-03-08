package com.androidbootcamp.androidtemplate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.androidbootcamp.androidtemplate.ui.listeners.OnFirstFragmentListener;

public class MyFirstFragmentActivity extends AppCompatActivity implements OnFirstFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first_fragment);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        // Boton retroceder
        onBackPressed();
        return true;
    }
}
