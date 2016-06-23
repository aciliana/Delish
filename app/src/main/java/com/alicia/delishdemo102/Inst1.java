package com.alicia.delishdemo102;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inst1 extends AppCompatActivity {
    Button skip, forward, signup, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inst1);
        getSupportActionBar().hide();
        forward = (Button)findViewById(R.id.inst1forward);
        forward.setVisibility(View.VISIBLE);
        forward.setBackgroundColor(Color.TRANSPARENT);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inst1.this, Inst2.class);
                startActivity(i);
            }
        });
        skip = (Button)findViewById(R.id.inst1skip);
        skip.setVisibility(View.VISIBLE);
        skip.setBackgroundColor(Color.TRANSPARENT);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inst1.this, Login.class);
                startActivity(i);
            }
        });
        signup = (Button)findViewById(R.id.inst1signup);
        signup.setVisibility(View.VISIBLE);
        signup.setBackgroundColor(Color.TRANSPARENT);
        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Inst1.this, SignUp.class);
                startActivity(i);
            }
        });
        login = (Button)findViewById(R.id.inst1login);
        login.setVisibility(View.VISIBLE);
        login.setBackgroundColor(Color.TRANSPARENT);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Inst1.this, Login.class);
                startActivity(i);
            }
        });
    }
}
