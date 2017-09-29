package com.pyarinc.staggeredlistviewdemo;

import java.util.List;

/**
 * Created by user2 on 9/29/2017.
 */

public class ListModel {
    String hobbie;
    List<String> mSubModelList;

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public List<String> getSubModelList() {
        return mSubModelList;
    }

    public void setSubModelList(List<String> subModelList) {
        mSubModelList = subModelList;
    }
}
