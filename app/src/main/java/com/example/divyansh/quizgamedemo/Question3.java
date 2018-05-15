package com.example.divyansh.quizgamedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Question3 extends AppCompatActivity {

    Intent intent;
    int point;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);


        intent = getIntent();
        s = intent.getStringExtra("answer2");
        point = Integer.parseInt(s);
    }

    public void answer3(View view) {
        int id  = view.getId();

        if(id == R.id.q3r2){
            point++;
        }
        else{
            // do nothing
        }
    }

    public void jump3(View view) {

        intent = new Intent(this,ScoreActivity.class);
        s = String.valueOf(point);
        intent.putExtra("answer3",s);
        startActivity(intent);
    }
}
