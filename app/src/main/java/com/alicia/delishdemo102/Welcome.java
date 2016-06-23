package com.alicia.delishdemo102;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by alici on 5/16/2016.
 */
public class Welcome extends AppCompatActivity {
    public final static int PAGES = 5;
    // You can choose a bigger number for LOOPS, but you know, nobody will fling
    // more than 1000 times just in order to test your "infinite" ViewPager :D
    public final static int LOOPS = 1000;
    public final static int FIRST_PAGE = PAGES * LOOPS / 2;
    public final static float BIG_SCALE = 1.0f;
    public final static float SMALL_SCALE = 0.7f;
    public final static float DIFF_SCALE = BIG_SCALE - SMALL_SCALE;

    public MyPagerAdapter adapter;
    public ViewPager pager;
    Button eat ,loves;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        loves = (Button)findViewById(R.id.loves);
        loves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Welcome.this, Loves.class);
                startActivity(i);
            }
        });
        eat = (Button)findViewById(R.id.eat);
        eat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Welcome.this, MealChoice.class);
                startActivity(i);
            }
        });
        pager = (ViewPager) findViewById(R.id.myviewpager);

        adapter = new MyPagerAdapter(this, this.getSupportFragmentManager());
        pager.setAdapter(adapter);
        pager.setOnPageChangeListener(adapter);


        // Set current item to the middle page so we can fling to both
        // directions left and right
        pager.setCurrentItem(FIRST_PAGE);

        // Necessary or the pager will only have one extra page to show
        // make this at least however many pages you can see
        pager.setOffscreenPageLimit(3);

        // Set margin for pages as a negative number, so a part of next and
        // previous pages will be showed
        pager.setPageMargin(-200);
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
                Intent i = new Intent(Welcome.this, Welcome.class);
                startActivity(i);
                break;
            case R.id.loves:
                Intent intent = new Intent(Welcome.this, Loves.class);
                startActivity(intent);
                break;
        }
        return false;
    }
}
