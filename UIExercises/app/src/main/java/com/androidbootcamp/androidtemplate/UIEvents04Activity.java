package com.androidbootcamp.androidtemplate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UIEvents04Activity extends BaseActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uievents_4b);
        enabledBack();
        Button blackButton = findViewById(R.id.buttonBlack);
        Button redButton = findViewById(R.id.buttonRed);
        Button blueButton = findViewById(R.id.buttonBlue);
        Button greenButton = findViewById(R.id.buttonGreen);
        Button clearButton = findViewById(R.id.clearButton);
        blackButton.setOnClickListener(this);
        redButton.setOnClickListener(this);
        blueButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        View canvas = findViewById(R.id.canvas);
        int color =0;
        switch (view.getId()){
            case R.id.buttonBlack:
                color = android.R.color.black;
                break;
            case R.id.buttonRed:
                color = android.R.color.holo_red_dark;
                break;
            case R.id.buttonGreen:
                color = android.R.color.holo_green_dark;
                break;
            case R.id.buttonBlue:
                color = android.R.color.holo_blue_dark;
                break;
            case R.id.clearButton:
                color = R.color.grey;
                break;
        }
        canvas.setBackgroundColor(getResources().getColor(color));
    }
}
