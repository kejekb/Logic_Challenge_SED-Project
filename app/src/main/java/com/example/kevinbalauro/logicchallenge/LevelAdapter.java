package com.example.kevinbalauro.logicchallenge;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Kevin Balauro on 1/11/2018.
 */

public class LevelAdapter extends BaseAdapter{

    private Context context;


    public LevelAdapter(Context context){
        this.context = context;
    }

    public int getCount(){
        return levelArray.length;
    }

    public Object getItem(int position){
        return null;
    }

    public long getItemId(int position){
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView;
        if(convertView == null){
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(32, 32, 32, 32);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(levelArray[position]);
        return imageView;
    }

     private Integer[] levelArray = {
                R.drawable.number_one,R.drawable.number_two,
                R.drawable.number_three,R.drawable.number_four,
                R.drawable.number_five,R.drawable.number_six,
                R.drawable.number_seven,R.drawable.number_eight,
                R.drawable.number_nine,
     };
}
