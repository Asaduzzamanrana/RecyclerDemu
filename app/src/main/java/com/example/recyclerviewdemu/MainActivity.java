package com.example.recyclerviewdemu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int[] images={
       R.drawable.argentina,R.drawable.bangladesh,R.drawable.canada,R.drawable.denmark,
     R.drawable.england,R.drawable.france,R.drawable.germany,R.drawable.hawaii,R.drawable.india,
            R.drawable.japan,R.drawable.kenya,R.drawable.liberia,R.drawable.malaysia};

    MyAdapter myAdapter;
    String[] title,des;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerViewId);
        title=getResources().getStringArray(R.array.Country_names);
        des=getResources().getStringArray(R.array.Country_des);

        myAdapter=new MyAdapter(this,title,des,images);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
