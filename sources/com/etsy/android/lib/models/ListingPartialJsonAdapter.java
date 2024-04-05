package com.etsy.android.lib.models;

import com.etsy.android.lib.currency.EtsyMoney;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ListingPartialJsonAdapter extends JsonAdapter<ListingPartial> {
    public static final int $stable = 8;
    private volatile Constructor<ListingPartial> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<EtsyMoney> nullableEtsyMoneyAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("listing_id", "url", "title", "image170", ResponseConstants.DISCOUNTED_PRICE, ResponseConstants.STATUS, "status_value", ResponseConstants.PRICE, ResponseConstants.CURRENCY_CODE, "currency_symbol");
    private final JsonAdapter<String> stringAdapter;

    public ListingPartialJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        Class cls2 = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls2, emptySet, "listingId");
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "url");
        this.nullableEtsyMoneyAdapter = yVar.mo68558c(EtsyMoney.class, emptySet, ResponseConstants.PRICE);
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, ResponseConstants.STATUS);
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "statusValue");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListingPartial)";
    }

    public ListingPartial fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        EtsyMoney etsyMoney = null;
        Integer num = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    l = this.longAdapter.fromJson(jsonReader2);
                    if (l != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("listingId", "listing_id", jsonReader2);
                    }
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader2);
                    if (str != null) {
                        i &= -3;
                        break;
                    } else {
                        throw C18215a.m30734m("url", "url", jsonReader2);
                    }
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader2);
                    if (str2 != null) {
                        i &= -5;
                        break;
                    } else {
                        throw C18215a.m30734m("title", "title", jsonReader2);
                    }
                case 3:
                    str3 = this.stringAdapter.fromJson(jsonReader2);
                    if (str3 != null) {
                        i &= -9;
                        break;
                    } else {
                        throw C18215a.m30734m("imageUrl170", "image170", jsonReader2);
                    }
                case 4:
                    etsyMoney = this.nullableEtsyMoneyAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
                case 8:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -257;
                    break;
                case 9:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -513;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i != -1023) {
            Constructor<ListingPartial> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = ListingPartial.class.getDeclaredConstructor(new Class[]{Long.TYPE, cls, cls, cls, EtsyMoney.class, Integer.class, cls, cls, cls, cls, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "ListingPartial::class.ja…his.constructorRef = it }");
            }
            Object[] objArr = new Object[12];
            if (l != null) {
                objArr[0] = Long.valueOf(l.longValue());
                objArr[1] = str;
                objArr[2] = str2;
                objArr[3] = str3;
                objArr[4] = etsyMoney;
                objArr[5] = num;
                objArr[6] = str4;
                objArr[7] = str5;
                objArr[8] = str6;
                objArr[9] = str7;
                objArr[10] = Integer.valueOf(i);
                objArr[11] = null;
                ListingPartial newInstance = constructor.newInstance(objArr);
                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw C18215a.m30728g("listingId", "listing_id", jsonReader);
        } else if (l != null) {
            long longValue = l.longValue();
            C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str2, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str3, "null cannot be cast to non-null type kotlin.String");
            return new ListingPartial(longValue, str, str2, str3, etsyMoney, num, str4, str5, str6, str7);
        } else {
            throw C18215a.m30728g("listingId", "listing_id", jsonReader2);
        }
    }

    public void toJson(C17412w wVar, ListingPartial listingPartial) {
        C19383o.m32797g(wVar, "writer");
        if (listingPartial != null) {
            wVar.mo68522b();
            wVar.mo68529h("listing_id");
            this.longAdapter.toJson(wVar, Long.valueOf(listingPartial.getListingId()));
            wVar.mo68529h("url");
            this.stringAdapter.toJson(wVar, listingPartial.getUrl());
            wVar.mo68529h("title");
            this.stringAdapter.toJson(wVar, listingPartial.getTitle());
            wVar.mo68529h("image170");
            this.stringAdapter.toJson(wVar, listingPartial.getImageUrl170());
            wVar.mo68529h(ResponseConstants.DISCOUNTED_PRICE);
            this.nullableEtsyMoneyAdapter.toJson(wVar, listingPartial.getPrice());
            wVar.mo68529h(ResponseConstants.STATUS);
            this.nullableIntAdapter.toJson(wVar, listingPartial.getStatus());
            wVar.mo68529h("status_value");
            this.nullableStringAdapter.toJson(wVar, listingPartial.getStatusValue());
            wVar.mo68529h(ResponseConstants.PRICE);
            this.nullableStringAdapter.toJson(wVar, listingPartial.getLegacyPrice());
            wVar.mo68529h(ResponseConstants.CURRENCY_CODE);
            this.nullableStringAdapter.toJson(wVar, listingPartial.getLegacyCurrencyCode());
            wVar.mo68529h("currency_symbol");
            this.nullableStringAdapter.toJson(wVar, listingPartial.getLegacyCurrencySymbol());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
