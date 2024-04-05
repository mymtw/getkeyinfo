package com.etsy.android.p327ui.navigation.keys;

import android.os.Bundle;
import android.os.Parcelable;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.FragmentNavigationKey */
public interface FragmentNavigationKey extends C12822e, Parcelable {
    FragmentAnimationMode getAnimationType();

    C12693a getBackstackGenerator();

    String getClazzName();

    boolean getClearBackstack();

    C12824f getNavigationParams();

    String getReferrer();

    Bundle getReferrerBundle();

    boolean isDialog();

    boolean isForciblyAddedToCurrentStack();

    boolean shouldReplaceTop();

    /* synthetic */ int storeDataForKey(Object obj);
}
