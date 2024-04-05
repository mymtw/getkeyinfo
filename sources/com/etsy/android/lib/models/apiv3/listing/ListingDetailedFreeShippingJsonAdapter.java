package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.DetailedFreeShipping;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ListingDetailedFreeShippingJsonAdapter extends JsonAdapter<ListingDetailedFreeShipping> {
    public static final int $stable = 8;
    private volatile Constructor<ListingDetailedFreeShipping> constructorRef;
    private final JsonAdapter<DetailedFreeShipping> nullableDetailedFreeShippingAdapter;
    private final JsonAdapter<FormattedMoney> nullableFormattedMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.SELLER_DESCRIPTION, "message", "formatted_message");

    public ListingDetailedFreeShippingJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "sellerDescription");
        this.nullableFormattedMoneyAdapter = yVar.mo68558c(FormattedMoney.class, emptySet, "message");
        this.nullableDetailedFreeShippingAdapter = yVar.mo68558c(DetailedFreeShipping.class, emptySet, "formattedMessage");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListingDetailedFreeShipping)";
    }

    public ListingDetailedFreeShipping fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        FormattedMoney formattedMoney = null;
        DetailedFreeShipping detailedFreeShipping = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (Q == 1) {
                formattedMoney = this.nullableFormattedMoneyAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (Q == 2) {
                detailedFreeShipping = this.nullableDetailedFreeShippingAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.mo68413e();
        if (i == -8) {
            return new ListingDetailedFreeShipping(str, formattedMoney, detailedFreeShipping);
        }
        Constructor<ListingDetailedFreeShipping> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ListingDetailedFreeShipping.class.getDeclaredConstructor(new Class[]{String.class, FormattedMoney.class, DetailedFreeShipping.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ListingDetailedFreeShipp…his.constructorRef = it }");
        }
        ListingDetailedFreeShipping newInstance = constructor.newInstance(new Object[]{str, formattedMoney, detailedFreeShipping, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ListingDetailedFreeShipping listingDetailedFreeShipping) {
        C19383o.m32797g(wVar, "writer");
        if (listingDetailedFreeShipping != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.SELLER_DESCRIPTION);
            this.nullableStringAdapter.toJson(wVar, listingDetailedFreeShipping.getSellerDescription());
            wVar.mo68529h("message");
            this.nullableFormattedMoneyAdapter.toJson(wVar, listingDetailedFreeShipping.getMessage());
            wVar.mo68529h("formatted_message");
            this.nullableDetailedFreeShippingAdapter.toJson(wVar, listingDetailedFreeShipping.getFormattedMessage());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
