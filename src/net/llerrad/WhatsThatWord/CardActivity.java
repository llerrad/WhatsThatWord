package net.llerrad.WhatsThatWord;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CardActivity extends Activity {

	int cardNum;
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.card);
	        cardNum=1;
	    }
	 
	 public void onNextClick(View view)
	    {	
		 
		 
		 ImageView card = (ImageView) view.findViewById(R.id.ImageViewCard);
		 
		 if (cardNum==1)
		 {
	    	card.setImageResource(R.drawable.card2);
	    	cardNum=2;
		 }
		 else{
			 card.setImageResource(R.drawable.card1);
			 cardNum=1;
		 }
	    }
	 
}
