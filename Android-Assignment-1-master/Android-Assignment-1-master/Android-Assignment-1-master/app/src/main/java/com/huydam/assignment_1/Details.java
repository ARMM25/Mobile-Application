package com.huydam.assignment_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class Details extends AppCompatActivity implements View.OnClickListener {
    TextView speakers;
    TextView sponsors;
    TextView attendees;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.detail_page_title);
        setContentView(R.layout.activity_details);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        speakers = (TextView) findViewById(R.id.btnSpeakers);
        speakers.setOnClickListener(Details.this);
        sponsors = (TextView) findViewById(R.id.btnSponsors);
        sponsors.setOnClickListener(Details.this);
        attendees = (TextView) findViewById(R.id.txtAttendees);
        attendees.setOnClickListener(Details.this);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onClick(View v){
        Intent intent;
        switch(v.getId()){
            case R.id.btnSpeakers:
                intent = new Intent(v.getContext(), ListSpeakers.class);
                break;
            case R.id.btnSponsors:
                intent = new Intent(v.getContext(), ListSponsors.class);
                break;
            default:
                intent = new Intent(v.getContext(), ListAttendees.class);

        }
        startActivity(intent);
    }
}
