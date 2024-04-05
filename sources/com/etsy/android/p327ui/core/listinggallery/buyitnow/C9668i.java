package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import android.content.DialogInterface;
import android.widget.FrameLayout;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.i */
public final /* synthetic */ class C9668i implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ CollageBottomSheet f21426a;

    /* renamed from: b */
    public final /* synthetic */ CollageTextInput f21427b;

    public /* synthetic */ C9668i(CollageBottomSheet collageBottomSheet, CollageTextInput collageTextInput) {
        this.f21426a = collageBottomSheet;
        this.f21427b = collageTextInput;
    }

    public final void onShow(DialogInterface dialogInterface) {
        CollageBottomSheet collageBottomSheet = this.f21426a;
        CollageTextInput collageTextInput = this.f21427b;
        C19383o.m32797g(collageBottomSheet, "$this_apply");
        C19383o.m32797g(collageTextInput, "$textInputPersonalization");
        collageBottomSheet.setOnShowListener((DialogInterface.OnShowListener) null);
        BottomSheetBehavior<FrameLayout> behavior = collageBottomSheet.getBehavior();
        C19383o.m32796f(behavior, "behavior");
        behavior.setState(3);
        collageTextInput.postDelayed(new C9670k(collageTextInput), 0);
    }
}
