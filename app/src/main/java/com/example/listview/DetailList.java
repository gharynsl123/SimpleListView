package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailList extends AppCompatActivity {
    private String idList;
    //make a Keymap
    public static final String KEY_LIST = "KEY";

    ImageView imgDetail;
    TextView txtTitle, txtDescrips, txtDescInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list);
        //Find An ID FROM DETAIL ACTIVITY XML
        imgDetail = findViewById(R.id.imgDet);
        txtTitle = findViewById(R.id.txtJud);
        txtDescrips = findViewById(R.id.txtDescrip);
        txtDescInfo = findViewById(R.id.txtDescInfo);

        //Get Support For Action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //Get id List
        idList = getIntent().getStringExtra(KEY_LIST);


        //Set The Content If You Click The List

        if (idList.equals("1")){
            imgDetail.setImageResource(R.drawable.img);
            txtTitle.setText("Fruits");
            txtDescrips.setText("Fruit is an object or something that can be eaten and sometimes fruit has many flavors, some are sweet, salty, sour, bitter, and so on. Fruit also has many forms. Fruit is also rich in color");
            txtDescInfo.setText("Fruit is an object or something that can be eaten and sometimes fruit has many flavors, some are sweet, salty, sour, bitter, and so on. Fruit also has many forms. Fruit is also rich in color.\nIt is not foreign to us to hear the word fruit, and there are already many people selling fruit");
        }else if (idList.equals("2")){
            imgDetail.setImageResource(R.drawable.img_1);
            txtTitle.setText("Vegetables");
            txtDescrips.setText("Vegetables Are Very Healthy Green Foods Can Keep Our Body Healthy. And also sometimes these vegetables can be turned into herbs");
            txtDescInfo.setText("Vegetables Are Very Healthy Green Foods Can Keep Our Body Healthy. And also sometimes these vegetables can be turned into herbs\nand there are also many shops that provide herbs or vegetables themselves. There are also many tutorials or recipes on the internet for making herbs");
        }else if (idList.equals("3")){
            imgDetail.setImageResource(R.drawable.img_2);
            txtTitle.setText(null);
            txtDescrips.setText(null);
            txtDescInfo.setText(null);
        }else if (idList.equals("4")){
            imgDetail.setImageResource(R.drawable.img_3);
            txtTitle.setText(null);
            txtDescrips.setText(null);
            txtDescInfo.setText(null);
        }else if (idList.equals("5")){
            imgDetail.setImageResource(R.drawable.img_4);
            txtTitle.setText(null);
            txtDescrips.setText(null);
            txtDescInfo.setText(null);
        }else if (idList.equals("6")){
            imgDetail.setImageResource(R.drawable.img_5);
            txtTitle.setText(null);
            txtDescrips.setText(null);
            txtDescInfo.setText(null);
        }else if (idList.equals("7")){
            imgDetail.setImageResource(R.drawable.img_8);
            txtTitle.setText("Animal");
            txtDescrips.setText("The one in this side picture is the Greatest, Funniest and Funniest Animal I have ever seen on earth.");
            txtDescInfo.setText("The one in this side picture is the Greatest, Funniest and Funniest Animal I have ever seen on earth. He likes to play and also likes to eat. His name is Cat. I really like cats, because sometimes cats can invite us to play with them, and their behavior is funny\nmaybe everyone has a cat at home because there are already many cats in this world. some are taken care of some are not taken care of");
        }else if (idList.equals("8")){
            imgDetail.setImageResource(R.drawable.img_9);
            txtTitle.setText("Anime");
            txtDescrips.setText("Yes yo know this title, So a Don't have to make any Description in here");
            txtDescInfo.setText("Aha");
        }else if (idList.equals("9")){
            imgDetail.setImageResource(R.drawable.img_6);
            txtTitle.setText("MOVIE");
            txtDescrips.setText(null);
            txtDescInfo.setText(null);
        }else if (idList.equals("10")){
            imgDetail.setImageResource(R.drawable.img_6);
            txtTitle.setText("Video");
            txtDescrips.setText(null);
            txtDescInfo.setText(null);
        }

    }
}