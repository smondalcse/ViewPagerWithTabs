package com.example.sanat.viewpagerwithtabs;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LaptopFragment extends Fragment {
    private TextView txt_laptop_title;
    private Button btn_laptop;

    public LaptopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_laptop, container, false);
        txt_laptop_title = (TextView) view.findViewById(R.id.txt_laptop_title);
        txt_laptop_title.setText(getArguments().getString("Message"));

        btn_laptop = (Button) view.findViewById(R.id.btnLaptop);

        btn_laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "I am a Laptop Fragment", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
