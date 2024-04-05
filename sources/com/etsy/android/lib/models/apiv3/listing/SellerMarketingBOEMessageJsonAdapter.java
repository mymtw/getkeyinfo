package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SellerMarketingBOEMessageJsonAdapter extends JsonAdapter<SellerMarketingBOEMessage> {
    public static final int $stable = 8;
    private volatile Constructor<SellerMarketingBOEMessage> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<FormattedMoney> nullableFormattedMoneyAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<SellerMarketingPromotion> nullableSellerMarketingPromotionAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("description", ResponseConstants.SELLER_DESCRIPTION, ResponseConstants.DISCLAIMER, ResponseConstants.HAS_MINIMUM_CONDITION, ResponseConstants.HAS_FREE_SHIPPING, ResponseConstants.DISCOUNT_DESCRIPTION, ResponseConstants.DISCOUNTED_PRICE, "promo_data");

    public SellerMarketingBOEMessageJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "description");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "hasMinimumCondition");
        this.nullableFormattedMoneyAdapter = yVar.mo68558c(FormattedMoney.class, emptySet, "discountDescription");
        this.nullableMoneyAdapter = yVar.mo68558c(Money.class, emptySet, "discountedPrice");
        this.nullableSellerMarketingPromotionAdapter = yVar.mo68558c(SellerMarketingPromotion.class, emptySet, "promoData");
    }

    public String toString() {
        return "GeneratedJsonAdapter(SellerMarketingBOEMessage)";
    }

    public SellerMarketingBOEMessage fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Boolean> cls = Boolean.class;
        Class<String> cls2 = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        FormattedMoney formattedMoney = null;
        Money money = null;
        SellerMarketingPromotion sellerMarketingPromotion = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    formattedMoney = this.nullableFormattedMoneyAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    money = this.nullableMoneyAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    sellerMarketingPromotion = this.nullableSellerMarketingPromotionAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -256) {
            return new SellerMarketingBOEMessage(str, str2, str3, bool, bool2, formattedMoney, money, sellerMarketingPromotion);
        }
        Constructor<SellerMarketingBOEMessage> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SellerMarketingBOEMessage.class.getDeclaredConstructor(new Class[]{cls2, cls2, cls2, cls, cls, FormattedMoney.class, Money.class, SellerMarketingPromotion.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "SellerMarketingBOEMessag…his.constructorRef = it }");
        }
        SellerMarketingBOEMessage newInstance = constructor.newInstance(new Object[]{str, str2, str3, bool, bool2, formattedMoney, money, sellerMarketingPromotion, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, SellerMarketingBOEMessage sellerMarketingBOEMessage) {
        C19383o.m32797g(wVar, "writer");
        if (sellerMarketingBOEMessage != null) {
            wVar.mo68522b();
            wVar.mo68529h("description");
            this.nullableStringAdapter.toJson(wVar, sellerMarketingBOEMessage.getDescription());
            wVar.mo68529h(ResponseConstants.SELLER_DESCRIPTION);
            this.nullableStringAdapter.toJson(wVar, sellerMarketingBOEMessage.getSellerDescription());
            wVar.mo68529h(ResponseConstants.DISCLAIMER);
            this.nullableStringAdapter.toJson(wVar, sellerMarketingBOEMessage.getDisclaimer());
            wVar.mo68529h(ResponseConstants.HAS_MINIMUM_CONDITION);
            this.nullableBooleanAdapter.toJson(wVar, sellerMarketingBOEMessage.getHasMinimumCondition());
            wVar.mo68529h(ResponseConstants.HAS_FREE_SHIPPING);
            this.nullableBooleanAdapter.toJson(wVar, sellerMarketingBOEMessage.getHasFreeShipping());
            wVar.mo68529h(ResponseConstants.DISCOUNT_DESCRIPTION);
            this.nullableFormattedMoneyAdapter.toJson(wVar, sellerMarketingBOEMessage.getDiscountDescription());
            wVar.mo68529h(ResponseConstants.DISCOUNTED_PRICE);
            this.nullableMoneyAdapter.toJson(wVar, sellerMarketingBOEMessage.getDiscountedPrice());
            wVar.mo68529h("promo_data");
            this.nullableSellerMarketingPromotionAdapter.toJson(wVar, sellerMarketingBOEMessage.getPromoData());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
