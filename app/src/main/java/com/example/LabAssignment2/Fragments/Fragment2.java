package com.example.LabAssignment2.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.LabAssignment2.R;
import com.example.LabAssignment2.SecondActivity;

public class Fragment2 extends Fragment {

    private EditText usernameET, emailET;
    private Button sendDataBtn;

    public Fragment2() {
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
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        usernameET = view.findViewById(R.id.userNameET);
        emailET = view.findViewById(R.id.emailET);
        sendDataBtn = view.findViewById(R.id.sendDataBtn);

        sendDataBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ( (SecondActivity)getActivity()).
                        sendDataToFragmentThree(usernameET.getText().toString(), emailET.getText().toString());
            }
        });

    }
}