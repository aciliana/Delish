package com.alicia.delishdemo102;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by alici on 5/15/2016.
 */
public class Inst4 extends AppCompatActivity{
    Button skip, back, signup, login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inst4);
        getSupportActionBar().hide();
        back = (Button)findViewById(R.id.inst4back);
        back.setVisibility(View.VISIBLE);
        back.setBackgroundColor(Color.TRANSPARENT);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Inst4.this, Inst3.class);
                startActivity(i);
            }
        });
        skip = (Button)findViewById(R.id.inst4skip);
        skip.setVisibility(View.VISIBLE);
        skip.setBackgroundColor(Color.TRANSPARENT);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inst4.this, Login.class);
                startActivity(i);
            }
        });
        signup = (Button)findViewById(R.id.inst4signup);
        signup.setVisibility(View.VISIBLE);
        signup.setBackgroundColor(Color.TRANSPARENT);
        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Inst4.this, SignUp.class);
                startActivity(i);
            }
        });
        login = (Button)findViewById(R.id.inst4login);
        login.setVisibility(View.VISIBLE);
        login.setBackgroundColor(Color.TRANSPARENT);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Inst4.this, Login.class);
                startActivity(i);
            }
        });
    }
}
