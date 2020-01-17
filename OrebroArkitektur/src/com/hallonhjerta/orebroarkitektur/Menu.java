package com.hallonhjerta.orebroarkitektur;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Menu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
	}

	public void openOrebro(View view){
		Intent i = new Intent(this, Orebro.class);
		startActivity(i);
	}
	public void openList(View view){
		Intent i = new Intent(this, List.class);
		startActivity(i);
	}
	public void openMap(View view){
		Intent i = new Intent(this, Map.class);
		startActivity(i);
	}
	public void openInfo(View view){
		Intent i = new Intent(this, Info.class);
		startActivity(i);
	}

}
