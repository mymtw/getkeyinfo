package com.etsy.android.p327ui.cart.googlepay.models;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.cart.googlepay.models.GooglePayBillingAddressParametersJsonAdapter */
public final class GooglePayBillingAddressParametersJsonAdapter extends JsonAdapter<GooglePayBillingAddressParameters> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.FORMAT);
    private final JsonAdapter<String> stringAdapter;

    public GooglePayBillingAddressParametersJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, ResponseConstants.FORMAT);
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
                throw C18215a.m30734m(ResponseConstants.FORMAT, ResponseConstants.FORMAT, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str != null) {
            return new GooglePayBillingAddressParameters(str);
        }
        throw C18215a.m30728g(ResponseConstants.FORMAT, ResponseConstants.FORMAT, jsonReader);
    }

    public final void toJson(C17412w wVar, Object obj) {
        GooglePayBillingAddressParameters googlePayBillingAddressParameters = (GooglePayBillingAddressParameters) obj;
        C19383o.m32797g(wVar, "writer");
        if (googlePayBillingAddressParameters != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.FORMAT);
            this.stringAdapter.toJson(wVar, googlePayBillingAddressParameters.f20551a);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(GooglePayBillingAddressParameters)";
    }
}
