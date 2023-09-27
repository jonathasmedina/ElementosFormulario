package com.example.elementosformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SearchView searchView_;
    ListView listView;

    ArrayList<String> arrayList = new ArrayList<>();

    ArrayList<String> arrayListCopia;

    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView_ = findViewById(R.id.searchView);
        listView = findViewById(R.id.listView1);

        searchView_.setIconified(false);

        arrayList.add("Chip e ChipGroup");
        arrayList.add("Switch");
        arrayList.add("CheckBox");
        arrayList.add("SnackBar e Toast");
        arrayList.add("RadioGroup");
        arrayList.add("CardView");
        arrayList.add("TextWatcher");

        arrayListCopia = new ArrayList<>(arrayList);

        arrayAdapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                arrayList
        );
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    Intent intent = new Intent(MainActivity.this, MainActivityChips.class);
                    startActivity(intent);
                }
                if(i == 1){
                    Intent intent = new Intent(MainActivity.this, MainActivitySwitch.class);
                    startActivity(intent);
                }
                if(i == 2){
                    Intent intent = new Intent(MainActivity.this, MainActivityCheckBox.class);
                    startActivity(intent);
                }
                if(i == 3){
                    Intent intent = new Intent(MainActivity.this, MainActivitySnackBarToast.class);
                    startActivity(intent);
                }
                if(i == 4){
                    Intent intent = new Intent(MainActivity.this, MainActivityRadioGroup.class);
                    startActivity(intent);
                }
                if(i == 5){
                    Intent intent = new Intent(MainActivity.this, MainActivityCardView.class);
                    startActivity(intent);
                }
                if(i == 6){
                    Intent intent = new Intent(MainActivity.this, MainActivityTextWatcher.class);
                    startActivity(intent);
                }
            }
        });

        searchView_.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                //forma 1
                //MainActivity3.this.arrayAdapter.getFilter().filter(s);

                //forma 2
                fazerBusca(s);
                arrayAdapter.notifyDataSetChanged();
                return false;
            }
        });

    }

    private void fazerBusca(String s) {

        arrayList.clear();

        s = s.toLowerCase();

        for(String item: arrayListCopia){
            if(item.toLowerCase().contains(s)){
                arrayList.add(item);
            }
        }
    }
}