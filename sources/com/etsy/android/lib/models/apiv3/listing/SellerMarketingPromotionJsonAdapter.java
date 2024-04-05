package com.etsy.android.lib.models.apiv3.listing;

import com.appsflyer.AppsFlyerProperties;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SellerMarketingPromotionJsonAdapter extends JsonAdapter<SellerMarketingPromotion> {
    public static final int $stable = 8;
    private volatile Constructor<SellerMarketingPromotion> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("created", ResponseConstants.CURRENCY_CODE, "description", ResponseConstants.PROMOTION_END, "fixed_items_in_set_discount", "fixed_order_discount", "id", "items_in_set_discount_pct", "min_num_items_from_set", ResponseConstants.MIN_NUM_ORDER_ITEMS, ResponseConstants.MIN_ORDER_PRICE, "order_discount_pct", "shipping_discount_pct", "start", "type", "updated", "venue_id");

    public SellerMarketingPromotionJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar2.mo68558c(Long.class, emptySet, "created");
        this.nullableStringAdapter = yVar2.mo68558c(String.class, emptySet, AppsFlyerProperties.CURRENCY_CODE);
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, "fixedItemsInSetDiscount");
    }

    public String toString() {
        return "GeneratedJsonAdapter(SellerMarketingPromotion)";
    }

    public SellerMarketingPromotion fromJson(JsonReader jsonReader) {
        int i;
        JsonReader jsonReader2 = jsonReader;
        Class<Long> cls = Long.class;
        Class<Integer> cls2 = Integer.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i2 = -1;
        Long l = null;
        String str = null;
        String str2 = null;
        Long l2 = null;
        Integer num = null;
        Integer num2 = null;
        Long l3 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Long l4 = null;
        Integer num9 = null;
        Long l5 = null;
        Long l6 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    continue;
                case 0:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    i2 &= -2;
                    continue;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -3;
                    continue;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -5;
                    continue;
                case 3:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i2 &= -9;
                    continue;
                case 4:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -17;
                    continue;
                case 5:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -33;
                    continue;
                case 6:
                    l3 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i2 &= -65;
                    continue;
                case 7:
                    num3 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -129;
                    continue;
                case 8:
                    num4 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -257;
                    continue;
                case 9:
                    num5 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -513;
                    continue;
                case 10:
                    num6 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -1025;
                    continue;
                case 11:
                    num7 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -2049;
                    continue;
                case 12:
                    num8 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -4097;
                    continue;
                case 13:
                    l4 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i2 &= -8193;
                    continue;
                case 14:
                    num9 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -16385;
                    continue;
                case 15:
                    l5 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i = -32769;
                    break;
                case 16:
                    l6 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i = -65537;
                    break;
            }
            i2 &= i;
        }
        jsonReader.mo68413e();
        if (i2 == -131072) {
            return new SellerMarketingPromotion(l, str, str2, l2, num, num2, l3, num3, num4, num5, num6, num7, num8, l4, num9, l5, l6);
        }
        Constructor<SellerMarketingPromotion> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SellerMarketingPromotion.class.getDeclaredConstructor(new Class[]{cls, String.class, String.class, cls, cls2, cls2, cls, cls2, cls2, cls2, cls2, cls2, cls2, cls, cls2, cls, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "SellerMarketingPromotion…his.constructorRef = it }");
        }
        SellerMarketingPromotion newInstance = constructor.newInstance(new Object[]{l, str, str2, l2, num, num2, l3, num3, num4, num5, num6, num7, num8, l4, num9, l5, l6, Integer.valueOf(i2), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, SellerMarketingPromotion sellerMarketingPromotion) {
        C19383o.m32797g(wVar, "writer");
        if (sellerMarketingPromotion != null) {
            wVar.mo68522b();
            wVar.mo68529h("created");
            this.nullableLongAdapter.toJson(wVar, sellerMarketingPromotion.getCreated());
            wVar.mo68529h(ResponseConstants.CURRENCY_CODE);
            this.nullableStringAdapter.toJson(wVar, sellerMarketingPromotion.getCurrencyCode());
            wVar.mo68529h("description");
            this.nullableStringAdapter.toJson(wVar, sellerMarketingPromotion.getDescription());
            wVar.mo68529h(ResponseConstants.PROMOTION_END);
            this.nullableLongAdapter.toJson(wVar, sellerMarketingPromotion.getEnd());
            wVar.mo68529h("fixed_items_in_set_discount");
            this.nullableIntAdapter.toJson(wVar, sellerMarketingPromotion.getFixedItemsInSetDiscount());
            wVar.mo68529h("fixed_order_discount");
            this.nullableIntAdapter.toJson(wVar, sellerMarketingPromotion.getFixedOrderDiscount());
            wVar.mo68529h("id");
            this.nullableLongAdapter.toJson(wVar, sellerMarketingPromotion.getId());
            wVar.mo68529h("items_in_set_discount_pct");
            this.nullableIntAdapter.toJson(wVar, sellerMarketingPromotion.getItemsInSetDiscountPct());
            wVar.mo68529h("min_num_items_from_set");
            this.nullableIntAdapter.toJson(wVar, sellerMarketingPromotion.getMinNumItemsFromSet());
            wVar.mo68529h(ResponseConstants.MIN_NUM_ORDER_ITEMS);
            this.nullableIntAdapter.toJson(wVar, sellerMarketingPromotion.getMinNumOrderItems());
            wVar.mo68529h(ResponseConstants.MIN_ORDER_PRICE);
            this.nullableIntAdapter.toJson(wVar, sellerMarketingPromotion.getMinOrderPrice());
            wVar.mo68529h("order_discount_pct");
            this.nullableIntAdapter.toJson(wVar, sellerMarketingPromotion.getOrderDiscountPct());
            wVar.mo68529h("shipping_discount_pct");
            this.nullableIntAdapter.toJson(wVar, sellerMarketingPromotion.getShippingDiscountPct());
            wVar.mo68529h("start");
            this.nullableLongAdapter.toJson(wVar, sellerMarketingPromotion.getStart());
            wVar.mo68529h("type");
            this.nullableIntAdapter.toJson(wVar, sellerMarketingPromotion.getType());
            wVar.mo68529h("updated");
            this.nullableLongAdapter.toJson(wVar, sellerMarketingPromotion.getUpdated());
            wVar.mo68529h("venue_id");
            this.nullableLongAdapter.toJson(wVar, sellerMarketingPromotion.getVenueId());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
