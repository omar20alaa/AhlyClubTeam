package com.ahlyclub.omar2.ahlyclubteam;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {

   Context context;
   ArrayList<Member> members;
   View view1;

    public MainAdapter(Context context, ArrayList<Member> members) {
        this.context = context;
        this.members = members;
    }

    @Override
    public MainAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {




        View view = LayoutInflater.from(context).inflate(R.layout.member_item, parent, false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final MainAdapter.MyViewHolder holder, final int position) {

        holder.tvName.setText(members.get(position).getName());
        holder.tvnationality.setText(members.get(position).getNationality());
        holder.tvAge.setText(members.get(position).getAge());


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent(context, DetailsAvtivity.class);
                bundle.putSerializable("member", members.get(position));
                bundle.putInt("pos" ,position);
                intent.putExtras(bundle);

                context.startActivity(intent);


            }
        });

    }


    @Override
    public int getItemCount() {
        return members.size();
    }

    public  class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvnationality, tvAge;
        CardView cardView;


        public MyViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.name);
            tvnationality = itemView.findViewById(R.id.nationality);
            tvAge = itemView.findViewById(R.id.age);
            cardView = itemView.findViewById(R.id.myCardView);

           }



    }
}
