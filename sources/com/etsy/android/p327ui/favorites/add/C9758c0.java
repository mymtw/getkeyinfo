package com.etsy.android.p327ui.favorites.add;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p327ui.util.CollectionUtil$ListingCollectionAction;
import com.etsy.android.p327ui.util.CollectionUtil$ListingCollectionsChangeState;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.add.c0 */
public final class C9758c0 {

    /* renamed from: a */
    public final EtsyId f21591a;

    /* renamed from: b */
    public final ListingLike f21592b;

    /* renamed from: c */
    public final Map<String, CollectionUtil$ListingCollectionAction> f21593c;

    /* renamed from: d */
    public final CollectionUtil$ListingCollectionsChangeState f21594d;

    public C9758c0(EtsyId etsyId, ListingLike listingLike, LinkedHashMap linkedHashMap, CollectionUtil$ListingCollectionsChangeState collectionUtil$ListingCollectionsChangeState) {
        C19383o.m32797g(collectionUtil$ListingCollectionsChangeState, "collectionChangeState");
        this.f21591a = etsyId;
        this.f21592b = listingLike;
        this.f21593c = linkedHashMap;
        this.f21594d = collectionUtil$ListingCollectionsChangeState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9758c0)) {
            return false;
        }
        C9758c0 c0Var = (C9758c0) obj;
        return C19383o.m32792b(this.f21591a, c0Var.f21591a) && C19383o.m32792b(this.f21592b, c0Var.f21592b) && C19383o.m32792b(this.f21593c, c0Var.f21593c) && this.f21594d == c0Var.f21594d;
    }

    public final int hashCode() {
        int hashCode = (this.f21592b.hashCode() + (this.f21591a.hashCode() * 31)) * 31;
        Map<String, CollectionUtil$ListingCollectionAction> map = this.f21593c;
        return this.f21594d.hashCode() + ((hashCode + (map == null ? 0 : map.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SaveListingCollectionSpec(listingId=");
        h.append(this.f21591a);
        h.append(", listing=");
        h.append(this.f21592b);
        h.append(", collectionsChanged=");
        h.append(this.f21593c);
        h.append(", collectionChangeState=");
        h.append(this.f21594d);
        h.append(')');
        return h.toString();
    }
}
