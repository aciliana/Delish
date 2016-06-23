package com.alicia.delishdemo102;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by alici on 5/19/2016.
 */
public class MoreResults extends AppCompatActivity {
    Button yum,home;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moreresults);
        yum=(Button)findViewById(R.id.b1);
        yum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreResults.this, Resturant.class);
                startActivity(i);
            }
        });
        home= (Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreResults.this, Welcome.class);
                startActivity(i);

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
                Intent i = new Intent(MoreResults.this, Welcome.class);
                startActivity(i);
                break;
            case R.id.loves:
                Intent intent = new Intent(MoreResults.this, Loves.class);
                startActivity(intent);
                break;
        }
        return false;
    }
}
