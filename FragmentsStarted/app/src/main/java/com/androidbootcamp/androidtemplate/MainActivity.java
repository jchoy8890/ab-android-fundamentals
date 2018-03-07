package com.androidbootcamp.androidtemplate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.textView1).setOnClickListener(this);
        findViewById(R.id.textView2).setOnClickListener(this);
        findViewById(R.id.textView3).setOnClickListener(this);
        findViewById(R.id.textView4).setOnClickListener(this);
        findViewById(R.id.textView5).setOnClickListener(this);
        findViewById(R.id.textView6).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.textView1:
                    goToActivity(MyFirstFragmentActivity.class);
                break;
            case R.id.textView2:
                    goToActivity(FragmentBasicActivity.class);
                break;
            case R.id.textView3:
                    goToActivity(FragmentProgrammingActivity.class);
                break;
            case R.id.textView4:
                    goToActivity(FragmentCommunicationActivity.class);
                break;
            case R.id.textView5:
                    goToActivity(MainMessageActivity.class);
                break;
            case R.id.textView6:
                    goToActivity(ColorActivity.class);
                break;
        }
    }

    private void goToActivity(Class activity){
        Intent intent= new Intent(this,activity);
        startActivity(intent);
    }
}
