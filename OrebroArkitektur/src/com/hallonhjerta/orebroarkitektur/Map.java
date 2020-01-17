package com.hallonhjerta.orebroarkitektur;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends android.support.v4.app.FragmentActivity {
	private static final LatLng OREBRO = new LatLng(59.2736, 15.2087);
	private static final LatLng TEATER = new LatLng(59.2745, 15.2130);
	private GoogleMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.map);
    	
    	Intent intent = getIntent();
        String message = intent.getStringExtra(com.hallonhjerta.orebroarkitektur.byggnader.Stadsteatern.EXTRA_MESSAGE);
    
        if (message == null){
        	setUpMapIfNeeded();
        }
        else{
        	setUpMapIfNeededStadsteatern();
        }
    }
    
    private void setUpMapIfNeeded(){
        if (map == null) {
            map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
            if (map != null) {
            	map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
            	map.moveCamera(CameraUpdateFactory.newLatLngZoom(OREBRO, 13));
            	
            	map.addMarker(new MarkerOptions()
            			.position(TEATER)
            			.title("Stadsteatern")
            			.snippet("Storgatan 1"));
            }
        }
    }
    private void setUpMapIfNeededStadsteatern(){
        if (map == null) {
            map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
            if (map != null) {
            	map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
            	map.moveCamera(CameraUpdateFactory.newLatLngZoom(TEATER, 17));
            	
            	map.addMarker(new MarkerOptions()
            			.position(TEATER)
            			.title("Stadsteatern")
            			.snippet("Storgatan 1"));
            }
        }
    }
}



