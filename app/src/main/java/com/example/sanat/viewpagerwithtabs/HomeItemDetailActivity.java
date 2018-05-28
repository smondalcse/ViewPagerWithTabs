package com.example.sanat.viewpagerwithtabs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HomeItemDetailActivity extends AppCompatActivity {

    private Toolbar toolbar;

    TextView txt_title_detail_home, txt_category_detail_home, txt_description_detail_home, txt_category_Price_home, txt_selected_item_size;
    ImageView img_Detail_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_item_detail);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mTitle.setText("Item Detail");

        ImageButton btnBack = (ImageButton) toolbar.findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        Intent intent = getIntent();
        String HomeItemTitle = intent.getExtras().getString("HomeItemTitle");
        String HomeItemCategory = "Category: " + intent.getExtras().getString("HomeItemCategory");
        String HomeItemDescription = intent.getExtras().getString("HomeItemDescription");
        int HomeItemImage = intent.getExtras().getInt("HomeItemImage");
        String HomeItemPrice= "Price: " + intent.getExtras().getString("HomeItemPrice");
        String SpnrSelectedItemSize= "Size: " + intent.getExtras().getString("SpnrSelectedItemSize");


        txt_title_detail_home = (TextView) findViewById(R.id.txt_title_detail_home);
        txt_category_detail_home  = (TextView) findViewById(R.id.txt_category_detail_home);
        txt_description_detail_home = (TextView) findViewById(R.id.txt_description_detail_home);
        img_Detail_home = (ImageView) findViewById(R.id.img_Detail_home);
        txt_category_Price_home = (TextView) findViewById(R.id.txt_category_Price_home);
        txt_selected_item_size = (TextView) findViewById(R.id.txt_selected_item_size);

        txt_title_detail_home.setText(HomeItemTitle);
        txt_category_detail_home.setText(HomeItemCategory);
        txt_description_detail_home.setText(HomeItemDescription);
        img_Detail_home.setImageResource(HomeItemImage);
        txt_category_Price_home.setText(HomeItemPrice);
        txt_selected_item_size.setText(SpnrSelectedItemSize);

    }
}
