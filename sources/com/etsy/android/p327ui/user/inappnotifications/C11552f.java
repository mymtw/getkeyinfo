package com.etsy.android.p327ui.user.inappnotifications;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.inappnotifications.f */
public final class C11552f extends RecyclerView.C3108s {

    /* renamed from: b */
    public final /* synthetic */ C11553g f25579b;

    public C11552f(C11553g gVar) {
        this.f25579b = gVar;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C19383o.m32797g(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            this.f25579b.mo37562b(recyclerView);
        }
    }
}
