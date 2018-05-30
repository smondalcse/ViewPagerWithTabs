package com.example.sanat.viewpagerwithtabs;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TeacherFragment extends Fragment {
    private TextView textView;
    private Button btnOk, btncancel;

    int okcancelstatus = 0;
    // ok  = 1, cancel = 2

    public TeacherFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_teacher, container, false);
        textView = (TextView) view.findViewById(R.id.txt_display);
        textView.setText(getArguments().getString("Message"));

        btnOk = (Button) view.findViewById(R.id.btnOk);
        btncancel = (Button) view.findViewById(R.id.btncancel);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(okcancelstatus == 1){
                    Toast.makeText(getActivity(), "Already Pressed", Toast.LENGTH_SHORT).show();
                } else {
                    okcancelstatus = 1;
                    btnOk.setBackgroundColor(ContextCompat.getColor(getActivity() ,R.color.colorPrimary));
                    btncancel.setBackgroundColor(Color.TRANSPARENT);
                }

            }
        });

        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(okcancelstatus == 2){
                    Toast.makeText(getActivity(), "Already cancel Pressed", Toast.LENGTH_SHORT).show();
                } else {
                    okcancelstatus = 2;
                    btncancel.setBackgroundColor(ContextCompat.getColor(getActivity() ,R.color.colorPrimary));
                    btnOk.setBackgroundColor(Color.TRANSPARENT);
                }
            }
        });

        return view;
    }

}
