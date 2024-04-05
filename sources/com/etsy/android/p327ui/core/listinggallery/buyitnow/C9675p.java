package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import android.content.DialogInterface;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.p */
public final /* synthetic */ class C9675p implements DialogInterface.OnDismissListener {

    /* renamed from: b */
    public final /* synthetic */ C9677r f21435b;

    public /* synthetic */ C9675p(C9677r rVar) {
        this.f21435b = rVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C9677r rVar = this.f21435b;
        C19383o.m32797g(rVar, "this$0");
        CollageBottomSheet collageBottomSheet = rVar.f21437a;
        if (collageBottomSheet != null) {
            collageBottomSheet.setOnCancelListener((DialogInterface.OnCancelListener) null);
            collageBottomSheet.setOnDismissListener((DialogInterface.OnDismissListener) null);
            if (collageBottomSheet.isShowing()) {
                collageBottomSheet.dismiss();
            }
        }
        rVar.f21437a = null;
    }
}
