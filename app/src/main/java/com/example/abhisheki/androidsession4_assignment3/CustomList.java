package com.example.abhisheki.androidsession4_assignment3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ABHISHEKI on 27-12-2016.
 */

public class CustomList extends ArrayAdapter<Integer> {

    private Integer[] images;

    private Activity context;

    public CustomList(Activity context, Integer[] Images) {
        super(context, R.layout.activity_listview, Images);
        this.context = context;
        this.images = Images;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.activity_listview, null, true);
        ImageView image = (ImageView) listViewItem.findViewById(R.id.imageView);
        image.setImageResource(images[position]);
        return  listViewItem;
    }

}
