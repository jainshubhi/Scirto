package com.example.motionsense;

import java.util.ArrayList;

import com.parse.Parse;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;

public class MyActivity extends Activity implements OnTouchListener,
		OnClickListener {
	ImageButton back;
	ImageButton forward;
	Intent get;
	String a;
	ArrayList<Double> d = new ArrayList<Double>();
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Parse.initialize(this, "W5vtHZQ3gyzSNOxNIhJSbzpUA9mB2Z5UjpbrTfDr",
				"zMC1dkN3PTIsI1FPMrdD3rbI51p6vtsA75hsBbLQ");
		setContentView(R.layout.main);
		get = getIntent();
		a = get.getStringExtra("answer");
		String copy = a;

	
        double[] y = new double[]{.8,.6,.3,.3,.2,.6};

		Graph g = (Graph) findViewById(R.id.the_canvas);
		g.setY(y);
		g.invalidate();
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean onTouch(View arg0, MotionEvent arg1) {
		// TODO Auto-generated method stub
		return false;
	}



	

}