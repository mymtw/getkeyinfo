package com.etsy.android.p327ui.search.toplevelcategories;

import com.etsy.android.lib.models.apiv3.search.GiftGuide;
import com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions;
import com.etsy.android.lib.models.apiv3.search.TaxonomyNode;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11071q;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11083w;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

/* renamed from: com.etsy.android.ui.search.toplevelcategories.a */
public final class C10955a {
    /* renamed from: a */
    public static List m18944a(SearchLandingSuggestions searchLandingSuggestions) {
        C19383o.m32797g(searchLandingSuggestions, "searchLandingSuggestions");
        if (searchLandingSuggestions.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(C11083w.C11095l.f24567a);
        if (!searchLandingSuggestions.getCategories().isEmpty()) {
            int i = 0;
            for (T next : searchLandingSuggestions.getCategories()) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(new C11083w.C11084a((TaxonomyNode) next, i));
                    i = i2;
                } else {
                    C17782b.m29877o0();
                    throw null;
                }
            }
        }
        List<GiftGuide> giftGuides = searchLandingSuggestions.getGiftGuides();
        if (giftGuides != null && (!giftGuides.isEmpty())) {
            arrayList.add(new C11083w.C11091h(C11071q.C11077f.f24542a));
            List<GiftGuide> giftGuides2 = searchLandingSuggestions.getGiftGuides();
            if (giftGuides2 != null) {
                for (GiftGuide oVar : giftGuides2) {
                    arrayList.add(new C11083w.C11098o(oVar));
                }
            }
        }
        SearchLandingSuggestions.PurchaseGiftCard purchaseGiftCard = searchLandingSuggestions.getPurchaseGiftCard();
        if (purchaseGiftCard != null && purchaseGiftCard.getEligible()) {
            arrayList.add(new C11083w.C11087d(purchaseGiftCard.getImageUrl()));
        }
        return arrayList;
    }
}
