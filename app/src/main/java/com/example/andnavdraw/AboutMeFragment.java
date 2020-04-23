package com.example.andnavdraw;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AboutMeFragment extends Fragment {
    public static AboutMeFragment newInstance() {
        AboutMeFragment fragment = new AboutMeFragment();
        return fragment;
    }

    public AboutMeFragment() {}

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSelectionAttached(1);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_about_me, container, false);
        return rootView;
    }

}
