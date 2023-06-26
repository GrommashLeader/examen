package com.example.medic;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class onBoard3 extends Fragment {

    private ImageView mImageView;
    private int mImageId;

    public onBoard3() {
    }

    public static onBoard3 newInstance(int imageId) {
        onBoard3 fragment = new onBoard3();
        Bundle args = new Bundle();
        args.putInt("image_id", imageId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mImageId = getArguments().getInt("image_id");
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_on_board_three, container, false);
        mImageView = view.findViewById(R.id.imageFrag3);
        mImageView.setImageResource(mImageId);
        return view;
    }
}