package com.etsy.android.p327ui.search.p330v2.suggestions;

import android.view.View;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11083w;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.suggestions.m */
public final /* synthetic */ class C11062m implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C11063n f24511b;

    /* renamed from: c */
    public final /* synthetic */ C11083w.C11089f f24512c;

    /* renamed from: d */
    public final /* synthetic */ int f24513d;

    public /* synthetic */ C11062m(C11063n nVar, C11083w.C11089f fVar, int i) {
        this.f24511b = nVar;
        this.f24512c = fVar;
        this.f24513d = i;
    }

    public final void onClick(View view) {
        C11063n nVar = this.f24511b;
        C11083w.C11089f fVar = this.f24512c;
        int i = this.f24513d;
        C19383o.m32797g(nVar, "this$0");
        C19383o.m32797g(fVar, "$item");
        nVar.f24514b.onQueryClicked(fVar, i);
    }
}
