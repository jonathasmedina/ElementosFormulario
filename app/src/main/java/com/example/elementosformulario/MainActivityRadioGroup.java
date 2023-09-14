package com.example.elementosformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivityRadioGroup extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_radio_group);

        radioGroup = findViewById(R.id.radioGRoup1);

        //ouvinte para o radio
        radioGroup.setOnCheckedChangeListener((radioGroup, i) -> {
            if(i == R.id.radioButton){
                Toast.makeText(getApplicationContext(), "Radio 1 selecionado", Toast.LENGTH_SHORT).show();
            }

        });
    }
}