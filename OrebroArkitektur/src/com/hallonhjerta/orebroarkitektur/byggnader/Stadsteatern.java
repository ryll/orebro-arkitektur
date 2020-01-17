package com.hallonhjerta.orebroarkitektur.byggnader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hallonhjerta.orebroarkitektur.R;


public class Stadsteatern extends Activity {
	public final static String EXTRA_MESSAGE = "com.hallonhjerta.orebroarkitektur.MESSAGE";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.byggnad_stadsteatern);
	}

	public void viewImage(View view){
		Intent i = new Intent(this, com.hallonhjerta.orebroarkitektur.ImageViewer.class);
		startActivity(i);
	}
	public void viewMap(View view){
		Intent intent = new Intent(this, com.hallonhjerta.orebroarkitektur.Map.class);
		String message = "Stadsteatern";
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
	}
}
