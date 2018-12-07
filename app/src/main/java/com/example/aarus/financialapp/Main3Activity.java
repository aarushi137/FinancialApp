package com.example.aarus.financialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {
    String[] items = new String[] {"Name: ", "Interest Rate: ", "Certificate Deposit Rate: ", "ATM fee: ", "Overdraft fee: ", "Minimum balance: ", "Local ATMS: "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_list);

        ListView listView = (ListView) findViewById(R.id.detailsList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
    }
}
