package com.example.kevinbalauro.logicchallenge;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Level7 extends AppCompatActivity implements View.OnClickListener{

    boolean orGateIsOn1,orGateIsOn2,orGateIsOn3,orGateIsOn4,orGateIsOn5,orGateIsOn6,andGateIsOn1,andGateIsOn2,andGateIsOn3,xorGateIsOn1,xorGateIsOn2,xorGateIsOn3,xorGateIsOn4;
    boolean isSwitchOneIsPress,isSwitchTwoIsPress,isSwitchThreeIsPress,isSwitchFourIsPress,isSwitchFiveIsPress,isSwitchSixIsPress;
    ImageView buttonOne,buttonTwo,buttonThree,buttonFour,buttonFive,buttonSix,outputLed,nextButton;
    View wire1,wire2,wire3,wire4,wire5,wire6;
    View orGate1,orGate2a,orGate2b,orGate2c,orGate2d,orGate3,andGate1d,andGate1e,andGate1f,andGate2d,andGate2e,andGate2f;
    View andGate1a,andGate1b,andGate1c,xorGate1a,xorGate1b,xorGate1c,xorGate1d,andGate2a,andGate2b,andGate2c;
    View andGate1g,xorGate2a,xorGate2b,xorGate2c,xorGate2d,orGate4a,orGate4b,orGate4c,orGate4d,andGate2g;
    View orGate5a,orGate5b,orGate5c,andGate3a,andGate3b,andGate3c,andGate3d,xorGate3a,xorGate3b,xorGate3c;
    View orGate6a,orGate6b,orGate6c,xorGate4a,xorGate4b,xorGate4c;
    View orGateColor1,orGateColor2,orGateColor3,orGateColor4,orGateColor5,orGateColor6,andGateColor1,andGateColor2,andGateColor3,xorGateColor1,xorGateColor2,xorGateColor3,xorGateColor4;
    TextView turns;
    int turn = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level7);

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
        buttonSix = findViewById(R.id.switch6);
        buttonSix.setOnClickListener(this);
        nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(this);
        orGateColor1 = findViewById(R.id.orGateColor1);
        orGateColor2 = findViewById(R.id.orGateColor2);
        orGateColor3 = findViewById(R.id.orGateColor3);
        orGateColor4 = findViewById(R.id.orGateColor4);
        orGateColor5 = findViewById(R.id.orGateColor5);
        orGateColor6 = findViewById(R.id.orGateColor6);
        andGateColor1 = findViewById(R.id.andGateColor1);
        andGateColor2 = findViewById(R.id.andGateColor2);
        andGateColor3 = findViewById(R.id.andGateColor3);
        xorGateColor1 = findViewById(R.id.xorGateColor1);
        xorGateColor2 = findViewById(R.id.xorGateColor2);
        xorGateColor3 = findViewById(R.id.xorGateColor3);
        xorGateColor4 = findViewById(R.id.xorGateColor4);
        wire1 = findViewById(R.id.wire1);
        wire2 = findViewById(R.id.wire2);
        wire3 = findViewById(R.id.wire3);
        wire4 = findViewById(R.id.wire4);
        wire5 = findViewById(R.id.wire5);
        wire6 = findViewById(R.id.wire6);
        orGate1 = findViewById(R.id.orGate1);
        orGate2a = findViewById(R.id.orGate2a);
        orGate2b = findViewById(R.id.orGate2b);
        orGate2c = findViewById(R.id.orGate2c);
        orGate2d = findViewById(R.id.orGate2d);
        orGate3 = findViewById(R.id.orGate3);
        andGate1d = findViewById(R.id.andGate1d);
        andGate1e = findViewById(R.id.andGate1e);
        andGate1f = findViewById(R.id.andGate1f);
        andGate2d = findViewById(R.id.andGate2d);
        andGate2e = findViewById(R.id.andGate2e);
        andGate2f = findViewById(R.id.andGate2f);
        andGate1a = findViewById(R.id.andGate1a);
        andGate1b = findViewById(R.id.andGate1b);
        andGate1c = findViewById(R.id.andGate1c);
        xorGate1a = findViewById(R.id.xorGate1a);
        xorGate1b = findViewById(R.id.xorGate1b);
        xorGate1c = findViewById(R.id.xorGate1c);
        xorGate1d = findViewById(R.id.xorGate1d);
        andGate2a = findViewById(R.id.andGate2a);
        andGate2b = findViewById(R.id.andGate2b);
        andGate2c = findViewById(R.id.andGate2c);
        andGate1g = findViewById(R.id.andGate1g);
        xorGate2a = findViewById(R.id.xorGate2a);
        xorGate2b = findViewById(R.id.xorGate2b);
        xorGate2c = findViewById(R.id.xorGate2c);
        xorGate2d = findViewById(R.id.xorGate2d);
        orGate4a = findViewById(R.id.orGate4a);
        orGate4b = findViewById(R.id.orGate4b);
        orGate4c = findViewById(R.id.orGate4c);
        orGate4d = findViewById(R.id.orGate4d);
        andGate2g = findViewById(R.id.andGate2g);
        orGate5a = findViewById(R.id.orGate5a);
        orGate5b = findViewById(R.id.orGate5b);
        orGate5c = findViewById(R.id.orGate5c);
        andGate3a = findViewById(R.id.andGate3a);
        andGate3b = findViewById(R.id.andGate3b);
        andGate3c = findViewById(R.id.andGate3c);
        andGate3d = findViewById(R.id.andGate3d);
        xorGate3a = findViewById(R.id.xorGate3a);
        xorGate3b = findViewById(R.id.xorGate3b);
        xorGate3c = findViewById(R.id.xorGate3c);
        orGate6a = findViewById(R.id.orGate6a);
        orGate6b = findViewById(R.id.orGate6b);
        orGate6c = findViewById(R.id.orGate6c);
        xorGate4a = findViewById(R.id.xorGate4a);
        xorGate4b = findViewById(R.id.xorGate4b);
        xorGate4c = findViewById(R.id.xorGate4c);
        outputLed = findViewById(R.id.outputLed);
        nextButton.setVisibility(View.GONE);
        turns = findViewById(R.id.turns);
        turns.setText("Turns: " + turn);
    }
    @Override
    public void onClick(View v) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.clickbutton);
        switch (v.getId()) {
            case R.id.switch1:
                if (!isSwitchOneIsPress) {
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
                    mp.start();
                    turn --;
                    isSwitchFourIsPress = true;
                } else {
                    buttonFour.setImageResource(R.drawable.button_red);
                    wire4.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
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
            case R.id.switch6:
                if (!isSwitchSixIsPress) {
                    buttonFive.setImageResource(R.drawable.button_green);
                    wire6.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    mp.start();
                    turn --;
                    isSwitchSixIsPress = true;
                } else {
                    buttonFive.setImageResource(R.drawable.button_red);
                    wire6.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    mp.start();
                    turn --;
                    isSwitchSixIsPress = false;
                }
                break;
            case R.id.nextButton:
                startActivity(new Intent(Level7.this, Level8.class));
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
        if(isSwitchThreeIsPress || isSwitchFourIsPress){
            orGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate2a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate2b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate2c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate2d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGateIsOn2 = true;
        } else {
            orGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate2a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate2b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate2c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate2d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGateIsOn2 = false;
        }
        if(isSwitchFiveIsPress || isSwitchSixIsPress){
            orGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGateIsOn3 = true;
        } else {
            orGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGateIsOn3 = false;
        }
        if(orGateIsOn1 && orGateIsOn2){
            andGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate1c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate1d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate1e.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate1f.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate1g.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGateIsOn1 = true;
        } else {
            andGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate1c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate1d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate1e.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate1f.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate1g.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGateIsOn1 = false;
        }
        if(orGateIsOn2 && orGateIsOn3){
            andGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate2a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate2b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate2c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate2d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate2e.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate2f.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate2g.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGateIsOn2 = true;
        } else {
            andGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate2a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate2b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate2c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate2d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate2e.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate2f.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate2g.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGateIsOn2 = false;
        }
        if(andGateIsOn1 ^ andGateIsOn2){
            xorGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate1c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate1d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGateIsOn1 = true;
        } else {
            xorGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate1c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate1d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn1 = false;
        }
        if(andGateIsOn1 ^ xorGateIsOn1){
            xorGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate2a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate2b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate2c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate2d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGateIsOn2 = true;
        } else {
            xorGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate2a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate2b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate2c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate2d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn2 = false;
        }
        if(xorGateIsOn1 || andGateIsOn2){
            orGateColor4.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate4a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate4b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate4c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate4d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGateIsOn4 = true;
        } else {
            orGateColor4.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate4a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate4b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate4c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate4d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGateIsOn4 = false;
        }
        if(andGateIsOn1 || xorGateIsOn2){
            orGateColor5.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate5a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate5b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate5c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGateIsOn5 = true;
        } else {
            orGateColor5.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate5a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate5b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate5c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGateIsOn5 = false;
        }
        if(xorGateIsOn2 && orGateIsOn4){
            andGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate3c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate3d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGateIsOn3 = true;
        } else {
            andGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate3c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate3d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGateIsOn3 = false;
        }
        if(orGateIsOn4 ^ andGateIsOn2){
            xorGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate3c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGateIsOn3 = true;
        } else {
            xorGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate3c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn3 = false;
        }
        if(orGateIsOn5 || andGateIsOn3){
            orGateColor6.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate6a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate6b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate6c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGateIsOn6 = true;
        } else {
            orGateColor6.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate6a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate6b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate6c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGateIsOn6 = false;
        }
        if(andGateIsOn3 ^ xorGateIsOn3){
            xorGateColor4.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate4a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate4b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate4c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGateIsOn4 = true;
        } else {
            xorGateColor4.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate4a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate4b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate4c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn4 = false;
        }
        if(orGateIsOn6 && xorGateIsOn4){
            outputLed.setImageResource(R.drawable.led_green);
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            buttonSix.setEnabled(false);
            nextButton.setVisibility(View.VISIBLE);
        } else {
            outputLed.setImageResource(R.drawable.led_red);
        }
        if(turn == 0 && !(orGateIsOn6 && xorGateIsOn4)){
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            buttonSix.setEnabled(false);
            turns.setText("Game Over");
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(Level7.this,MainMenu.class));
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

