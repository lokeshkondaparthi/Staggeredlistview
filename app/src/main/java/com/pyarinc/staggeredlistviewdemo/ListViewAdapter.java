package com.pyarinc.staggeredlistviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user2 on 9/29/2017.
 */

public class ListViewAdapter extends BaseAdapter {
    Context mContext;
    List<ListModel> mHobbListModelsList;
    LayoutInflater mInflater;

    public ListViewAdapter(Context context, List<ListModel> hobbListModelsList) {
        mContext = context;
        mHobbListModelsList = hobbListModelsList;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mHobbListModelsList.size();
    }

    @Override
    public Object getItem(int i) {
        return mHobbListModelsList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if (view == null) {
            viewHolder = new ViewHolder();
            view = mInflater.inflate(R.layout.inflator_layout, null);
            viewHolder.mLinearLayout = view.findViewById(R.id.linear_layout);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.mLinearLayout.removeAllViews();
       /* for (int j = 0; j < 3; j++) {
            TextView mView1 = new TextView(mContext);
            if(j  == 0) {
                mView1.setText("First" + (j+1));
            }
            if(j  == 1)
                mView1.setText("Second Word"+(j+1));
            if( j ==2 )
                mView1.setText("Third"+(j+1));
            mView1.setTextSize(20);
            mView1.setPadding(3,3,3,3);
            mView1.setBackgroundColor(mContext.getResources().getColor(R.color.colorAccent));
            LinearLayout.LayoutParams mLLLayoutParams = (LinearLayout.LayoutParams) viewHolder.mLinearLayout.getLayoutParams();
            mLLLayoutParams.width = LinearLayout.LayoutParams.WRAP_CONTENT;
            mLLLayoutParams.height = LinearLayout.LayoutParams.WRAP_CONTENT;
            mLLLayoutParams.setMargins(5,5,5,5);
            viewHolder.mLinearLayout.addView(mView1);
        }*/

        List<String> subModelList = mHobbListModelsList.get(i).getSubModelList();
        if (i %3 != 0 &      i != 0) {
            for (int i1 = 0; i1 < subModelList.size(); i1++) {
                TextView mView1 = new TextView(mContext);
                mView1.setText(subModelList.get(i1));
                mView1.setTextSize(20);
                mView1.setPadding(3, 3, 3, 3);
                mView1.setBackgroundColor(mContext.getResources().getColor(R.color.colorAccent));
                LinearLayout.LayoutParams mLLLayoutParams = (LinearLayout.LayoutParams) viewHolder.mLinearLayout.getLayoutParams();
                mLLLayoutParams.width = LinearLayout.LayoutParams.WRAP_CONTENT;
                mLLLayoutParams.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                mLLLayoutParams.setMargins(5, 5, 5, 5);
                mView1.setLayoutParams(mLLLayoutParams);
                viewHolder.mLinearLayout.addView(mView1);
            }
        }

        if (i %3  == 0) {
            for (int i1 = 0; i1 < 2; i1++) {
                TextView mView1 = new TextView(mContext);
                mView1.setText("Hidden tesxt");
                mView1.setTextSize(10);
                mView1.setPadding(3, 1, 3, 1);
                LinearLayout.LayoutParams mLLLayoutParams = (LinearLayout.LayoutParams) viewHolder.mLinearLayout.getLayoutParams();
                mLLLayoutParams.width = LinearLayout.LayoutParams.WRAP_CONTENT;
                mLLLayoutParams.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                mLLLayoutParams.setMargins(5, 2, 5, 2);
                mView1.setLayoutParams(mLLLayoutParams);
                mView1.setVisibility(View.INVISIBLE);
                viewHolder.mLinearLayout.addView(mView1);
            }
        }


        return view;


    }
    private class ViewHolder{
        private LinearLayout mLinearLayout;
    }

}
