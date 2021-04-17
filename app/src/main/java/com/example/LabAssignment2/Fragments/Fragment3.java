package com.example.LabAssignment2.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.LabAssignment2.R;


public class Fragment3 extends Fragment {

    private TextView usernameTV, emailTV;

    public Fragment3() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        usernameTV = view.findViewById(R.id.userNameTV);
        emailTV = view.findViewById(R.id.emailTV);

    }

    @Override
    public void onResume() {
        super.onResume();

        Bundle b = getArguments();
        if(b != null)
        {
            String username = b.getString("username", "empty");
            String email = b.getString("email", "empty");

            usernameTV.setText(username);
            emailTV.setText(email);

        }

    }
    
}