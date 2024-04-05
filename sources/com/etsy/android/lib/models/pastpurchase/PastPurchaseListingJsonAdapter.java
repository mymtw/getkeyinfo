package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class PastPurchaseListingJsonAdapter extends JsonAdapter<PastPurchaseListing> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<PastPurchaseListing> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<PastPurchasesReceiptListingState> nullablePastPurchasesReceiptListingStateAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("listing_id", "title", ResponseConstants.IS_PERSONALIZABLE, ResponseConstants.HAS_VARIATIONS, "is_digital", "state", "is_vintage");

    public PastPurchaseListingJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls, emptySet, "listingId");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "title");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isPersonalizable");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "hasVariations");
        this.nullablePastPurchasesReceiptListingStateAdapter = yVar.mo68558c(PastPurchasesReceiptListingState.class, emptySet, "state");
    }

    public String toString() {
        return "GeneratedJsonAdapter(PastPurchaseListing)";
    }

    public PastPurchaseListing fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        Long l = 0L;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo68410b();
        Boolean bool2 = bool;
        int i = -1;
        String str = null;
        Boolean bool3 = null;
        PastPurchasesReceiptListingState pastPurchasesReceiptListingState = null;
        Boolean bool4 = bool2;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    l = this.longAdapter.fromJson(jsonReader2);
                    if (l != null) {
                        i &= -2;
                        break;
                    } else {
                        throw C18215a.m30734m("listingId", "listing_id", jsonReader2);
                    }
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    bool = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool != null) {
                        i &= -5;
                        break;
                    } else {
                        throw C18215a.m30734m("isPersonalizable", ResponseConstants.IS_PERSONALIZABLE, jsonReader2);
                    }
                case 3:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    bool4 = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool4 != null) {
                        i &= -17;
                        break;
                    } else {
                        throw C18215a.m30734m("isDigital", "is_digital", jsonReader2);
                    }
                case 5:
                    pastPurchasesReceiptListingState = this.nullablePastPurchasesReceiptListingStateAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    bool2 = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool2 != null) {
                        i &= -65;
                        break;
                    } else {
                        throw C18215a.m30734m("isVintage", "is_vintage", jsonReader2);
                    }
            }
        }
        jsonReader.mo68413e();
        if (i == -128) {
            return new PastPurchaseListing(l.longValue(), str, bool.booleanValue(), bool3, bool4.booleanValue(), pastPurchasesReceiptListingState, bool2.booleanValue());
        }
        Constructor<PastPurchaseListing> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Boolean.TYPE;
            constructor = PastPurchaseListing.class.getDeclaredConstructor(new Class[]{Long.TYPE, String.class, cls, Boolean.class, cls, PastPurchasesReceiptListingState.class, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "PastPurchaseListing::cla…his.constructorRef = it }");
        }
        PastPurchaseListing newInstance = constructor.newInstance(new Object[]{l, str, bool, bool3, bool4, pastPurchasesReceiptListingState, bool2, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, PastPurchaseListing pastPurchaseListing) {
        C19383o.m32797g(wVar, "writer");
        if (pastPurchaseListing != null) {
            wVar.mo68522b();
            wVar.mo68529h("listing_id");
            this.longAdapter.toJson(wVar, Long.valueOf(pastPurchaseListing.getListingId()));
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseListing.getTitle());
            wVar.mo68529h(ResponseConstants.IS_PERSONALIZABLE);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(pastPurchaseListing.isPersonalizable()));
            wVar.mo68529h(ResponseConstants.HAS_VARIATIONS);
            this.nullableBooleanAdapter.toJson(wVar, pastPurchaseListing.getHasVariations());
            wVar.mo68529h("is_digital");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(pastPurchaseListing.isDigital()));
            wVar.mo68529h("state");
            this.nullablePastPurchasesReceiptListingStateAdapter.toJson(wVar, pastPurchaseListing.getState());
            wVar.mo68529h("is_vintage");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(pastPurchaseListing.isVintage()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
