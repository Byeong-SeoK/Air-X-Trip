package com.example.lab11_map;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;

public class Lodging extends AppCompatActivity {
    Intent Lodintent;
    String city_name;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lodging);
        setTitle("Air X Trip");

        Lodintent = getIntent();
        city_name = Lodintent.getStringExtra("도시 이름");

        //setOnItemClickListener();

        if(city_name.equals("seoul") || city_name.equals("Seoul")){
            final String[] lod = { "신라 호텔", "조선 호텔", "시그니엘 서울",
                    "그랜드 하얏트 서울", "밀레니엄 힐튼", "그랜드 워커힐"};

            ListView list = (ListView) findViewById(R.id.listView1);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, lod);
            list.setAdapter(adapter);

            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                        long arg3) {
                    Toast.makeText(getApplicationContext(), lod[arg2],
                            Toast.LENGTH_SHORT).show();

                    Intent tripintent = new Intent(getApplicationContext(), Triproute.class);
                    tripintent.putExtra("호텔 이름", lod[arg2]);
                    startActivity(tripintent);
                }
            });
        }

        else if(city_name.equals("tokyo") || city_name.equals("Tokyo")){
            final String[] lod = { "더 리츠 칼튼 도쿄", "만다린 오리엔탈 도쿄", "포시즌스 호텔 도쿄",
                    "임페리얼 호텔 도쿄", "콘래드 도쿄", "팰리스 호텔 도쿄"};

            ListView list = (ListView) findViewById(R.id.listView1);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, lod);
            list.setAdapter(adapter);

            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                        long arg3) {
                    Toast.makeText(getApplicationContext(), lod[arg2],
                            Toast.LENGTH_SHORT).show();

                    Intent tripintent = new Intent(getApplicationContext(), Triproute.class);
                    tripintent.putExtra("호텔 이름", lod[arg2]);
                    startActivity(tripintent);
                }
            });
        }

        else if(city_name.equals("new york") || city_name.equals("New York")){
            final String[] lod = { "그랜드 하얏트 뉴욕", "더 뉴욕 팰리스 호텔", "힐튼 호텔 뉴욕",
                    "파라마운트 호텔 타임 스퀘어", "포드 타임스 스퀘어 호텔", "엠파이어 호텔 뉴욕"};

            ListView list = (ListView) findViewById(R.id.listView1);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, lod);
            list.setAdapter(adapter);

            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                        long arg3) {
                    Toast.makeText(getApplicationContext(), lod[arg2],
                            Toast.LENGTH_SHORT).show();

                    Intent tripintent = new Intent(getApplicationContext(), Triproute.class);
                    tripintent.putExtra("호텔 이름", lod[arg2]);
                    startActivity(tripintent);
                }

            });
        }

    }

}
