package com.paypal.pyplcheckout.events.model;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C19383o;

public final class FragmentInfo {
    private final Fragment fragment;
    private final String fragmentId;

    public FragmentInfo(String str, Fragment fragment2) {
        C19383o.m32797g(str, "fragmentId");
        C19383o.m32797g(fragment2, "fragment");
        this.fragmentId = str;
        this.fragment = fragment2;
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public final String getFragmentId() {
        return this.fragmentId;
    }
}
