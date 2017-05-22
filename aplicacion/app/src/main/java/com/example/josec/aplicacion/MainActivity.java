package com.example.josec.aplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import static com.example.josec.aplicacion.R.id.spinner;

public class MainActivity extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private TextView resultado;
    private Spinner mySpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText)findViewById(R.id.n1);
        n2 = (EditText)findViewById(R.id.n2);
        resultado = (TextView)findViewById(R.id.resultado);
        mySpinner = (Spinner)findViewById(spinner);
        //final String txtFromSpinner = mySpinner.getSelectedItem().toString();



        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                final String txtFromSpinner = mySpinner.getItemAtPosition(i).toString();

            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });
    }


    public void calcular(View View) {
        final String txtFromSpinner = mySpinner.getSelectedItem().toString();

        switch (txtFromSpinner) {
            case "Sumar":
                sumar(n1, n2);
                break;
            case "Restar":
                restar(n1,n2);
                break;
            case "Multiplicar":
                multiplicar(n1,n2);
                break;
            case "Dividir":
                dividir(n1,n2);
                break;
        }
    }

    public void sumar(EditText n1, EditText n2){
        String nro1 = n1.getText().toString();
        String nro2 = n2.getText().toString();
        double num1 = Double.parseDouble(nro1);
        double num2 = Double.parseDouble(nro2);

        double suma = num1 + num2;
        String result = String.valueOf(suma);
        resultado.setText(result);
    }

    public void restar(EditText n1, EditText n2){
        String nro1 = n1.getText().toString();
        String nro2 = n2.getText().toString();
        double num1 = Double.parseDouble(nro1);
        double num2 = Double.parseDouble(nro2);

        double resta = num1 - num2;
        String result = String.valueOf(resta);
        resultado.setText(result);
    }

    public void multiplicar(EditText n1, EditText n2){
        String nro1 = n1.getText().toString();
        String nro2 = n2.getText().toString();
        double num1 = Double.parseDouble(nro1);
        double num2 = Double.parseDouble(nro2);

        double mult = num1 * num2;
        String result = String.valueOf(mult);
        resultado.setText(result);
    }

    public void dividir(EditText n1, EditText n2){
        String nro1 = n1.getText().toString();
        String nro2 = n2.getText().toString();
        double num1 = Double.parseDouble(nro1);
        double num2 = Double.parseDouble(nro2);

        double div = num1 / num2;
        String result = String.valueOf(div);
        resultado.setText(result);
    }

}

