package com.etsy.android.p327ui.search;

import android.net.Uri;
import android.os.Bundle;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchContainerKey;
import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19456j;
import kotlin.text.C19457k;
import org.apache.commons.cli.HelpFormatter;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.search.e */
public final class C10745e implements C12729e {

    /* renamed from: a */
    public final C10865h f23678a;

    /* renamed from: b */
    public final C12741o f23679b;

    public C10745e(C10865h hVar, C12741o oVar) {
        C19383o.m32797g(hVar, "searchUriParser");
        C19383o.m32797g(oVar, "routeInspector");
        this.f23678a = hVar;
        this.f23679b = oVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        C12730f fVar2 = fVar;
        HashMap<String, String> a = this.f23678a.mo36068a(fVar2.f28049b);
        SearchOptions.Companion companion = SearchOptions.Companion;
        C10865h hVar = this.f23678a;
        Uri uri = fVar2.f28049b;
        companion.getClass();
        Long l = null;
        SearchOptions a2 = SearchOptions.Companion.m18947a(hVar, uri, (C8694h) null);
        String str = a.get(ResponseConstants.ANCHOR_LISTING_ID);
        boolean b = C19383o.m32792b(a.get("include_featured_categories"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        String e = this.f23679b.mo45510e(fVar2.f28049b, DeepLinkEntity.MARKET.getEntityName());
        if (e == null) {
            e = "";
        }
        String H = C18263b.m30813H((C8694h) null, C19457k.m33023a1(C19457k.m33023a1(e, HelpFormatter.DEFAULT_OPT_PREFIX, " ", false), "_", " ", false));
        C12741o oVar = this.f23679b;
        Uri uri2 = fVar2.f28049b;
        oVar.getClass();
        String d = C12741o.m20404d(uri2, ResponseConstants.TAXONOMY_ID);
        if (d != null) {
            l = C19456j.m33017U0(d);
        }
        SearchSpec searchSpec = new SearchSpec(H, l, a2, (Long) null, str, false, false, b, false, (Bundle) null, 872, (DefaultConstructorMarker) null);
        return new C12731g.C12733b(new SearchContainerKey(fVar2.f28050c, searchSpec, (SearchRedirectSpec) null, fVar2.f28051d, 4, (DefaultConstructorMarker) null));
    }
}
