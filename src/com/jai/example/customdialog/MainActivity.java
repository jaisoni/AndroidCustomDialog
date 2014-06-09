package com.jai.example.customdialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void showCustonDialog(View v){
		CustomDialog dialog=new CustomDialog(MainActivity.this, new DialogCallback() {
			
			@Override
			public void onOkButtonClick() {
				Toast.makeText(MainActivity.this, "Ok button clicked", Toast.LENGTH_LONG).show();
				
			}
		});
		
		dialog.show();
	}
	
	
}
