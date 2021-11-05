package com.example.ls4_hw_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Topic> topicArrayList = new ArrayList<>();
        topicArrayList.add(new Topic("Mua bán có tâm ","8k ","10+ bài viết mới cập ","Nhóm đóng  ",R.drawable.saber,1));
        topicArrayList.add(new Topic("Mua bán có tâm ","8k ","10+ bài viết mới cập ","Nhóm đóng  ",R.drawable.cheem1,2));
        topicArrayList.add(new Topic("Mua bán có tâm ","8k ","10+ bài viết mới cập ","Nhóm đóng  ",R.drawable.cheem2,1));
        topicArrayList.add(new Topic("Mua bán có tâm ","8k ","10+ bài viết mới cập ","Nhóm đóng  ",R.drawable.cheem3,3));
        topicArrayList.add(new Topic("Mua bán có tâm ","8k ","10+ bài viết mới cập ","Nhóm đóng  ",R.drawable.cheem4,2));
        topicArrayList.add(new Topic("Mua bán có tâm ","8k ","10+ bài viết mới cập ","Nhóm đóng  ",R.drawable.cheem5,2));
        topicArrayList.add(new Topic("Mua bán có tâm ","8k ","10+ bài viết mới cập ","Nhóm đóng  ",R.drawable.cheem6,1));
        topicArrayList.add(new Topic("Mua bán có tâm ","8k ","10+ bài viết mới cập ","Nhóm đóng  ",R.drawable.cheem7,1));
//        topicArrayList.add(new Topic("he","a","a","Nhóm kín ","saber.png",2));
//        topicArrayList.add(new Topic("he","a","a","Nhóm mở ","saber.png",3));nhật
        TopicAdapter adapter = new TopicAdapter(topicArrayList, this);
        recyclerView.setAdapter(adapter);
    }

}