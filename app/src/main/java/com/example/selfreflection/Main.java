package com.example.selfreflection;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main extends AppCompatActivity {
    TextView result;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        result=findViewById(R.id.result);
        Intent i=getIntent();
        int score=i.getIntExtra("selfCheck",0);
        int maxScore=20;
        result.setText(""+score+"/"+maxScore);
        if(score==20)
            Toast.makeText(Main.this,"Perfect Day you are unstoppable",Toast.LENGTH_LONG).show();
        else if(score>15)
            Toast.makeText(Main.this,"Good Work be Consistent to get perfect",Toast.LENGTH_LONG).show();
        else if(score>10)
            Toast.makeText(Main.this,"Never Give Up Let it not repeat again",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(Main.this,"Give it a thought you can do much better",Toast.LENGTH_LONG).show();
    }
}