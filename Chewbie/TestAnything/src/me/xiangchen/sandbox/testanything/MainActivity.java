package me.xiangchen.sandbox.testanything;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		String filename = "mysecondfile";
	    String outputString = "Hello world!";
	    File myDir = getFilesDir();
	    
	    String strDir = myDir.getAbsolutePath();

	    try {
	        File secondFile = new File(myDir + "/text/", filename);
	        if (secondFile.getParentFile().mkdirs()) {
	            secondFile.createNewFile();
	            FileOutputStream fos = new FileOutputStream(secondFile);

	            fos.write(outputString.getBytes());
	            fos.flush();
	            fos.close();
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    try {
	        File secondInputFile = new File(myDir + "/text/", filename);
	        InputStream secondInputStream = new BufferedInputStream(new FileInputStream(secondInputFile));
	        BufferedReader r = new BufferedReader(new InputStreamReader(secondInputStream));
	        StringBuilder total = new StringBuilder();
	        String line;
	        while ((line = r.readLine()) != null) {
	            total.append(line);
	        }
	        r.close();
	        secondInputStream.close();
	        Log.d("File", "File contents: " + total);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
