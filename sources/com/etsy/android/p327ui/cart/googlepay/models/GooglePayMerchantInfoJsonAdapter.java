package com.etsy.android.p327ui.cart.googlepay.models;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.cart.googlepay.models.GooglePayMerchantInfoJsonAdapter */
public final class GooglePayMerchantInfoJsonAdapter extends JsonAdapter<GooglePayMerchantInfo> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("merchantName");
    private final JsonAdapter<String> stringAdapter;

    public GooglePayMerchantInfoJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "merchantName");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("merchantName", "merchantName", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str != null) {
            return new GooglePayMerchantInfo(str);
        }
        throw C18215a.m30728g("merchantName", "merchantName", jsonReader);
    }

    public final void toJson(C17412w wVar, Object obj) {
        GooglePayMerchantInfo googlePayMerchantInfo = (GooglePayMerchantInfo) obj;
        C19383o.m32797g(wVar, "writer");
        if (googlePayMerchantInfo != null) {
            wVar.mo68522b();
            wVar.mo68529h("merchantName");
            this.stringAdapter.toJson(wVar, googlePayMerchantInfo.f20556a);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(GooglePayMerchantInfo)";
    }
}
