package com.example.lovecalculator;


import android.app.Activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Starting extends Activity{
	MediaPlayer mp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        mp=MediaPlayer.create(getBaseContext(), R.raw.l);
	
        mp.start();
        Thread th=new Thread(){
        	
        	public void run(){
        		try{
        			sleep(10000);
        			
        		}catch(InterruptedException e){
        			e.printStackTrace();
        			
        		}finally{
        			Intent intent1 =new Intent("com.example.lovecalculator.MainActivity");
        			startActivity(intent1);
        			mp.stop();
        		}
        		
        		
        		
        		
        	}
        	
        
        	
        	
        };
		th.start();
	
	
	
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	} 

	
}