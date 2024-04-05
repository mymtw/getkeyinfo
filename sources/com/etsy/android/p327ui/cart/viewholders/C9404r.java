package com.etsy.android.p327ui.cart.viewholders;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.ui.cart.viewholders.r */
public final /* synthetic */ class C9404r implements Consumer {
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if (C0326j.m869n(BuildTarget.Companion)) {
            if (th == null) {
                th = new RuntimeException("throwable was null");
            }
            throw th;
        }
    }
}
