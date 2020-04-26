package com.example.fragmentlifecycle;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;


import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;


public class SecondFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("Fragment 2","onAttach...");
        Toast toast= Toast.makeText(getActivity(), "onAttach...", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment 2","onCreate...");
        Toast toast= Toast.makeText(getActivity(), "onCreate...", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("Fragment 2","onCreateView...");
        Toast toast= Toast.makeText(getActivity(), "onCreateView...", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
        toast.show();
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Fragment 2","onActivityCreated...");
        Toast toast= Toast.makeText(getActivity(), "onActivityCrweated...", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
        toast.show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Fragment 2","onStart...");
        Toast toast= Toast.makeText(getActivity(), "onStart...", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
        toast.show();
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment 2","onResume...");
        Toast toast= Toast.makeText(getActivity(), "onResume...", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
        toast.show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment 2","onPause...");
        Toast toast= Toast.makeText(getActivity(), "onPause...", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
        toast.show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment 2","onStop...");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment","onDestroyView...");
        Toast toast= Toast.makeText(getActivity(), "onDestroyView...", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
        toast.show();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Fragment 2","onDestroy...");
        Toast toast= Toast.makeText(getActivity(), "onDestroy...", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
        toast.show();

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Fragment 2","onDetach...");
        Toast toast= Toast.makeText(getActivity(), "onDetach...", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
        toast.show();
    }
}
