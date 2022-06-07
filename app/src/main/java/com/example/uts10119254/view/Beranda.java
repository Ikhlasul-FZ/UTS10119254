package com.example.uts10119254.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.uts10119254.Present.SlidePagerAdapter;
import com.example.uts10119254.R;

import java.util.ArrayList;
import java.util.List;

public class Beranda extends Fragment {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beranda, null, false);
        List<Fragment> list = new ArrayList<>();

        list.add(new P1());
        list.add(new P2());
        list.add(new P3());

        pager = view.findViewById(R.id.branda);
        pagerAdapter = new SlidePagerAdapter(getChildFragmentManager(), list);
        pager.setAdapter(pagerAdapter);
        return view;
    }
}

//10119254_IkhlasulFZ_IF7