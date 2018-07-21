package com.top.smartypans;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;


public class WelcomeFragment extends Fragment {

//    @BindView(R.id.agreeLink) TextView agreeLinkText;

    public WelcomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);

//        ButterKnife.bind(this, view);
//        agreeLinkText.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView = (TextView) view.findViewById(R.id.agreeLink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());


        return view;
    }}
