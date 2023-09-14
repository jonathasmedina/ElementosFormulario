package com.example.elementosformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivityCheckBox extends AppCompatActivity {
    CheckBox chk1, chk2, chk3;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_check_box);

        chk1 = (CheckBox) findViewById(R.id.checkBox1);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        chk3 = (CheckBox) findViewById(R.id.checkBox3);
        botao = (Button) findViewById(R.id.button);


        //utilizando um botão para verificar quais do grupo estão marcados
        botao.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         if (chk1.isChecked()){

                                             Toast.makeText(MainActivityCheckBox.this, "CheckBox 1 está checado", Toast.LENGTH_LONG).show();

                                         }
                                     }
                                 }

        );

        //utilizando ouvinte do checkbox
        chk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Checkbox: ", "1 clicado. Status: " + chk1.isChecked());

                //ou, para verificar se está marcado:
                if(chk1.isChecked()){
                    Log.e("Checkbox: ", "1 clicado e marcado.");
                }
            }
        });
    }
}