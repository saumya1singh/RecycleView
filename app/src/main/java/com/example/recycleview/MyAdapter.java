package com.example.recycleview;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends  RecyclerView.Adapter<MyAdapter.MyHolder>{


    ArrayList<MyArrayClass>newarray;
    Context context;
    MyArrayClass ob;

    public MyAdapter(ArrayList<MyArrayClass> newarray, Context context, MyArrayClass ob) {
        this.newarray = newarray;
        this.context = context;
        this.ob = ob;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View inflatedview=layoutInflater.inflate(R.layout.each_row,viewGroup,false);
        MyHolder myHolder=new MyHolder(inflatedview);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        ob=newarray.get(i);
        myHolder.x.setText(ob.getThry());
        myHolder.y.setText(ob.getTm());

    }

    @Override
    public int getItemCount() {
        return newarray.size();
    }

    public class MyHolder  extends  RecyclerView.ViewHolder{

        TextView x,y;
        public MyHolder(@NonNull final View itemView) {
            super(itemView);
            x=itemView.findViewById(R.id.tv);
            y=itemView.findViewById(R.id.tv1);
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    newarray.remove(getAdapterPosition());
                    notifyDataSetChanged();
                    return  false;
                }
            });
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    itemView.setBackgroundColor(Color.parseColor("#fa1010"));
                    ob.setClr("#fa1010");

                }
            });

        }

    }
}
