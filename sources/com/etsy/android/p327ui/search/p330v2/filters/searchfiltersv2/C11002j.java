package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import com.etsy.android.lib.models.apiv3.filters.ValueFacet;
import com.etsy.android.stylekit.views.CollageCheckbox;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.j */
public final class C11002j implements CollageCheckbox.C9027c {

    /* renamed from: a */
    public final /* synthetic */ C10996i f24402a;

    /* renamed from: b */
    public final /* synthetic */ ValueFacet f24403b;

    public C11002j(C10996i iVar, ValueFacet valueFacet) {
        this.f24402a = iVar;
        this.f24403b = valueFacet;
    }

    /* renamed from: a */
    public final void mo30790a(boolean z, CollageCheckbox collageCheckbox) {
        C19383o.m32797g(collageCheckbox, "selectedButton");
        this.f24402a.f24390e.invoke(this.f24403b, Boolean.valueOf(z));
    }
}
