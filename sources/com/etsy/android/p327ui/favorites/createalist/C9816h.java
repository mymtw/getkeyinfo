package com.etsy.android.p327ui.favorites.createalist;

import com.etsy.android.lib.models.apiv3.listing.ListingCard;
import com.etsy.android.p327ui.favorites.C9863o;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.subjects.C19254a;

/* renamed from: com.etsy.android.ui.favorites.createalist.h */
public final class C9816h {

    /* renamed from: b */
    public static final LinkedHashSet<ListingCard> f21712b;

    /* renamed from: c */
    public static C19254a<Set<ListingCard>> f21713c;

    /* renamed from: a */
    public final C9863o f21714a;

    static {
        LinkedHashSet<ListingCard> linkedHashSet = new LinkedHashSet<>();
        f21712b = linkedHashSet;
        f21713c = C19254a.m32516l(linkedHashSet);
    }

    public C9816h(C9863o oVar) {
        this.f21714a = oVar;
    }

    /* renamed from: a */
    public static Set m18087a() {
        Set<ListingCard> m = f21713c.mo71420m();
        C19383o.m32794d(m);
        return m;
    }
}
