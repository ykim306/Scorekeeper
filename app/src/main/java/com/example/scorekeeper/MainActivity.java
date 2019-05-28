package com.example.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mScore1, mScore2;
    TextView mScoreText1, mScoreText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScore1 = 0;
        mScore2 = 0;

        mScoreText1 = findViewById(R.id.team1scoreLabel);
        mScoreText2 = findViewById(R.id.team2scoreLabel);
    }

    public void decreaseScore(View view) {
        int viewId = view.getId();

        switch (viewId) {
            case R.id.team1subtractButton:
                if (mScore1 > 0) mScore1--;
                mScoreText1.setText(String.valueOf(mScore1));
                break;
            case R.id.team2subtractButton:
                if (mScore2 > 0) mScore2--;
                mScoreText2.setText(String.valueOf(mScore2));
                break;
        }
    }

    public void increaseScore(View view) {
        int viewId = view.getId();

        switch (viewId) {
            case R.id.team1addButton:
                mScore1++;
                mScoreText1.setText(String.valueOf(mScore1));
                break;
            case R.id.team2addButton:
                mScore2++;
                mScoreText2.setText(String.valueOf(mScore2));
                break;
        }
    }
}
