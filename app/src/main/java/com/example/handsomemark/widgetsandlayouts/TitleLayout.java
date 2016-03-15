package com.example.handsomemark.widgetsandlayouts;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * Created by handsomemark on 2016/3/15.
 * Customized Title Widget
 */
public class TitleLayout extends LinearLayout{
    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        Button button_back = (Button) findViewById(R.id.button_back);
        Button button_edit = (Button) findViewById(R.id.button_edit);
        button_back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
    }
}
