package com.example.kevinbalauro.logicchallenge;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Level9 extends AppCompatActivity implements View.OnClickListener{

    boolean orGateIsOn1,orGateIsOn2,andGateIsOn1,andGateIsOn2,xorGateIsOn1,xorGateIsOn2,xorGateIsOn3,xorGateIsOn4,xorGateIsOn5;
    boolean isSwitchOneIsPress,isSwitchTwoIsPress,isSwitchThreeIsPress,isSwitchFourIsPress,isSwitchFiveIsPress;
    ImageView buttonOne,buttonTwo,buttonThree,buttonFour,buttonFive,outputLed,nextButton;
    View wire1a,wire2a,wire2b,wire2c,wire3,wire4a,wire4b,wire4c,wire4d,wire5;
    View wire1b,wire2d,wire2e,wire2f,andGate1a,andGate1b,andGate1c,xorGate1;
    View xorGate2,wire2g,wire2h,wire2i,wire2j,andGate1d,xorGate3a;
    View orGate1a,orGate1b,orGate1c,andGate2a,andGate2b,andGate2c,andGate2d,xorGate3b,xorGate3c,xorGate3d;
    View xorGate4a,xorGate4b,xorGate4c,orGate2a,orGate2b,orGate2c,xorGate5;
    View orGateColor1,orGateColor2,andGateColor1,andGateColor2,xorGateColor1,xorGateColor2,xorGateColor3,xorGateColor4,xorGateColor5;
    TextView turns;
    int turn = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level9);

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
        wire2b = findViewById(R.id.wire2b);
        wire2c = findViewById(R.id.wire2c);
        wire3 = findViewById(R.id.wire3);
        wire4a = findViewById(R.id.wire4a);
        wire4b = findViewById(R.id.wire4b);
        wire4c = findViewById(R.id.wire4c);
        wire4d = findViewById(R.id.wire4d);
        wire5 = findViewById(R.id.wire5);
        wire1b = findViewById(R.id.wire1b);
        wire2d = findViewById(R.id.wire2d);
        wire2e = findViewById(R.id.wire2e);
        wire2f = findViewById(R.id.wire2f);
        andGate1a = findViewById(R.id.andGate1a);
        andGate1b = findViewById(R.id.andGate1b);
        andGate1c = findViewById(R.id.andGate1c);
        xorGate1 = findViewById(R.id.xorGate1);
        xorGate2 = findViewById(R.id.xorGate2);
        wire2g = findViewById(R.id.wire2g);
        wire2h = findViewById(R.id.wire2h);
        wire2i = findViewById(R.id.wire2i);
        wire2j = findViewById(R.id.wire2j);
        andGate1d = findViewById(R.id.andGate1d);
        xorGate3a = findViewById(R.id.xorGate3a);
        orGate1a = findViewById(R.id.orGate1a);
        orGate1b = findViewById(R.id.orGate1b);
        orGate1c = findViewById(R.id.orGate1c);
        andGate2a = findViewById(R.id.andGate2a);
        andGate2b = findViewById(R.id.andGate2b);
        andGate2c = findViewById(R.id.andGate2c);
        andGate2d = findViewById(R.id.andGate2d);
        xorGate3b = findViewById(R.id.xorGate3b);
        xorGate3c = findViewById(R.id.xorGate3c);
        xorGate3d = findViewById(R.id.xorGate3d);
        xorGate4a = findViewById(R.id.xorGate4a);
        xorGate4b = findViewById(R.id.xorGate4b);
        xorGate4c = findViewById(R.id.xorGate4c);
        orGate2a = findViewById(R.id.orGate2a);
        orGate2b = findViewById(R.id.orGate2b);
        orGate2c = findViewById(R.id.orGate2c);
        xorGate5 = findViewById(R.id.xorGate5);
        orGateColor1 = findViewById(R.id.orGateColor1);
        orGateColor2 = findViewById(R.id.orGateColor2);
        andGateColor1 = findViewById(R.id.andGateColor1);
        andGateColor2 = findViewById(R.id.andGateColor2);
        xorGateColor1 = findViewById(R.id.xorGateColor1);
        xorGateColor2 = findViewById(R.id.xorGateColor2);
        xorGateColor3 = findViewById(R.id.xorGateColor3);
        xorGateColor4 = findViewById(R.id.xorGateColor4);
        xorGateColor5 = findViewById(R.id.xorGateColor5);
        outputLed = findViewById(R.id.outputLed);
        nextButton.setVisibility(View.GONE);

        turns = findViewById(R.id.turns);
        turns.setText("Turns: " + turn);
        buttonOne.setImageResource(R.drawable.button_green);
        buttonTwo.setImageResource(R.drawable.button_green);
        buttonFour.setImageResource(R.drawable.button_green);
        buttonFive.setImageResource(R.drawable.button_green);
        wire1a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire1b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2e.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2f.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2g.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2h.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2i.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2j.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire4a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire4b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire4c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire4d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire5.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        orGate1c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        xorGateColor4.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        xorGate4a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        xorGate4b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        xorGate4c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        isSwitchOneIsPress = true;
        isSwitchTwoIsPress = true;
        isSwitchFourIsPress = true;
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
                        wire2f.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                        wire2g.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                        wire2h.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                        wire2i.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                        wire2j.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
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
                    wire2f.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire2g.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire2h.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire2i.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire2j.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
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
                startActivity(new Intent(Level9.this, MainMenu.class));
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
        if(isSwitchTwoIsPress && isSwitchThreeIsPress && isSwitchFourIsPress){
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
        if(isSwitchFourIsPress ^ isSwitchFiveIsPress){
            xorGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGateIsOn1 = true;
        } else {
            xorGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn1 = false;
        }
        if(andGateIsOn1 ^ xorGateIsOn1){
            xorGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate3c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate3d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGateIsOn3 = true;
        } else {
            xorGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate3c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate3d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn3 = false;
        }
        if(xorGateIsOn2 || isSwitchTwoIsPress){
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
        if(orGateIsOn1 ^ andGateIsOn2){
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
        if(andGateIsOn2 || xorGateIsOn3){
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
        if(xorGateIsOn4 && orGateIsOn2){
            xorGateColor5.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate5.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGateIsOn5 = true;
        } else {
            xorGateColor5.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate5.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn5 = false;
        }
        if(xorGateIsOn5){
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
        if(turn == 0 && !xorGateIsOn5){
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            turns.setText("Game Over");
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(Level9.this,MainMenu.class));
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
