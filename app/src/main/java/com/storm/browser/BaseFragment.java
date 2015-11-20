package com.storm.browser;

import android.support.v4.app.Fragment;

/**
 * Created by sunhongzhi on 2015/11/20.
 */
public class BaseFragment extends Fragment {
    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
