package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ListingPersonalizationJsonAdapter extends JsonAdapter<ListingPersonalization> {
    public static final int $stable = 8;
    private volatile Constructor<ListingPersonalization> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<EtsyMoney> nullableEtsyMoneyAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.PERSONALIZATION_MAXCHARS, ResponseConstants.IS_PERSONALIZABLE, "is_required", ResponseConstants.PERSONALIZATION_INSTRUCTIONS, ResponseConstants.PRICE);

    public ListingPersonalizationJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "buyerPersonalizationCharCountMax");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "isPersonalizable");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "personalizationInstructions");
        this.nullableEtsyMoneyAdapter = yVar.mo68558c(EtsyMoney.class, emptySet, ResponseConstants.PRICE);
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListingPersonalization)";
    }

    public ListingPersonalization fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Boolean> cls = Boolean.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        EtsyMoney etsyMoney = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.nullableIntAdapter.fromJson(jsonReader2);
                i &= -2;
            } else if (Q == 1) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                i &= -3;
            } else if (Q == 2) {
                bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                i &= -5;
            } else if (Q == 3) {
                str = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -9;
            } else if (Q == 4) {
                etsyMoney = this.nullableEtsyMoneyAdapter.fromJson(jsonReader2);
                i &= -17;
            }
        }
        jsonReader.mo68413e();
        if (i == -32) {
            return new ListingPersonalization(num, bool, bool2, str, etsyMoney);
        }
        Constructor<ListingPersonalization> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ListingPersonalization.class.getDeclaredConstructor(new Class[]{Integer.class, cls, cls, String.class, EtsyMoney.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ListingPersonalization::…his.constructorRef = it }");
        }
        ListingPersonalization newInstance = constructor.newInstance(new Object[]{num, bool, bool2, str, etsyMoney, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ListingPersonalization listingPersonalization) {
        C19383o.m32797g(wVar, "writer");
        if (listingPersonalization != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.PERSONALIZATION_MAXCHARS);
            this.nullableIntAdapter.toJson(wVar, listingPersonalization.getBuyerPersonalizationCharCountMax());
            wVar.mo68529h(ResponseConstants.IS_PERSONALIZABLE);
            this.nullableBooleanAdapter.toJson(wVar, listingPersonalization.isPersonalizable());
            wVar.mo68529h("is_required");
            this.nullableBooleanAdapter.toJson(wVar, listingPersonalization.isRequired());
            wVar.mo68529h(ResponseConstants.PERSONALIZATION_INSTRUCTIONS);
            this.nullableStringAdapter.toJson(wVar, listingPersonalization.getPersonalizationInstructions());
            wVar.mo68529h(ResponseConstants.PRICE);
            this.nullableEtsyMoneyAdapter.toJson(wVar, listingPersonalization.getPrice());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
