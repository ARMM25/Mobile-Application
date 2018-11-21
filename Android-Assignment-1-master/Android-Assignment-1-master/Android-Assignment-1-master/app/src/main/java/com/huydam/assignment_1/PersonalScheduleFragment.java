package com.huydam.assignment_1;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class PersonalScheduleFragment extends Fragment implements View.OnClickListener {
    ConstraintLayout constraintLayout1;

    public PersonalScheduleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_personal_schedule, container, false);
        constraintLayout1 = (ConstraintLayout) myView.findViewById(R.id.personalEvent1);
        constraintLayout1.setOnClickListener(PersonalScheduleFragment.this);
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
