package com.example.kp.doktor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Deskripsi_Piston extends Fragment {

    public static Deskripsi_Piston newInstance() {return new Deskripsi_Piston();}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_deskripsi__piston, container,false);
        return rootView;
    }
}
