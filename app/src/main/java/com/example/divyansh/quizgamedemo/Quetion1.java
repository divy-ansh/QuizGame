package com.example.divyansh.quizgamedemo;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Quetion1 extends AppCompatActivity {

    public int point = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quetion1);

    }

    public void answer1(View view) {

        int id = view.getId();

        if(id == R.id.q1r1){
            point++;
        }
        else{
            //do nothing
        }
    }

    public void jump1(View view) {
        Intent intent = new Intent(this,Question2.class);
        String s = String.valueOf(point);
        intent.putExtra("answer1" ,s);
        startActivity(intent);
    }
}
