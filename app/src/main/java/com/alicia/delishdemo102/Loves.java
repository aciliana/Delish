package com.alicia.delishdemo102;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by alici on 5/18/2016.
 */
public class Loves extends AppCompatActivity{
    TextView msg, t1;
    Button b1;
    RelativeLayout layout;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loves);
        msg = (TextView)findViewById(R.id.msg);
        t1 = (TextView)findViewById(R.id.t1);
        b1 = (Button) findViewById(R.id.b1);
        layout = (RelativeLayout)findViewById(R.id.layout);
        layout.setPadding(0,10,0,10);
        if(Moreinfo.loved == true){
            msg.setVisibility(View.GONE);
            t1.setVisibility(View.VISIBLE);
            b1.setVisibility(View.VISIBLE);

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Loves.this, Resturant.class);
                    startActivity(i);
                }
            });

        }
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
                Intent i = new Intent(Loves.this, Welcome.class);
                startActivity(i);
                break;
            case R.id.loves:
                Intent intent = new Intent(Loves.this, Loves.class);
                startActivity(intent);
                break;
        }
        return false;
    }
}
