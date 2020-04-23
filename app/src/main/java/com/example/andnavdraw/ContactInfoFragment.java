package com.example.andnavdraw;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ContactInfoFragment extends Fragment {

    public static ContactInfoFragment newInstance() {
        ContactInfoFragment fragment = new ContactInfoFragment();
        return fragment;
    }

    public ContactInfoFragment() {}

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSelectionAttached(2);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_contact_info, container, false);
        return rootView;
    }
}
