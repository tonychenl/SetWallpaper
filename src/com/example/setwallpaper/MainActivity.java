package com.example.setwallpaper;

import java.io.IOException;

import android.os.Bundle;
import android.app.Activity;
import android.app.WallpaperManager;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		WallpaperManager wm = WallpaperManager.getInstance(this);
		try {
			wm.setResource(R.drawable.wall_2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
