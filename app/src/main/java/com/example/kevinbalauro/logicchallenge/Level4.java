package com.example.kevinbalauro.logicchallenge;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Level4 extends AppCompatActivity implements View.OnClickListener{

    boolean isSwitchOneIsPress,isSwitchTwoIsPress,isSwitchThreeIsPress,isSwitchFourIsPress,isSwitchFiveIsPress,orGateIsOn1,orGateIsOn2,orGateIsOn3,orGateIsOn4,andGateIsOn1,andGateIsOn2,andGateIsOn3,andGateIsOn4;
    boolean isFinished1 = false;
    boolean isFinished2 = false;
    ImageView buttonOne,buttonTwo,buttonThree,buttonFour,buttonFive,outputLed1,outputLed2,nextButton;
    View wire1,wire2a,wire2b,wire3,wire4a,wire4b,wire5;
    View orGate1,wire2c,wire2d,andGate1,wire4c,wire4d,orGate2;
    View orGate3a,orGate3b,wire2e,andGate2a,andGate2b,wire4e,andGate3a,andGate3b;
    View andGate4a,andGate4b,andGate2c,andGate2d,orGate4a,orGate4b;
    View orGateColor1,orGateColor2,orGateColor3,orGateColor4,andGateColor1,andGateColor2,andGateColor3,andGateColor4;
    TextView turns;
    int turn = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);

        buttonOne = findViewById(R.id.switch1);
        buttonOne.setOnClickListener(this);
        buttonTwo = findViewById(R.id.switch2);
        buttonTwo.setOnClickListener(this);
        buttonThree = findViewById(R.id.switch3);
        buttonThree.setOnClickListener(this);
        buttonFour = findViewById(R.id.switch4);
        buttonFour.setOnClickListener(this);
        buttonFive = findViewById(R.id.switch5);
        buttonFive.setOnClickListener(this);
        nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(this);
        wire1 = findViewById(R.id.wire1);
        wire2a = findViewById(R.id.wire2a);
        wire2b = findViewById(R.id.wire2b);
        wire3 = findViewById(R.id.wire3);
        wire4a = findViewById(R.id.wire4a);
        wire4b = findViewById(R.id.wire4b);
        wire5 = findViewById(R.id.wire5);
        orGate1 = findViewById(R.id.orGate1);
        wire2c = findViewById(R.id.wire2c);
        wire2d = findViewById(R.id.wire2d);
        andGate1 = findViewById(R.id.andGate1);
        wire4c = findViewById(R.id.wire4c);
        wire4d = findViewById(R.id.wire4d);
        orGate2 = findViewById(R.id.orGate2);
        orGate3a = findViewById(R.id.orGate3a);
        orGate3b = findViewById(R.id.orGate3b);
        wire2e = findViewById(R.id.wire2e);
        andGate2a = findViewById(R.id.andGate2a);
        andGate2b = findViewById(R.id.andGate2b);
        wire4e = findViewById(R.id.wire4e);
        andGate3a = findViewById(R.id.andGate3a);
        andGate3b = findViewById(R.id.andGate3b);
        andGate4a = findViewById(R.id.andGate4a);
        andGate4b = findViewById(R.id.andGate4b);
        andGate2c = findViewById(R.id.andGate2c);
        andGate2d = findViewById(R.id.andGate2d);
        orGate4a = findViewById(R.id.orGate4a);
        orGate4b = findViewById(R.id.orGate4b);
        orGateColor1 = findViewById(R.id.orGateColor1);
        orGateColor2 = findViewById(R.id.orGateColor2);
        orGateColor3 = findViewById(R.id.orGateColor3);
        orGateColor4 = findViewById(R.id.orGateColor4);
        andGateColor1 = findViewById(R.id.andGateColor1);
        andGateColor2 = findViewById(R.id.andGateColor2);
        andGateColor3 = findViewById(R.id.andGateColor3);
        andGateColor4 = findViewById(R.id.andGateColor4);
        outputLed1 = findViewById(R.id.outputLed1);
        outputLed2 = findViewById(R.id.outputLed2);
        nextButton.setVisibility(View.GONE);

        turns = findViewById(R.id.turns);
        turns.setText("Turns: " + turn);
        buttonThree.setImageResource(R.drawable.button_green);
        wire3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        buttonFive.setImageResource(R.drawable.button_green);
        wire5.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGate2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        isSwitchThreeIsPress = true;
        isSwitchFiveIsPress = true;
    }
    @Override
    public void onClick(View v) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.clickbutton);
        switch (v.getId()) {
            case R.id.switch1:
                if (!isSwitchOneIsPress) {
                    buttonOne.setImageResource(R.drawable.button_green);
                    wire1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    turn --;
                    mp.start();
                    isSwitchOneIsPress = true;
                } else {
                    buttonOne.setImageResource(R.drawable.button_red);
                    wire1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    turn --;
                    mp.start();
                    isSwitchOneIsPress = false;
                }
                break;
            case R.id.switch2:
                if (!isSwitchTwoIsPress) {
                    buttonTwo.setImageResource(R.drawable.button_green);
                    wire2a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire2b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire2c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire2d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire2e.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    turn --;
                    mp.start();
                    isSwitchTwoIsPress = true;
                } else {
                    buttonTwo.setImageResource(R.drawable.button_red);
                    wire2a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire2b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire2c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire2d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire2e.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    turn --;
                    mp.start();
                    isSwitchTwoIsPress = false;
                }
                break;
            case R.id.switch3:
                if (!isSwitchThreeIsPress) {
                    buttonThree.setImageResource(R.drawable.button_green);
                    wire3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    turn --;
                    mp.start();
                    isSwitchThreeIsPress = true;
                } else {
                    buttonThree.setImageResource(R.drawable.button_red);
                    wire3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    turn --;
                    mp.start();
                    isSwitchThreeIsPress = false;
                }
                break;
            case R.id.switch4:
                if (!isSwitchFourIsPress) {
                    buttonFour.setImageResource(R.drawable.button_green);
                    wire4a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire4b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire4c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire4d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire4e.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    turn --;
                    mp.start();
                    isSwitchFourIsPress = true;
                } else {
                    buttonFour.setImageResource(R.drawable.button_red);
                    wire4a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire4b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire4c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire4d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire4e.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    turn --;
                    mp.start();
                    isSwitchFourIsPress = false;
                }
                break;
            case R.id.switch5:
                if (!isSwitchFiveIsPress) {
                    buttonFive.setImageResource(R.drawable.button_green);
                    wire5.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    turn --;
                    mp.start();
                    isSwitchFiveIsPress = true;
                } else {
                    buttonFive.setImageResource(R.drawable.button_red);
                    wire5.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    turn --;
                    mp.start();
                    isSwitchFiveIsPress = false;
                }
                break;
            case R.id.nextButton:
                    startActivity(new Intent(Level4.this, Level5.class));
                break;
        }

        if(isSwitchOneIsPress || isSwitchTwoIsPress){
            orGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGateIsOn1 = true;
        } else {
            orGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGateIsOn1 = false;
        }
        if(isSwitchThreeIsPress && isSwitchFourIsPress){
            andGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGateIsOn1 = true;
        } else {
            andGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGateIsOn1 = false;
        }
        if(isSwitchFourIsPress || isSwitchFiveIsPress){
            orGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGateIsOn2 = true;
        } else {
            orGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGateIsOn2 = false;
        }
        if(orGateIsOn1 || isSwitchTwoIsPress){
            orGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGateIsOn3 = true;
        } else {
            orGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGateIsOn3 = false;
        }
        if(isSwitchTwoIsPress && andGateIsOn1){
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
        if(isSwitchFourIsPress && orGateIsOn2){
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
        if(orGateIsOn3 && andGateIsOn3 && isSwitchTwoIsPress){
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
        if(isSwitchFourIsPress || andGateIsOn3){
            orGateColor4.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate4a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate4b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGateIsOn4 = true;
        } else {
            orGateColor4.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate4a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate4b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGateIsOn4 = false;
        }
        if(andGateIsOn4 && andGateIsOn2){
            outputLed1.setImageResource(R.drawable.led_green);
            isFinished1 = true;
        } else {
            outputLed1.setImageResource(R.drawable.led_red);
            isFinished1 = false;
        }
        if(andGateIsOn2 && orGateIsOn4) {
            outputLed2.setImageResource(R.drawable.led_green);
            isFinished2 = true;
        } else {
            outputLed2.setImageResource(R.drawable.led_red);
            isFinished2 = false;
        }
        if(isFinished1 && isFinished2){
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            nextButton.setVisibility(View.VISIBLE);
        }

        if(turn == 0 && (!isFinished1 && !isFinished2)){
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            turns.setText("Game Over");
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(Level4.this,MainMenu.class));
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
