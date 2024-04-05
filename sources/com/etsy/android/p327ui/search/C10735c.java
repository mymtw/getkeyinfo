package com.etsy.android.p327ui.search;

import android.os.Bundle;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchContainerKey;
import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19456j;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;

/* renamed from: com.etsy.android.ui.search.c */
public final class C10735c implements C12729e {

    /* renamed from: a */
    public final C12741o f23668a;

    public C10735c(C12741o oVar) {
        C19383o.m32797g(oVar, "routeInspector");
        this.f23668a = oVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        C12730f fVar2 = fVar;
        String e = this.f23668a.mo45510e(fVar2.f28049b, DeepLinkEntity.CATEGORY.getEntityName());
        return new C12731g.C12733b(new SearchContainerKey(fVar2.f28050c, e != null ? new SearchSpec((String) null, C19456j.m33017U0(e), (SearchOptions) null, (Long) null, (String) null, false, false, false, false, (Bundle) null, 1021, (DefaultConstructorMarker) null) : new SearchSpec((String) null, (Long) null, (SearchOptions) null, (Long) null, (String) null, false, false, false, true, (Bundle) null, 767, (DefaultConstructorMarker) null), (SearchRedirectSpec) null, fVar2.f28051d, 4, (DefaultConstructorMarker) null));
    }
}
