package com.example.divyansh.quizgamedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Question2 extends AppCompatActivity {

    Intent intent;
    int point;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        intent = getIntent();
        s = intent.getStringExtra("answer1");
        point = Integer.parseInt(s);

    }

    public void answer2(View view) {
        int id = view.getId();

        if(id == R.id.q2r3){

            point++;
        }
        else{
            // do nothing
        }
    }

    public void jump2(View view) {
        intent = new Intent(this,Question3.class);
        s=String.valueOf(point);
        intent.putExtra("answer2",s);
        startActivity(intent);

    }
}
