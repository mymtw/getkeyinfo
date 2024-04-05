package com.etsy.android.p327ui.cart.googlepay.models;

import com.appsflyer.AppsFlyerProperties;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.cart.googlepay.models.GooglePayTransactionInfoJsonAdapter */
public final class GooglePayTransactionInfoJsonAdapter extends JsonAdapter<GooglePayTransactionInfo> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("totalPrice", "totalPriceStatus", AppsFlyerProperties.CURRENCY_CODE);
    private final JsonAdapter<String> stringAdapter;

    public GooglePayTransactionInfoJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "totalPrice");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
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
                    throw C18215a.m30734m("totalPrice", "totalPrice", jsonReader);
                }
            } else if (Q == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw C18215a.m30734m("totalPriceStatus", "totalPriceStatus", jsonReader);
                }
            } else if (Q == 2 && (str3 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m(AppsFlyerProperties.CURRENCY_CODE, AppsFlyerProperties.CURRENCY_CODE, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("totalPrice", "totalPrice", jsonReader);
        } else if (str2 == null) {
            throw C18215a.m30728g("totalPriceStatus", "totalPriceStatus", jsonReader);
        } else if (str3 != null) {
            return new GooglePayTransactionInfo(str, str2, str3);
        } else {
            throw C18215a.m30728g(AppsFlyerProperties.CURRENCY_CODE, AppsFlyerProperties.CURRENCY_CODE, jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        GooglePayTransactionInfo googlePayTransactionInfo = (GooglePayTransactionInfo) obj;
        C19383o.m32797g(wVar, "writer");
        if (googlePayTransactionInfo != null) {
            wVar.mo68522b();
            wVar.mo68529h("totalPrice");
            this.stringAdapter.toJson(wVar, googlePayTransactionInfo.f20573a);
            wVar.mo68529h("totalPriceStatus");
            this.stringAdapter.toJson(wVar, googlePayTransactionInfo.f20574b);
            wVar.mo68529h(AppsFlyerProperties.CURRENCY_CODE);
            this.stringAdapter.toJson(wVar, googlePayTransactionInfo.f20575c);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(GooglePayTransactionInfo)";
    }
}
