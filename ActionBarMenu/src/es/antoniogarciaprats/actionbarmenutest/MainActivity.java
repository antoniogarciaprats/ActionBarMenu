package es.antoniogarciaprats.actionbarmenutest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater ( ).inflate ( R.menu.main, menu );
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch( item.getItemId ( )) {
			case R.id.menu_rojo:
				Toast.makeText ( getBaseContext ( ), "menu rojo", Toast.LENGTH_SHORT).show ( );
				return true;
				
			case R.id.menu_verde:
				Toast.makeText(getBaseContext(), "menu verde", Toast.LENGTH_SHORT).show ( );
				return true;
				
			default:
				return super.onOptionsItemSelected(item);
		}
		
	}
}
