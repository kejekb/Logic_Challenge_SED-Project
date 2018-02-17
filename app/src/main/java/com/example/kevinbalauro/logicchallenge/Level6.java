package com.example.kevinbalauro.logicchallenge;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Level6 extends AppCompatActivity implements View.OnClickListener {

    boolean isSwitchOneIsPress,isSwitchTwoIsPress,isSwitchThreeIsPress,isSwitchFourIsPress,isSwitchFiveIsPress;
    boolean xorGateIsOn1,xorGateIsOn2,xorGateIsOn3,andGateIsOn1,andGateIsOn2,andGateIsOn3,andGateIsOn4,andGateIsOn5;
    View wire1,wire2a,wire2e,wire3,wire4a,wire4e,wire5;
    View xorGate1a,wire2b,wire2c,wire2d,andGate1,wire4b,wire4c,wire4d,wire4f,andGate2;
    View xorGate1b,andGate3a,andGate3b,andGate3c,xorGate2a;
    View andGate4,andGate5a,andGate5b,andGate5c,xorGate2b;
    View xorGate3,xorGate2c,xorGate2d;
    View xorGateColor1,xorGateColor2,xorGateColor3,andGateColor1,andGateColor2,andGateColor3,orGateColor,andGateColor5;
    ImageView buttonOne,buttonTwo,buttonThree,buttonFour,buttonFive,outputLed,nextButton;
    TextView turns;
    int turn = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level6);

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
        wire2e = findViewById(R.id.wire2e);
        wire3 = findViewById(R.id.wire3);
        wire4a = findViewById(R.id.wire4a);
        wire4e = findViewById(R.id.wire4e);
        wire5 = findViewById(R.id.wire5);
        xorGate1a = findViewById(R.id.xorGate1a);
        wire2b = findViewById(R.id.wire2b);
        wire2c = findViewById(R.id.wire2c);
        wire2d = findViewById(R.id.wire2d);
        andGate1 = findViewById(R.id.andGate1);
        wire4b = findViewById(R.id.wire4b);
        wire4c = findViewById(R.id.wire4c);
        wire4d = findViewById(R.id.wire4d);
        wire4f = findViewById(R.id.wire4f);
        andGate2 = findViewById(R.id.andGate2);
        xorGate1b = findViewById(R.id.xorGate1b);
        andGate3a = findViewById(R.id.andGate3a);
        andGate3b = findViewById(R.id.andGate3b);
        andGate3c = findViewById(R.id.andGate3c);
        xorGate2a = findViewById(R.id.xorGate2a);
        andGate4 = findViewById(R.id.andGate4);
        andGate5a = findViewById(R.id.andGate5a);
        andGate5b = findViewById(R.id.andGate5b);
        andGate5c = findViewById(R.id.andGate5c);
        xorGate2b = findViewById(R.id.xorGate2b);
        xorGate3 = findViewById(R.id.xorGate3);
        xorGate2c = findViewById(R.id.xorGate2c);
        xorGate2d = findViewById(R.id.xorGate2d);
        xorGateColor1 = findViewById(R.id.xorGateColor1);
        xorGateColor2 = findViewById(R.id.xorGateColor2);
        xorGateColor3 = findViewById(R.id.xorGateColor3);
        andGateColor1 = findViewById(R.id.andGateColor1);
        andGateColor2 = findViewById(R.id.andGateColor2);
        andGateColor3 = findViewById(R.id.andGateColor3);
        orGateColor = findViewById(R.id.orGateColor);
        andGateColor5 = findViewById(R.id.andGateColor5);
        outputLed = findViewById(R.id.outputLed);
        nextButton.setVisibility(View.GONE);

        turns = findViewById(R.id.turns);
        turns.setText("Turns: " + turn);
        buttonOne.setImageResource(R.drawable.button_green);
        buttonTwo.setImageResource(R.drawable.button_green);
        buttonFour.setImageResource(R.drawable.button_green);
        buttonFive.setImageResource(R.drawable.button_green);
        wire1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire2e.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire4a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire4b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire4c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire4d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire4e.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire4f.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        wire5.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        andGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        isSwitchOneIsPress = true;
        isSwitchTwoIsPress = true;
        isSwitchFourIsPress = true;
        isSwitchFiveIsPress = true;

    }
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
                    wire4e.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    wire4f.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    mp.start();
                    turn --;
                    isSwitchFourIsPress = true;
                } else {
                    buttonFour.setImageResource(R.drawable.button_red);
                    wire4a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire4a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire4b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire4c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire4d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire4e.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    wire4f.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
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
                startActivity(new Intent(Level6.this, Level7.class));
                break;
        }
        if(isSwitchOneIsPress ^ isSwitchTwoIsPress){
            xorGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGateIsOn1 = true;
        } else {
            xorGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn1 = false;
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
        if(isSwitchFourIsPress && isSwitchFiveIsPress){
            andGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGateIsOn2 = true;
        } else {
            andGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGateIsOn2 = false;
        }
        if(isSwitchTwoIsPress && andGateIsOn1 && isSwitchFourIsPress){
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
        if(isSwitchFourIsPress ^ andGateIsOn2){
            xorGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate2a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate2b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate2c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate2d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGateIsOn2 = true;
        } else{
            xorGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate2a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate2b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate2c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate2d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn2 = false;
        }
        if(xorGateIsOn1 || andGateIsOn3){
            orGateColor.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate4.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGateIsOn4 = true;
        } else {
            orGateColor.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate4.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGateIsOn4 = false;
        }
        if(andGateIsOn3){
            andGateColor5.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate5a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate5b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate5c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGateIsOn5 = true;
        } else {
            andGateColor5.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate5a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate5b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate5c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGateIsOn5 = false;
        }
        if(andGateIsOn4 ^ andGateIsOn5){
            xorGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGateIsOn3 = true;
        } else {
            xorGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn3 = false;
        }
        if(xorGateIsOn2 && xorGateIsOn3){
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
        if(turn == 0 && !(xorGateIsOn2 && xorGateIsOn3)){
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            turns.setText("Game Over");
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(Level6.this,MainMenu.class));
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
