package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.widget.CompoundButton;
import com.etsy.android.lib.models.apiv3.filters.ValueFacet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.l */
public final /* synthetic */ class C11004l implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C10996i f24406b;

    /* renamed from: c */
    public final /* synthetic */ ValueFacet f24407c;

    public /* synthetic */ C11004l(C10996i iVar, ValueFacet valueFacet) {
        this.f24406b = iVar;
        this.f24407c = valueFacet;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C10996i iVar = this.f24406b;
        ValueFacet valueFacet = this.f24407c;
        C19383o.m32797g(iVar, "this$0");
        C19383o.m32797g(valueFacet, "$valueFacet");
        iVar.f24390e.invoke(valueFacet, Boolean.valueOf(z));
    }
}
