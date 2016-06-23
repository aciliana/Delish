package com.alicia.delishdemo102;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by alici on 5/16/2016.
 */
public class RestrictionChoice extends AppCompatActivity{
    Button b1, b2, b3,b4,b5,b6,b7,b8,go;
    Boolean c1 = false,c2 = false,c3 = false,c4 = false,c5 = false,c6 = false,c7 = false,c8 = false;
    int count = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restrictionchoice);
        b1= (Button)findViewById(R.id.spon1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c1==false){
                    b1.setBackgroundResource(R.drawable.button_boarder2);
                    b1.setText("Vegan");
                    c1=true;
                    count++;
                }else{
                    b1.setBackgroundResource(R.drawable.vegan);
                    b1.setText("");
                    c1=false;
                    count--;
                }
            }
        });
        b2= (Button)findViewById(R.id.spon2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c2==false){
                    b2.setBackgroundResource(R.drawable.button_boarder2);
                    b2.setText("Glucose Control");
                    c2=true;
                    count++;
                }else{
                    b2.setBackgroundResource(R.drawable.gluccontrol);
                    b2.setText("");
                    c2=false;
                    count--;
                }
            }
        });
        b3= (Button)findViewById(R.id.spon3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c3==false){
                    b3.setBackgroundResource(R.drawable.button_boarder2);
                    b3.setText("Gluten Free");
                    c3=true;
                    count++;
                }else{
                    b3.setBackgroundResource(R.drawable.glutfree);
                    b3.setText("");
                    c3=false;
                    count--;
                }
            }
        });
        b4= (Button)findViewById(R.id.spon4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c4==false){
                    b4.setBackgroundResource(R.drawable.button_boarder2);
                    b4.setText("Vegetarian");
                    c4=true;
                    count++;
                }else{
                    b4.setBackgroundResource(R.drawable.vegetarian);
                    b4.setText("");
                    c4=false;
                    count--;
                }
            }
        });
        b5= (Button)findViewById(R.id.spon5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c5==false){
                    b5.setBackgroundResource(R.drawable.button_boarder2);
                    b5.setText("Low Sodium");
                    c5=true;
                    count++;
                }else{
                    b5.setBackgroundResource(R.drawable.lowsodium);
                    b5.setText("");
                    c5=false;
                    count--;
                }
            }
        });
        b6= (Button)findViewById(R.id.spon6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c6==false){
                    b6.setBackgroundResource(R.drawable.button_boarder2);
                    b6.setText("Low Carb");
                    c6=true;
                    count++;
                }else{
                    b6.setBackgroundResource(R.drawable.lowcarb);
                    b6.setText("");
                    c6=false;
                    count--;
                }
            }
        });
        b7= (Button)findViewById(R.id.spon7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c7==false){
                    b7.setBackgroundResource(R.drawable.button_boarder2);
                    b7.setText("Low fat");
                    c7=true;
                    count++;
                }else{
                    b7.setBackgroundResource(R.drawable.lowfat);
                    b7.setText("");
                    c7=false;
                    count--;
                }
            }
        });
        b8= (Button)findViewById(R.id.spon8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c8==false){
                    b8.setBackgroundResource(R.drawable.button_boarder2);
                    b8.setText("Lactose Free");
                    c8=true;
                    count++;
                }else{
                    b8.setBackgroundResource(R.drawable.lactfree);
                    b8.setText("");
                    c8=false;
                    count--;
                }
            }
        });
        go= (Button)findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count == 1) {
                    Intent i = new Intent(RestrictionChoice.this, Results.class);
                    startActivity(i);
                }else {
                    Intent i = new Intent(RestrictionChoice.this, MoreResults.class);
                    startActivity(i);
                }
            }
        });
    }

}
