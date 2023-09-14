package com.example.elementosformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.List;

public class MainActivityChips extends AppCompatActivity {

    //Fonte
    //https://m2.material.io/components/chips/android#using-chips

    Chip chip1_;
    ChipGroup chipGroup_;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chips);

        chip1_  = findViewById(R.id.chip1Entry);
        chipGroup_  = findViewById(R.id.chipGroupEntry);
        bt  = findViewById(R.id.buttonVerificaChip);

        //exemplos de ouvintes

        //responde a um click em um chip
        chip1_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //responde ao clique no ícone de fechar, se existente
        chip1_.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("fechado ", "fechado - id: "+view.getId());
            }
        });

        //recuperando itens selecionados em um grupo
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //recuperando itens selecionados em um grupo
                List<Integer> ids = chipGroup_.getCheckedChipIds();
                for (Integer id:ids){
                    Log.e("id:", ""+id);
                    Chip chip = chipGroup_.findViewById(id);
                    //....
                }
            }
        });


    }
}