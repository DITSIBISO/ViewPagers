package com.example.android.viewpagers;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by eKasiLab Alex CDTB on 2017/07/18.
 */

public class FragmentB extends Fragment {
    public FragmentB() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view, container, false);


        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText("FragmentB");
        return view;
    }
}
