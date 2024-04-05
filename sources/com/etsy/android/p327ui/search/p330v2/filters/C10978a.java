package com.etsy.android.p327ui.search.p330v2.filters;

import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.filters.a */
public final class C10978a {

    /* renamed from: a */
    public final CharSequence f24342a;

    /* renamed from: b */
    public final FilterType f24343b;

    /* renamed from: com.etsy.android.ui.search.v2.filters.a$a */
    public /* synthetic */ class C10979a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24344a;

        static {
            int[] iArr = new int[FilterType.values().length];
            iArr[FilterType.FILTER_CATEGORY.ordinal()] = 1;
            iArr[FilterType.FILTER_MARKETPLACE.ordinal()] = 2;
            iArr[FilterType.FILTER_PRICE.ordinal()] = 3;
            iArr[FilterType.FILTER_SHIPS_TO.ordinal()] = 4;
            iArr[FilterType.FILTER_SHOP_LOCATION.ordinal()] = 5;
            iArr[FilterType.FILTER_GIFT_CARDS.ordinal()] = 6;
            iArr[FilterType.OPTION_SORT_ORDER.ordinal()] = 7;
            iArr[FilterType.FILTER_ONSALE.ordinal()] = 8;
            iArr[FilterType.FILTER_FREE_SHIPPING.ordinal()] = 9;
            iArr[FilterType.FILTER_1_DAY_SHIPPING.ordinal()] = 10;
            iArr[FilterType.FILTER_3_DAY_SHIPPING.ordinal()] = 11;
            iArr[FilterType.FILTER_CUSTOMIZABLE.ordinal()] = 12;
            iArr[FilterType.FILTER_GIFT_WRAP.ordinal()] = 13;
            f24344a = iArr;
        }
    }

    public C10978a(CharSequence charSequence, FilterType filterType) {
        C19383o.m32797g(filterType, "filterId");
        this.f24342a = charSequence;
        this.f24343b = filterType;
    }
}
