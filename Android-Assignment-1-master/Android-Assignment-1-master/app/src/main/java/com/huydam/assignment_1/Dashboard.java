package com.huydam.assignment_1;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.content.SharedPreferences;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {
    private android.app.FragmentManager manager = getFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //SharedPreferences Name Displayed

        SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
        String display = preferences.getString("display", "");

        TextView activityDashboard = (TextView) findViewById(R.id.textViewName);
        activityDashboard.setText(display);


        //Set Default Fragment
        GeneralScheduleFragment generalScheduleFragment = new GeneralScheduleFragment();
        manager.beginTransaction().replace(R.id.contentLayout,
                generalScheduleFragment,
                generalScheduleFragment.getTag()).commit();
        //Set Actions for Bottom bar
        BottomNavigationView NavigationView = (BottomNavigationView)findViewById(R.id.nav);
        NavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.personal_schedule:
                        PersonalScheduleFragment personalScheduleFragment = new PersonalScheduleFragment();
                        manager.beginTransaction().replace(R.id.contentLayout,
                                personalScheduleFragment,
                                personalScheduleFragment.getTag()).commit();
                        break;
                    case R.id.map:
                        MapFragment mapFragment = new MapFragment();
                        manager.beginTransaction().replace(R.id.contentLayout,
                                mapFragment,
                                mapFragment.getTag()).commit();
                        break;
                    default:
                        GeneralScheduleFragment generalScheduleFragment = new GeneralScheduleFragment();
                        manager.beginTransaction().replace(R.id.contentLayout,
                                generalScheduleFragment,
                                generalScheduleFragment.getTag()).commit();
                }
                return true;
            }
        });
    }

}
