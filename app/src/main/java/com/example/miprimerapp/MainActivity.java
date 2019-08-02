package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
//INDICAR LOS COMPONENTES QUE SE VA A UTILIZAR: EN ESTE CASO LOS COMPONENTES DONDE INGRESA Y SALE RESULTADOS:
    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ESTO ES EL CASTING: AYUDA A CAMBIAR UN TIPO DE OBJETO HACIA OTRO TIPO DE OBJETO
        et1 = (EditText)findViewById(R.id.txt_num1);  //EL PRIMER COMPONENTE SE GUARDA DENNTRO DE et1, DENTRO DEL PARENTESIS SE PONE EL TIPO DE TEXTO QUE ES, R ES UNA CLASE(PUENTE ENTRE LA VISTA Y EL CODIGO)
        et2 = (EditText)findViewById(R.id.txt_num2);  //...
        tv1 = (TextView)findViewById(R.id.txt_resultado);   //...

    }
    //PARTE FUNCIONAL
    //ESTE METODO REALIZA LA SUMA
    public void Sumar(View view){   // DENTRO DEL PARENTESIS SE ENVIA LOS VALORES O ARGUMENTOS , LO QUE ESTA DENTRO DEL PARENTESIS ES UN OBJETO DE LA CLASE VIEW, EL PRIMER VIEW ES EL OBJETO Y EL OTRO ES EL NOMBRE VIEW
       String valor1 = et1.getText().toString(); //CREAR VARIABLE: VALOR 1, OSEA ESPACIO EN MEMORIA, EN VALOR 1 SE GUARDA LO QUE HA RECUPERADO EL TIPO EDIT TEXT, get Text RECUPERA EL TEXTO, PARA PARCIAR DE UN COMPONENTE A UN STRING: toString
       String valor2 = et2.getText().toString(); //...

       //CONVERTIR LOS VALORES valor1 y valor2 string a entero Y EL PARSEO(PARSEO PERMITE CAMBIAR DE UN TIPO DE DATO A OTRO)
       int num1 = Integer.parseInt (valor1); //CREAMOS LA VARIABLE: num1 ,ES UNA VARIABLE DE TIPO ENTERO, SE GUARDA DENTRO DE LA VARIABLE valor1 ,OJO: NO SE PUEDE GUARDAR UN TIPO DE VARIABLE STRING DENTRO DE UN TIPO DE VARIABLE ENTERO, PARA ESO HACEMOS UN PARSEO:Integer.parseInt
       int num2 = Integer.parseInt (valor2); //...

       //ESTA ES LA SUMA
       int suma = num1 + num2;

       //AHORA CREAMOS LA VARIABLE: result PARA TRANSFORMAR DE ENTERO A STRING
       // String result = suma + ""; //ESTA ES UNA FORMA DE NOVATOS DE PARSEAR DE ENTERO A STRING
        //OTRA FORMA:
        String result = String.valueOf(suma);
        tv1.setText(result);

    }
}
