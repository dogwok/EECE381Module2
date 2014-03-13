package ca.sbojan.modulegui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/**
	 * TODO: think about implementation of button_matrix
	 */
	public void initializeMatrix() {
		boolean[][] button_matrix = new boolean[4][16];
	}
	
	public void toggleButton(View view) {
	     /**
	      * TODO:
	      * 	1) Find button by id
	      * 	2) Update button_matrix[4][16] with !(button_value) from id
	      * 	3) Toggle (colour, picture,.. something) on button with same id
	      **/
		
	 }

}
