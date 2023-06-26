package com.example.medic;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link onBoard2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class onBoard2 extends Fragment {

    private ImageView mImageView;
    private int mImageId;

    public onBoard2() {
    }

    // TODO: Rename and change types and number of parameters
    public static onBoard2 newInstance(int imageId) {
        onBoard2 fragment = new onBoard2();
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
        View view = inflater.inflate(R.layout.fragment_on_board_two, container, false);
        mImageView = view.findViewById(R.id.imageFrag2);
        mImageView.setImageResource(mImageId);
        return view;
    }
}