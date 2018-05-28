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
public class BookFragment extends Fragment {
    private TextView txt_book_title;
    private Button btnBook;

    public BookFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_book, container, false);
        txt_book_title = (TextView) view.findViewById(R.id.txt_book_title);
        txt_book_title.setText(getArguments().getString("Message"));

        btnBook = (Button) view.findViewById(R.id.btnBook);

        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "I am a Book Fragment", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
