package com.example.m.praswipepage;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;
import android.view.ViewGroup;

/**
 * Created by m on 2016-07-10.
 */
public class SwipeAdapter extends FragmentStatePagerAdapter {
    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
        Log.d("Uwaga","destroy");
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        PageFragment pageFragment = new PageFragment();
        Bundle bundle  = new Bundle();
        bundle.putInt("count",position+1);
        pageFragment.setArguments(bundle);
        return pageFragment;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
