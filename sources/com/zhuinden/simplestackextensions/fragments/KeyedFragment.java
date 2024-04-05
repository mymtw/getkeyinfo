package com.zhuinden.simplestackextensions.fragments;

import androidx.fragment.app.Fragment;

public abstract class KeyedFragment extends Fragment {
    public KeyedFragment() {
    }

    public final <T extends DefaultFragmentKey> T getKey() {
        return (DefaultFragmentKey) requireArguments().getParcelable(DefaultFragmentKey.ARGS_KEY);
    }

    public KeyedFragment(int i) {
        super(i);
    }
}
