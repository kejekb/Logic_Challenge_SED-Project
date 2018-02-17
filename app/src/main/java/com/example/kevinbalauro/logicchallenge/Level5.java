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

public class Level5 extends AppCompatActivity implements View.OnClickListener {

    boolean isSwitchOneIsPress,isSwitchTwoIsPress,isSwitchThreeIsPress,isSwitchFourIsPress,isSwitchFiveIsPress,isSwitchSixIsPress;
    boolean andGateIsOn1,andGateIsOn2,andGateIsOn3,andGateIsOn4,orGateIsOn1,xorGateIsOn1,xorGateIsOn2,xorGateIsOn3;
    ImageView buttonOne,buttonTwo,buttonThree,buttonFour,buttonFive,buttonSix,outputLed,nextButton;
    View xorGateColor1,xorGateColor2,xorGateColor3,andGateColor1,andGateColor2,andGateColor3,andGateColor4,orGateColor1;
    View wire1,wire2,wire3,wire4,wire5,wire6;
    View andGate1,xorGate1a,xorGate2d,xorGate2e,xorGate2f,xorGate3d,xorGate3e,xorGate3f,xorGate1b,xorGate1c,xorGate1d,andGate2;
    View xorGate2a,xorGate2b,xorGate2c,orGate1a,orGate1b,orGate1c,orGate1d,xorGate3a,xorGate3b,xorGate3c;
    View andGate3a,andGate3b,andGate4a,andGate4b;
    TextView turns;
    int turn = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);

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
        xorGateColor1 = findViewById(R.id.xorGateColor1);
        xorGateColor2 = findViewById(R.id.xorGateColor2);
        xorGateColor3 = findViewById(R.id.xorGateColor3);
        andGateColor1 = findViewById(R.id.andGateColor1);
        andGateColor2 = findViewById(R.id.andGateColor2);
        andGateColor3 = findViewById(R.id.andGateColor3);
        andGateColor4 = findViewById(R.id.andGateColor4);
        orGateColor1 = findViewById(R.id.orGateColor1);
        wire1 = findViewById(R.id.wire1);
        wire2 = findViewById(R.id.wire2);
        wire3 = findViewById(R.id.wire3);
        wire4 = findViewById(R.id.wire4);
        wire5 = findViewById(R.id.wire5);
        wire6 = findViewById(R.id.wire6);
        andGate1 = findViewById(R.id.andGate1);
        xorGate1a = findViewById(R.id.xorGate1a);
        xorGate1b = findViewById(R.id.xorGate1b);
        xorGate1c = findViewById(R.id.xorGate1c);
        xorGate1d = findViewById(R.id.xorGate1d);
        xorGate2d = findViewById(R.id.xorGate2d);
        xorGate2e = findViewById(R.id.xorGate2e);
        xorGate2f = findViewById(R.id.xorGate2f);
        xorGate3d = findViewById(R.id.xorGate3d);
        xorGate3e = findViewById(R.id.xorGate3e);
        xorGate3f = findViewById(R.id.xorGate3f);
        andGate2 = findViewById(R.id.andGate2);
        xorGate2a = findViewById(R.id.xorGate2a);
        xorGate2b = findViewById(R.id.xorGate2b);
        xorGate2c = findViewById(R.id.xorGate2c);
        orGate1a = findViewById(R.id.orGate1a);
        orGate1b = findViewById(R.id.orGate1b);
        orGate1c = findViewById(R.id.orGate1c);
        orGate1d = findViewById(R.id.orGate1d);
        xorGate3a = findViewById(R.id.xorGate3a);
        xorGate3b = findViewById(R.id.xorGate3b);
        xorGate3c = findViewById(R.id.xorGate3c);
        andGate3a = findViewById(R.id.andGate3a);
        andGate3b = findViewById(R.id.andGate3b);
        andGate4a = findViewById(R.id.andGate4a);
        andGate4b = findViewById(R.id.andGate4b);
        outputLed = findViewById(R.id.outputLed);
        nextButton.setVisibility(View.GONE);

        turns = findViewById(R.id.turns);
        turns.setText("Turns: " + turn);

        buttonOne.setImageResource(R.drawable.button_green);
        wire1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        buttonTwo.setImageResource(R.drawable.button_green);
        wire2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        buttonFour.setImageResource(R.drawable.button_green);
        wire4.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        buttonFive.setImageResource(R.drawable.button_green);
        wire5.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        buttonSix.setImageResource(R.drawable.button_green);
        wire6.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        andGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        xorGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        andGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        andGate1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        andGate2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        xorGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        xorGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        xorGate1c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        xorGate1d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        isSwitchOneIsPress = true;
        isSwitchTwoIsPress = true;
        isSwitchFourIsPress = true;
        isSwitchFiveIsPress = true;
        isSwitchSixIsPress = true;

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
                    buttonSix.setImageResource(R.drawable.button_green);
                    wire6.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    mp.start();
                    turn --;
                    isSwitchSixIsPress = true;
                } else {
                    buttonSix.setImageResource(R.drawable.button_red);
                    wire6.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    mp.start();
                    turn --;
                    isSwitchSixIsPress = false;
                }
                break;
            case R.id.nextButton:
                startActivity(new Intent(Level5.this, Level6.class));
                break;
        }
        if(isSwitchOneIsPress && isSwitchTwoIsPress){
            andGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGateIsOn1 = true;
        } else {
            andGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGateIsOn1 = false;
        }
        if(isSwitchThreeIsPress ^ isSwitchFourIsPress){
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
        if(isSwitchFiveIsPress && isSwitchSixIsPress){
            andGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGate2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            andGateIsOn2 = true;
        } else {
            andGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGate2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            andGateIsOn2 = false;
        }
        if(andGateIsOn1 ^ xorGateIsOn1){
            xorGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate2a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate2b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate2c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate2d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate2e.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate2f.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGateIsOn2 = true;
        } else {
            xorGateColor2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate2a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate2b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate2c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate2d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate2e.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate2f.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn2 = false;
        }
        if(xorGateIsOn1 ^ andGateIsOn2){
            xorGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate3c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate3d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate3e.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGate3f.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            xorGateIsOn3 = true;
        } else {
            xorGateColor3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate3a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate3b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate3c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate3d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate3e.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGate3f.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            xorGateIsOn3 = false;
        }
        if(xorGateIsOn2 || xorGateIsOn3){
            orGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate1c.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGate1d.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            orGateIsOn1 = true;
        } else {
            orGateColor1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate1a.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate1b.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate1c.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGate1d.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            orGateIsOn1 = false;
        }
        if(xorGateIsOn2 && orGateIsOn1){
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
        if(orGateIsOn1 && xorGateIsOn3 ){
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
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            nextButton.setVisibility(View.VISIBLE);
        } else {
            outputLed.setImageResource(R.drawable.led_red);
        }

        if(turn == 0 && !(andGateIsOn3 && andGateIsOn4)){
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            turns.setText("Game Over");
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(Level5.this,MainMenu.class));
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
