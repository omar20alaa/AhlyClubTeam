package com.ahlyclub.omar2.ahlyclubteam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Member> members = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FindID();
        initializationRecyclerView();


    }

    public void FindID ()
    {
        recyclerView = findViewById(R.id.myRecyclerView);

    }

    void initializationRecyclerView ()
    {
        members.add(new Member(1 , "Mohamed Elshenawy","170cm","27","https://3.bp.blogspot.com/-bs6HliVmlx8/V4TT8ra5DnI/AAAAAAAAAJ0/BFiDx4oMx2Y9UPa9AWo5IzT4K84DwVhRgCLcB/s1600/13592343_1211338458908670_1601125361072530889_n.png","Egypt" , "27" ,"Gool Keeper"));
        members.add(new Member(2 , "Saad Samir","160cm","21","http://sawasport.com/wp-content/uploads/2015/09/saad-samir-egypt.jpg","Egypt" , "28","Center Back"));
        members.add(new Member(3 , "Ayman Ashraf","165cm","12","http://img.soutalomma.com/ArticleImgs/2017/9/5/50183-%D8%A7%D9%8A%D9%85%D9%86-%D8%A7%D8%B4%D8%B1%D9%81.jpg","Egypt" , "25","Center Back"));
        members.add(new Member(4 , "Sabry Raheel","180cm","6","https://tmssl.akamaized.net//images/portrait/originals/104280-1496926565.jpg","Egypt" , "27", "Left Back"));
        members.add(new Member(5 , "Ahmed Fathy","175cm","26","http://e0.365dm.com/14/07/16-9/20/club-football-world-tournament-fathi_3172489.jpg?20140714133027","Egypt" , "31","Right Back"));
        members.add(new Member(6 , "Hossam Ashour","170cm","27","https://photosarab.com/wp-content/uploads/2016/12/50217_Details.jpg","Egypt" , "30","Defensive Midfielders"));
        members.add(new Member(7 , "Amr Elsolaia","160cm","13","http://www.egypttoday.com/images/larg/32054.jpg","Egypt" , "24","Defensive Midfielders"));
        members.add(new Member(8 , "Abdalla Elsaeed","175cm","20","https://img00.deviantart.net/2287/i/2016/145/d/c/abdallah_el_saeed_by_fadydesigner-da3s4jz.png","Egypt" , "32","Attacking Midfielders"));
        members.add(new Member(9 , "Moamen Zakaria","160cm","9","http://english.ahram.org.eg/Media/News/2016/3/22/2016-635942497059463801-946.jpg","Egypt" , "30","Left Wing"));
        members.add(new Member(10 , "Junior Ajayeh","165cm","29","http://www.elyomnew.com/sites/default/files/styles/main-image-620/public/news-media-body/2016/11/20/maxresdefault.jpg?itok=7y1_zClY","Nigerian" , "21","Right Wing"));
        members.add(new Member(11 , "Waleed Azaro","170cm","30","https://www.sport24info.ma/wp-content/uploads/2017/10/AZARO-324x160.png","Syrian" , "20","Striker"));

        MainAdapter mainAdapter = new MainAdapter(this, members);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mainAdapter);
    }

}
