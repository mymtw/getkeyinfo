package com.etsy.android.lib.selfuser;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SelfUserAddressJsonAdapter extends JsonAdapter<SelfUserAddress> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.ZIP, ResponseConstants.COUNTRY_ID, ResponseConstants.IS_DEFAULT_SHIPPING);
    private final JsonAdapter<String> stringAdapter;

    public SelfUserAddressJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, ResponseConstants.ZIP);
        this.intAdapter = yVar.mo68558c(Integer.TYPE, emptySet, "countryId");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isDefaultShipping");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        Integer num = null;
        Boolean bool = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m(ResponseConstants.ZIP, ResponseConstants.ZIP, jsonReader);
                }
            } else if (Q == 1) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw C18215a.m30734m("countryId", ResponseConstants.COUNTRY_ID, jsonReader);
                }
            } else if (Q == 2 && (bool = this.booleanAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("isDefaultShipping", ResponseConstants.IS_DEFAULT_SHIPPING, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g(ResponseConstants.ZIP, ResponseConstants.ZIP, jsonReader);
        } else if (num != null) {
            int intValue = num.intValue();
            if (bool != null) {
                return new SelfUserAddress(str, intValue, bool.booleanValue());
            }
            throw C18215a.m30728g("isDefaultShipping", ResponseConstants.IS_DEFAULT_SHIPPING, jsonReader);
        } else {
            throw C18215a.m30728g("countryId", ResponseConstants.COUNTRY_ID, jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        SelfUserAddress selfUserAddress = (SelfUserAddress) obj;
        C19383o.m32797g(wVar, "writer");
        if (selfUserAddress != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.ZIP);
            this.stringAdapter.toJson(wVar, selfUserAddress.f19487a);
            wVar.mo68529h(ResponseConstants.COUNTRY_ID);
            this.intAdapter.toJson(wVar, Integer.valueOf(selfUserAddress.f19488b));
            wVar.mo68529h(ResponseConstants.IS_DEFAULT_SHIPPING);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(selfUserAddress.f19489c));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SelfUserAddress)";
    }
}
