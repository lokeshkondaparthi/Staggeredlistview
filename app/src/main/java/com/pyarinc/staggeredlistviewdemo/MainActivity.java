package com.pyarinc.staggeredlistviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private List<ListModel> mListModelsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView  = (ListView)findViewById(R.id.listview);
        mCreateDummyList();
        ListViewAdapter mAdapter = new ListViewAdapter(this,mListModelsList);
        mListView.setAdapter(mAdapter);
        mListView.setDividerHeight(0);
    }

    private void mCreateDummyList() {
        mListModelsList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if(i == 0 ) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList("Adventurous2", "Ambitious", "Courageous"));
                mListModelsList.add(mModel);
            }
            if(i == 1  ) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList( "Curious", "Fearless", "Spontaneous"));
                mListModelsList.add(mModel);
            }
            if(i == 2) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList("Independent", "Open-minded", "Playful"));
                mListModelsList.add(mModel);
            }
            if(i == 3) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList("Athletic", "Confident", "Energetic"));
                mListModelsList.add(mModel);
            }
            if(i == 4) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList("Fun-loving", "Romantic", "Sensitive"));
                mListModelsList.add(mModel);
            }
            if(i == 4) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList( "Sensual", "Spirtual", "Wise"));
                mListModelsList.add(mModel);
            }
            if(i == 5) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList( "Intelligent", "Logical", "Neat"));
                mListModelsList.add(mModel);
            } if(i == 6) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList( "Organised", "Realistic", "Witty"));
                mListModelsList.add(mModel);
            }if(i == 7) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList("Compassionate", "Generous", "Honest"));
                mListModelsList.add(mModel);
            }if(i == 8) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList("Humble", "Selfless", "Trustworthy"));
                mListModelsList.add(mModel);
            }if(i == 9) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList("Calm", "Easygoing", "Flexible"));
                mListModelsList.add(mModel);
            }if(i == 10) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList("Friendly", "Patient", "Polite"));
                mListModelsList.add(mModel);
            }

        }
    }
}
