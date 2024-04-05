package com.etsy.android.p327ui.navigation.keys;

import android.os.Parcelable;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.BottomSheetNavigationKey */
public interface BottomSheetNavigationKey extends C12822e, Parcelable {
    TrackingBottomSheetDialogFragment getBottomSheetFragment();

    C12824f getNavigationParams();

    String getReferrer();

    /* synthetic */ int storeDataForKey(Object obj);
}
