package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.view.View;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.u */
public final /* synthetic */ class C11025u implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C19846a f24444b;

    public /* synthetic */ C11025u(C19846a aVar) {
        this.f24444b = aVar;
    }

    public final void onFocusChange(View view, boolean z) {
        C19846a aVar = this.f24444b;
        C19383o.m32797g(aVar, "$performAction");
        if (z) {
            aVar.invoke();
        }
    }
}
