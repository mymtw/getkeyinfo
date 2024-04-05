package com.etsy.android.lib.selfuser;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SelfUserProfileCountryJsonAdapter extends JsonAdapter<SelfUserProfileCountry> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("name", ResponseConstants.COUNTRY_ID, "iso_country_code", "world_bank_country_code");
    private final JsonAdapter<String> stringAdapter;

    public SelfUserProfileCountryJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "name");
        this.intAdapter = yVar.mo68558c(Integer.TYPE, emptySet, "countryId");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "isoCountryCode");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("name", "name", jsonReader);
                }
            } else if (Q == 1) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw C18215a.m30734m("countryId", ResponseConstants.COUNTRY_ID, jsonReader);
                }
            } else if (Q == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("name", "name", jsonReader);
        } else if (num != null) {
            return new SelfUserProfileCountry(str, num.intValue(), str2, str3);
        } else {
            throw C18215a.m30728g("countryId", ResponseConstants.COUNTRY_ID, jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        SelfUserProfileCountry selfUserProfileCountry = (SelfUserProfileCountry) obj;
        C19383o.m32797g(wVar, "writer");
        if (selfUserProfileCountry != null) {
            wVar.mo68522b();
            wVar.mo68529h("name");
            this.stringAdapter.toJson(wVar, selfUserProfileCountry.f19510a);
            wVar.mo68529h(ResponseConstants.COUNTRY_ID);
            this.intAdapter.toJson(wVar, Integer.valueOf(selfUserProfileCountry.f19511b));
            wVar.mo68529h("iso_country_code");
            this.nullableStringAdapter.toJson(wVar, selfUserProfileCountry.f19512c);
            wVar.mo68529h("world_bank_country_code");
            this.nullableStringAdapter.toJson(wVar, selfUserProfileCountry.f19513d);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SelfUserProfileCountry)";
    }
}
