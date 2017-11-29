package com.ahlyclub.omar2.ahlyclubteam;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.Timer;
import java.util.TimerTask;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsAvtivity extends AppCompatActivity {

    TextView playerName , playerNumber , height , dName ,dAge ,dNationality , dPosition;
    CircleImageView profileImage;
    int x;
    Member member;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_avtivity);
        findId();
        member = (Member) getIntent().getExtras().getSerializable("member");
        x = getIntent().getExtras().getInt("pos");
        dPosition.setText(member.getPosition());
        dNationality.setText(member.getNationality());
        height.setText(member.getHeigth());
        dAge.setText(member.getAge());
        playerName.setText(member.getName());
        Picasso.with(this)
                .load(member.getProfile_image())
                .placeholder(R.drawable.person_placeholder)
                .error(R.drawable.person_placeholder)
                .into(profileImage);

        Picasso.with(this).setLoggingEnabled(true);
        playerNumber.setText(member.getTishert_number());

          }


    public void findId() {
        playerName = findViewById(R.id.playerName);
        profileImage = findViewById(R.id.player_image);
        playerNumber = findViewById(R.id.tishertNumber);
        height = findViewById(R.id.height);
        dAge = findViewById(R.id.dAge);
        dNationality = findViewById(R.id.dNationality);
        dPosition = findViewById(R.id.dPosition);
    }







}

