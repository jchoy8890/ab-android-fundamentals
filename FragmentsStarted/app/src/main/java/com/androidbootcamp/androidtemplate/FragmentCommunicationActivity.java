package com.androidbootcamp.androidtemplate;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.androidbootcamp.androidtemplate.ui.fragments.BlankFragment;
import com.androidbootcamp.androidtemplate.ui.listeners.BlankFragmentListener;


public class FragmentCommunicationActivity extends AppCompatActivity
implements BlankFragmentListener {

    private BlankFragment blankFragment;
    private FragmentManager fragmentManager;
    private View constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_communication);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        constraintLayout= findViewById(R.id.constraintLayout);

        fragmentManager= getSupportFragmentManager();
        blankFragment= (BlankFragment)fragmentManager.findFragmentById(R.id.blankFragment);
        blankFragment.cambiarColorFondo();
        //blankFragment.ejecutarAccionDesdeFragment("Hola Fragment");
        //blankFragment.executeActionFromFragment("Hello Fragment from Activity...");
    }

    public void otroMetodo(){}

    @Override
    public void actionFragment(Object object) {
        String message= String.valueOf(object);
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    public void actionActivityCambiarColor() {
        constraintLayout.setBackgroundColor(Color.YELLOW);
    }

    @Override
    public void callToActivity(Object object) {
        Toast.makeText(this, String.valueOf(object), Toast.LENGTH_LONG * 5).show();
    }

    @Override
    public void cerrarSesion() {

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
