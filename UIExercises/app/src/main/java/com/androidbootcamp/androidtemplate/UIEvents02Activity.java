package com.androidbootcamp.androidtemplate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UIEvents02Activity extends BaseActivity {

    private EditText editText,editText2;
    private Button button2, button3,button4,button5;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uievents02);
        enabledBack();
        editText= findViewById(R.id.editText);
        editText2= findViewById(R.id.editText2);

        button2= findViewById(R.id.button2);//sumar
        button3= findViewById(R.id.button3);//restar
        button4= findViewById(R.id.button4);//multiplicar
        button5= findViewById(R.id.button5);//dividir

        textView= findViewById(R.id.textView);

        //events
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //capturar los valores de entrada
                String mValor1= editText.getText().toString();
                String mValor2= editText2.getText().toString();
                //Cambiar tipo de dato
                int valor1= Integer.parseInt(mValor1);
                int valor2= Integer.parseInt(mValor2);
                //procesar datos
                int suma=sumar(valor1,valor2);
                //mostrar resultado
                textView.setText("Resultado : "+suma);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //capturar los valores de entrada
                String mValor1= editText.getText().toString();
                String mValor2= editText2.getText().toString();
                //Cambiar tipo de dato
                int valor1= Integer.parseInt(mValor1);
                int valor2= Integer.parseInt(mValor2);
                //procesar datos
                int resta=restar(valor1,valor2);
                //mostrar resultado
                textView.setText("Resultado : "+resta);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //capturar los valores de entrada
                String mValor1= editText.getText().toString();
                String mValor2= editText2.getText().toString();
                //Cambiar tipo de dato
                int valor1= Integer.parseInt(mValor1);
                int valor2= Integer.parseInt(mValor2);
                //procesar datos
                int multiplica=multiplicar(valor1,valor2);
                //mostrar resultado
                textView.setText("Resultado : "+multiplica);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //capturar los valores de entrada
                String mValor1= editText.getText().toString();
                String mValor2= editText2.getText().toString();
                //Cambiar tipo de dato
                int valor1= Integer.parseInt(mValor1);
                int valor2= Integer.parseInt(mValor2);

                if(valor2!=0){
                    //procesar datos
                    double divide=dividir(valor1,valor2);
                    //mostrar resultado
                    textView.setText("Resultado : "+divide);
                }else{
                    textView.setText("Error : campo inválido");
                }
            }
        });
    }


    //sumar
    private int sumar(int valor1,int valor2){
        return valor1+valor2;
    }

    //restar
    private int restar(int valor1,int valor2){
        return valor1-valor2;
    }

    //restar
    private int multiplicar(int valor1,int valor2){
        return valor1*valor2;
    }

    private double dividir(int valor1, int valor2){
        return valor1/(valor2*1.0);
    }
}
