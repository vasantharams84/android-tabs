package com.example.tabs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SongsActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
        TextView textview = new TextView(this);
        textview.setText("This is the SongsActivity");
        setContentView(textview);
	}
}
