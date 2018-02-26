package com.androidbootcamp.androidtemplate;

import android.os.Bundle;

public class UIEvents01Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uievents01);
        enabledBack();
    }
}
