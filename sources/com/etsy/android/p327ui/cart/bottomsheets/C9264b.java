package com.etsy.android.p327ui.cart.bottomsheets;

import android.content.DialogInterface;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10554d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.bottomsheets.b */
public final /* synthetic */ class C9264b implements DialogInterface.OnDismissListener {

    /* renamed from: b */
    public final /* synthetic */ int f20464b;

    /* renamed from: c */
    public final /* synthetic */ Object f20465c;

    public /* synthetic */ C9264b(Object obj, int i) {
        this.f20464b = i;
        this.f20465c = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f20464b) {
            case 0:
                SelectVariationWorkflow selectVariationWorkflow = (SelectVariationWorkflow) this.f20465c;
                C19383o.m32797g(selectVariationWorkflow, "this$0");
                selectVariationWorkflow.mo31553a();
                return;
            default:
                C10554d dVar = (C10554d) this.f20465c;
                C19383o.m32797g(dVar, "this$0");
                dVar.mo34146b();
                return;
        }
    }
}
