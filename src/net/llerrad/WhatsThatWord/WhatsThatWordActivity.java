package net.llerrad.WhatsThatWord;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class WhatsThatWordActivity extends Activity{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void onStartClick(View view)
    { Intent i = new Intent(WhatsThatWordActivity.this, CardActivity.class);
    startActivity(i);
    	
    }
    
    public void onInstructionsClick(View view)
    { Intent i = new Intent(WhatsThatWordActivity.this, InstructionsActivity.class);
    startActivity(i);
    	
    }
    public void onAboutClick(View view)
    {	//Toast.makeText(this, "Exit!", Toast.LENGTH_SHORT).show();
    	//finish();
    	
    	new AlertDialog.Builder( this )
    	.setTitle( "About What's that Word?" )
    	.setMessage( "Version 0.1 \n\nCopyright (c) 2011-2012 Darrell Loh. All Rights Reserved." )
    	.setNegativeButton( "Close", new DialogInterface.OnClickListener() {
    		public void onClick(DialogInterface dialog, int which) {
    			Log.d( "AlertDialog", "Negative" );
    		}
    	} )
    	.show();
    }
    public void onExitClick(View view)
    {	//Toast.makeText(this, "Exit!", Toast.LENGTH_SHORT).show();
    	//finish();
    	
    	new AlertDialog.Builder( this )
    	.setTitle( "Exit" )
    	.setMessage( "Are you sure you want to quit?" )
    	.setPositiveButton( "Yes", new DialogInterface.OnClickListener() {
    		public void onClick(DialogInterface dialog, int which) {
    			//Log.d( "AlertDialog", "Positive" );
    			finish();
    		}
    	})
    	.setNegativeButton( "No", new DialogInterface.OnClickListener() {
    		public void onClick(DialogInterface dialog, int which) {
    			Log.d( "AlertDialog", "Negative" );
    		}
    	} )
    	.show();
    }
}