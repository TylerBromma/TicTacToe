package com.example.comxb.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    boolean turn = true;

    public void X(View view) {
        if(((Button) view).getText() == "X" || ((Button) view).getText() == "O"){
        } else {
            if (turn) {
                ((Button) view).setText("X");
                turn = false;
            } else {
                ((Button) view).setText("O");
                turn = true;
            }
            win("O",R.id.one,R.id.two,R.id.three);
            win("O",R.id.four,R.id.five,R.id.six);
            win("O",R.id.seven,R.id.eight,R.id.nine);
            win("O",R.id.one,R.id.four,R.id.seven);
            win("O",R.id.two,R.id.five,R.id.eight);
            win("O",R.id.three,R.id.six,R.id.nine);
            win("O",R.id.one,R.id.five,R.id.nine);
            win("O",R.id.three,R.id.five,R.id.seven);
            win("X",R.id.one,R.id.two,R.id.three);
            win("X",R.id.four,R.id.five,R.id.six);
            win("X",R.id.seven,R.id.eight,R.id.nine);
            win("X",R.id.one,R.id.four,R.id.seven);
            win("X",R.id.two,R.id.five,R.id.eight);
            win("X",R.id.three,R.id.six,R.id.nine);
            win("X",R.id.one,R.id.five,R.id.nine);
            win("X",R.id.three,R.id.five,R.id.seven);
        }
    }

    public void win(String player, int slot1,int slot2,int slot3){
        if(((Button) findViewById(slot1)).getText() == player && ((Button) findViewById(slot2)).getText() == player && ((Button) findViewById(slot3)).getText() == player){
            ((TextView) findViewById(R.id.textView)).setText(player + " wins!");
        }
    }
}
