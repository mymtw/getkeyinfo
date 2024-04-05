package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.apiv3.listing.Subrating;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SubratingsJsonAdapter extends JsonAdapter<Subratings> {
    public static final int $stable = 8;
    private volatile Constructor<Subratings> constructorRef;
    private final JsonAdapter<Subrating.ItemQuality> nullableItemQualityAdapter;
    private final JsonAdapter<Subrating.SellerCustomerService> nullableSellerCustomerServiceAdapter;
    private final JsonAdapter<Subrating.Shipping> nullableShippingAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("item_quality", "shipping", "seller_customer_service");

    public SubratingsJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableItemQualityAdapter = yVar.mo68558c(Subrating.ItemQuality.class, emptySet, "itemQuality");
        this.nullableShippingAdapter = yVar.mo68558c(Subrating.Shipping.class, emptySet, "shipping");
        this.nullableSellerCustomerServiceAdapter = yVar.mo68558c(Subrating.SellerCustomerService.class, emptySet, "sellerCustomerService");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Subratings)";
    }

    public Subratings fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Subrating.ItemQuality itemQuality = null;
        Subrating.Shipping shipping = null;
        Subrating.SellerCustomerService sellerCustomerService = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                itemQuality = this.nullableItemQualityAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (Q == 1) {
                shipping = this.nullableShippingAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (Q == 2) {
                sellerCustomerService = this.nullableSellerCustomerServiceAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.mo68413e();
        if (i == -8) {
            return new Subratings(itemQuality, shipping, sellerCustomerService);
        }
        Constructor<Subratings> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Subratings.class.getDeclaredConstructor(new Class[]{Subrating.ItemQuality.class, Subrating.Shipping.class, Subrating.SellerCustomerService.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "Subratings::class.java.g…his.constructorRef = it }");
        }
        Subratings newInstance = constructor.newInstance(new Object[]{itemQuality, shipping, sellerCustomerService, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, Subratings subratings) {
        C19383o.m32797g(wVar, "writer");
        if (subratings != null) {
            wVar.mo68522b();
            wVar.mo68529h("item_quality");
            this.nullableItemQualityAdapter.toJson(wVar, subratings.getItemQuality());
            wVar.mo68529h("shipping");
            this.nullableShippingAdapter.toJson(wVar, subratings.getShipping());
            wVar.mo68529h("seller_customer_service");
            this.nullableSellerCustomerServiceAdapter.toJson(wVar, subratings.getSellerCustomerService());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
