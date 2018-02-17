package com.example.kevinbalauro.logicchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = findViewById(R.id.startMainMenu);
        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(),LevelSelection.class);
                startActivity(intent);
            }
        });

        Button exit = findViewById(R.id.exitMainMenu);
        exit.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
               finish();
           }
        });
    }

    @Override
    public void onBackPressed(){

    }
}
