package com.example.myexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonCalculer= findViewById(R.id.buttonCalculer);
        EditText editTexttMontant = findViewById(R.id.editTextMotant);
        TextView  textViewRes= findViewById(R.id.textViewRes);
         ListView listViewRes =findViewById(R.id.listViewRes);
         List<String> data = new ArrayList<>();
        ArrayAdapter<String> stringArrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listViewRes.setAdapter(stringArrayAdapter);
        buttonCalculer.setOnClickListener((view->{
            double montant = Double.parseDouble(editTexttMontant.getText().toString());
            double res =montant*11;
            textViewRes.setText(String.valueOf(res));
            data.add(montant+"=>"+res);
            stringArrayAdapter.notifyDataSetChanged();




        }));

        }
}
