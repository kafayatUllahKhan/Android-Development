package com.example.LabAssignment2.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    Fragment fragment1, fragment2, fragment3;

    private String email, username;

    public ViewPagerAdapter(@NonNull FragmentManager fm, Fragment fragment1, Fragment fragment2, Fragment fragment3) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        this.fragment1 = fragment1;
        this.fragment2 = fragment2;
        this.fragment3 = fragment3;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment f;
        switch (position) {
            case 0:
                return fragment1;
            case 1:
                return fragment2;
            case 2:
                return fragment3;
            default:
                return fragment1;

        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Fragment 1";
            case 1:
                return "Fragment 2";
            case 2:
                return "Fragment 3";
            default:
                return "Fragment 1";
        }
    }
}
