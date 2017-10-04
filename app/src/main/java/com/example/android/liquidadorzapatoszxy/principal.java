package com.example.android.liquidadorzapatoszxy;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class principal extends AppCompatActivity {

    private TextView resultado;
    private EditText cantidad;
    private Resources resources;
    private Spinner sexo;
    private Spinner tipo;
    private Spinner marca;
    private String sex[];
    private String type[];
    private String brand[];





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        resultado = (TextView)findViewById(R.id.lblResultado);
        cantidad = (EditText)findViewById(R.id.txtCantidad);
        sexo = (Spinner)findViewById(R.id.spSexo);
        tipo = (Spinner)findViewById(R.id.spTipo);
        marca = (Spinner)findViewById(R.id.spMarca);
        resources = this.getResources();
        sex = resources.getStringArray(R.array.spsexo);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,sex);
        sexo.setAdapter(adapter);

        type = resources.getStringArray(R.array.sptipo);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,type);
        tipo.setAdapter(adapter1);

        brand = resources.getStringArray(R.array.spmarca);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,brand);
        marca.setAdapter(adapter2);

    }

    public boolean validar(){
        if(cantidad.getText().toString().isEmpty() || cantidad.getText().toString().equals("0")){
            cantidad.setError(resources.getString(R.string.mensaje_error_uno));
            return false;
        }

        return true;
    }

    public void calcular(View v){
        int sex1;
        int tip1;
        int marc1;
        int res=0;
        int cant;


        resultado.setText("");
        if(validar()){

            sex1 = sexo.getSelectedItemPosition();
            tip1 = tipo.getSelectedItemPosition();
            marc1 = marca.getSelectedItemPosition();
            cant = Integer.parseInt(cantidad.getText().toString());



            resultado.setText(String.valueOf(res));
        }

    }

}
