package cz.my.droidsandbox;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

public class DisplayMessageActivity extends FragmentActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
        if (findViewById(R.id.fragment_container) != null) {

            // However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (savedInstanceState != null) {
                return;
            }

            // Create an instance of ExampleFragment
            DisplayMessageFragment firstFragment = new DisplayMessageFragment();
            
            // In case this activity was started with special instructions from an Intent,
            // pass the Intent's extras to the fragment as arguments
            firstFragment.setArguments(getIntent().getExtras());
            
            // Add the fragment to the 'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, firstFragment).commit();
        }
    }
    
    public void displayMessageClick(View view){
    	// Create fragment and give it an argument specifying the article it should show
    	ArticleFragment newFragment = new ArticleFragment();
    	Bundle args = new Bundle();
//    	args.putInt(ArticleFragment.ARG_POSITION, position);
    	newFragment.setArguments(args);

    	FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

    	// Replace whatever is in the fragment_container view with this fragment,
    	// and add the transaction to the back stack so the user can navigate back
    	transaction.replace(R.id.fragment_container, newFragment);
    	transaction.addToBackStack(null);

    	// Commit the transaction
    	transaction.commit();
    }
}




//package cz.my.droidsandbox;
//
//import android.annotation.TargetApi;
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Build;
//import android.os.Bundle;
//import android.support.v4.app.NavUtils;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.view.MenuItem;
//import android.widget.TextView;
//
//public class DisplayMessageActivity extends Activity {
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_display_message);
//		// Show the Up button in the action bar.
//		setupActionBar();
//		
//		Intent intent = getIntent();
//		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//		
//		TextView textView = new TextView(this);
//		textView.setText(message);
//		setContentView(textView);
//	}
//
//	/**
//	 * Set up the {@link android.app.ActionBar}, if the API is available.
//	 */
//	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
//	private void setupActionBar() {
//		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//			getActionBar().setDisplayHomeAsUpEnabled(true);
//		}
//	}
//
//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//		switch (item.getItemId()) {
//		case android.R.id.home:
//			// This ID represents the Home or Up button. In the case of this
//			// activity, the Up button is shown. Use NavUtils to allow users
//			// to navigate up one level in the application structure. For
//			// more details, see the Navigation pattern on Android Design:
//			//
//			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
//			//
//			NavUtils.navigateUpFromSameTask(this);
//			return true;
//		}
//		return super.onOptionsItemSelected(item);
//	}
//
//}
