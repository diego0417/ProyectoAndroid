package com.example.diego.inicio2.vistas;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.diego.inicio2.R;
/**
 * Created by diego on 8/13/2015.
 */
public class Videos extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lay_videos, container, false);
        return rootView;
    }
}
