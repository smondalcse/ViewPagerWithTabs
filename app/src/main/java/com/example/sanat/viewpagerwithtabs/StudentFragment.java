package com.example.sanat.viewpagerwithtabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class StudentFragment extends Fragment {
    private TextView txt_student_title;
    private Button btnStudent;

    public StudentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_student, container, false);
        txt_student_title = (TextView) view.findViewById(R.id.txt_student_title);
        txt_student_title.setText(getArguments().getString("Message"));

        btnStudent = (Button) view.findViewById(R.id.btnStudent);

        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "I am a student Fragment", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
