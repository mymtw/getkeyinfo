package com.paypal.pyplcheckout.navigation.interfaces;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.paypal.pyplcheckout.animation.base.FragmentAnimation;
import java.lang.ref.WeakReference;

public interface IContentRouter {
    void addFragment(String str, Fragment fragment);

    void clear();

    boolean doesFragmentExistOrNull(String str, Fragment fragment);

    boolean doesFragmentNotExistOrNull(String str, Fragment fragment);

    void finishActivityAndShowPaySheet(AppCompatActivity appCompatActivity);

    void finishFragment(String str, Fragment fragment);

    WeakReference<AppCompatActivity> getCheckoutActivity();

    Fragment getFragment(String str);

    void gotoFragment(Context context, String str);

    boolean onBackPressed(AppCompatActivity appCompatActivity);

    void removeFragment(String str);

    void reset();

    void setCheckoutActivity(WeakReference<AppCompatActivity> weakReference);

    void setUpFragmentAnimation(FragmentAnimation fragmentAnimation);

    void showCurrentFragment(AppCompatActivity appCompatActivity);

    void startActivityAndHidePaySheet(AppCompatActivity appCompatActivity, Intent intent);

    void startFragment(AppCompatActivity appCompatActivity, int i, Fragment fragment, String str);

    void updateFragment(String str, Fragment fragment);
}
