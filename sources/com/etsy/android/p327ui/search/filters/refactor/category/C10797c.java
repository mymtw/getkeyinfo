package com.etsy.android.p327ui.search.filters.refactor.category;

import com.etsy.android.lib.models.apiv3.FacetCount;
import java.util.Comparator;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.search.filters.refactor.category.c */
public final class C10797c<T> implements Comparator {
    public final int compare(T t, T t2) {
        return C18263b.m30880z(Integer.valueOf(((FacetCount) t2).getCount()), Integer.valueOf(((FacetCount) t).getCount()));
    }
}
