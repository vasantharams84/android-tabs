package com.example.tabs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ArtistsActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView textview = new TextView(this);
        textview.setText("This is the ArtistsActivity");
        setContentView(textview);
    }
}