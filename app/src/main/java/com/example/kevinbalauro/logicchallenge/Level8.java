package com.example.kevinbalauro.logicchallenge;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Level8 extends AppCompatActivity implements  View.OnClickListener{

    boolean orGateIsOn1,orGateIsOn2,orGateIsOn3,andGateIsOn1,andGateIsOn2,andGateIsOn3,xorGateIsOn1,xorGateIsOn2,xorGateIsOn3,xorGateIsOn4,xorGateIsOn5;
    boolean isSwitchOneIsPress,isSwitchTwoIsPress,isSwitchThreeIsPress,isSwitchFourIsPress,isSwitchFiveIsPress;
    ImageView buttonOne,buttonTwo,buttonThree,buttonFour,buttonFive,outputLed,nextButton;
    View wire1a,wire2a,wire3,wire4a,wire4b,wire4c,wire4d,wire5;
    View wire1b,wire2b,wire2c,wire2d,wire2e,xorGate1a,xorGate1b,xorGate1c,orGate1;
    View xorGate2,orGate3d,orGate3e,orGate3f,orGate2a,orGate2b,orGate2c,xorGate3a;
    View orGate3a,orGate3b,orGate3c,xorGate4a,xorGate4b,xorGate4c,xorGate4d,xorGate3b;
    View andGate1a,andGate1b,andGate1c,xorGate4e,xorGate4f,andGate2a,andGate2b,andGate2c;
    View andGate3a,andGate3b,andGate3c,xorGate5a,xorGate5b,xorGate5c;
    View xorGateColor1,xorGateColor2,xorGateColor3,xorGateColor4,xorGateColor5,orGateColor1,orGateColor2,orGateColor3,andGateColor1,andGateColor2,andGateColor3;
    TextView turns;
    int turn = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level8);

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
        wire1a = findViewById(R.id.wire1a);
        wire2a = findViewById(R.id.wire2a);
        wire3 = findViewById(R.id.wire3);
        wire4a = findViewById(R.id.wire4a);
        wire4b = findViewById(R.id.wire4b);
        wire4c = findViewById(R.id.wire4c);
        wire4d = findViewById(R.id.wire4d);
        wire5 = findViewById(R.id.wire5);
        wire1b = findViewById(R.id.wire1b);
        wire2b = findViewById(R.id.wire2b);
        wire2c = findViewById(R.id.wire2c);
        wire2d = findViewById(R.id.wire2d);
        wire2e = findViewById(R.id.wire2e);
        xorGate1a = findViewById(R.id.xorGate1a);
        xorGate1b = findViewById(R.id.xorGate1b);
        xorGate1c = findViewById(R.id.xorGate1c);
        orGate1 = findViewById(R.id.orGate1);
        xorGate2 = findViewById(R.id.xorGate2);
        orGate3d = findViewById(R.id.orGate3d);
        orGate3e = findViewById(R.id.orGate3e);
        orGate3f = findViewById(R.id.orGate3f);
        orGate2a = findViewById(R.id.orGate2a);
        orGate2b = findViewById(R.id.orGate2b);
        orGate2c = findViewById(R.id.orGate2c);
        xorGate3a = findViewById(R.id.xorGate3a);
        orGate3a = findViewById(R.id.orGate3a);
        orGate3b = findViewById(R.id.orGate3b);
        orGate3c = findViewById(R.id.orGate3c);
        xorGate4a = findViewById(R.id.xorGate4a);
        xorGate4b = findViewById(R.id.xorGate4b);
        xorGate4c = findViewById(R.id.xorGate4c);
        xorGate4d = findViewById(R.id.xorGate4d);
        xorGate3b = findViewById(R.id.xorGate3b);
        andGate1a = findViewById(R.id.andGate1a);
        andGate1b = findViewById(R.id.andGate1b);
        andGate1c = findViewById(R.id.andGate1c);
        xorGate4e = findViewById(R.id.xorGate4e);
        xorGate4f = findViewById(R.id.xorGate4f);
        andGate2a = findViewById(R.id.andGate2a);
        andGate2b = findViewById(R.id.andGate2b);
        andGate2c = findViewById(R.id.andGate2c);
        andGate3a = findViewById(R.id.andGate3a);
        andGate3b = findViewById(R.id.andGate3b);
        andGate3c = findViewById(R.id.andGate3c);
        xorGate5a = findViewById(R.id.xorGate5a);
        xorGate5b = findViewById(R.id.xorGate5b);
        xorGate5c = findViewById(R.id.xorGate5c);
        outputLed = findViewById(R.id.outputLed);
        xorGateColor1 = findViewById(R.id.xorGateColor1);
        xorGateColor2 = findViewById(R.id.xorGateColor2);
        xorGateColor3 = findViewById(R.id.xorGateColor3);
        xorGateColor4 = findViewById(R.id.xorGateColor4);
        xorGateColor5 = findViewById(R.id.xorGateColor5);
        orGateColor1 = findViewById(R.id.orGateColor1);
        orGateColor2 = findViewById(R.id.orGateColor2);
        orGateColor3 = findViewById(R.id.orGateColor3);
        andGateColor1 = findViewById(R.id.andGateColor1);
        andGateColor2 = findViewById(R.id.andGateColor2);
        andGateColor3 = findViewById(R.id.andGateColor3);
        outputLed = findViewById(R.id.outputLed);
        nextButton.setVisibility(View.GONE);

        turns = findViewById(R.id.turns);
        turns.setText("Turns: " + turn);
        buttonOne.setImageResource(R.drawable.button_green);
        buttonTwo.setImageResource(R.drawable.button_green);
        buttonFive.setImageResource(R.drawable.button_green);
        wire1a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire1b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2e.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire5.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGate1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        xorGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        xorGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        xorGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGate2a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGate2b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGate2c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGate3c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGate3d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGate3e.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGate3f.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        isSwitchOneIsPress = true;
        isSwitchTwoIsPress = true;
        isSwitchFiveIsPress = true;
    }
    @Override
    public void onClick(View v) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.clickbutton);
        switch (v.getId()) {
            case R.id.switch1:
                if (!isSwitchOneIsPress) {
                    buttonOne.setImageResource(R.drawable.button_green);
                    wire1a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire1b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    mp.start();
                    turn --;
                    isSwitchOneIsPress = true;
                } else {
                    buttonOne.setImageResource(R.drawable.button_red);
                    wire1a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire1b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    mp.start();
                    turn --;
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
                    mp.start();
                    turn --;
                    isSwitchTwoIsPress = true;
                } else {
                    buttonTwo.setImageResource(R.drawable.button_red);
                    wire2a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire2b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire2c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire2d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire2e.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
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
                    wire4a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire4b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire4c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire4d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    mp.start();
                    turn --;
                    isSwitchFourIsPress = true;
                } else {
                    buttonFour.setImageResource(R.drawable.button_red);
                    wire4a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire4b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire4c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire4d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    mp.start();
                    turn --;
                    isSwitchFourIsPress = false;
                }
                break;
            case R.id.switch5:
                if (!isSwitchFiveIsPress) {
                    buttonFive.setImageResource(R.drawable.button_green);
                    wire5.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    mp.start();
                    turn --;
                    isSwitchFiveIsPress = true;
                } else {
                    buttonFive.setImageResource(R.drawable.button_red);
                    wire5.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    mp.start();
                    turn --;
                    isSwitchFiveIsPress = false;
                }
                break;
            case R.id.nextButton:
                startActivity(new Intent(Level8.this, Level9.class));
                break;
        }
        if(isSwitchOneIsPress ^ isSwitchTwoIsPress){
            xorGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGateIsOn2 = true;
        } else {
            xorGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn2 = false;
        }
        if(isSwitchThreeIsPress ^ isSwitchFourIsPress){
            xorGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate1c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGateIsOn1 = true;
        } else {
            xorGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate1c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn1 = false;
        }
        if(isSwitchFourIsPress || isSwitchFiveIsPress){
            orGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGateIsOn1 = true;
        } else {
            orGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGateIsOn1 = false;
        }
        if(isSwitchTwoIsPress || xorGateIsOn1){
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
        if(xorGateIsOn1 ^ orGateIsOn1){
            xorGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGateIsOn3 = true;
        } else {
            xorGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn3 = false;
        }
        if(xorGateIsOn2 || orGateIsOn2){
            orGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate3c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate3d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate3e.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate3f.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGateIsOn3 = true;
        } else {
            orGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate3c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate3d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate3e.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate3f.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGateIsOn3 = false;
        }
        if(orGateIsOn3 ^ orGateIsOn2){
            xorGateColor4.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate4a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate4b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate4c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate4d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate4e.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate4f.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGateIsOn4 = true;
        } else {
            xorGateColor4.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate4a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate4b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate4c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate4d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate4e.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate4f.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn4 = false;
        }
        if(orGateIsOn3 && xorGateIsOn4){
            andGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate1c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGateIsOn1 = true;
        } else {
            andGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate1c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn1 = false;
        }
        if(xorGateIsOn4 && xorGateIsOn3){
            andGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate2a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate2b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate2c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGateIsOn2 = true;
        } else {
            andGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate2a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate2b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate2c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGateIsOn2 = false;
        }
        if(andGateIsOn1 && xorGateIsOn4){
            andGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate3c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGateIsOn3 = true;
        } else {
            andGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate3c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGateIsOn3 = false;
        }
        if(xorGateIsOn4 ^ andGateIsOn2){
            xorGateColor5.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate5a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate5b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate5c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGateIsOn5 = true;
        } else {
            xorGateColor5.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate5a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate5b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate5c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn5 = false;
        }
        if(andGateIsOn3 && xorGateIsOn5){
            outputLed.setImageResource(R.drawable.led_green);
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            nextButton.setVisibility(View.VISIBLE);
        } else {
            outputLed.setImageResource(R.drawable.led_red);
        }
        if(turn == 0 && (!andGateIsOn3 && !xorGateIsOn5)){
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            turns.setText("Game Over");
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(Level8.this,MainMenu.class));
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
