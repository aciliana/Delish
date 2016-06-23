package com.alicia.delishdemo102;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by alici on 5/16/2016.
 */
public class MealChoice extends AppCompatActivity{
    Button breakfast, lunch, dinner, dessert, any;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mealchoice);
        breakfast = (Button)findViewById(R.id.spon1);
        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MealChoice.this, RestrictionChoice.class);
                startActivity(i);
            }
        });
        lunch = (Button)findViewById(R.id.spon2);
        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MealChoice.this, RestrictionChoice.class);
                startActivity(i);
            }
        });
        dinner = (Button)findViewById(R.id.dinner);
        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MealChoice.this, RestrictionChoice.class);
                startActivity(i);
            }
        });
        dessert = (Button)findViewById(R.id.dessert);
        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MealChoice.this, RestrictionChoice.class);
                startActivity(i);
            }
        });
        any = (Button)findViewById(R.id.any);
        any.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MealChoice.this, RestrictionChoice.class);
                startActivity(i);
            }
        });
    }
    @Override
    public boolean onPrepareOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.btm:
                Intent i = new Intent(MealChoice.this, Welcome.class);
                startActivity(i);
                break;
            case R.id.loves:
                Intent intent = new Intent(MealChoice.this, Loves.class);
                startActivity(intent);
                break;
        }
        return false;
    }
}
