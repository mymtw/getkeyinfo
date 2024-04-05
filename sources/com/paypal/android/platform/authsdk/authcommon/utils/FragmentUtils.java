package com.paypal.android.platform.authsdk.authcommon.utils;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FragmentUtils {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isFragmentAlive(Fragment fragment) {
            C19383o.m32797g(fragment, "fragment");
            return !fragment.isRemoving() && fragment.getActivity() != null && !fragment.isDetached() && fragment.isAdded() && fragment.getView() != null;
        }
    }
}
