package com.example.kp.doktor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

public class Deskripsi extends Fragment {

    public static Deskripsi newInstance() {return new Deskripsi();}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_deskripsi, container,false);
        return rootView;
    }
}
