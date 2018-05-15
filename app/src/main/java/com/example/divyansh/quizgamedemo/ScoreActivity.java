package com.example.divyansh.quizgamedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    Intent intent;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        intent = getIntent();
        String s = intent.getStringExtra("answer3");
        t = (TextView)findViewById(R.id.textid);
        t.setText("Score: "+s);

    }

    public void jumpOnMainClick(View view) {
        intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
