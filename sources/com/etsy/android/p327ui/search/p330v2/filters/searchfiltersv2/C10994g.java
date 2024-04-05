package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.widget.CompoundButton;
import com.etsy.android.lib.models.apiv3.filters.ValueFacet;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10996i;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.g */
public final /* synthetic */ class C10994g implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C10996i.C10997a f24382b;

    /* renamed from: c */
    public final /* synthetic */ C10996i f24383c;

    /* renamed from: d */
    public final /* synthetic */ ValueFacet f24384d;

    public /* synthetic */ C10994g(C10996i.C10997a aVar, C10996i iVar, ValueFacet valueFacet) {
        this.f24382b = aVar;
        this.f24383c = iVar;
        this.f24384d = valueFacet;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C10996i.C10997a aVar = this.f24382b;
        C10996i iVar = this.f24383c;
        ValueFacet valueFacet = this.f24384d;
        C19383o.m32797g(aVar, "this$0");
        C19383o.m32797g(iVar, "this$1");
        C19383o.m32797g(valueFacet, "$valueFacet");
        aVar.mo36554e(z);
        iVar.f24390e.invoke(valueFacet, Boolean.valueOf(z));
    }
}
