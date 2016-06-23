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
public class Inst2 extends AppCompatActivity {
    Button skip, back, forward, signup, login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inst2);
        getSupportActionBar().hide();
        forward = (Button)findViewById(R.id.inst2forward);
        forward.setVisibility(View.VISIBLE);
        forward.setBackgroundColor(Color.TRANSPARENT);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inst2.this, Inst3.class);
                startActivity(i);
            }
        });
        back = (Button)findViewById(R.id.inst2back);
        back.setVisibility(View.VISIBLE);
        back.setBackgroundColor(Color.TRANSPARENT);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Inst2.this, Inst1.class);
                startActivity(i);
            }
        });
        skip = (Button)findViewById(R.id.inst2skip);
        skip.setVisibility(View.VISIBLE);
        skip.setBackgroundColor(Color.TRANSPARENT);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inst2.this, Login.class);
                startActivity(i);
            }
        });
        signup = (Button)findViewById(R.id.inst2signup);
        signup.setVisibility(View.VISIBLE);
        signup.setBackgroundColor(Color.TRANSPARENT);
        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Inst2.this, SignUp.class);
                startActivity(i);
            }
        });
        login = (Button)findViewById(R.id.inst2login);
        login.setVisibility(View.VISIBLE);
        login.setBackgroundColor(Color.TRANSPARENT);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Inst2.this, Login.class);
                startActivity(i);
            }
        });

    }
}
