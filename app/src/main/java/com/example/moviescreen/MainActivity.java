package com.example.moviescreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.moviescreen.Adapter.RecyclerAdapter2;
import com.example.moviescreen.Adapter.RecyclerAdpter1;
import com.example.moviescreen.Model.Model1;
import com.example.moviescreen.Model.Model2;

import java.util.ArrayList;
import java.util.List;

import android.transition.AutoTransition;
import android.transition.TransitionManager;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView1,recyclerView2,recyclerView3,recyclerView4;
    RecyclerAdpter1 recyclerAdpter1,recyclerAdpter4;
    RecyclerAdapter2 recyclerAdapter2,recyclerAdapter3;
    ConstraintLayout constraintLayout;
    TextView textView;
    CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView1 = findViewById(R.id.recylcer1);
        recyclerView2 = findViewById(R.id.recycler2);
        recyclerView3 = findViewById(R.id.recycler3);
        recyclerView4 = findViewById(R.id.recycler4);
        constraintLayout = findViewById(R.id.constraint);
        cardView = findViewById(R.id.cardview);
        textView = findViewById(R.id.text1);
        recyclerView1.setHasFixedSize(true);
        recyclerView2.setHasFixedSize(true);
        recyclerView3.setHasFixedSize(true);
        recyclerView4.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView3.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView4.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        List<Model2> model2List = new ArrayList<>();
        List<Model1> model1List = new ArrayList<>();
        List<Model2>model3List = new ArrayList<>();
        List<Model1> model4List = new ArrayList<>();
        model1List.add(new Model1(R.drawable.dead3));
        model1List.add(new Model1(R.drawable.dead2));
        model1List.add(new Model1(R.drawable.dead1));
        model1List.add(new Model1(R.drawable.dead4));
        model2List.add(new Model2(R.drawable.ryan,"Ryan Reynolds"));
        model2List.add(new Model2(R.drawable.morena,"Morena Baccarin"));
        model2List.add(new Model2(R.drawable.zazie,"Zazie Beetz"));
        model2List.add(new Model2(R.drawable.leslie,"Leslie Uggams"));
        model3List.add(new Model2(R.drawable.stan,"Stan Lee"));
        model3List.add(new Model2(R.drawable.simon,"Simon Kinberg"));
        model3List.add(new Model2(R.drawable.kelly,"Kelly McCormick "));
        model3List.add(new Model2(R.drawable.rhett,"Rhett Reese"));
        model4List.add(new Model1(R.drawable.spider));
        model4List.add(new Model1(R.drawable.ant));
        model4List.add(new Model1(R.drawable.guard));
        model4List.add(new Model1(R.drawable.iron));
        recyclerAdpter1 = new RecyclerAdpter1(model1List);
        recyclerAdapter2= new RecyclerAdapter2(model2List);
        recyclerAdapter3 = new RecyclerAdapter2(model3List);
        recyclerAdpter4 = new RecyclerAdpter1(model4List);
        recyclerView1.setAdapter(recyclerAdpter1);
        recyclerView2.setAdapter(recyclerAdapter2);
        recyclerView3.setAdapter(recyclerAdapter3);
        recyclerView4.setAdapter(recyclerAdpter4);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(constraintLayout.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView,new AutoTransition());
                    constraintLayout.setVisibility(View.VISIBLE);
                    textView.setText("READ LESS");
                }else {
                    TransitionManager.beginDelayedTransition(cardView,new AutoTransition());
                    constraintLayout.setVisibility(View.GONE);
                    textView.setText("READ MORE");
                }
            }
        });
    }
}