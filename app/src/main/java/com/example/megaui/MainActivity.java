package com.example.megaui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rv = findViewById(R.id.recyclerView);


//        ArrayList<String> cartList = new ArrayList<>();
        CartAdapter adapter = new CartAdapter();

        rv.setLayoutManager(new LinearLayoutManager(getBaseContext()));

        rv.setAdapter(adapter);
    }
}