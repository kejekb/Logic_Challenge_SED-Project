package com.example.kevinbalauro.logicchallenge;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Level1 extends AppCompatActivity implements View.OnClickListener{

    boolean isSwitchOneIsPress = false;
    boolean isSwitchTwoIsPress = false;
    boolean isSwitchOpen = false;
    ImageView buttonOne,buttonTwo,output,nextButton;
    View changeColor,switchOneWire1,switchOneWire2,switchOneWire3,switchTwoWire1,switchTwoWire2,switchTwoWire3,outputWire;
    TextView turns;
    int turn = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        buttonOne = findViewById(R.id.switchOne);
        buttonOne.setOnClickListener(this);
        buttonTwo = findViewById(R.id.switchTwo);
        buttonTwo.setOnClickListener(this);
        changeColor = findViewById(R.id.andGateColor);
        switchOneWire1 = findViewById(R.id.switchOneWireOne);
        switchOneWire2 = findViewById(R.id.switchOneWireTwo);
        switchOneWire3 = findViewById(R.id.switchOneWireThree);
        switchTwoWire1 = findViewById(R.id.switchTwoWireOne);
        switchTwoWire2 = findViewById(R.id.switchTwoWireTwo);
        switchTwoWire3 = findViewById(R.id.switchTwoWireThree);
        outputWire = findViewById(R.id.outputWire);
        output = findViewById(R.id.outputLed);
        nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(this);
        nextButton.setVisibility(View.GONE);
        turns = findViewById(R.id.turns);
        turns.setText("Turns: " + turn);
    }

    @Override
    public void onClick(View v){
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.clickbutton);
        switch(v.getId()){
            case R.id.switchOne:
                if(!isSwitchOneIsPress) {
                    buttonOne.setImageResource(R.drawable.button_green);
                    switchOneWire1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    switchOneWire2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    switchOneWire3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    mp.start();
                    turn --;
                    isSwitchOneIsPress = true;
                } else {
                    buttonOne.setImageResource(R.drawable.button_red);
                    switchOneWire1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    switchOneWire2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    switchOneWire3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    mp.start();
                    turn --;
                    isSwitchOneIsPress = false;
                } break;
            case R.id.switchTwo:
                if(!isSwitchTwoIsPress) {
                    buttonTwo.setImageResource(R.drawable.button_green);
                    switchTwoWire1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    switchTwoWire2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    switchTwoWire3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    mp.start();
                    turn --;
                    isSwitchTwoIsPress = true;
                } else {

                    buttonTwo.setImageResource(R.drawable.button_red);
                    switchTwoWire1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    switchTwoWire2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    switchTwoWire3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    mp.start();
                    turn --;
                    isSwitchTwoIsPress = false;
                } break;
            case R.id.nextButton:
                if(isSwitchOpen){
                    startActivity(new Intent(Level1.this,Level2.class));
                } break;
        }
        if(isSwitchTwoIsPress && isSwitchOneIsPress){
            output.setImageResource(R.drawable.led_green);
            outputWire.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            changeColor.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            nextButton.setVisibility(View.VISIBLE);
            isSwitchOpen = true;
        } else {
            output.setImageResource(R.drawable.led_red);
            outputWire.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            changeColor.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            isSwitchOpen = false;
        }
        if(turn == 0 && !isSwitchOpen){
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            turns.setText("Game Over");
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(Level1.this,MainMenu.class));
                }
            }, 1000);
        } else {
         turns.setText("Turns: " + turn);
        }
    }

    @Override
    public void onBackPressed(){
        startActivity(new Intent(this,LevelSelection.class));
    }
}
