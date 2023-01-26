package com.example.selfreflection;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    CheckBox checkBox6;
    CheckBox checkBox7;
    Button button;
    TextView textView3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox1=findViewById(R.id.checkbox1);
        checkBox2=findViewById(R.id.checkbox2);
        checkBox3=findViewById(R.id.checkbox3);
        checkBox4=findViewById(R.id.checkbox4);
        checkBox5=findViewById(R.id.checkbox5);
        checkBox6=findViewById(R.id.checkbox6);
        checkBox7=findViewById(R.id.checkbox7);
        button=findViewById(R.id.button);
        textView3=findViewById(R.id.textView3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Main.class);
                i.putExtra("selfCheck",getScore());
                startActivity(i);
            }
        });
    }
    public int getScore(){
        int sum=0,pr1=5,pr2=3,pr3=2,pr4=1;
        if(checkBox1.isChecked())
            sum+=pr3;
        if(checkBox2.isChecked())
            sum+=pr2;
        if(checkBox3.isChecked())
            sum+=pr1;
        if(checkBox4.isChecked())
            sum+=pr1;
        if(checkBox5.isChecked())
            sum+=pr2;
        if(checkBox6.isChecked())
            sum+=pr4;
        if(checkBox7.isChecked())
            sum+=pr4;
        return sum;
    }
}