package com.example.abhisheki.androidsession4_assignment3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    public static Integer [] Images={R.drawable.gingerbread,R.drawable.honeycomb,
                                     R.drawable.icecreamsandwitch,R.drawable.jellybean,
                                     R.drawable.kitkat,R.drawable.lollipop };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MakeList();
    }
    public void MakeList()
    {
        GridView gridView;
        CustomList customList = new CustomList(this, Images);
        gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(customList);
    }
}
