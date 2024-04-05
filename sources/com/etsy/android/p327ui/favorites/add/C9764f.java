package com.etsy.android.p327ui.favorites.add;

import com.etsy.android.lib.models.apiv3.CheckableListingCollection;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p327ui.favorites.add.C9775p;
import com.etsy.android.p327ui.util.C11777e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p248tp.C8072t;
import p248tp.C8074v;

/* renamed from: com.etsy.android.ui.favorites.add.f */
public final /* synthetic */ class C9764f implements C8074v {

    /* renamed from: b */
    public final /* synthetic */ AddToListPresenter f21599b;

    /* renamed from: c */
    public final /* synthetic */ Map f21600c;

    /* renamed from: d */
    public final /* synthetic */ ListingLike f21601d;

    public /* synthetic */ C9764f(AddToListPresenter addToListPresenter, HashMap hashMap, ListingLike listingLike) {
        this.f21599b = addToListPresenter;
        this.f21600c = hashMap;
        this.f21601d = listingLike;
    }

    /* renamed from: f */
    public final void mo11996f(C8072t tVar) {
        AddToListPresenter addToListPresenter = this.f21599b;
        Map map = this.f21600c;
        ListingLike listingLike = this.f21601d;
        C19383o.m32797g(addToListPresenter, "this$0");
        C19383o.m32797g(map, "$collectionsChanged");
        C19383o.m32797g(listingLike, "$listing");
        Set<? extends CheckableListingCollection> set = addToListPresenter.f21560j;
        ArrayList arrayList = new ArrayList();
        for (T next : set) {
            if (((CheckableListingCollection) next).isTypeFavorites()) {
                arrayList.add(next);
            }
        }
        if (!C19543e0.m33306Y(arrayList)) {
            tVar.onSuccess(new C9775p.C9777b());
        } else if (!map.containsKey(((CheckableListingCollection) arrayList.get(0)).getKey())) {
            tVar.onSuccess(new C9775p.C9777b());
        } else {
            boolean isFavorite = listingLike.isFavorite();
            C9765g gVar = new C9765g(isFavorite, tVar);
            addToListPresenter.f21554d.mo32721b(new C11777e(listingLike, isFavorite, addToListPresenter.f21555e.mo45960e()), gVar);
        }
    }
}
