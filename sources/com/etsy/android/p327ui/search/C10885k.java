package com.etsy.android.p327ui.search;

import android.net.Uri;
import android.os.Bundle;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchContainerKey;
import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;

/* renamed from: com.etsy.android.ui.search.k */
public final class C10885k implements C12729e {

    /* renamed from: a */
    public final C10865h f24150a;

    public C10885k(C10865h hVar) {
        C19383o.m32797g(hVar, "searchUriParser");
        this.f24150a = hVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        C12730f fVar2 = fVar;
        HashMap<String, String> a = this.f24150a.mo36068a(fVar2.f28049b);
        C10865h hVar = this.f24150a;
        Uri uri = fVar2.f28049b;
        hVar.getClass();
        String b = C10865h.m18884b(uri);
        SearchOptions.Companion companion = SearchOptions.Companion;
        C10865h hVar2 = this.f24150a;
        Uri uri2 = fVar2.f28049b;
        companion.getClass();
        SearchRedirectSpec searchRedirectSpec = new SearchRedirectSpec(b, a, false, 4, (DefaultConstructorMarker) null);
        return new C12731g.C12733b(new SearchContainerKey(fVar2.f28050c, new SearchSpec((String) null, (Long) null, SearchOptions.Companion.m18947a(hVar2, uri2, (C8694h) null), (Long) null, a.get(ResponseConstants.ANCHOR_LISTING_ID), false, false, false, false, (Bundle) null, 1003, (DefaultConstructorMarker) null), searchRedirectSpec, fVar2.f28051d));
    }
}
