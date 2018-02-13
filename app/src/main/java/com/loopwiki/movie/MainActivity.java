package com.loopwiki.movie;


import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;

import com.loopwiki.movie.fragments.AboutFragment;
import com.loopwiki.movie.fragments.MovieFragment;
import com.loopwiki.movie.fragments.TheatreFragment;


public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    RecyclerView r1;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = item -> {
                FragmentTransaction trans=getSupportFragmentManager().beginTransaction();
                switch (item.getItemId()) {
                    case R.id.movies:
                        trans.replace(R.id.frame,new MovieFragment()).commit();

                        return true;
                    case R.id.theaters:
                        trans.replace(R.id.frame,new TheatreFragment()).commit();
                        return true;
                    case R.id.about:
                        trans.replace(R.id.frame,new AboutFragment()).commit();
                        return true;
                }
                return false;
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        FragmentTransaction trans=getSupportFragmentManager().beginTransaction();
        trans.replace(R.id.frame,new MovieFragment()).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
