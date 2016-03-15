package com.example.handsomemark.widgetsandlayouts;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class HomePage extends AppCompatActivity {

    private Button b,bt2,bt3,bt4,bt5,bt6;
    private EditText et;
    private ImageView iv;
    private Vibrator vibe;
    private static final int vibeTime = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home_page);
        b = (Button) findViewById(R.id.button);
        bt2 = (Button) findViewById(R.id.button_goto2);
        bt3 = (Button) findViewById(R.id.button_goto3);
        bt4 = (Button) findViewById(R.id.button_goto4);
        bt5 = (Button) findViewById(R.id.button_goto5);
        bt6 = (Button) findViewById(R.id.button_goto6);
        et = (EditText) findViewById(R.id.text_edit);
        iv = (ImageView) findViewById(R.id.image_view);
        vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog p = new ProgressDialog(HomePage.this);
                p.setTitle("This may take several seconds.");
                p.setMessage("Loading");
                p.setCancelable(true);
                p.show();
                iv.setImageResource(R.drawable.selfiee);
                et.setText("自拍");
                vibe.vibrate(vibeTime);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this,SecondPage.class);
                startActivity(i);
                vibe.vibrate(vibeTime);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this,ThirdPage.class);
                startActivity(i);
                vibe.vibrate(vibeTime);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this,FourthPage.class);
                startActivity(i);
                vibe.vibrate(vibeTime);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this,FifthPage.class);
                startActivity(i);
                vibe.vibrate(vibeTime);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this,SixPage.class);
                startActivity(i);
                vibe.vibrate(vibeTime);
            }
        });
    }
}
