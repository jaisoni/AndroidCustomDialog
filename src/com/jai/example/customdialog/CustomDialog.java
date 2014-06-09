package com.jai.example.customdialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class CustomDialog extends Dialog{
	
	public DialogCallback mCallback;
	
	public CustomDialog(Context context, DialogCallback callback) {
		super(context);
		this.mCallback=callback;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.dialog_view);
		
		Button okButoon=(Button)findViewById(R.id.button_ok);
		okButoon.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if(mCallback!=null){
					mCallback.onOkButtonClick();
				}
				dismiss();
			}
		});
	}
}
