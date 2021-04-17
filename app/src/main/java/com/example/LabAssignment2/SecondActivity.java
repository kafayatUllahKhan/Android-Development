package com.example.LabAssignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.example.LabAssignment2.Adapters.ViewPagerAdapter;
import com.example.LabAssignment2.Fragments.Fragment1;
import com.example.LabAssignment2.Fragments.Fragment2;
import com.example.LabAssignment2.Fragments.Fragment3;

public class SecondActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private Toolbar toolbar;
    private ViewPagerAdapter adapter;

    private Fragment fragment1, fragment2, fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String email = getIntent().getExtras().getString("email");
        String username = getIntent().getExtras().getString("username");

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();

        Bundle b = new Bundle();
        b.putString("email", email);
        b.putString("username", username);

        fragment1.setArguments(b);

        adapter = new ViewPagerAdapter(getSupportFragmentManager(), fragment1, fragment2, fragment3);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);


    }

    public void sendDataToFragmentThree(String email, String username) {

        Bundle b = new Bundle();
        b.putString("email", email);
        b.putString("username", username);
        fragment3.setArguments(b);

    }
}