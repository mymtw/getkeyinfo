package com.etsy.android.p327ui.search.filters;

import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.filters.AttributeFacet;
import com.etsy.android.lib.models.apiv3.filters.AttributeValue;
import com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type;
import com.etsy.android.lib.models.apiv3.filters.StaticFilterAttribute;
import com.etsy.android.lib.models.apiv3.filters.ValueFacet;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10993f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import p486y9.C13888d;

/* renamed from: com.etsy.android.ui.search.filters.d */
public final class C10766d {

    /* renamed from: a */
    public final C10993f f23724a;

    /* renamed from: b */
    public final C13888d f23725b;

    /* renamed from: c */
    public final ArrayList f23726c = new ArrayList();

    /* renamed from: d */
    public Map<SearchFiltersV2Type, Integer> f23727d = C19294b0.m32562s0(new Pair(SearchFiltersV2Type.SORT_BY, Integer.valueOf(R.string.new_search_filter_sort_by)), new Pair(SearchFiltersV2Type.SORT_RELEVANCE, Integer.valueOf(R.string.order_relevance)), new Pair(SearchFiltersV2Type.SORT_RECENT, Integer.valueOf(R.string.sort_order_most_recent)), new Pair(SearchFiltersV2Type.SORT_HIGHEST_PRICE, Integer.valueOf(R.string.sort_order_highest_price)), new Pair(SearchFiltersV2Type.SORT_LOWEST_PRICE, Integer.valueOf(R.string.sort_order_lowest_price)), new Pair(SearchFiltersV2Type.PRICE, Integer.valueOf(R.string.price)), new Pair(SearchFiltersV2Type.ANY_PRICE, Integer.valueOf(R.string.search_filters_any_price)), new Pair(SearchFiltersV2Type.CATEGORY, Integer.valueOf(R.string.category)), new Pair(SearchFiltersV2Type.ALL_CATEGORIES, Integer.valueOf(R.string.all_categories)), new Pair(SearchFiltersV2Type.ITEM_TYPE, Integer.valueOf(R.string.new_search_filter_item_type)), new Pair(SearchFiltersV2Type.ALL_ITEMS, Integer.valueOf(R.string.new_search_filter_all_items)), new Pair(SearchFiltersV2Type.HANDMADE, Integer.valueOf(R.string.handmade)), new Pair(SearchFiltersV2Type.VINTAGE, Integer.valueOf(R.string.vintage)), new Pair(SearchFiltersV2Type.SHIPPING, Integer.valueOf(R.string.shipping)), new Pair(SearchFiltersV2Type.FREE_SHIPPING, Integer.valueOf(R.string.new_search_filter_free_shipping)), new Pair(SearchFiltersV2Type.SHIPPING_ONE_DAY, Integer.valueOf(R.string.new_search_filter_1_day_shipping)), new Pair(SearchFiltersV2Type.SHIPPING_ONE_THREE_DAYS, Integer.valueOf(R.string.new_search_filter_3_day_shipping)), new Pair(SearchFiltersV2Type.SHIPS_TO, Integer.valueOf(R.string.search_filter_ships_to_title)), new Pair(SearchFiltersV2Type.SHOP_LOCATION, Integer.valueOf(R.string.search_filter_location_title)), new Pair(SearchFiltersV2Type.ANYWHERE, Integer.valueOf(R.string.new_search_filter_shop_location_anywhere)), new Pair(SearchFiltersV2Type.CUSTOM_SHOP_LOCATION, Integer.valueOf(R.string.new_search_filter_shop_location_custom_title)), new Pair(SearchFiltersV2Type.LOCAL, Integer.valueOf(R.string.search_filter_shop_location_local)), new Pair(SearchFiltersV2Type.OTHER_OPTIONS, Integer.valueOf(R.string.structured_payment_other_options)), new Pair(SearchFiltersV2Type.ON_SALE, Integer.valueOf(R.string.new_search_filter_onsale)), new Pair(SearchFiltersV2Type.ACCEPT_GIFT_CARDS, Integer.valueOf(R.string.new_search_filter_accepts_giftcards)), new Pair(SearchFiltersV2Type.CUSTOMIZABLE, Integer.valueOf(R.string.new_search_filter_customizable)), new Pair(SearchFiltersV2Type.CAN_BE_GIFT_WRAPPED, Integer.valueOf(R.string.new_search_filter_gift_wrapped)), new Pair(SearchFiltersV2Type.CUSTOM, Integer.valueOf(R.string.order_custom)));

    public C10766d(C10993f fVar, C13888d dVar) {
        C19383o.m32797g(fVar, "resProvider");
        C19383o.m32797g(dVar, "currentLocale");
        this.f23724a = fVar;
        this.f23725b = dVar;
    }

    /* renamed from: b */
    public static ArrayList m18645b(List list, StaticFilterAttribute staticFilterAttribute) {
        C19383o.m32797g(list, "dynamicFacets");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AttributeFacet attributeFacet = (AttributeFacet) it.next();
            AttributeValue attribute = attributeFacet.getAttribute();
            if (attribute != null ? C19383o.m32792b(attribute.isSize(), Boolean.TRUE) : false) {
                AttributeValue attribute2 = attributeFacet.getAttribute();
                if (attribute2 != null) {
                    attribute2.setFilterType(SearchFiltersV2Type.SIZE);
                }
            } else {
                AttributeValue attribute3 = attributeFacet.getAttribute();
                if (attribute3 != null) {
                    attribute3.setFilterType(SearchFiltersV2Type.MULTI_SELECT);
                }
            }
            arrayList2.add(C19394m.f43287a);
        }
        if (staticFilterAttribute != null) {
            AttributeFacet attributeFacet2 = new AttributeFacet();
            AttributeValue attributeValue = new AttributeValue();
            attributeValue.setName(staticFilterAttribute.getName());
            attributeValue.setId(staticFilterAttribute.getId());
            attributeValue.setFilterType(SearchFiltersV2Type.COLOR);
            attributeFacet2.setAttribute(attributeValue);
            ArrayList arrayList3 = new ArrayList();
            List<AttributeValue> values = staticFilterAttribute.getValues();
            if (values != null) {
                for (AttributeValue attributeValue2 : values) {
                    ValueFacet valueFacet = new ValueFacet();
                    valueFacet.setCount((String) null);
                    valueFacet.setAttributeValue(attributeValue2);
                    arrayList3.add(valueFacet);
                }
            }
            attributeFacet2.setValueFacets(arrayList3);
            arrayList.add(attributeFacet2);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final String mo35740a(SearchFiltersV2Type searchFiltersV2Type) {
        C19383o.m32797g(searchFiltersV2Type, "filterType");
        Integer num = this.f23727d.get(searchFiltersV2Type);
        if (num != null) {
            return String.valueOf(num.intValue());
        }
        return null;
    }
}
