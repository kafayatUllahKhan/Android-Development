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


public class Fragment1 extends Fragment {

    private String email, username;
    private TextView emailTV, usernameTV;

    public Fragment1() {
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
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        emailTV = view.findViewById(R.id.emailTV);
        usernameTV = view.findViewById(R.id.userNameTV);

        this.email = getArguments().getString("email");
        this.username = getArguments().getString("username");

        emailTV.setText(this.email);
        usernameTV.setText(this.username);
    }

}