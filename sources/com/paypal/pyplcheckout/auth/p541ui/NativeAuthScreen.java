package com.paypal.pyplcheckout.auth.p541ui;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.pyplcheckout.auth.ui.NativeAuthScreen */
public final class NativeAuthScreen {
    private final Fragment fragment;
    private final boolean showBackButton;

    public NativeAuthScreen(Fragment fragment2, boolean z) {
        C19383o.m32797g(fragment2, "fragment");
        this.fragment = fragment2;
        this.showBackButton = z;
    }

    public static /* synthetic */ NativeAuthScreen copy$default(NativeAuthScreen nativeAuthScreen, Fragment fragment2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            fragment2 = nativeAuthScreen.fragment;
        }
        if ((i & 2) != 0) {
            z = nativeAuthScreen.showBackButton;
        }
        return nativeAuthScreen.copy(fragment2, z);
    }

    public final Fragment component1() {
        return this.fragment;
    }

    public final boolean component2() {
        return this.showBackButton;
    }

    public final NativeAuthScreen copy(Fragment fragment2, boolean z) {
        C19383o.m32797g(fragment2, "fragment");
        return new NativeAuthScreen(fragment2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeAuthScreen)) {
            return false;
        }
        NativeAuthScreen nativeAuthScreen = (NativeAuthScreen) obj;
        return C19383o.m32792b(this.fragment, nativeAuthScreen.fragment) && this.showBackButton == nativeAuthScreen.showBackButton;
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    public int hashCode() {
        int hashCode = this.fragment.hashCode() * 31;
        boolean z = this.showBackButton;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        Fragment fragment2 = this.fragment;
        boolean z = this.showBackButton;
        return "NativeAuthScreen(fragment=" + fragment2 + ", showBackButton=" + z + ")";
    }
}
