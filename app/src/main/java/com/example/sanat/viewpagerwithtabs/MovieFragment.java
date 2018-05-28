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
public class MovieFragment extends Fragment {
    private TextView txt_movie_title;
    private Button btn_movie;

    public MovieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_movie, container, false);
        txt_movie_title = (TextView) view.findViewById(R.id.txt_movie_title);
        txt_movie_title.setText(getArguments().getString("Message"));

        btn_movie = (Button) view.findViewById(R.id.btnMovie);

        btn_movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "I am a Movie Fragment", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
