package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import android.content.DialogInterface;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.m */
public final /* synthetic */ class C9672m implements DialogInterface.OnDismissListener {

    /* renamed from: b */
    public final /* synthetic */ C9674o f21432b;

    public /* synthetic */ C9672m(C9674o oVar) {
        this.f21432b = oVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C9674o oVar = this.f21432b;
        C19383o.m32797g(oVar, "this$0");
        CollageBottomSheet collageBottomSheet = oVar.f21434a;
        if (collageBottomSheet != null) {
            collageBottomSheet.setOnCancelListener((DialogInterface.OnCancelListener) null);
            collageBottomSheet.setOnDismissListener((DialogInterface.OnDismissListener) null);
            if (collageBottomSheet.isShowing()) {
                collageBottomSheet.dismiss();
            }
        }
        oVar.f21434a = null;
    }
}
