package com.example.denfo.about;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button butt1;
    public void init(){
        butt1=(Button)findViewById(R.id.butt1);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent A=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(A);
            }
        });
    }

    public Button butt2;
    public void ini(){
        butt2=(Button)findViewById(R.id.butt2);
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(B);
            }
        });
    }
    public Button butt3;
    public void initit(){
        butt3=(Button)findViewById(R.id.butt3);
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent C=new Intent(MainActivity.this,Main4Activity.class);
                startActivity(C);
            }
        });
    }
    public Button butt4;
    public void inititit(){
        butt4=(Button)findViewById(R.id.butt4);
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent D=new Intent(MainActivity.this,Main5Activity.class);
                startActivity(D);
            }
        });
    }
    public Button butt5;
    public void initititit(){
        butt5=(Button)findViewById(R.id.butt5);
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent E=new Intent(MainActivity.this,Main6Activity.class);
                startActivity(E);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        ini();
        initit();
        inititit();
        initititit();
    }
}

