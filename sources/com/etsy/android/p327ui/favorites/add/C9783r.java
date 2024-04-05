package com.etsy.android.p327ui.favorites.add;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.CollectionPrivacyLevel;
import com.etsy.android.lib.models.interfaces.ListingLike;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.favorites.add.r */
public final class C9783r {

    /* renamed from: a */
    public final String f21625a;

    /* renamed from: b */
    public final List<Long> f21626b;

    /* renamed from: c */
    public final List<ListingLike> f21627c;

    /* renamed from: d */
    public final CollectionPrivacyLevel f21628d;

    public C9783r(String str, List<Long> list, List<? extends ListingLike> list2, CollectionPrivacyLevel collectionPrivacyLevel) {
        C19383o.m32797g(collectionPrivacyLevel, "privacyLevel");
        this.f21625a = str;
        this.f21626b = list;
        this.f21627c = list2;
        this.f21628d = collectionPrivacyLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9783r)) {
            return false;
        }
        C9783r rVar = (C9783r) obj;
        return C19383o.m32792b(this.f21625a, rVar.f21625a) && C19383o.m32792b(this.f21626b, rVar.f21626b) && C19383o.m32792b(this.f21627c, rVar.f21627c) && this.f21628d == rVar.f21628d;
    }

    public final int hashCode() {
        int hashCode = this.f21625a.hashCode() * 31;
        List<Long> list = this.f21626b;
        return this.f21628d.hashCode() + C13983i.m21488g(this.f21627c, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MultipleListingCollectionSpec(collectionName=");
        h.append(this.f21625a);
        h.append(", listingIds=");
        h.append(this.f21626b);
        h.append(", listings=");
        h.append(this.f21627c);
        h.append(", privacyLevel=");
        h.append(this.f21628d);
        h.append(')');
        return h.toString();
    }
}
