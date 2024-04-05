package com.etsy.android.p327ui.cart.clicklisteners;

import android.content.DialogInterface;
import android.os.Handler;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.clicklisteners.b */
public final /* synthetic */ class C9271b implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ CollageBottomSheet f20478a;

    /* renamed from: b */
    public final /* synthetic */ CollageTextInput f20479b;

    public /* synthetic */ C9271b(CollageBottomSheet collageBottomSheet, CollageTextInput collageTextInput) {
        this.f20478a = collageBottomSheet;
        this.f20479b = collageTextInput;
    }

    public final void onShow(DialogInterface dialogInterface) {
        CollageBottomSheet collageBottomSheet = this.f20478a;
        CollageTextInput collageTextInput = this.f20479b;
        C19383o.m32797g(collageBottomSheet, "$this_apply");
        C19383o.m32797g(collageTextInput, "$textInput");
        collageBottomSheet.setOnShowListener((DialogInterface.OnShowListener) null);
        new Handler().postDelayed(new C9272c(0, collageBottomSheet, collageTextInput), 0);
    }
}
