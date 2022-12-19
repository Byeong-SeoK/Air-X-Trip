package com.example.lab11_map;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

import java.util.List;


//FragmentActivity
public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private static final int DEFAULT_ZOOM = 13;
    EditText editText;
    private String city_name; //도시 이름


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setTitle("Air X Trip");

        editText = (EditText) findViewById(R.id.input_cityname);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @SuppressLint("MissingPermission")
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMyLocationEnabled(true);
        mMap.getUiSettings().setMyLocationButtonEnabled(true);
        mMap.getUiSettings().setZoomControlsEnabled(true);
    }


    public void mCityClick(View v){
        if(mMap == null) {
            return;
        }
        else{
            city_name = editText.getText().toString();
            if(city_name.equals("seoul") || city_name.equals("Seoul")){
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                        new LatLng(37.541, 126.986), DEFAULT_ZOOM
                ));
            }
            else if(city_name.equals("tokyo") || city_name.equals("Tokyo")){
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                        new LatLng(35.6894, 139.692), DEFAULT_ZOOM
                ));
            }
            else if(city_name.equals("new york") || city_name.equals("New York")){
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                        new LatLng(40.7127837, -74.0059413), DEFAULT_ZOOM
                ));
            }
            else{
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                        new LatLng(0, 0), DEFAULT_ZOOM
                ));
                Toast.makeText(this,"다른 주소를 입력하세요", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void mLodClick(View v){
        Intent intent = new Intent(getApplicationContext(), Lodging.class);
        intent.putExtra("도시 이름", city_name);
        startActivity(intent);
    }

}