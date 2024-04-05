package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class SellerMarketingPromotionDataJsonAdapter extends JsonAdapter<SellerMarketingPromotionData> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("id", "type", ResponseConstants.HAS_MINIMUM, "seller_desc", "discount_desc", ResponseConstants.DISCOUNTED_PRICE, ResponseConstants.PERCENTAGE_DISCOUNT, ResponseConstants.MIN_ORDER_ITEMS, "min_set_items", "discounted_amt", "min_order_amt", "discounted_money", "new_original_price", "min_order_money", "savings_money");

    public SellerMarketingPromotionDataJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar2.mo68558c(Long.class, emptySet, "id");
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, "type");
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "hasMinimum");
        this.nullableStringAdapter = yVar2.mo68558c(String.class, emptySet, "sellerDesc");
        this.nullableMoneyAdapter = yVar2.mo68558c(Money.class, emptySet, "discountedMoney");
    }

    public String toString() {
        return "GeneratedJsonAdapter(SellerMarketingPromotionData)";
    }

    public SellerMarketingPromotionData fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        Long l = null;
        Integer num = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Money money = null;
        Money money2 = null;
        Money money3 = null;
        Money money4 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
                case 1:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 2:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 6:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 7:
                    num3 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 8:
                    num4 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 9:
                    num5 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 10:
                    num6 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 11:
                    money = this.nullableMoneyAdapter.fromJson(jsonReader2);
                    break;
                case 12:
                    money2 = this.nullableMoneyAdapter.fromJson(jsonReader2);
                    break;
                case 13:
                    money3 = this.nullableMoneyAdapter.fromJson(jsonReader2);
                    break;
                case 14:
                    money4 = this.nullableMoneyAdapter.fromJson(jsonReader2);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new SellerMarketingPromotionData(l, num, bool, str, str2, str3, num2, num3, num4, num5, num6, money, money2, money3, money4);
    }

    public void toJson(C17412w wVar, SellerMarketingPromotionData sellerMarketingPromotionData) {
        C19383o.m32797g(wVar, "writer");
        if (sellerMarketingPromotionData != null) {
            wVar.mo68522b();
            wVar.mo68529h("id");
            this.nullableLongAdapter.toJson(wVar, sellerMarketingPromotionData.getId());
            wVar.mo68529h("type");
            this.nullableIntAdapter.toJson(wVar, sellerMarketingPromotionData.getType());
            wVar.mo68529h(ResponseConstants.HAS_MINIMUM);
            this.nullableBooleanAdapter.toJson(wVar, sellerMarketingPromotionData.getHasMinimum());
            wVar.mo68529h("seller_desc");
            this.nullableStringAdapter.toJson(wVar, sellerMarketingPromotionData.getSellerDesc());
            wVar.mo68529h("discount_desc");
            this.nullableStringAdapter.toJson(wVar, sellerMarketingPromotionData.getDiscountDesc());
            wVar.mo68529h(ResponseConstants.DISCOUNTED_PRICE);
            this.nullableStringAdapter.toJson(wVar, sellerMarketingPromotionData.getDiscountedPrice());
            wVar.mo68529h(ResponseConstants.PERCENTAGE_DISCOUNT);
            this.nullableIntAdapter.toJson(wVar, sellerMarketingPromotionData.getPercentageDiscount());
            wVar.mo68529h(ResponseConstants.MIN_ORDER_ITEMS);
            this.nullableIntAdapter.toJson(wVar, sellerMarketingPromotionData.getMinOrderItems());
            wVar.mo68529h("min_set_items");
            this.nullableIntAdapter.toJson(wVar, sellerMarketingPromotionData.getMinSetItems());
            wVar.mo68529h("discounted_amt");
            this.nullableIntAdapter.toJson(wVar, sellerMarketingPromotionData.getDiscountedAmt());
            wVar.mo68529h("min_order_amt");
            this.nullableIntAdapter.toJson(wVar, sellerMarketingPromotionData.getMinOrderAmt());
            wVar.mo68529h("discounted_money");
            this.nullableMoneyAdapter.toJson(wVar, sellerMarketingPromotionData.getDiscountedMoney());
            wVar.mo68529h("new_original_price");
            this.nullableMoneyAdapter.toJson(wVar, sellerMarketingPromotionData.getNewOriginalPrice());
            wVar.mo68529h("min_order_money");
            this.nullableMoneyAdapter.toJson(wVar, sellerMarketingPromotionData.getMinOrderMoney());
            wVar.mo68529h("savings_money");
            this.nullableMoneyAdapter.toJson(wVar, sellerMarketingPromotionData.getSavingsMoney());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
