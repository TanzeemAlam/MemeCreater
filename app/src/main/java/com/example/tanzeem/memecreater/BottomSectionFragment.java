package com.example.tanzeem.memecreater;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
//import android.widget.RelativeLayout;
import android.widget.TextView;

public class BottomSectionFragment extends Fragment{

    @SuppressLint("StaticFieldLeak")
    private static TextView topMemeText;
    @SuppressLint("StaticFieldLeak")
    private static TextView bottomMemeText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_section_fragment,container,false);
        topMemeText =  view.findViewById(R.id.topMemeText);
        bottomMemeText =  view.findViewById(R.id.bottomMemeText);
        return view;
    }
    public void setMemeText(String top,String bottom){
        topMemeText.setText(top);
        bottomMemeText.setText(bottom);
    }


}
