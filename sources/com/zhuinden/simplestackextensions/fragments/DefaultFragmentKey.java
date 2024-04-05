package com.zhuinden.simplestackextensions.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

public abstract class DefaultFragmentKey implements Parcelable {
    public static final String ARGS_KEY = "___SIMPLE_STACK_FRAGMENT_ARGUMENTS_KEY_TAG___";

    public final Fragment createFragment() {
        Fragment instantiateFragment = instantiateFragment();
        Bundle arguments = instantiateFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            instantiateFragment.setArguments(arguments);
        }
        arguments.putParcelable(ARGS_KEY, this);
        return instantiateFragment;
    }

    public String getFragmentTag() {
        return getClass().getName();
    }

    public abstract Fragment instantiateFragment();
}
