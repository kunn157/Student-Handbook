package com.example.student_handbook.doanthanhnien;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.student_handbook.R;

import java.util.ArrayList;

public class MainDoanThanhNien extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<DataClass> dataList;
    private int[] imageList;
    private String[] titleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_doan_thanh_nien);


        imageList = new int[] {
                R.drawable.ic_clb,
                R.drawable.ic_clb,
                R.drawable.ic_clb,
        };

        titleList = new String[] {
                "Giới Thiệu Đoàn Thanh Niên",
                "Giới Thiệu Câu Lạc Bộ",
                "Tiêu Chí Sinh viên 5 Tốt",

        };

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        dataList = new ArrayList<>();
        getData();
    }

    private void getData() {
        for (int i = 0; i < imageList.length; i++) {
            DataClass dataClass = new DataClass(imageList [i], titleList[i]);
            dataList.add(dataClass);
        }
        recyclerView.setAdapter(new AdapterClass(dataList));
    }

}