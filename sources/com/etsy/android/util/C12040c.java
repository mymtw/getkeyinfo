package com.etsy.android.util;

import com.appsflyer.AFInAppEventParameterName;
import com.etsy.android.util.C12045h;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p248tp.C8049b;
import p248tp.C8051d;

/* renamed from: com.etsy.android.util.c */
public final /* synthetic */ class C12040c implements C8051d {

    /* renamed from: b */
    public final /* synthetic */ C12043f f26838b;

    /* renamed from: c */
    public final /* synthetic */ C12045h f26839c;

    public /* synthetic */ C12040c(C12043f fVar, C12045h hVar) {
        this.f26838b = fVar;
        this.f26839c = hVar;
    }

    /* renamed from: d */
    public final void mo10586d(C8049b bVar) {
        C12043f fVar = this.f26838b;
        C12045h hVar = this.f26839c;
        C19383o.m32797g(fVar, "this$0");
        C19383o.m32797g(hVar, "$event");
        String str = hVar.f26865a;
        C19383o.m32797g(str, "customerId");
        try {
            if (fVar.mo38931e()) {
                C12043f.m19857d().setCustomerUserId(str);
            } else {
                fVar.f26844b.mo45474a("appsflyer.setcustomerid_afnotsetup");
                fVar.f26843a.mo21310e("Set customerid not logged. AppsFlyer is not setup");
            }
            if (hVar instanceof C12045h.C12046a) {
                fVar.mo38934h(hVar.f26866b, C19294b0.m32559p0());
            } else if (hVar instanceof C12045h.C12048c) {
                String str2 = hVar.f26866b;
                C12045h.C12048c cVar = (C12045h.C12048c) hVar;
                fVar.mo38934h(str2, C19294b0.m32562s0(new Pair(AFInAppEventParameterName.REVENUE, null), new Pair(AFInAppEventParameterName.CONTENT_TYPE, null), new Pair(AFInAppEventParameterName.CONTENT_ID, null), new Pair(AFInAppEventParameterName.PURCHASE_CURRENCY, null)));
            } else {
                boolean z = hVar instanceof C12045h.C12047b;
            }
            bVar.onComplete();
        } catch (Exception e) {
            fVar.f26843a.error(e);
            fVar.f26844b.mo45474a("appsflyer.setcustomerid_failure");
            throw e;
        }
    }
}
