package com.example.sanat.viewpagerwithtabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private TextView txt_home_title;
    private Button btn_home;

    private SwipeRefreshLayout swipeRefreshLayout;

    List<HomeModel> mHomeModel;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Toast.makeText(getActivity(), "Refresh Called", Toast.LENGTH_SHORT).show();
                swipeRefreshLayout.setRefreshing(false);
            }
        });


        txt_home_title = (TextView) view.findViewById(R.id.txt_home_title);
        txt_home_title.setText(getArguments().getString("Message"));

        btn_home = (Button) view.findViewById(R.id.btnHome);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "I am a Home Fragment", Toast.LENGTH_SHORT).show();
            }
        });


        mHomeModel = new ArrayList<>();
        mHomeModel.add(new HomeModel("Italian Pasta-1", "Food", "This a Italian Pasta. Very Delicious. This a Italian Pasta. " +
                "Very Delicious. This a Italian Pasta. Very Delicious. This a Italian Pasta. Very Delicious. " +
                "This a Italian Pasta. Very Delicious. This a Italian Pasta. Very Delicious..This a Italian Pasta. " +
                "Very Delicious.This a Italian Pasta. Very Delicious." +
                "This a Italian Pasta. Very Delicious...............", "100 Taka", R.drawable.img1));
        mHomeModel.add(new HomeModel("Chicken Gril-1", "Food", "This a Chicken Gril. Very Delicious", "200 Taka", R.drawable.img2));
        mHomeModel.add(new HomeModel("Russain Pizza-1", "Food", "This a Russain Pizza. Very Delicious", "300 Taka", R.drawable.img3));
        mHomeModel.add(new HomeModel("Chicken Lolypop-1", "Food", "This a Chicken Lolypop. Very Delicious", "400 Taka", R.drawable.img4));
        mHomeModel.add(new HomeModel("Italian Pasta-2", "Food", "This a Italian Pasta. Very Delicious", "500 Taka", R.drawable.img1));
        mHomeModel.add(new HomeModel("Chicken Gril-2", "Food", "This a Chicken Gril. Very Delicious", "200 Taka", R.drawable.img2));
        mHomeModel.add(new HomeModel("Russain Pizza-2", "Food", "This a Russain Pizza. Very Delicious", "500 Taka", R.drawable.img3));
        mHomeModel.add(new HomeModel("Chicken Lolypop-2", "Food", "This a Chicken Lolypop. Very Delicious", "200 Taka", R.drawable.img4));
        mHomeModel.add(new HomeModel("Italian Pasta-3", "Food", "This a Italian Pasta. Very Delicious", "300 Taka", R.drawable.img1));
        mHomeModel.add(new HomeModel("Chicken Gril-3", "Food", "This a Chicken Gril. Very Delicious", "100 Taka", R.drawable.img2));
        mHomeModel.add(new HomeModel("Russain Pizza3", "Food", "This a Russain Pizza. Very Delicious", "400 Taka", R.drawable.img3));
        mHomeModel.add(new HomeModel("Chicken Lolypop-3", "Food", "This a Chicken Lolypop. Very Delicious", "320 Taka", R.drawable.img4));
        mHomeModel.add(new HomeModel("Italian Pasta-4", "Food", "This a Italian Pasta. Very Delicious", "420 Taka", R.drawable.img1));
        mHomeModel.add(new HomeModel("Chicken Gril-4", "Food", "This a Chicken Gril. Very Delicious", "350 Taka", R.drawable.img2));
        mHomeModel.add(new HomeModel("Russain Pizza-4", "Food", "This a Russain Pizza. Very Delicious", "251 Taka", R.drawable.img3));
        mHomeModel.add(new HomeModel("Chicken Lolypop-4", "Food", "This a Chicken Lolypop. Very Delicious", "201 Taka", R.drawable.img4));

        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.home_recyclerview_id);
        HomeRecyclerViewAdapter homeRecyclerViewAdapter = new HomeRecyclerViewAdapter(getActivity(), mHomeModel);
        myrv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        myrv.setAdapter(homeRecyclerViewAdapter);

        return view;
    }

}
