package com.etsy.android.p327ui.shop;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.n0 */
public final class C11180n0 extends RecyclerView.C3108s {

    /* renamed from: b */
    public final WeakReference<C11178m0> f24724b;

    /* renamed from: c */
    public boolean f24725c = true;

    /* renamed from: d */
    public boolean f24726d;

    public C11180n0(C11178m0 m0Var) {
        C19383o.m32797g(m0Var, "router");
        this.f24724b = new WeakReference<>(m0Var);
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C19383o.m32797g(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            this.f24725c = true;
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C19383o.m32797g(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        C11178m0 m0Var = this.f24724b.get();
        if (this.f24726d && m0Var != null) {
            m0Var.mo36771g();
            this.f24726d = false;
        } else if (this.f24725c && m0Var != null) {
            m0Var.mo36773l();
        }
    }
}
