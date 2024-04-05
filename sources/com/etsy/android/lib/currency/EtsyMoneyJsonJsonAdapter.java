package com.etsy.android.lib.currency;

import com.appsflyer.AppsFlyerProperties;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class EtsyMoneyJsonJsonAdapter extends JsonAdapter<EtsyMoneyJson> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.AMOUNT, ResponseConstants.CURRENCY_CODE, ResponseConstants.DIVISOR);
    private final JsonAdapter<String> stringAdapter;

    public EtsyMoneyJsonJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "_amount");
        this.intAdapter = yVar.mo68558c(Integer.TYPE, emptySet, ResponseConstants.DIVISOR);
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        Integer num = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("_amount", ResponseConstants.AMOUNT, jsonReader);
                }
            } else if (Q == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw C18215a.m30734m(AppsFlyerProperties.CURRENCY_CODE, ResponseConstants.CURRENCY_CODE, jsonReader);
                }
            } else if (Q == 2 && (num = this.intAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m(ResponseConstants.DIVISOR, ResponseConstants.DIVISOR, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("_amount", ResponseConstants.AMOUNT, jsonReader);
        } else if (str2 == null) {
            throw C18215a.m30728g(AppsFlyerProperties.CURRENCY_CODE, ResponseConstants.CURRENCY_CODE, jsonReader);
        } else if (num != null) {
            return new EtsyMoneyJson(str, str2, num.intValue());
        } else {
            throw C18215a.m30728g(ResponseConstants.DIVISOR, ResponseConstants.DIVISOR, jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        EtsyMoneyJson etsyMoneyJson = (EtsyMoneyJson) obj;
        C19383o.m32797g(wVar, "writer");
        if (etsyMoneyJson != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.AMOUNT);
            this.stringAdapter.toJson(wVar, etsyMoneyJson.f18959a);
            wVar.mo68529h(ResponseConstants.CURRENCY_CODE);
            this.stringAdapter.toJson(wVar, etsyMoneyJson.f18960b);
            wVar.mo68529h(ResponseConstants.DIVISOR);
            this.intAdapter.toJson(wVar, Integer.valueOf(etsyMoneyJson.f18961c));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(EtsyMoneyJson)";
    }
}
