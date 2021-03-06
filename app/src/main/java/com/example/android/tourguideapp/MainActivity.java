package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Displays a {@link ViewPager} where each page shows a different day of the week.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an pAdapter that knows which fragment should be shown on each page
        FragmentPagerAdapter pAdapter = new SimpleFragmentPagerAdapter(this, getSupportFragmentManager());

        // Set the pAdapter onto the view pager
        viewPager.setAdapter(pAdapter);

        //Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        //Connect the tab layout with the view pager.
        tabLayout.setupWithViewPager(viewPager);

    }
}
