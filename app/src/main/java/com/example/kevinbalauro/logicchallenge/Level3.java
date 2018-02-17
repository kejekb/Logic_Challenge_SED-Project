package com.example.kevinbalauro.logicchallenge;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Level3 extends AppCompatActivity implements View.OnClickListener{
    boolean isSwitchOneIsPress,isSwitchTwoIsPress,isSwitchThreeIsPress,isSwitchFourIsPress,orGateIsOn1,orGateIsOn2,andGateIsOn1,andGateIsOn2,andGateIsOn3,andGateIsOn4;
    boolean isFinished = false;
    ImageView buttonOne,buttonTwo,buttonThree,buttonFour,outputLed,nextButton;
    View wire1,wire1a,wire1b,wire2,wire3,wire4,wire4a,wire4b,wire1c,orGate1a,orGate1b,orGate1c,andGate1a,andGate1b,andGate1c,andGate1d,wire4c;
    View wire1d,wire1e,andGate2a,andGate2b,andGate2c,andGate2d,orGate2a,orGate2b,orGate2c,andGate3a,andGate3b,andGate4a,andGate4b;
    View orGateColor1,orGateColor2,andGateColor1,andGateColor2,andGateColor3,andGateColor4;
    TextView turns;
    int turn = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);

        buttonOne = findViewById(R.id.switch1);
        buttonOne.setOnClickListener(this);
        buttonTwo = findViewById(R.id.switch2);
        buttonTwo.setOnClickListener(this);
        buttonThree = findViewById(R.id.switch3);
        buttonThree.setOnClickListener(this);
        buttonFour = findViewById(R.id.switch4);
        buttonFour.setOnClickListener(this);
        nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(this);
        wire1 = findViewById(R.id.wire1);
        wire1a = findViewById(R.id.wire1a);
        wire1b = findViewById(R.id.wire1b);
        wire2 = findViewById(R.id.wire2);
        wire3 = findViewById(R.id.wire3);
        wire4 = findViewById(R.id.wire4);
        wire4a = findViewById(R.id.wire4a);
        wire4b = findViewById(R.id.wire4b);
        wire1c = findViewById(R.id.wire1c);
        orGate1a = findViewById(R.id.orGate1a);
        orGate1b = findViewById(R.id.orGate1b);
        orGate1c = findViewById(R.id.orGate1c);
        andGate1a = findViewById(R.id.andGate1a);
        andGate1b = findViewById(R.id.andGate1b);
        andGate1c = findViewById(R.id.andGate1c);
        andGate1d = findViewById(R.id.andGate1d);
        wire4c = findViewById(R.id.wire4c);
        wire1d = findViewById(R.id.wire1d);
        wire1e = findViewById(R.id.wire1e);
        andGate2a = findViewById(R.id.andGate2a);
        andGate2b = findViewById(R.id.andGate2b);
        andGate2c = findViewById(R.id.andGate2c);
        andGate2d = findViewById(R.id.andGate2d);
        orGate2a = findViewById(R.id.orGate2a);
        orGate2b = findViewById(R.id.orGate2b);
        orGate2c = findViewById(R.id.orGate2c);
        andGate3a = findViewById(R.id.andGate3a);
        andGate3b = findViewById(R.id.andGate3b);
        andGate4a = findViewById(R.id.andGate4a);
        andGate4b = findViewById(R.id.andGate4b);
        orGateColor1 = findViewById(R.id.orGateColor1);
        orGateColor2 = findViewById(R.id.orGateColor2);
        andGateColor1 = findViewById(R.id.andGateColor1);
        andGateColor2 = findViewById(R.id.andGateColor2);
        andGateColor3 = findViewById(R.id.andGateColor3);
        andGateColor4 = findViewById(R.id.andGateColor4);
        outputLed = findViewById(R.id.outputLed);
        nextButton.setVisibility(View.GONE);
        turns = findViewById(R.id.turns);
        turns.setText("Turns: " + turn);
    }

    @Override
    public void onClick(View v){
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.clickbutton);
        switch(v.getId()) {
            case R.id.switch1:
                if (!isSwitchOneIsPress) {
                    buttonOne.setImageResource(R.drawable.button_green);
                    wire1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire1a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire1b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire1c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire1d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire1e.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    mp.start();
                    turn --;
                    isSwitchOneIsPress = true;
                } else {
                    buttonOne.setImageResource(R.drawable.button_red);
                    wire1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire1a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire1b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire1c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire1d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire1e.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    mp.start();
                    turn --;
                    isSwitchOneIsPress = false;
                }
                break;
            case R.id.switch2:
                if (!isSwitchTwoIsPress) {
                    buttonTwo.setImageResource(R.drawable.button_green);
                    wire2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    mp.start();
                    turn --;
                    isSwitchTwoIsPress = true;
                } else {
                    buttonTwo.setImageResource(R.drawable.button_red);
                    wire2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    mp.start();
                    turn --;
                    isSwitchTwoIsPress = false;
                }
                break;
            case R.id.switch3:
                if (!isSwitchThreeIsPress) {
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
                }
                break;
            case R.id.switch4:
                if (!isSwitchFourIsPress) {
                    buttonFour.setImageResource(R.drawable.button_green);
                    wire4.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire4a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire4b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire4c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    mp.start();
                    turn --;
                    isSwitchFourIsPress = true;
                } else {
                    buttonFour.setImageResource(R.drawable.button_red);
                    wire4.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire4a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire4b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire4c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    mp.start();
                    turn --;
                    isSwitchFourIsPress = false;
                }
                break;
            case R.id.nextButton:
                if(isFinished){
                    startActivity(new Intent(Level3.this,Level4.class));
                } break;
        }

        if(isSwitchOneIsPress || isSwitchTwoIsPress){
            orGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate1c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGateIsOn1 = true;
        } else {
            orGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate1c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGateIsOn1 = false;
        }
        if(isSwitchThreeIsPress && isSwitchFourIsPress){
            andGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate1c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate1d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGateIsOn1 = true;
        } else {
            andGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate1c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate1d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGateIsOn1 = false;
        }
        if(orGateIsOn1 && andGateIsOn1){
            andGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate2a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate2b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate2c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate2d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGateIsOn2 = true;
        } else {
            andGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate2a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate2b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate2c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate2d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGateIsOn2 = false;
        }
        if(andGateIsOn1 || isSwitchFourIsPress){
            orGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate2a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate2b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate2c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGateIsOn2 = true;
        } else {
            orGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate2a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate2b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate2c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGateIsOn2 = false;
        }
        if(isSwitchOneIsPress && andGateIsOn2){
            andGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGateIsOn3 = true;
        } else {
            andGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGateIsOn3 = false;
        }
        if(andGateIsOn2 && orGateIsOn2){
            andGateColor4.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate4a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate4b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGateIsOn4 = true;
        } else {
            andGateColor4.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate4a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate4b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGateIsOn4 = false;
        }
        if(andGateIsOn3 && andGateIsOn4){
            outputLed.setImageResource(R.drawable.led_green);
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            nextButton.setVisibility(View.VISIBLE);
            isFinished = true;
        } else {
            outputLed.setImageResource(R.drawable.led_red);
            isFinished = false;
        }
        if(turn == 0 && !isFinished){
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            turns.setText("Game Over");
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(Level3.this,MainMenu.class));
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
