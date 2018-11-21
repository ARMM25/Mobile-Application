package com.huydam.assignment_1;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Constraints;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class GeneralScheduleFragment extends Fragment implements View.OnClickListener {
    ConstraintLayout constraintLayout1;
    ConstraintLayout constraintLayout2;
    ConstraintLayout constraintLayout3;
    ConstraintLayout constraintLayout4;
    public GeneralScheduleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_general_schedule, container, false);
        constraintLayout1 = (ConstraintLayout) myView.findViewById(R.id.event1);
        constraintLayout1.setOnClickListener(GeneralScheduleFragment.this);
        constraintLayout2 = (ConstraintLayout) myView.findViewById(R.id.event2);
        constraintLayout2.setOnClickListener(GeneralScheduleFragment.this);
        constraintLayout3 = (ConstraintLayout) myView.findViewById(R.id.event3);
        constraintLayout3.setOnClickListener(GeneralScheduleFragment.this);
        constraintLayout4 = (ConstraintLayout) myView.findViewById(R.id.event4);
        constraintLayout4.setOnClickListener(GeneralScheduleFragment.this);
        return myView;
    }
    @Override
    public void onClick(View v){
        Intent intent;
        switch(v.getId()){
            default:
                intent = new Intent(v.getContext(), Details.class);
        }
        startActivity(intent);
    }

}
