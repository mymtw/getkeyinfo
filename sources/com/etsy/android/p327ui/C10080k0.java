package com.etsy.android.p327ui;

import android.view.View;
import androidx.core.view.C2325q;
import androidx.core.view.C2348w0;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.k0 */
public final /* synthetic */ class C10080k0 implements C2325q {

    /* renamed from: b */
    public final /* synthetic */ BOEActivity f22215b;

    public /* synthetic */ C10080k0(BOEActivity bOEActivity) {
        this.f22215b = bOEActivity;
    }

    /* renamed from: b */
    public final C2348w0 mo1389b(View view, C2348w0 w0Var) {
        BOEActivity bOEActivity = this.f22215b;
        C19383o.m32797g(bOEActivity, "$activity");
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), w0Var.mo8948g(), view.getPaddingRight(), view.getPaddingBottom());
        }
        bOEActivity.getAppBarHelper().updateToolbarHeight(true, w0Var.mo8948g());
        return w0Var;
    }
}
