package com.androidbootcamp.starttemplate.l5uievents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginButton = findViewById(R.id.loginButton);
        final EditText usernameEditText = findViewById(R.id.usernameEditText);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                intent.putExtra("username", username);
                startActivity(intent);
            }
        });


    }
}
