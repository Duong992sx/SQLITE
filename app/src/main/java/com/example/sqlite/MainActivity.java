package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Tour> TourList;
    TourAdapter tourAdapter;
    private ListView listView;
    private MyDB db;
    ViewPager2 viewpager2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        listView=(ListView) findViewById(R.id.listview);
//        TourList=new ArrayList<>();
////         db=new MyDB(this,"ContacDB",
////                null,1);
//
//        TourList.add(new Tour(1,"Hinh anh 1",R.drawable.banner5,25000000));
//        TourList.add(new Tour(2,"Hinh anh 2",R.drawable.banner3,25000000));
//        TourList.add(new Tour(3,"Hinh anh 3",R.drawable.banner4,25000000));
//        TourList.add(new Tour(4,"Hinh anh 4",R.drawable.banner6,25000000));
////        db.addContact(new Tour(1,"Ha Noi ",R.drawable.banner6,3000));
////       // db.addContact(new Contact(2,"img3","Đào Thu Hà","0987976588"));
////      //  db.addContact(new Contact(3,"img2","Nguyễn  Thị Lụa","0987976587"));
////         db.addContact(new Tour(2,"Ha Nam  ",R.drawable.banner3,3000));
////          db.addContact(new Tour(3,"Thai Binh  ",R.drawable.banner4,3000));
////           db.addContact(new Tour(4,"Ninh Binh ",R.drawable.banner5,3000));
//     //      TourList =db.getAllContact();
//        //etSearch=findViewById(R.id.etSearch);
//        //listView=findViewById(R.id.listview);
//        tourAdapter=new TourAdapter(this,R.layout.item_search,TourList);
//        listView.setAdapter(tourAdapter);
//

        viewpager2 = findViewById(R.id.viewpager);
        List<SlideItem> sliderItem = new ArrayList<>();
        sliderItem.add(new SlideItem(R.drawable.banner3));
        sliderItem.add(new SlideItem(R.drawable.banner4));
        sliderItem.add(new SlideItem(R.drawable.banner5));
        sliderItem.add(new SlideItem(R.drawable.banner6));
        viewpager2.setAdapter(new slideAdapter(sliderItem, viewpager2));


    }
}
