package com.example.lovecalculator;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText et1,et2;
	Button cal,ref,exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        cal=(Button) findViewById(R.id.button1);
        ref=(Button) findViewById(R.id.button2);
        exit=(Button) findViewById(R.id.button3);
        
        et1=(EditText) findViewById(R.id.YourName);
        et2=(EditText) findViewById(R.id.gfName);
       
        
        
        
        
        
        ref.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent i=new Intent("com.example.lovecalculator.MainActivity");
				startActivity(i);
				
			}});
        
        
        
        
        exit.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				finish();
				System.exit(0);
				
				
			}});
        
        
        
        
        
        
        
        
        
        
        cal.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Random r=new Random();
				int value=r.nextInt(70)+30;
				String values=Integer.toString(value);
				
				
				
				String yourName=et1.getText().toString().toUpperCase();
				String gfName=et2.getText().toString().toUpperCase();
				
				AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
				
				if(value<40){
					if(!(yourName).equalsIgnoreCase("")&&!(gfName).equalsIgnoreCase("")){
						
						
						builder.setMessage("hey !"+yourName +" you are  in "+values+"%"+"love with "+gfName +" Its very low . Are you actually in Love?? ");
						builder.setCancelable(false);
						builder.setPositiveButton("Again", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								Intent i=new Intent("com.example.lovecalculator.MainActivity");
								startActivity(i);
								
							}
						});
                       builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								finish();
								System.exit(0);
								
							}
						});
						
						
						
						
						AlertDialog alert=builder.create();
						alert.show();
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						//et3.setText("hey !"+yourName +" you have "+values+"%"+"with "+gfName +" Its very low . Are you actually in Love?? ");
					}
					
				}else if(value<50){
					if(!(yourName).equalsIgnoreCase("")&&!(gfName).equalsIgnoreCase("")){
						
						
						

						
						builder.setMessage("hey !"+yourName +" you are in "+values+"%"+"love with "+gfName +" Its low . Try to increase?? ");
						builder.setCancelable(false);
						builder.setPositiveButton("Again", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								Intent i=new Intent("com.example.lovecalculator.MainActivity");
								startActivity(i);
								
							}
						});
                       builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								finish();
								System.exit(0);
								
							}
						});
						
						
						
						
						
						
						
                       AlertDialog alert=builder.create();
						alert.show();
						
						
						
						
						
						
						
						
						
						//et3.setText("hey !"+yourName +" you have "+values+"%"+"with "+gfName +" Its low . Try to increase?? ");
					}
					
				}else if(value<60){
					if(!(yourName).equalsIgnoreCase("")&&!(gfName).equalsIgnoreCase("")){
						
						
						
						
						

						
						builder.setMessage("hey !"+yourName +" you are in "+values+"%"+"love with "+gfName +" You have pass Marks . Try to increase ");
						builder.setCancelable(false);
						builder.setPositiveButton("Again", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								Intent i=new Intent("com.example.lovecalculator.MainActivity");
								startActivity(i);
								
							}
						});
                       builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								finish();
								System.exit(0);
								
							}
						});
						
						
						
						
						
                       AlertDialog alert=builder.create();
						alert.show();
						
						
						
						
						
						
						//et3.setText("hey !"+yourName +" you have "+values+"%"+"with "+gfName +" You have pass Marks . Try to increase?? ");
					}
				}else if(value<70){
					if(!(yourName).equalsIgnoreCase("")&&!(gfName).equalsIgnoreCase("")){
						
						
						
						

						
						builder.setMessage("hey !"+yourName +" you are in "+values+"%"+"love with "+gfName +" Its good anough . If you senceare it will be great ! ");
						builder.setCancelable(false);
						builder.setPositiveButton("Again", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								Intent i=new Intent("com.example.lovecalculator.MainActivity");
								startActivity(i);
								
							}
						});
                       builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								finish();
								System.exit(0);
								
							}
						});
						
						
						
						
						
                       AlertDialog alert=builder.create();
						alert.show();
						
						
						
						
						
						
						
						
						
						
						
						//et3.setText("hey !"+yourName +" you have "+values+"%"+"with "+gfName +" Its good anough . If you senceare it will be great ! ");
					}
				}else if(value<80){
					if(!(yourName).equalsIgnoreCase("")&&!(gfName).equalsIgnoreCase("")){
						
						
						
						
						

						
						builder.setMessage("hey !"+yourName +" you are in "+values+"%"+"love with "+gfName +" It looks great .Carry On ");
						builder.setCancelable(false);
						builder.setPositiveButton("Again", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								Intent i=new Intent("com.example.lovecalculator.MainActivity");
								startActivity(i);
								
							}
						});
                       builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								finish();
								System.exit(0);
								
							}
						});
						
						
						
                       AlertDialog alert=builder.create();
						alert.show();
						
						
						
						
						
						
						
						
						
						
						
						
						
						//et3.setText("hey !"+yourName +" you have "+values+"%"+"with "+gfName +" Its good great .Carry On ");
					}
					
					
				}else if(value<90){
					if(!(yourName).equalsIgnoreCase("")&&!(gfName).equalsIgnoreCase("")){
						
						
						
						

						
						builder.setMessage("hey !"+yourName +" you are in "+values+"%"+"love with "+gfName +" It looks great . Congreats!! ");
						builder.setCancelable(false);
						builder.setPositiveButton("Again", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								Intent i=new Intent("com.example.lovecalculator.MainActivity");
								startActivity(i);
								
							}
						});
                       builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								finish();
								System.exit(0);
								
							}
						});
						
						
						
						
						
                       AlertDialog alert=builder.create();
						alert.show();
						
						
						
						
						
						//et3.setText("hey !"+yourName +" you have "+values+"%"+"with "+gfName +" Its good great . Congreats !?? ");
					}
				}else{
					if(!(yourName).equalsIgnoreCase("")&&!(gfName).equalsIgnoreCase("")){
						
						
						
						
						
						

						
						builder.setMessage("hey !"+yourName +" you are in "+values+"%"+"love with "+gfName +" Congrates . Its is really rear  ! ");
						builder.setCancelable(false);
						builder.setPositiveButton("Again", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								Intent i=new Intent("com.example.lovecalculator.MainActivity");
								startActivity(i);
								
							}
						});
                       builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								finish();
								System.exit(0);
								
							}
						});
						
						
						
						
                       AlertDialog alert=builder.create();
						alert.show();
						
						
						
						
						
						
						//et3.setText("hey !"+yourName +" you have "+values+"%"+"with "+gfName +" Congrates . Its is really rear  !?? ");
					}
					
				}
				
				
					
					
				
				
				
			}});
    }
				

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
