package com.loopwiki.movie.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.loopwiki.movie.R;

/**
 * Created by sambad on 2/13/18.
 */

public class TheatreFragment extends android.support.v4.app.Fragment {

    public TheatreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_theater, container, false);


        try {
            Glide.with(this).load(R.drawable.flash).into((ImageView) view.findViewById(R.id.theatreview));
        } catch (Exception e) {
            e.printStackTrace();
        }
        TextView myAwesomeTextView = (TextView) view.findViewById(R.id.theatretext1);
        myAwesomeTextView.setText("FLASH");
        TextView descrip = (TextView) view.findViewById(R.id.theatretext2);
        descrip.setText("The super-fast hero the Flash travels into a timeline where Earth is a mess and its heroes are lost and scattered. It's up to him to put things right.\n\n" +
                "Directors: John Francis Daley, Jonathan Goldstein");
        return view;
    }

}
