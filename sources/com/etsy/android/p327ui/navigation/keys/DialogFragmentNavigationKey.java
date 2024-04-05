package com.etsy.android.p327ui.navigation.keys;

import android.os.Parcelable;
import androidx.fragment.app.DialogFragment;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.DialogFragmentNavigationKey */
public interface DialogFragmentNavigationKey extends C12822e, Parcelable {
    DialogFragment getDialogFragment();

    C12824f getNavigationParams();

    String getReferrer();

    /* synthetic */ int storeDataForKey(Object obj);
}
