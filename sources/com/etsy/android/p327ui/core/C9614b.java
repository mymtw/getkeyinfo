package com.etsy.android.p327ui.core;

import android.net.Uri;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.p327ui.favorites.recommendations.ListRecommendationsFragment;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CollectionKey;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;

/* renamed from: com.etsy.android.ui.core.b */
public final class C9614b implements C12729e {

    /* renamed from: a */
    public final C12741o f21306a;

    public C9614b(C12741o oVar) {
        C19383o.m32797g(oVar, "routeInspector");
        this.f21306a = oVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        CollectionKey collectionKey;
        Uri uri = fVar.f28049b;
        String e = this.f21306a.mo45510e(uri, DeepLinkEntity.LISTING_COLLECTION.getEntityName());
        if ((e == null || e.length() == 0) && !mo32294b(uri)) {
            return new C12731g.C12732a(C0073e.m206f("Invalid Collection Key ", uri));
        }
        if (mo32294b(uri)) {
            this.f21306a.getClass();
            String queryParameter = uri.getQueryParameter(ListRecommendationsFragment.COLLECTION_KEY);
            this.f21306a.getClass();
            collectionKey = new CollectionKey(fVar.f28050c, (Collection) null, queryParameter, (String) null, uri.getQueryParameter("slug"), (String) null, false, fVar.f28051d, 106, (DefaultConstructorMarker) null);
        } else {
            collectionKey = new CollectionKey(fVar.f28050c, (Collection) null, e, (String) null, (String) null, (String) null, false, fVar.f28051d, 122, (DefaultConstructorMarker) null);
        }
        return new C12731g.C12733b(collectionKey);
    }

    /* renamed from: b */
    public final boolean mo32294b(Uri uri) {
        this.f21306a.getClass();
        HashMap c = C12741o.m20403c(uri);
        return c.containsKey("slug") && c.containsKey(ListRecommendationsFragment.COLLECTION_KEY);
    }
}
