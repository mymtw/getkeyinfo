package com.etsy.android.p327ui.search;

import android.content.res.Resources;
import com.etsy.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.SortOrder */
public enum SortOrder {
    MOST_RECENT,
    RELEVANCY,
    HIGHEST_PRICE,
    LOWEST_PRICE;
    
    public static final C10730a Companion = null;
    /* access modifiers changed from: private */
    public static final SortOrder DEFAULT = null;

    /* renamed from: com.etsy.android.ui.search.SortOrder$a */
    public static final class C10730a {

        /* renamed from: com.etsy.android.ui.search.SortOrder$a$a */
        public /* synthetic */ class C10731a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23666a = null;

            static {
                int[] iArr = new int[SortOrder.values().length];
                iArr[SortOrder.RELEVANCY.ordinal()] = 1;
                iArr[SortOrder.MOST_RECENT.ordinal()] = 2;
                iArr[SortOrder.HIGHEST_PRICE.ordinal()] = 3;
                iArr[SortOrder.LOWEST_PRICE.ordinal()] = 4;
                f23666a = iArr;
            }
        }

        /* renamed from: a */
        public static String m18621a(Resources resources, SortOrder sortOrder) {
            C19383o.m32797g(resources, "resources");
            C19383o.m32797g(sortOrder, "sortOrder");
            int i = C10731a.f23666a[sortOrder.ordinal()];
            if (i == 1) {
                String string = resources.getString(R.string.sort_order_relevancy);
                C19383o.m32796f(string, "resources.getString(R.string.sort_order_relevancy)");
                return string;
            } else if (i == 2) {
                String string2 = resources.getString(R.string.sort_order_most_recent);
                C19383o.m32796f(string2, "resources.getString(R.st…g.sort_order_most_recent)");
                return string2;
            } else if (i == 3) {
                String string3 = resources.getString(R.string.sort_order_highest_price);
                C19383o.m32796f(string3, "resources.getString(R.st…sort_order_highest_price)");
                return string3;
            } else if (i == 4) {
                String string4 = resources.getString(R.string.sort_order_lowest_price);
                C19383o.m32796f(string4, "resources.getString(R.st….sort_order_lowest_price)");
                return string4;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* access modifiers changed from: public */
    static {
        SortOrder sortOrder;
        Companion = new C10730a();
        DEFAULT = sortOrder;
    }

    public static final String getSortOrderLabel(Resources resources, SortOrder sortOrder) {
        Companion.getClass();
        return C10730a.m18621a(resources, sortOrder);
    }
}
