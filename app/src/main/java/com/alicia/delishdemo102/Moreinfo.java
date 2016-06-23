package com.alicia.delishdemo102;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by alici on 5/18/2016.
 */
public class Moreinfo extends AppCompatActivity {
    public static boolean loved = false;
    Button heart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moreinfo);
        heart = (Button) findViewById(R.id.button);
        heart.setVisibility(View.VISIBLE);
        heart.setBackgroundColor(Color.TRANSPARENT);
        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Moreinfo.this, Resturant.class);
                startActivity(i);
                loved = true;
                Toast.makeText(getApplicationContext(), "Added to loves", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.btm:
                Intent i = new Intent(Moreinfo.this, Welcome.class);
                startActivity(i);
                break;
            case R.id.loves:
                Intent intent = new Intent(Moreinfo.this, Loves.class);
                startActivity(intent);
                break;
        }
        return false;
    }
    @Override
    protected void onPause() {
        // destroy screen after used
        super.onPause();
        finish();
    }
}
