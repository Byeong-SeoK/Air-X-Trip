package com.example.lab11_map;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Triproute extends AppCompatActivity {
    Intent hotelIntent;
    String hotel_name;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triproute);
        setTitle("Air X Trip");

        hotelIntent = getIntent();
        hotel_name = hotelIntent.getStringExtra("호텔 이름");


        if(hotel_name.equals("신라 호텔") ||
                hotel_name.equals("조선 호텔") ||
                hotel_name.equals("시그니엘 서울") ||
                hotel_name.equals("그랜드 하얏트 서울") ||
                hotel_name.equals("밀레니엄 힐튼") ||
                hotel_name.equals("그랜드 워커힐")
        ){
            final String[] route = { "경복궁 -> 창덕궁 -> 종묘 -> 서울 시청",
                    "DDP -> 동대문 역사 공원 -> 서울숲 -> 건대",
                    "서대문 형무소 -> 망원 한강 공원 -> 홍대"};

            ListView list = (ListView) findViewById(R.id.listView2);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, route);
            list.setAdapter(adapter);

            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                        long arg3) {
                    Toast.makeText(getApplicationContext(), route[arg2]+" 로 여행 루트를 정하셨습니다.",
                            Toast.LENGTH_SHORT).show();
                }
            });
        }
        else if(hotel_name.equals("더 리츠 칼튼 도쿄") ||
                hotel_name.equals("만다린 오리엔탈 도쿄") ||
                hotel_name.equals("포시즌스 호텔 도쿄") ||
                hotel_name.equals("임페리얼 호텔 도쿄") ||
                hotel_name.equals("콘래드 도쿄") ||
                hotel_name.equals("팰리스 호텔 도쿄")){
            final String[] route = { "아사쿠사 -> 도쿄 타워 -> 신오쿠보",
                    "신주쿠 -> 도쿄역 -> 일본 왕궁 -> 요코하마",
                    "시부야 -> 롯폰기 힐스 -> 신주쿠 공원 -> 디즈니 랜드"};

            ListView list = (ListView) findViewById(R.id.listView2);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, route);
            list.setAdapter(adapter);

            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                        long arg3) {
                    Toast.makeText(getApplicationContext(), route[arg2]+" 로 여행 루트를 정하셨습니다.",
                            Toast.LENGTH_SHORT).show();
                }
            });
        }
        else if(hotel_name.equals("그랜드 하얏트 뉴욕") ||
                hotel_name.equals("더 뉴욕 팰리스 호텔") ||
                hotel_name.equals("힐튼 호텔 뉴욕") ||
                hotel_name.equals("파라마운트 호텔 타임 스퀘어") ||
                hotel_name.equals("포드 타임스 스퀘어 호텔") ||
                hotel_name.equals("엠파이어 호텔 뉴욕")){
            final String[] route = { "타임 스퀘어 -> 센트럴 파크 -> 엠파이어 스테이트 빌딩",
                    "자유의 여신상 -> 월드 트레이드 센터 -> 구겐하임 미술관",
                    "브루클린 다리 -> 록펠러 센터 -> 허드슨 강 수변 공원"};

            ListView list = (ListView) findViewById(R.id.listView2);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, route);
            list.setAdapter(adapter);

            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                        long arg3) {
                    Toast.makeText(getApplicationContext(), route[arg2]+" 로 여행 루트를 정하셨습니다.",
                            Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
