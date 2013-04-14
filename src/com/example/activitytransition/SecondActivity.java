package com.example.activitytransition;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import animation.ActivityAnimator;

public class SecondActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.second);
	}
	
	public void back(View v)
	{
		this.finish();
		try
		{
			ActivityAnimator anim = new ActivityAnimator();
			anim.getClass().getMethod(this.getIntent().getExtras().getString("backAnimation") + "Animation", Activity.class).invoke(anim, this);
		}
		catch (Exception e) { Toast.makeText(this, "An error occured " + e.toString(), Toast.LENGTH_LONG).show(); }
	}
	
	@Override
	public void onBackPressed()
	{
		back(null);
	}
}
