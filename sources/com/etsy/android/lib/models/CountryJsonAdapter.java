package com.etsy.android.lib.models;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class CountryJsonAdapter extends JsonAdapter<Country> {
    public static final int $stable = 8;
    private volatile Constructor<Country> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.COUNTRY_ID, "name", "iso_country_code", "world_bank_country_code", "slug");
    private final JsonAdapter<String> stringAdapter;

    public CountryJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.intAdapter = yVar.mo68558c(cls, emptySet, "countryId");
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "name");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Country)";
    }

    public Country fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        Integer num = 0;
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.intAdapter.fromJson(jsonReader2);
                if (num != null) {
                    i &= -2;
                } else {
                    throw C18215a.m30734m("countryId", ResponseConstants.COUNTRY_ID, jsonReader2);
                }
            } else if (Q == 1) {
                str = this.stringAdapter.fromJson(jsonReader2);
                if (str != null) {
                    i &= -3;
                } else {
                    throw C18215a.m30734m("name", "name", jsonReader2);
                }
            } else if (Q == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader2);
                if (str2 != null) {
                    i &= -5;
                } else {
                    throw C18215a.m30734m("isoCountryCode", "iso_country_code", jsonReader2);
                }
            } else if (Q == 3) {
                str3 = this.stringAdapter.fromJson(jsonReader2);
                if (str3 != null) {
                    i &= -9;
                } else {
                    throw C18215a.m30734m("worldBankCode", "world_bank_country_code", jsonReader2);
                }
            } else if (Q == 4) {
                str4 = this.stringAdapter.fromJson(jsonReader2);
                if (str4 != null) {
                    i &= -17;
                } else {
                    throw C18215a.m30734m("slug", "slug", jsonReader2);
                }
            } else {
                continue;
            }
        }
        jsonReader.mo68413e();
        if (i == -32) {
            int intValue = num.intValue();
            C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str2, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str3, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str4, "null cannot be cast to non-null type kotlin.String");
            return new Country(intValue, str, str2, str3, str4);
        }
        Constructor<Country> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls2 = Integer.TYPE;
            constructor = Country.class.getDeclaredConstructor(new Class[]{cls2, cls, cls, cls, cls, cls2, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "Country::class.java.getD…his.constructorRef = it }");
        }
        Country newInstance = constructor.newInstance(new Object[]{num, str, str2, str3, str4, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, Country country) {
        C19383o.m32797g(wVar, "writer");
        if (country != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.COUNTRY_ID);
            this.intAdapter.toJson(wVar, Integer.valueOf(country.getCountryId()));
            wVar.mo68529h("name");
            this.stringAdapter.toJson(wVar, country.getName());
            wVar.mo68529h("iso_country_code");
            this.stringAdapter.toJson(wVar, country.getIsoCountryCode());
            wVar.mo68529h("world_bank_country_code");
            this.stringAdapter.toJson(wVar, country.getWorldBankCode());
            wVar.mo68529h("slug");
            this.stringAdapter.toJson(wVar, country.getSlug());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
