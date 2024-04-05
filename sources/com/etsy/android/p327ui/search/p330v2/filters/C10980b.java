package com.etsy.android.p327ui.search.p330v2.filters;

import android.content.res.Resources;
import com.etsy.android.R;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import java.math.BigDecimal;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.filters.b */
public final class C10980b {

    /* renamed from: com.etsy.android.ui.search.v2.filters.b$a */
    public /* synthetic */ class C10981a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24345a;

        static {
            int[] iArr = new int[SearchOptions.MarketPlace.values().length];
            iArr[SearchOptions.MarketPlace.MARKETPLACE_VINTAGE.ordinal()] = 1;
            iArr[SearchOptions.MarketPlace.MARKETPLACE_HANDMADE.ordinal()] = 2;
            f24345a = iArr;
        }
    }

    /* renamed from: a */
    public static final C10978a m18955a(SearchOptions searchOptions, boolean z, Resources resources, C8629a aVar, C8630b bVar) {
        String str;
        C19383o.m32797g(searchOptions, "searchOptions");
        C19383o.m32797g(resources, "resources");
        C19383o.m32797g(aVar, "appCurrency");
        C19383o.m32797g(bVar, "moneyFactory");
        BigDecimal minPrice = searchOptions.getMinPrice();
        BigDecimal maxPrice = searchOptions.getMaxPrice();
        C19383o.m32797g(minPrice, "minPrice");
        EtsyMoney a = bVar.mo21248a(minPrice.toString(), aVar.mo21246a());
        String str2 = null;
        EtsyMoney a2 = maxPrice != null ? bVar.mo21248a(maxPrice.toString(), aVar.mo21246a()) : null;
        BigDecimal bigDecimal = SearchOptions.DEFAULT_LOW_PRICE;
        if (!C19383o.m32792b(minPrice, bigDecimal) && maxPrice != null && !z) {
            Object[] objArr = new Object[2];
            objArr[0] = a.format();
            if (a2 != null) {
                str2 = a2.format();
            }
            objArr[1] = str2;
            str = resources.getString(R.string.new_search_empty_view_price_range_desc, objArr);
            C19383o.m32796f(str, "{\n        resources.getS….format()\n        )\n    }");
        } else if (!C19383o.m32792b(minPrice, bigDecimal) && z) {
            Object[] objArr2 = new Object[2];
            objArr2[0] = a.format();
            if (a2 != null) {
                str2 = a2.format();
            }
            objArr2[1] = str2;
            str = resources.getString(R.string.new_search_empty_view_price_range_desc, objArr2);
            C19383o.m32796f(str, "{\n        // For an edge….format()\n        )\n    }");
        } else if (!C19383o.m32792b(minPrice, bigDecimal)) {
            str = resources.getString(R.string.search_filters_price_min_bound_desc, new Object[]{a.format()});
            C19383o.m32796f(str, "{\n        resources.getS….format()\n        )\n    }");
        } else {
            Object[] objArr3 = new Object[1];
            if (a2 != null) {
                str2 = a2.format();
            }
            objArr3[0] = str2;
            str = resources.getString(R.string.search_filters_price_max_bound_desc, objArr3);
            C19383o.m32796f(str, "{\n        resources.getS….format()\n        )\n    }");
        }
        return new C10978a(str, FilterType.FILTER_PRICE);
    }
}
