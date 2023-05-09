package com.example.mapas20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.CheckBox;

import android.widget.ImageView;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioButton checkBoxMunicipios;
    private RadioButton checkBoxArea;
    private RadioButton checkBoxPopulacao;
    private RadioButton checkBoxIdh;
    private RadioGroup radioGroupEstados;
    private CheckBox radioButtonPR;
    private CheckBox radioButtonSC;
    private CheckBox radioButtonRS;
    private ImageView mapaPR;
    private ImageView mapaRS;
    private ImageView mapaSC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapaPR = findViewById(R.id.mapaPR);
        mapaRS = findViewById(R.id.mapaRS);
        mapaSC = findViewById(R.id.mapaSC);

        radioButtonPR = findViewById(R.id.radioButtonPR);
        radioButtonSC = findViewById(R.id.radioButtonSC);
        radioButtonRS = findViewById(R.id.radioButtonRS);

        radioGroupEstados = findViewById(R.id.radioGroupEstados);

        checkBoxIdh = findViewById(R.id.checkBoxIdh);
        checkBoxPopulacao = findViewById(R.id.checkBoxPopulacao);
        checkBoxArea = findViewById(R.id.checkBoxArea);
        checkBoxMunicipios = findViewById(R.id.checkBoxMunicipios);

        radioButtonListener();
    }

    public void checkBox(){

        String texto = "";

        if (checkBoxMunicipios.isChecked()){
            texto = "N° Municipios: 284";
        } else if (checkBoxArea.isChecked()){
            texto = "Área: 199.298,981 km² [2022]";
        } else if (checkBoxPopulacao.isChecked()){
            texto = "População: 7.338.473 pessoas [2021]";
        } else if (checkBoxIdh.isChecked()){
            texto = "IDH: 0,774 [2010]";
    }

    public void radioButtonListener(){
        radioGroupEstados.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButtonPR){
                    mapaPR.setVisibility(View.VISIBLE);
                } else if (checkedId == R.id.radioButtonSC){
                    mapaSC.setVisibility(View.VISIBLE);
                } else if (checkedId == R.id.radioButtonRS){
                    mapaRS.setVisibility(View.VISIBLE);
                }
            }
        });
    }
//    public void pesquisar(View view){
//        String entrada = estado.getText().toString();
//
//        if (entrada.equals("parana") || entrada.equals("pr")){
//            mapaPR.setVisibility(View.VISIBLE);
//            idh.setText("IDH: 0,749 [2010]");
//            area.setText("Área: 199.298,981 km² [2022]");
//            municipios.setText("N° Municipios: 284");
//            populacao.setText("População: 11.597.484 pessoas [2021]");
//        }
//        else if (entrada.equals("santa catarina") || entrada.equals("sc")){
//            mapaSC.setVisibility(View.VISIBLE);
//            idh.setText("IDH: 0,774 [2010]");
//            area.setText("Área: 95.730,690km² [2022]");
//            municipios.setText("N° Municipios: 295");
//            populacao.setText("População: 7.338.473 pessoas [2021]");
//        }
//        else if (entrada.equals("rio grande do sul") || entrada.equals("rs")){
//            mapaRS.setVisibility(View.VISIBLE);
//            idh.setText("IDH: 0,746 [2010]");
//            area.setText("Área: 281.707,151km² [2022]");
//            municipios.setText("N° Municipios: 497");
//            populacao.setText("População: 11.466.630 pessoas [2021]");
//        }
//    }

    public void enviar (View view){
        checkBox();
        radioButton();
    }
    }
}
