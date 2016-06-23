package com.alicia.delishdemo102;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by alici on 5/15/2016.
 */
public class Login extends AppCompatActivity{
    TextView title;
    Button email, go;
    EditText emailenter, passwordenter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
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
                emailenter.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        emailenter.setText("");
                    }
                });

                passwordenter= (EditText)findViewById(R.id.passwordenter);
                passwordenter.setVisibility(View.VISIBLE);
                passwordenter.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        passwordenter.setText("");
                    }
                });
                go = (Button)findViewById(R.id.go);
                go.setVisibility(View.VISIBLE);
                go.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Login.this, Welcome.class);
                        startActivity(i);
                    }
                });
            }
        });
    }
}
