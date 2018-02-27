package com.androidbootcamp.androidtemplate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class UIEvents01Activity extends BaseActivity {

    private Button button;
    private ImageView imageView;
    private boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uievents01);
        enabledBack();
        //ui
        button= findViewById(R.id.button);
        imageView= findViewById(R.id.imageView);
        //events
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                change();
            }
        });
    }

    private void change(){
        if(flag){
            flag=false;
            imageView.setImageResource(R.drawable.brain_friendly_logo);

        }else{
            flag=true;
            imageView.setImageResource(R.drawable.img01);
        }

    }
}
