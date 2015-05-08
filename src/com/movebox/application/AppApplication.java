package com.movebox.application;

import com.parse.Parse;

import android.app.Application;
import android.util.Log;

public class AppApplication extends Application {
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		// Enable Local Datastore.
		Parse.enableLocalDatastore(this);
		Parse.initialize(this, "g8jP46eACcuqqExpuTUJglE4gMano1Sd2x6QPQSD", "iUda9EJLG1pKpl4xf1VGGIAKNmjU7IgmqsWNPEVk");
		
		

	}
}
