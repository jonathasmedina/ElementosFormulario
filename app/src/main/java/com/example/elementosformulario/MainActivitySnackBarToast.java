package com.example.elementosformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivitySnackBarToast extends AppCompatActivity {

    Button bt1, bt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_snack_bar_toast);

        bt1 = findViewById(R.id.buttonToast);
        bt2 = findViewById(R.id.buttonSnack);

        //exemplo com lambda
        /*
        Em Java, funções lambda são uma forma concisa de criar uma implementação de uma interface funcional.
        Uma interface funcional é uma interface que possui exatamente um método abstrato.
        As funções lambda permitem que você forneça uma implementação desse método abstrato sem a necessidade
         de criar uma classe anônima completa.
         */
        bt1.setOnClickListener(view ->
                Toast.makeText(this, "Isso é um toast", Toast.LENGTH_SHORT).show()
        );

        //exemplo sem lambda
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Isto é um SnackBar!", Snackbar.LENGTH_LONG)
                        .setAction("Voltar à lista", ouvinte)
                        .show();
            }
        });
    }

    View.OnClickListener ouvinte = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };

    //ou, com lambda:
    //View.OnClickListener ouvinte = view -> finish();


}