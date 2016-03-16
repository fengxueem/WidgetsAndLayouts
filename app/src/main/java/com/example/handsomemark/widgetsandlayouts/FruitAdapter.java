package com.example.handsomemark.widgetsandlayouts;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by handsomemark on 2016/3/16.
 */
public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resouceID;

    public FruitAdapter(Context context, int textViewResourceID, List<Fruit> objects) {
        super(context, textViewResourceID, objects);
        this.resouceID = textViewResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {// getView is called every time a item is brought into the screen
        Fruit fruit = getItem(position);// get the current fruit instance
        View view = LayoutInflater.from(getContext()).inflate(resouceID, null);// get the view of this fruit instance
        ImageView fruitImage = (ImageView) view.findViewById(R.id.image_fruit);
        TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageID());// set the image source
        fruitName.setText(fruit.getName());// set the text
        return view;
    }
}
