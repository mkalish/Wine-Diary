package com.wine;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;

public class AddEntryActivity extends Activity{


	
	public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        
	        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
	        intent.putExtra(MediaStore.EXTRA_OUTPUT, getImageUri());
	        startActivityForResult(intent, TAKE_PHOTO_CODE);
	        
	        setContentView(R.layout.main);
	    }
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
		super.onActivityResult(requestCode, resultCode, data);
		
		if(requestCode == TAKE_PHOTO_CODE && resultCode == RESULT_OK){
			Uri imagePaht = getImageUri();
			
			
			
		}
	}
	
	private Uri getImageUri(){
		File file new File(Environment.getExternalStorageDirectory() + "/DCIM", CAPTURE_TITLE);
		Uri imgUri = Uri.fromFile(file);
		
		return imgUri;
	}

}
