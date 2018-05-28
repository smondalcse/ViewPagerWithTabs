package com.example.sanat.viewpagerwithtabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by sanat on 5/26/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        position = position + 1;

        switch (position)
        {
            case 1:
                HomeFragment homeFragment = new HomeFragment();
                Bundle bundleHome = new Bundle();
                bundleHome.putString("Message", " Home");
                homeFragment.setArguments(bundleHome);
                return homeFragment;

            case 2:
                TeacherFragment teacherFragment = new TeacherFragment();
                Bundle bundleTeacher = new Bundle();
                bundleTeacher.putString("Message", " Teacher");
                teacherFragment.setArguments(bundleTeacher);
                return teacherFragment;

            case 3:
                StudentFragment studentFragment = new StudentFragment();
                Bundle bundleSutdent = new Bundle();
                bundleSutdent.putString("Message", " Student");
                studentFragment.setArguments(bundleSutdent);
                return studentFragment;

            case 4:
                BookFragment bookFragment = new BookFragment();
                Bundle bundleBook = new Bundle();
                bundleBook.putString("Message", " Book");
                bookFragment.setArguments(bundleBook);
                return bookFragment;

            case 5:
                MovieFragment movieFragment = new MovieFragment();
                Bundle bundleMovie = new Bundle();
                bundleMovie.putString("Message", " Movie");
                movieFragment.setArguments(bundleMovie);
                return movieFragment;

            case 6:
                LaptopFragment laptopFragment = new LaptopFragment();
                Bundle bundleLaptop = new Bundle();
                bundleLaptop.putString("Message", "Fragement : " + " Laptop");
                laptopFragment.setArguments(bundleLaptop);
                return laptopFragment;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String fragment_title = "";
        position = position + 1;
        switch (position)
        {
            case 1:
                fragment_title = "Home";
                return fragment_title;
            case 2:
                fragment_title = "Teacher";
                return fragment_title;
            case 3:
                fragment_title = "Student";
                return fragment_title;
            case 4:
                fragment_title = "Book";
                return fragment_title;
            case 5:
                fragment_title = "Movie";
                return fragment_title;
            case 6:
                fragment_title = "Laptop";
                return fragment_title;
            default:
                return fragment_title;

        }
    }
}
