package com.paridhi.habits;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String[] data1;
    public MyAdapter(String[] myDataset) {
        data1 = myDataset;
    }
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        LayoutInflater myInflator = LayoutInflater.from(parent.getContext());
        View myOwnView=myInflator.inflate(R.layout.my_text_view, parent, false);
        return new MyViewHolder(myOwnView);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.t1.setText(data1[position]);

    }
    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        TextView t1;
        public MyViewHolder(View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.tv1);
        }
    }

}