package com.example.listviewadepter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdepter extends BaseAdapter {
    //variables
    private Context mContext;
    private LayoutInflater inflater;
    private List<Model> modelList;
    private ArrayList<Model> arrayList;

    //constructor
    public ListViewAdepter(Context context, List<Model> modelList) {
        mContext = context;
        this.modelList = modelList;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modelList);
    }


    public class ViewHolder{
        TextView mTitleTv, mDescTv;
        ImageView mIconIv;
    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int i) {
        return modelList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;
        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.sample_view, null);

            //locate the views in row.xml
            holder.mTitleTv = view.findViewById(R.id.mainTitle);
            holder.mDescTv = view.findViewById(R.id.mainDesc);
            holder.mIconIv = view.findViewById(R.id.mainIcon);

            view.setTag(holder);

        }
        else {
            holder = (ViewHolder)view.getTag();
        }
        //set the results into textViews
        holder.mTitleTv.setText(modelList.get(i).getTitle());
        holder.mDescTv.setText(modelList.get(i).getDesc());
        //set the result in imageView
        holder.mIconIv.setImageResource(modelList.get(i).getIcon());

        //listView item clicks
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //code later
                if (modelList.get(i).getTitle().equals("Bangladesh")){

                    //start NewActivity with title for actionbar and text for textView
                    Intent intent = new Intent(mContext, NewActivity.class);

                    intent.putExtra("actionBarTitle", "Bangladesh");
                    intent.putExtra("contentTv", "This is Bangladesh detail...");
                    mContext.startActivity(intent);
                }
                if (modelList.get(i).getTitle().equals("India")){

                    //start NewActivity with title for actionbar and text for textView
                    Intent intent = new Intent(mContext, NewActivity.class);

                    intent.putExtra("actionBarTitle", "India");
                    intent.putExtra("contentTv", "This is India detail...");
                    mContext.startActivity(intent);
                }
                if (modelList.get(i).getTitle().equals("USA")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "USA");
                    intent.putExtra("contentTv", "This is USA detail...");
                    mContext.startActivity(intent);
                }
                if (modelList.get(i).getTitle().equals("China")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "China");
                    intent.putExtra("contentTv", "This is China detail...");
                    mContext.startActivity(intent);
                }
                if (modelList.get(i).getTitle().equals("Brazil")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Brazil");
                    intent.putExtra("contentTv", "This is Brazil detail...");
                    mContext.startActivity(intent);
                }
                if (modelList.get(i).getTitle().equals("Canada")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Canada");
                    intent.putExtra("contentTv", "This is Canada detail...");
                    mContext.startActivity(intent);
                }
                if (modelList.get(i).getTitle().equals("Pakistan")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Pakistan");
                    intent.putExtra("contentTv", "This is Pakistan detail...");
                    mContext.startActivity(intent);
                }

            }
        });

        return view;
    }

    //filter
    public void filter(String s){
        s = s.toLowerCase(Locale.getDefault());
        modelList.clear();
        if (s.length()==0){
            modelList.addAll(arrayList);
        }
        else {
            for (Model model : arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault())
                        .contains(s)){
                    modelList.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }
}
