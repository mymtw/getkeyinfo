package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies;

import com.etsy.android.lib.models.Country;
import java.util.Comparator;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.e */
public final class C10562e<T> implements Comparator {
    public final int compare(T t, T t2) {
        return C18263b.m30880z(((Country) t).getSlug(), ((Country) t2).getSlug());
    }
}
