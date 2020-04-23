package com.example.andnavdraw;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyCompanyFragment extends Fragment {
    public static MyCompanyFragment newInstance() {
        MyCompanyFragment fragment = new MyCompanyFragment();
        return fragment;
    }

    public MyCompanyFragment() {}

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSelectionAttached(3);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my_company, container, false);
        return rootView;
    }
}
