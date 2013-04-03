package edu.berkeley.cs160.theccertservice.splist;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;  
import android.widget.TabHost;  
import android.widget.TabHost.TabSpec;  
  

public class MainActivity extends TabActivity {  
	
	TabHost mTabHost;
	
    /** Called when the activity is first created. */  
	@Override  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
        mTabHost = getTabHost();
        
        TabSpec listSpec = mTabHost.newTabSpec("List");
        listSpec.setIndicator("List", null);
        Intent listIntent = new Intent(this, ListActivity.class);
        listSpec.setContent(listIntent);
        
        TabSpec feedSpec = mTabHost.newTabSpec("Feed");
        feedSpec.setIndicator("Feed", null);
        Intent feedIntent = new Intent(this, FeedActivity.class);
        feedSpec.setContent(feedIntent);
        
        TabSpec friendsSpec = mTabHost.newTabSpec("Friends");
        friendsSpec.setIndicator("Friends", null);
        Intent friendsIntent = new Intent(this, FriendsActivity.class);
        friendsSpec.setContent(friendsIntent);
        
        TabSpec pickUpSpec = mTabHost.newTabSpec("Pick Up");
        pickUpSpec.setIndicator("Pick Up", null);
        Intent pickUpIntent = new Intent(this, PickUpActivity.class);
        pickUpSpec.setContent(pickUpIntent);
        
        mTabHost.addTab(listSpec);
        mTabHost.addTab(feedSpec);
        mTabHost.addTab(friendsSpec);
        mTabHost.addTab(pickUpSpec);
        mTabHost.setCurrentTab(0);
    }  
}  
