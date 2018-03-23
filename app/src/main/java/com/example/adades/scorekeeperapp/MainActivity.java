package com.example.adades.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreBlue;
    int scoreRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jabBlue(View view){
        scoreBlue++;
        displayBlue(scoreBlue);
    }
    public void jabRed(View view){
        scoreRed++;
        displayRed(scoreRed);
    }

    public void hookBlue(View view){
        scoreBlue++;
        displayBlue(scoreBlue);
    }
    public void hookRed(View view){
        scoreRed++;
        displayRed(scoreRed);
    }

    public void lowerBlue(View view){
        scoreBlue++;
        displayBlue(scoreBlue);
    }

    public void lowerRed(View view){
        scoreRed++;
        displayRed(scoreRed);
    }

    public void upperBlue(View view){
        scoreBlue+=2;
        displayBlue(scoreBlue);
    }
    public void upperRed(View view){
        scoreRed+=2;
        displayRed(scoreRed);
    }
    public void projectionBlue (View view){
        scoreBlue+=2;
        displayBlue(scoreBlue);
    }
    public void projectionRed (View view){
        scoreRed+=2;
        displayRed(scoreRed);
    }
    public void resetBlue (View view){
        scoreBlue=0;
        displayBlue(scoreBlue);
    }
    public void resetRed (View view){
        scoreRed=0;
        displayRed(scoreRed);
    }
    public void displayBlue(int score){
        TextView scoreBlue = (TextView) findViewById(R.id.score_blue);
        scoreBlue.setText(""+score);
    }

    public void displayRed(int score){
        TextView scoreRed = (TextView) findViewById(R.id.score_red);
        scoreRed.setText(""+score);
    }
}
