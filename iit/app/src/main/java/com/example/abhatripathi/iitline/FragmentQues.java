package com.example.abhatripathi.iitline;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Arrays;

public class FragmentQues extends Fragment {
    ArrayList<mathsMainsQuestion1> MathsArrayList = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_ques, container, false);

        MathsArrayList.add(
                new mathsMainsQuestion1("QUESTION 1:", "2+4=?", "ITS basic 6", "6","7","8","4"));

        RecyclerView recyclerView = v.findViewById(R.id.rvMaths);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        AdapterMaths1 AdapterMaths1 = new AdapterMaths1(MathsArrayList,getContext());


        recyclerView.setAdapter(AdapterMaths1);

        return v;
    }
}

