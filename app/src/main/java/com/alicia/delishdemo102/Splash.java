package com.alicia.delishdemo102;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

/**
 * Created by alici on 5/15/2016.
 */
public class Splash extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        Thread timerThread = new Thread(){
            public void run(){
                try{//try to display splash for 4 seconds
                    sleep(3000);
                }catch(InterruptedException e){//otherwise print error
                    e.printStackTrace();
                }finally{//display the next screen
                    Intent i = new Intent(Splash.this, Inst1.class);
                    startActivity(i);
                }
            }
        };
        timerThread.start();
    }
    @Override
    protected void onPause() {
        // destroy screen after used
        super.onPause();
        finish();
    }

}
