package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.C8672b;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.t */
public final class C11577t extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final C19857l<C11573r, C19394m> f25641b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11577t(View view, C8672b bVar, C19857l<? super C11573r, C19394m> lVar) {
        super(view);
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(lVar, "clickHandler");
        this.f25641b = lVar;
    }
}
