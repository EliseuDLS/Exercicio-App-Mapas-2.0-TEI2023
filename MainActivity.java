package com.example.appmapas20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.CheckBox;
import android.widget.ImageView;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    public RadioButton municipios;
    public RadioButton area;
    public RadioButton populacao;
    public RadioButton idh;
    public RadioButton estado;
    public CheckBox checkBoxPR;
    public CheckBox checkBoxSC;
    public CheckBox checkBoxRS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxPR = findViewById(R.id.checkBoxPR);
        checkBoxSC = findViewById(R.id.checkBoxSC);
        checkBoxRS = findViewById(R.id.checkBoxRS);

        estado = findViewById(R.id.estado);
        idh = findViewById(R.id.idh);
        populacao = findViewById(R.id.populacao);
        area = findViewById(R.id.area);
        municipios = findViewById(R.id.municipios);

        radioButtonListener();
    }

    public void checkBox(){

        if (checkBoxPR.isChecked()){
            checkBoxPR.setVisibility(View.VISIBLE);
        } if (checkBoxSC.isChecked()){
            checkBoxSC.setVisibility(View.VISIBLE);
        } if (checkBoxRS.isChecked()){
            checkBoxRS.setVisibility(View.VISIBLE);
        }
        
    }

    public void radioButtonListener(){
        radioGroupAlmoco.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButtonArroz){
                    textoResultado.setText("Arroz");
                } else if (checkedId == R.id.radioButtonFeijão){
                    textoResultado.setText("Feijão");
                }
            }
        });
    }
    public
    void pesquisar(View view){
        String entrada = estado.getText().toString();

        if (entrada.equals("parana") || entrada.equals("pr")){
            mapaPR.setVisibility(View.VISIBLE);
            idh.setText("IDH: 0,749 [2010]");
            area.setText("Área: 199.298,981 km² [2022]");
            municipios.setText("N° Municipios: 284");
            populacao.setText("População: 11.597.484 pessoas [2021]");
        }
        else if (entrada.equals("santa catarina") || entrada.equals("sc")){
            mapaSC.setVisibility(View.VISIBLE);
            idh.setText("IDH: 0,774 [2010]");
            area.setText("Área: 95.730,690km² [2022]");
            municipios.setText("N° Municipios: 295");
            populacao.setText("População: 7.338.473 pessoas [2021]");
        }
        else if (entrada.equals("rio grande do sul") || entrada.equals("rs")){
            mapaRS.setVisibility(View.VISIBLE);
            idh.setText("IDH: 0,746 [2010]");
            area.setText("Área: 281.707,151km² [2022]");
            municipios.setText("N° Municipios: 497");
            populacao.setText("População: 11.466.630 pessoas [2021]");
        }
    }
    
    public void enviar (View view){
        //checkBox();
        //radioButton();
    }
}
