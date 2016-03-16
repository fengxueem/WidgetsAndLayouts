package com.example.handsomemark.widgetsandlayouts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by handsomemark on 2016/3/15.
 */
public class SixPage extends AppCompatActivity {

//    private String[] data = {"Apple", "Banana", "Orange", "Watermelon", "Pear", "Avocado", "Kiwi",
//            "Mango", "Cherry", "Strawberry", "Grape", "Pineapple"};
    private List<Fruit> fruitList = new ArrayList<Fruit>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_six_page);
        initFruitList();
        FruitAdapter adapter = new FruitAdapter(SixPage.this,R.layout.fruit_item,fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initFruitList() {
        Fruit apple = new Fruit("Apple",R.drawable.apple_pic);
        fruitList.add(apple);
        Fruit banana = new Fruit("Banana",R.drawable.banana_pic);
        fruitList.add(banana);
        Fruit orange = new Fruit("Orange",R.drawable.orange_pic);
        fruitList.add(orange);
        Fruit watermelon = new Fruit("Watermelon",R.drawable.watermelon_pic);
        fruitList.add(watermelon);
        Fruit pear = new Fruit("Pear",R.drawable.pear_pic);
        fruitList.add(pear);
        Fruit grape = new Fruit("Grape",R.drawable.grape_pic);
        fruitList.add(grape);
        Fruit pineapple = new Fruit("Pineapple",R.drawable.pineapple_pic);
        fruitList.add(pineapple);
        Fruit strawberry = new Fruit("Strawberry",R.drawable.strawberry_pic);
        fruitList.add(strawberry);
        Fruit cherry = new Fruit("Cherry",R.drawable.cherry_pic);
        fruitList.add(cherry);
        Fruit mango = new Fruit("Mango",R.drawable.mango_pic);
        fruitList.add(mango);
    }
}
