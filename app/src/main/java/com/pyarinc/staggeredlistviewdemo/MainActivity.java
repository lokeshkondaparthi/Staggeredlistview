package com.pyarinc.staggeredlistviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private List<SubListModel> mSubListModels;
    private List<ListModel> mListModelList;
    private String[] mPersonalityArray = {"Adventurous","Ambitious","Courageous",
            "Curious","Fearless","Spontaneous","Artsy","Creative","Funny",
            "Independent","Open-minded","Playful","Athletic","Confident","Energetic",
            "Enthusiastic","Healthy","Optimistic","Fun-loving","Romantic","Sensitive",
            "Sensual","Spiritual","Wise","Intelligent","Logical","Neat",
            "Organized","Realistic","Witty","Compassionate","Generous","Honest",
            "Humble","Selfless","Trustworthy","Calm","Easygoing","Flexible",
            "Friendly","Patient","Polite"};
    private int colors[] = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView  = (ListView)findViewById(R.id.listview);

        /* setcion wise colors*/
        colors = new int[]{getResources().getColor(R.color.textCyanSelectedColor),
                getResources().getColor( R.color.textGraySelectedColor),
                                                    getResources().getColor(R.color.textYellowSelectedColor),
                                                   getResources().getColor( R.color.textPinkSelectedColor),
                                                    getResources().getColor(R.color.textPinkSelectedColor),
                                                    getResources().getColor(R.color.textGreenSelectedColor),
                                                    getResources().getColor(R.color.textLightGraySelectedColor)};

        mCreateDummySubList2();
        mCreateStaggeredList();
        ListViewAdapter2 mAdapter = new ListViewAdapter2(this,mListModelList);
        mListView.setAdapter(mAdapter);
        mListView.setDividerHeight(0);
    }




    private void mCreateDummySubList2() {
        mSubListModels = new ArrayList<>();
        for(int i = 1; i <= 40 ; i++) {
                SubListModel mSubListModel = new SubListModel();
                mSubListModel.setHobieName(mPersonalityArray[i]);
                mSubListModel.setEmptyView(false);
                mSubListModel.setSelected(true);
                mSubListModel.setNumber(i);
            /*  setting color for textview's bg*/
                if(i% 6  == 0){
                    mSubListModel.setSetcolor(getResources().getColor(R.color.textCyanSelectedColor));
                }else{
                    mSubListModel.setSetcolor(getResources().getColor(R.color.textPinkSelectedColor));
                }
                mSubListModels.add(mSubListModel);
        }
    }

    private void mCreateStaggeredList() {
        mListModelList = new ArrayList<>();
            for (int i = 1; i <mSubListModels.size() ; i++) {
                ListModel mListModel = new ListModel();
                List<SubListModel> subListModels  = new ArrayList<>();
                for (int j = mListModelList.size(); j < mListModelList.size()+3; j++) {
                    try {
                        SubListModel  mSubListModel = new SubListModel();
                        mSubListModel.setHobieName(mSubListModels.get(j).getHobieName());
                      /*  mSubListModel.setSetcolor(colors[i-1]);*/
                        mSubListModel.setSetcolor(mSubListModels.get(i).getSetcolor());
                        subListModels.add(mSubListModel);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                mListModel.setSubModelList(subListModels);
                mListModelList.add(mListModel);

                /* To give empty row*/
                if(mListModelList.size()%3  == 0)
                    mListModelList.add(new ListModel());
            }
        }
    }

   /* private void mCreateDummyList() {
        mSubListModels = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if(i == 0 ) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList("Adventurous2", "Ambitious", "Courageous"));
                mSubListModels.add(mModel);
            }
            if(i == 1  ) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList( "Curious", "Fearless", "Spontaneous"));
                mSubListModels.add(mModel);
            }
            if(i == 2) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList("Independent", "Open-minded", "Playful"));
                mSubListModels.add(mModel);
            }
            if(i == 3) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList("Athletic", "Confident", "Energetic"));
                mSubListModels.add(mModel);
            }
            if(i == 4) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList("Fun-loving", "Romantic", "Sensitive"));
                mSubListModels.add(mModel);
            }
            if(i == 4) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList( "Sensual", "Spirtual", "Wise"));
                mSubListModels.add(mModel);
            }
            if(i == 5) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList( "Intelligent", "Logical", "Neat"));
                mSubListModels.add(mModel);
            } if(i == 6) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList( "Organised", "Realistic", "Witty"));
                mSubListModels.add(mModel);
            }if(i == 7) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList("Compassionate", "Generous", "Honest"));
                mSubListModels.add(mModel);
            }if(i == 8) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList("Humble", "Selfless", "Trustworthy"));
                mSubListModels.add(mModel);
            }if(i == 9) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList("Calm", "Easygoing", "Flexible"));
                mSubListModels.add(mModel);
            }if(i == 10) {
                ListModel mModel = new ListModel();
                mModel.setSubModelList(Arrays.asList("Friendly", "Patient", "Polite"));
                mSubListModels.add(mModel);
            }

        }
    }*/


