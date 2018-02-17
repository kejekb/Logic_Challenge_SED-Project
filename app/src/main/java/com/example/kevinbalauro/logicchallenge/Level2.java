package com.example.kevinbalauro.logicchallenge;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Level2 extends AppCompatActivity implements View.OnClickListener {

    boolean isSwitchOneIsPress, isSwitchTwoIsPress, isSwitchThreeIsPress,andGateIsOn,orGateIsOn;
    boolean isFinished = false;
    ImageView buttonOne,buttonTwo,buttonThree,outputLed,nextButton;
    View wire1,wire2,wire2a,wire2b,wire2c,wire3,wireAndGate1,wireAndGate2,wireOrGate1,wireOrGate2,outputWire,orGateColor,andGateColor1,andGateColor2;
    TextView turns;
    int turn = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        buttonOne = findViewById(R.id.switch1);
        buttonOne.setOnClickListener(this);
        buttonTwo = findViewById(R.id.switch2);
        buttonTwo.setOnClickListener(this);
        buttonThree = findViewById(R.id.switch3);
        buttonThree.setOnClickListener(this);
        nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(this);
        outputWire = findViewById(R.id.outputWire);
        wire1 = findViewById(R.id.switchOneWireOne);
        wire2 = findViewById(R.id.switchTwoWireTwo);
        wire2a = findViewById(R.id.switchTwoWireTwoA);
        wire2b = findViewById(R.id.switchTwoWireTwoB);
        wire2c = findViewById(R.id.switchTwoWireTwoB);
        wire3 = findViewById(R.id.switchThreeWireOne);
        wireOrGate1 = findViewById(R.id.orGateWireOne);
        wireOrGate2 = findViewById(R.id.orGateWireTwo);
        wireAndGate1 = findViewById(R.id.andGateWireOne);
        wireAndGate2 = findViewById(R.id.andGateWireTwo);
        orGateColor = findViewById(R.id.orGateColor1);
        andGateColor1 = findViewById(R.id.andGateColor1);
        andGateColor2 = findViewById(R.id.andGateColor2);
        outputLed = findViewById(R.id.outputLed);
        nextButton.setVisibility(View.GONE);
        turns = findViewById(R.id.turns);
        turns.setText("Turns: " + turn);
    }

    @Override
    public void onClick(View v){
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.clickbutton);
        switch(v.getId()){
            case R.id.switch1:
                if(!isSwitchOneIsPress) {
                    buttonOne.setImageResource(R.drawable.button_green);
                    wire1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    mp.start();
                    turn --;
                    isSwitchOneIsPress = true;
                } else {
                    buttonOne.setImageResource(R.drawable.button_red);
                    wire1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    mp.start();
                    turn --;
                    isSwitchOneIsPress = false;
                } break;
            case R.id.switch2:
                if(!isSwitchTwoIsPress) {
                    buttonTwo.setImageResource(R.drawable.button_green);
                    wire2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire2a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire2b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire2c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    mp.start();
                    turn --;
                    isSwitchTwoIsPress = true;
                } else {
                    buttonTwo.setImageResource(R.drawable.button_red);
                    wire2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire2a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire2b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire2c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    mp.start();
                    turn --;
                    isSwitchTwoIsPress = false;
                } break;
            case R.id.switch3:
                if(!isSwitchThreeIsPress) {
                    buttonThree.setImageResource(R.drawable.button_green);
                    wire3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    mp.start();
                    turn --;
                    isSwitchThreeIsPress = true;
                } else {
                    buttonThree.setImageResource(R.drawable.button_red);
                    wire3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    mp.start();
                    turn --;
                    isSwitchThreeIsPress = false;
                } break;
            case R.id.nextButton:
                if(isFinished){
                    startActivity(new Intent(Level2.this,Level3.class));
                } break;
        }
        if(isSwitchOneIsPress && isSwitchTwoIsPress){
            andGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            wireAndGate1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            wireAndGate2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGateIsOn = true;
        } else {
            andGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            wireAndGate1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            wireAndGate2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGateIsOn = false;
        }
        if(isSwitchTwoIsPress || isSwitchThreeIsPress){
            orGateColor.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            wireOrGate1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            wireOrGate2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGateIsOn = true;
        } else {
            orGateColor.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            wireOrGate1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            wireOrGate2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGateIsOn = false;
        }
        if(andGateIsOn && orGateIsOn){
            andGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            outputWire.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            outputLed.setImageResource(R.drawable.led_green);
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            nextButton.setVisibility(View.VISIBLE);
            isFinished = true;
        } else {
            andGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            outputWire.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            outputLed.setImageResource(R.drawable.led_red);
            isFinished = false;
        }
        if(turn == 0 && !isFinished){
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            turns.setText("Game Over");
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(Level2.this,MainMenu.class));
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
