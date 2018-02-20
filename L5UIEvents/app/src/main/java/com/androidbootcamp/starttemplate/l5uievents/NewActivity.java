package com.androidbootcamp.starttemplate.l5uievents;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        String username = getIntent().getStringExtra("username");
        TextView usernameTextView = findViewById(R.id.usernameTextView);
        usernameTextView.setText("Hola " + username);
    }
}
