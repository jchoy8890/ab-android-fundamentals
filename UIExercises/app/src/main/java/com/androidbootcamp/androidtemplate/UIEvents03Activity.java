package com.androidbootcamp.androidtemplate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UIEvents03Activity extends BaseActivity {

    private EditText editText3;
    private EditText editText4;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uievents03);
        enabledBack();

        editText3= findViewById(R.id.editText3);
        editText4= findViewById(R.id.editText4);
        button6= findViewById(R.id.button6);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validarLogIn()){
                    showMessage("Enviando al servidor...");
                }else{
                    showMessage("Horror :( !!! ");
                }
            }
        });
    }

    private void showMessage(String message){
        Toast.makeText(this,
                message,Toast.LENGTH_SHORT).show();
    }

    private boolean validarLogIn(){
        //capturar los datos
        String username= editText3.getText().toString();
        String password= editText4.getText().toString();

        //validar
        if(username.isEmpty()){
            return false;
        }

        if(password.isEmpty()){
            return false;
        }
        return true;
    }
}
