package com.example.handsomemark.widgetsandlayouts;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class HomePage extends AppCompatActivity {

    private Button b,bt2;
    private EditText et;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home_page);
        b = (Button) findViewById(R.id.button);
        bt2 = (Button) findViewById(R.id.button_goto2);
        et = (EditText) findViewById(R.id.text_edit);
        iv = (ImageView) findViewById(R.id.image_view);
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
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this,SecondPage.class);
                startActivity(i);
            }
        });
    }
}
