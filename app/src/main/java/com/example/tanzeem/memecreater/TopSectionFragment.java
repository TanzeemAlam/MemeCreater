package com.example.tanzeem.memecreater;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.app.Activity;
import android.widget.EditText;
import android.widget.Button;

public class TopSectionFragment extends Fragment{

    @SuppressLint("StaticFieldLeak")
    private static EditText topTextInput;
    @SuppressLint("StaticFieldLeak")
    private static EditText bottomTextInput;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander = (TopSectionListener) activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment,container,false);

        topTextInput =  view.findViewById(R.id.topMemeText);
        bottomTextInput =  view.findViewById(R.id.bottomMemeText);
        final Button button =  view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );


        return view;
    }

    public void buttonClicked(View view){
        activityCommander.createMeme(topTextInput.getText().toString(),bottomTextInput.getText().toString());
    }
}
