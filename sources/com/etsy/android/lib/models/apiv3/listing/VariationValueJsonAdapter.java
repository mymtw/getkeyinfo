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

public final class VariationValueJsonAdapter extends JsonAdapter<VariationValue> {
    public static final int $stable = 8;
    private volatile Constructor<VariationValue> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("listing_variation_id", ResponseConstants.VALUE_ID, "value", "raw_value", "is_available", "price_diff", ResponseConstants.PRICE, ResponseConstants.CONVERTED_PRICE);

    public VariationValueJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "listingVariationId");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "value");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "isAvailable");
        this.nullableMoneyAdapter = yVar.mo68558c(Money.class, emptySet, "priceDiff");
    }

    public String toString() {
        return "GeneratedJsonAdapter(VariationValue)";
    }

    public VariationValue fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        Class<Long> cls2 = Long.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Long l = null;
        Long l2 = null;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        Money money = null;
        Money money2 = null;
        Money money3 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    money = this.nullableMoneyAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    money2 = this.nullableMoneyAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    money3 = this.nullableMoneyAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -256) {
            return new VariationValue(l, l2, str, str2, bool, money, money2, money3);
        }
        Constructor<VariationValue> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = VariationValue.class.getDeclaredConstructor(new Class[]{cls2, cls2, cls, cls, Boolean.class, Money.class, Money.class, Money.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "VariationValue::class.ja…his.constructorRef = it }");
        }
        VariationValue newInstance = constructor.newInstance(new Object[]{l, l2, str, str2, bool, money, money2, money3, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, VariationValue variationValue) {
        C19383o.m32797g(wVar, "writer");
        if (variationValue != null) {
            wVar.mo68522b();
            wVar.mo68529h("listing_variation_id");
            this.nullableLongAdapter.toJson(wVar, variationValue.getListingVariationId());
            wVar.mo68529h(ResponseConstants.VALUE_ID);
            this.nullableLongAdapter.toJson(wVar, variationValue.getValueId());
            wVar.mo68529h("value");
            this.nullableStringAdapter.toJson(wVar, variationValue.getValue());
            wVar.mo68529h("raw_value");
            this.nullableStringAdapter.toJson(wVar, variationValue.getRawValue());
            wVar.mo68529h("is_available");
            this.nullableBooleanAdapter.toJson(wVar, variationValue.isAvailable());
            wVar.mo68529h("price_diff");
            this.nullableMoneyAdapter.toJson(wVar, variationValue.getPriceDiff());
            wVar.mo68529h(ResponseConstants.PRICE);
            this.nullableMoneyAdapter.toJson(wVar, variationValue.getPrice());
            wVar.mo68529h(ResponseConstants.CONVERTED_PRICE);
            this.nullableMoneyAdapter.toJson(wVar, variationValue.getConvertedPrice());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
