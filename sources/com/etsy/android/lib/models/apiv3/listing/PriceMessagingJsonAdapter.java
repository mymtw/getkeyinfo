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

public final class PriceMessagingJsonAdapter extends JsonAdapter<PriceMessaging> {
    public static final int $stable = 8;
    private volatile Constructor<PriceMessaging> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("has_transparent_pricing", ResponseConstants.IS_VAT_INCLUSIVE, "shipping_costs_message", ResponseConstants.TRANSPARENT_PRICE_MESSAGE, "vat_inclusive_message");

    public PriceMessagingJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "hasTransparentPricing");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "shippingCostsMessage");
    }

    public String toString() {
        return "GeneratedJsonAdapter(PriceMessaging)";
    }

    public PriceMessaging fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Boolean> cls = Boolean.class;
        Class<String> cls2 = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                i &= -2;
            } else if (Q == 1) {
                bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                i &= -3;
            } else if (Q == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -5;
            } else if (Q == 3) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -9;
            } else if (Q == 4) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -17;
            }
        }
        jsonReader.mo68413e();
        if (i == -32) {
            return new PriceMessaging(bool, bool2, str, str2, str3);
        }
        Constructor<PriceMessaging> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PriceMessaging.class.getDeclaredConstructor(new Class[]{cls, cls, cls2, cls2, cls2, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "PriceMessaging::class.ja…his.constructorRef = it }");
        }
        PriceMessaging newInstance = constructor.newInstance(new Object[]{bool, bool2, str, str2, str3, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, PriceMessaging priceMessaging) {
        C19383o.m32797g(wVar, "writer");
        if (priceMessaging != null) {
            wVar.mo68522b();
            wVar.mo68529h("has_transparent_pricing");
            this.nullableBooleanAdapter.toJson(wVar, priceMessaging.getHasTransparentPricing());
            wVar.mo68529h(ResponseConstants.IS_VAT_INCLUSIVE);
            this.nullableBooleanAdapter.toJson(wVar, priceMessaging.isVatInclusive());
            wVar.mo68529h("shipping_costs_message");
            this.nullableStringAdapter.toJson(wVar, priceMessaging.getShippingCostsMessage());
            wVar.mo68529h(ResponseConstants.TRANSPARENT_PRICE_MESSAGE);
            this.nullableStringAdapter.toJson(wVar, priceMessaging.getTransparentPriceMessage());
            wVar.mo68529h("vat_inclusive_message");
            this.nullableStringAdapter.toJson(wVar, priceMessaging.getVatInclusiveMessage());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
