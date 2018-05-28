package com.example.sanat.viewpagerwithtabs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by sanat on 5/26/2018.
 */

public class HomeRecyclerViewAdapter extends RecyclerView.Adapter<HomeRecyclerViewAdapter.MyHomeViewHolder> {


    private Context mContext;
    private List<HomeModel> mHomeModel;

    public HomeRecyclerViewAdapter(Context mContext, List<HomeModel> mHomeModel) {
        this.mContext = mContext;
        this.mHomeModel = mHomeModel;
    }

    @Override
    public MyHomeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_home, parent, false);
        return new MyHomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHomeViewHolder holder, final int position) {

        String title = mHomeModel.get(position).getTitle();
        holder.tv_home_title_id.setText(title);
        holder.txt_Home_ItemPrince_id.setText(mHomeModel.get(position).getPrice());
        holder.img_home_img_id.setImageResource(mHomeModel.get(position).getThumbnail());
        String[] items = new String[]{"Large", "Medium", "Small"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(mContext, android.R.layout.simple_spinner_item, items);
        holder.spnrItemSize.setAdapter(adapter);

        // Set OnClick Listener
        holder.cardView_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(mContext, mHomeModel.get(position).getTitle(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext, HomeItemDetailActivity.class);
                intent.putExtra("HomeItemTitle", mHomeModel.get(position).getTitle());
                intent.putExtra("HomeItemCategory", mHomeModel.get(position).getCategory());
                intent.putExtra("HomeItemImage", mHomeModel.get(position).getThumbnail());
                intent.putExtra("HomeItemDescription", mHomeModel.get(position).getDescription());
                intent.putExtra("HomeItemPrice", mHomeModel.get(position).getPrice());

                mContext.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return mHomeModel.size();
    }

    public static class MyHomeViewHolder extends RecyclerView.ViewHolder{

        TextView tv_home_title_id;
        ImageView img_home_img_id;
        CardView cardView_item;
        TextView txt_Home_ItemPrince_id;
        Spinner spnrItemSize;

        public MyHomeViewHolder(View itemView) {
            super(itemView);

            tv_home_title_id = (TextView) itemView.findViewById(R.id.txt_Home_Item_id);
            img_home_img_id = (ImageView) itemView.findViewById(R.id.home_img_id);
            txt_Home_ItemPrince_id = (TextView) itemView.findViewById(R.id.txt_Home_ItemPrince_id);
            cardView_item = (CardView) itemView.findViewById(R.id.cardview_id);
            spnrItemSize = (Spinner) itemView.findViewById(R.id.spnrItemSize);
        }
    }
}
