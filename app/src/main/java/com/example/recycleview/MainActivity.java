package com.example.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText e;
    TextView t1;
    TextView t2;
    RecyclerView r;
    ArrayList<MyArrayClass> myArrayClas=new ArrayList<>();
    MyArrayClass obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=findViewById(R.id.btn);
        e=findViewById(R.id.edit);
        t1=findViewById(R.id.tv);
        t2=findViewById(R.id.tv1);
        r=findViewById(R.id.rv);
        LinearLayoutManager lm=new LinearLayoutManager(this);
        r.setLayoutManager(lm);

        final  MyAdapter myAdapter=new MyAdapter(myArrayClas,this,obj);
        r.setAdapter(myAdapter);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String theory=e.getText().toString();
                Calendar c=Calendar.getInstance();
                SimpleDateFormat format=new SimpleDateFormat();
                String time=""+ format.format(c.getTime());
                String color="dede";
                obj=new  MyArrayClass(theory,time,color);
                myArrayClas.add(obj);
                myAdapter.notifyDataSetChanged();
            }
        });
    }
}
