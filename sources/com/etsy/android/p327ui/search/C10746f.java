package com.etsy.android.p327ui.search;

import android.net.Uri;
import android.os.Bundle;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPage;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchContainerKey;
import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;

/* renamed from: com.etsy.android.ui.search.f */
public final class C10746f implements C12729e {

    /* renamed from: a */
    public final C10865h f23680a;

    /* renamed from: b */
    public final C12741o f23681b;

    public C10746f(C10865h hVar, C12741o oVar) {
        C19383o.m32797g(hVar, "searchUriParser");
        C19383o.m32797g(oVar, "routeInspector");
        this.f23680a = hVar;
        this.f23681b = oVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        C12730f fVar2 = fVar;
        HashMap<String, String> a = this.f23680a.mo36068a(fVar2.f28049b);
        SearchOptions.Companion companion = SearchOptions.Companion;
        C10865h hVar = this.f23680a;
        Uri uri = fVar2.f28049b;
        companion.getClass();
        SearchOptions a2 = SearchOptions.Companion.m18947a(hVar, uri, (C8694h) null);
        String str = a.get(ResponseConstants.ANCHOR_LISTING_ID);
        boolean b = C19383o.m32792b(a.get("include_featured_categories"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        String str2 = a.get(SearchCategoryRedirectPage.PARAM_QUERY);
        C10865h hVar2 = this.f23680a;
        Uri uri2 = fVar2.f28049b;
        hVar2.getClass();
        String b2 = C10865h.m18884b(uri2);
        String e = this.f23681b.mo45510e(fVar2.f28049b, DeepLinkEntity.SEARCH.getEntityName());
        if (C19383o.m32792b(e, "people") || C19383o.m32792b(e, "shops")) {
            return new C12731g.C12733b(new SearchContainerKey(fVar2.f28050c, (SearchSpec) null, (SearchRedirectSpec) null, fVar2.f28051d, 6, (DefaultConstructorMarker) null));
        }
        return new C12731g.C12733b(new SearchContainerKey(fVar2.f28050c, new SearchSpec(str2, (Long) null, a2, (Long) null, str, false, false, b, false, (Bundle) null, 874, (DefaultConstructorMarker) null), new SearchRedirectSpec(b2, a, false, 4, (DefaultConstructorMarker) null), fVar2.f28051d));
    }
}
