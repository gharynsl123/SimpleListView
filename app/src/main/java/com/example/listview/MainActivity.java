package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Set Adapter, RecyclerView, Model To ID
    private AdapterClass adapterClass;
    RecyclerView recyclerMain;
    ArrayList<ModelClass> arrayList;

    //List Item

    private String[] listId ={
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
    };

    private String[] txtTitle = {
            "Fruits",
            "Vegetables",
            "Seasoning",
            "Cake",
            "Chilli Sauce",
            "Fried food",
            "Animal",
            "Anime",
            "Movie",
            "Video"
    };

    private String[] txtSubs = {
            "Some Things sweet Like You",
            "This Is Can Make You Healthy",
            "Like You Fill What I Fill",
            "Sweetnes",
            "Spicy",
            "Yummy, Crispy, And Crunchy",
            "Like Cat, Dog, Monkey, Bird, And Another",
            "Yes You Know This",
            "When You Have Free Time Then You Will Watch This Right",
            "Many Of Them"
    };

    private int[] imgList = {
            R.drawable.img,
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_5,
            R.drawable.img_6,
            R.drawable.img_6,
            R.drawable.img_6,
            R.drawable.img_6,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerMain = findViewById(R.id.rvMain);
        arrayList= new ArrayList<>();
        adapterClass = new AdapterClass(arrayList);
        setDataList();
        recyclerMain.setAdapter(adapterClass);
        recyclerMain.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setDataList() {
        int count = 0;
        for (String id : listId) {
            arrayList.add(new ModelClass(id, txtTitle[count], txtSubs[count], imgList[count]));
            count++;
        }
    }
}