package com.example.kp.doktor;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Penyebab_Piston extends Fragment {

    public static Penyebab_Piston newInstance() {return new Penyebab_Piston();}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_penyebab__piston, container,false);
        return rootView;
    }
}
