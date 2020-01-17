package com.hallonhjerta.orebroarkitektur;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;


public class List extends ListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list);
		final String[] buildingsABC = getResources().getStringArray(R.array.list_buildings_ABC);
		final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.list_item, R.id.text, buildingsABC);
		setListAdapter(adapter);
		
		getListView().setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, 
					int position, long id) {
				if ("Adolf Kjellströms Villa".equals(buildingsABC[position])){
					Intent AdolfKjellstromsVilla = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.AdolfKjellstromsVilla.class);
					startActivity(AdolfKjellstromsVilla);}
				else if ("Allehandaborgen".equals(buildingsABC[position])){
					Intent Allehandaborgen = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Allehandaborgen.class);
					startActivity(Allehandaborgen);}
				else if ("Centralpalatset".equals(buildingsABC[position])){
					Intent Centralpalatset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Centralpalatset.class);
					startActivity(Centralpalatset);}
				else if ("Drottninggatan/Rudbecksgatan".equals(buildingsABC[position])){
					Intent DrottninggatanRudbecksgatan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Drottninggatan_Rudbecksgatan.class);
					startActivity(DrottninggatanRudbecksgatan);}
				else if ("Drottninggatan 18".equals(buildingsABC[position])){
					Intent Drottninggatan18 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Drottninggatan18.class);
					startActivity(Drottninggatan18);}
				else if ("Före detta Engelbrektsskolan".equals(buildingsABC[position])){
					Intent Engelbrektsskolan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Engelbrektsskolan.class);
					startActivity(Engelbrektsskolan);}
				else if ("Fabriksgatan/Nygatan".equals(buildingsABC[position])){
					Intent FabriksgatanNygatan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Fabriksgatan_Nygatan.class);
					startActivity(FabriksgatanNygatan);}
				else if ("Drottninggatan/Färgaregränd/Ågatan".equals(buildingsABC[position])){
					Intent DrottninggatanFärgaregrändÅgatan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Fargaregrand.class);
					startActivity(DrottninggatanFärgaregrändÅgatan);}
				else if ("Fenixhuset".equals(buildingsABC[position])){
					Intent Fenixhuset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Fenixhuset.class);
					startActivity(Fenixhuset);}
				else if ("Folkets Hus".equals(buildingsABC[position])){
					Intent FolketsHus = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.FolketsHus.class);
					startActivity(FolketsHus);}
				else if ("Hagabro Hus".equals(buildingsABC[position])){
					Intent HagabroHus = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.HagabroHus.class);
					startActivity(HagabroHus);}
				else if ("Järntorgsgatan/Storgatan".equals(buildingsABC[position])){
					Intent JarntorgsgatanStorgatan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Jarntorgsgatan_Storgatan.class);
					startActivity(JarntorgsgatanStorgatan);}
				else if ("Järnvägsgatan 12".equals(buildingsABC[position])){
					Intent Jarnvagsgatan12 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Jarnvagsgatan12.class);
					startActivity(Jarnvagsgatan12);}
				else if ("Jugendpalatset".equals(buildingsABC[position])){
					Intent Jugendpalatset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Jugendpalatset.class);
					startActivity(Jugendpalatset);}
				else if ("Köpmangatan/Våghustorget".equals(buildingsABC[position])){
					Intent KopmangatanVaghustorget = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Kopmangatan_Vaghustorget.class);
					startActivity(KopmangatanVaghustorget);}
				else if ("Köpmangatan 17".equals(buildingsABC[position])){
					Intent Kopmangatan17 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Kopmangatan17.class);
					startActivity(Kopmangatan17);}
				else if ("Köpmangatan 37-39".equals(buildingsABC[position])){
					Intent Kopmangatan37to39 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Kopmangatan37to39.class);
					startActivity(Kopmangatan37to39);}
				else if ("Krämaren".equals(buildingsABC[position])){
					Intent Kramaren = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Kramaren.class);
					startActivity(Kramaren);}
				else if ("Manillagatan 25".equals(buildingsABC[position])){
					Intent Manillagatan25 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Manillagatan25.class);
					startActivity(Manillagatan25);}
				else if ("Medborgarhuset".equals(buildingsABC[position])){
					Intent Medborgarhuset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Medborgarhuset.class);
					startActivity(Medborgarhuset);}
				else if ("Nämndhuset".equals(buildingsABC[position])){
					Intent Namndhuset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Namndhuset.class);
					startActivity(Namndhuset);}
				else if ("Nygatan 49".equals(buildingsABC[position])){
					Intent Nygatan49 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Nygatan49.class);
					startActivity(Nygatan49);}
				else if ("Nygatan 80".equals(buildingsABC[position])){
					Intent Nygatan80 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Nygatan80.class);
					startActivity(Nygatan80);}
				else if ("Rådhuset".equals(buildingsABC[position])){
					Intent Radhuset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Radhuset.class);
					startActivity(Radhuset);}
				else if ("Rosta".equals(buildingsABC[position])){
					Intent Rosta = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Rosta.class);
					startActivity(Rosta);}
				else if ("Stadsteatern".equals(buildingsABC[position])){
					Intent Stadsteatern = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Stadsteatern.class);
					startActivity(Stadsteatern);}
				else if ("Storgatan 10".equals(buildingsABC[position])){
					Intent Storgatan10 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Storgatan10.class);
					startActivity(Storgatan10);}
				else if ("Stortorget 16".equals(buildingsABC[position])){
					Intent Stortorget16 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Stortorget16.class);
					startActivity(Stortorget16);}
				else if ("Stortorget 18".equals(buildingsABC[position])){
					Intent Stortorget18 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Stortorget18.class);
					startActivity(Stortorget18);}
				else if ("Stortorget 6".equals(buildingsABC[position])){
					Intent Stortorget6 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Stortorget6.class);
					startActivity(Stortorget6);}
				else if ("Telehuset".equals(buildingsABC[position])){
					Intent Telehuset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Telehuset.class);
					startActivity(Telehuset);}
				else if ("Trefaldighetskyrkan".equals(buildingsABC[position])){
					Intent Trefaldighetskyrkan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Trefaldighetskyrkan.class);
					startActivity(Trefaldighetskyrkan);}
				else if ("Vasastrand 7".equals(buildingsABC[position])){
					Intent Vasastrand7 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Vasastrand7.class);
					startActivity(Vasastrand7);}
			}	
		});
	}
	
	public void go123(View view) {
		final String[] buildings123 = getResources().getStringArray(R.array.list_buildings_123);
		final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.list_item, R.id.text, buildings123);
		setListAdapter(adapter);
		
		getListView().setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, 
					int position, long id) {
				
					if ("Adolf Kjellströms Villa".equals(buildings123[position])){
						Intent AdolfKjellstromsVilla = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.AdolfKjellstromsVilla.class);
						startActivity(AdolfKjellstromsVilla);}
					else if ("Allehandaborgen".equals(buildings123[position])){
						Intent Allehandaborgen = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Allehandaborgen.class);
						startActivity(Allehandaborgen);}
					else if ("Centralpalatset".equals(buildings123[position])){
						Intent Centralpalatset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Centralpalatset.class);
						startActivity(Centralpalatset);}
					else if ("Drottninggatan/Rudbecksgatan".equals(buildings123[position])){
						Intent DrottninggatanRudbecksgatan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Drottninggatan_Rudbecksgatan.class);
						startActivity(DrottninggatanRudbecksgatan);}
					else if ("Drottninggatan 18".equals(buildings123[position])){
						Intent Drottninggatan18 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Drottninggatan18.class);
						startActivity(Drottninggatan18);}
					else if ("Före detta Engelbrektsskolan".equals(buildings123[position])){
						Intent Engelbrektsskolan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Engelbrektsskolan.class);
						startActivity(Engelbrektsskolan);}
					else if ("Fabriksgatan/Nygatan".equals(buildings123[position])){
						Intent FabriksgatanNygatan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Fabriksgatan_Nygatan.class);
						startActivity(FabriksgatanNygatan);}
					else if ("Drottninggatan/Färgaregränd/Ågatan".equals(buildings123[position])){
						Intent DrottninggatanFärgaregrändÅgatan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Fargaregrand.class);
						startActivity(DrottninggatanFärgaregrändÅgatan);}
					else if ("Fenixhuset".equals(buildings123[position])){
						Intent Fenixhuset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Fenixhuset.class);
						startActivity(Fenixhuset);}
					else if ("Folkets Hus".equals(buildings123[position])){
						Intent FolketsHus = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.FolketsHus.class);
						startActivity(FolketsHus);}
					else if ("Hagabro Hus".equals(buildings123[position])){
						Intent HagabroHus = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.HagabroHus.class);
						startActivity(HagabroHus);}
					else if ("Järntorgsgatan/Storgatan".equals(buildings123[position])){
						Intent JarntorgsgatanStorgatan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Jarntorgsgatan_Storgatan.class);
						startActivity(JarntorgsgatanStorgatan);}
					else if ("Järnvägsgatan 12".equals(buildings123[position])){
						Intent Jarnvagsgatan12 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Jarnvagsgatan12.class);
						startActivity(Jarnvagsgatan12);}
					else if ("Jugendpalatset".equals(buildings123[position])){
						Intent Jugendpalatset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Jugendpalatset.class);
						startActivity(Jugendpalatset);}
					else if ("Köpmangatan/Våghustorget".equals(buildings123[position])){
						Intent KopmangatanVaghustorget = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Kopmangatan_Vaghustorget.class);
						startActivity(KopmangatanVaghustorget);}
					else if ("Köpmangatan 17".equals(buildings123[position])){
						Intent Kopmangatan17 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Kopmangatan17.class);
						startActivity(Kopmangatan17);}
					else if ("Köpmangatan 37-39".equals(buildings123[position])){
						Intent Kopmangatan37to39 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Kopmangatan37to39.class);
						startActivity(Kopmangatan37to39);}
					else if ("Krämaren".equals(buildings123[position])){
						Intent Kramaren = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Kramaren.class);
						startActivity(Kramaren);}
					else if ("Manillagatan 25".equals(buildings123[position])){
						Intent Manillagatan25 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Manillagatan25.class);
						startActivity(Manillagatan25);}
					else if ("Medborgarhuset".equals(buildings123[position])){
						Intent Medborgarhuset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Medborgarhuset.class);
						startActivity(Medborgarhuset);}
					else if ("Nämndhuset".equals(buildings123[position])){
						Intent Namndhuset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Namndhuset.class);
						startActivity(Namndhuset);}
					else if ("Nygatan 49".equals(buildings123[position])){
						Intent Nygatan49 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Nygatan49.class);
						startActivity(Nygatan49);}
					else if ("Nygatan 80".equals(buildings123[position])){
						Intent Nygatan80 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Nygatan80.class);
						startActivity(Nygatan80);}
					else if ("Rådhuset".equals(buildings123[position])){
						Intent Radhuset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Radhuset.class);
						startActivity(Radhuset);}
					else if ("Rosta".equals(buildings123[position])){
						Intent Rosta = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Rosta.class);
						startActivity(Rosta);}
					else if ("Stadsteatern".equals(buildings123[position])){
						Intent Stadsteatern = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Stadsteatern.class);
						startActivity(Stadsteatern);}
					else if ("Storgatan 10".equals(buildings123[position])){
						Intent Storgatan10 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Storgatan10.class);
						startActivity(Storgatan10);}
					else if ("Stortorget 16".equals(buildings123[position])){
						Intent Stortorget16 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Stortorget16.class);
						startActivity(Stortorget16);}
					else if ("Stortorget 18".equals(buildings123[position])){
						Intent Stortorget18 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Stortorget18.class);
						startActivity(Stortorget18);}
					else if ("Stortorget 6".equals(buildings123[position])){
						Intent Stortorget6 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Stortorget6.class);
						startActivity(Stortorget6);}
					else if ("Telehuset".equals(buildings123[position])){
						Intent Telehuset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Telehuset.class);
						startActivity(Telehuset);}
					else if ("Trefaldighetskyrkan".equals(buildings123[position])){
						Intent Trefaldighetskyrkan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Trefaldighetskyrkan.class);
						startActivity(Trefaldighetskyrkan);}
					else if ("Vasastrand 7".equals(buildings123[position])){
						Intent Vasastrand7 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Vasastrand7.class);
						startActivity(Vasastrand7);}
			}	
		});
	}
	public void goABC(View view) {
		final String[] buildingsABC = getResources().getStringArray(R.array.list_buildings_ABC);
		final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.list_item, R.id.text, buildingsABC);
		setListAdapter(adapter);
		
		getListView().setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, 
					int position, long id) {
				if ("Adolf Kjellströms Villa".equals(buildingsABC[position])){
					Intent AdolfKjellstromsVilla = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.AdolfKjellstromsVilla.class);
					startActivity(AdolfKjellstromsVilla);}
				else if ("Allehandaborgen".equals(buildingsABC[position])){
					Intent Allehandaborgen = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Allehandaborgen.class);
					startActivity(Allehandaborgen);}
				else if ("Centralpalatset".equals(buildingsABC[position])){
					Intent Centralpalatset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Centralpalatset.class);
					startActivity(Centralpalatset);}
				else if ("Drottninggatan/Rudbecksgatan".equals(buildingsABC[position])){
					Intent DrottninggatanRudbecksgatan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Drottninggatan_Rudbecksgatan.class);
					startActivity(DrottninggatanRudbecksgatan);}
				else if ("Drottninggatan 18".equals(buildingsABC[position])){
					Intent Drottninggatan18 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Drottninggatan18.class);
					startActivity(Drottninggatan18);}
				else if ("Före detta Engelbrektsskolan".equals(buildingsABC[position])){
					Intent Engelbrektsskolan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Engelbrektsskolan.class);
					startActivity(Engelbrektsskolan);}
				else if ("Fabriksgatan/Nygatan".equals(buildingsABC[position])){
					Intent FabriksgatanNygatan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Fabriksgatan_Nygatan.class);
					startActivity(FabriksgatanNygatan);}
				else if ("Drottninggatan/Färgaregränd/Ågatan".equals(buildingsABC[position])){
					Intent DrottninggatanFärgaregrändÅgatan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Fargaregrand.class);
					startActivity(DrottninggatanFärgaregrändÅgatan);}
				else if ("Fenixhuset".equals(buildingsABC[position])){
					Intent Fenixhuset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Fenixhuset.class);
					startActivity(Fenixhuset);}
				else if ("Folkets Hus".equals(buildingsABC[position])){
					Intent FolketsHus = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.FolketsHus.class);
					startActivity(FolketsHus);}
				else if ("Hagabro Hus".equals(buildingsABC[position])){
					Intent HagabroHus = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.HagabroHus.class);
					startActivity(HagabroHus);}
				else if ("Järntorgsgatan/Storgatan".equals(buildingsABC[position])){
					Intent JarntorgsgatanStorgatan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Jarntorgsgatan_Storgatan.class);
					startActivity(JarntorgsgatanStorgatan);}
				else if ("Järnvägsgatan 12".equals(buildingsABC[position])){
					Intent Jarnvagsgatan12 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Jarnvagsgatan12.class);
					startActivity(Jarnvagsgatan12);}
				else if ("Jugendpalatset".equals(buildingsABC[position])){
					Intent Jugendpalatset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Jugendpalatset.class);
					startActivity(Jugendpalatset);}
				else if ("Köpmangatan/Våghustorget".equals(buildingsABC[position])){
					Intent KopmangatanVaghustorget = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Kopmangatan_Vaghustorget.class);
					startActivity(KopmangatanVaghustorget);}
				else if ("Köpmangatan 17".equals(buildingsABC[position])){
					Intent Kopmangatan17 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Kopmangatan17.class);
					startActivity(Kopmangatan17);}
				else if ("Köpmangatan 37-39".equals(buildingsABC[position])){
					Intent Kopmangatan37to39 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Kopmangatan37to39.class);
					startActivity(Kopmangatan37to39);}
				else if ("Krämaren".equals(buildingsABC[position])){
					Intent Kramaren = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Kramaren.class);
					startActivity(Kramaren);}
				else if ("Manillagatan 25".equals(buildingsABC[position])){
					Intent Manillagatan25 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Manillagatan25.class);
					startActivity(Manillagatan25);}
				else if ("Medborgarhuset".equals(buildingsABC[position])){
					Intent Medborgarhuset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Medborgarhuset.class);
					startActivity(Medborgarhuset);}
				else if ("Nämndhuset".equals(buildingsABC[position])){
					Intent Namndhuset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Namndhuset.class);
					startActivity(Namndhuset);}
				else if ("Nygatan 49".equals(buildingsABC[position])){
					Intent Nygatan49 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Nygatan49.class);
					startActivity(Nygatan49);}
				else if ("Nygatan 80".equals(buildingsABC[position])){
					Intent Nygatan80 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Nygatan80.class);
					startActivity(Nygatan80);}
				else if ("Rådhuset".equals(buildingsABC[position])){
					Intent Radhuset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Radhuset.class);
					startActivity(Radhuset);}
				else if ("Rosta".equals(buildingsABC[position])){
					Intent Rosta = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Rosta.class);
					startActivity(Rosta);}
				else if ("Stadsteatern".equals(buildingsABC[position])){
					Intent Stadsteatern = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Stadsteatern.class);
					startActivity(Stadsteatern);}
				else if ("Storgatan 10".equals(buildingsABC[position])){
					Intent Storgatan10 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Storgatan10.class);
					startActivity(Storgatan10);}
				else if ("Stortorget 16".equals(buildingsABC[position])){
					Intent Stortorget16 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Stortorget16.class);
					startActivity(Stortorget16);}
				else if ("Stortorget 18".equals(buildingsABC[position])){
					Intent Stortorget18 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Stortorget18.class);
					startActivity(Stortorget18);}
				else if ("Stortorget 6".equals(buildingsABC[position])){
					Intent Stortorget6 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Stortorget6.class);
					startActivity(Stortorget6);}
				else if ("Telehuset".equals(buildingsABC[position])){
					Intent Telehuset = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Telehuset.class);
					startActivity(Telehuset);}
				else if ("Trefaldighetskyrkan".equals(buildingsABC[position])){
					Intent Trefaldighetskyrkan = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Trefaldighetskyrkan.class);
					startActivity(Trefaldighetskyrkan);}
				else if ("Vasastrand 7".equals(buildingsABC[position])){
					Intent Vasastrand7 = new Intent(List.this, com.hallonhjerta.orebroarkitektur.byggnader.Vasastrand7.class);
					startActivity(Vasastrand7);}
			}	
		});
	}
	
}
