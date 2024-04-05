package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.widget.CompoundButton;
import com.etsy.android.lib.models.apiv3.filters.ValueFacet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.k */
public final /* synthetic */ class C11003k implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C10996i f24404b;

    /* renamed from: c */
    public final /* synthetic */ ValueFacet f24405c;

    public /* synthetic */ C11003k(C10996i iVar, ValueFacet valueFacet) {
        this.f24404b = iVar;
        this.f24405c = valueFacet;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C10996i iVar = this.f24404b;
        ValueFacet valueFacet = this.f24405c;
        C19383o.m32797g(iVar, "this$0");
        C19383o.m32797g(valueFacet, "$valueFacet");
        iVar.f24390e.invoke(valueFacet, Boolean.valueOf(z));
    }
}
