package com.etsy.android.p327ui.util;

import com.etsy.android.lib.models.datatypes.EtsyId;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.ui.util.b */
public final /* synthetic */ class C11772b implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ C11773c f26224b;

    /* renamed from: c */
    public final /* synthetic */ EtsyId f26225c;

    public /* synthetic */ C11772b(C11773c cVar, EtsyId etsyId) {
        this.f26224b = cVar;
        this.f26225c = etsyId;
    }

    public final void accept(Object obj) {
        C11773c cVar = this.f26224b;
        EtsyId etsyId = this.f26225c;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C19383o.m32797g(cVar, "this$0");
        C19383o.m32797g(etsyId, "$userId");
        cVar.mo38017a(etsyId, booleanValue);
    }
}
