package com.alicia.delishdemo102;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by alici on 5/19/2016.
 */
public class Results extends AppCompatActivity {
    Button yum, home;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        yum=(Button)findViewById(R.id.b1);
        yum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Results.this, Resturant.class);
                startActivity(i);
            }
        });
        home= (Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Results.this, Welcome.class);
                startActivity(i);

            }
        });
    }
}
