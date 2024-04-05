package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.widget.CompoundButton;
import com.etsy.android.lib.models.apiv3.filters.ValueFacet;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10996i;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.h */
public final /* synthetic */ class C10995h implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C10996i.C10997a f24385b;

    /* renamed from: c */
    public final /* synthetic */ C10996i f24386c;

    /* renamed from: d */
    public final /* synthetic */ ValueFacet f24387d;

    public /* synthetic */ C10995h(C10996i.C10997a aVar, C10996i iVar, ValueFacet valueFacet) {
        this.f24385b = aVar;
        this.f24386c = iVar;
        this.f24387d = valueFacet;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C10996i.C10997a aVar = this.f24385b;
        C10996i iVar = this.f24386c;
        ValueFacet valueFacet = this.f24387d;
        C19383o.m32797g(aVar, "this$0");
        C19383o.m32797g(iVar, "this$1");
        C19383o.m32797g(valueFacet, "$valueFacet");
        aVar.mo36554e(z);
        iVar.f24390e.invoke(valueFacet, Boolean.valueOf(z));
    }
}
