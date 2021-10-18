package com.example.kp.doktor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Deskripsi2 extends Fragment {

    public static Deskripsi2 newInstance() {return new Deskripsi2();}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_deskripsi2, container,false);
        return rootView;
    }
}
