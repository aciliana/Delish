package com.alicia.delishdemo102;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by alici on 5/15/2016.
 */
public class SignUp extends AppCompatActivity{
    TextView title;
    Button email, go;
    EditText emailenter,passwordreenter, passwordenter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();
        title = (TextView)findViewById(R.id.title);
        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/PdPMedium.ttf");
        title.setTypeface(type);
        email = (Button)findViewById(R.id.emaillogin);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emailenter= (EditText)findViewById(R.id.emailenter);
                emailenter.setVisibility(View.VISIBLE);
                passwordenter= (EditText)findViewById(R.id.passwordenter);
                passwordenter.setVisibility(View.VISIBLE);
                passwordreenter=(EditText)findViewById(R.id.passwordreenter);
                passwordreenter.setVisibility(View.VISIBLE);
                go = (Button)findViewById(R.id.go);
                go.setVisibility(View.VISIBLE);
                go.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(SignUp.this, Welcome.class);
                        startActivity(i);
                    }
                });
            }
        });
    }
}
