package com.etsy.android.p327ui.cart.googlepay.models;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.cart.googlepay.models.GooglePayTokenizationParametersJsonAdapter */
public final class GooglePayTokenizationParametersJsonAdapter extends JsonAdapter<GooglePayTokenizationParameters> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("protocolVersion", "publicKey");
    private final JsonAdapter<String> stringAdapter;

    public GooglePayTokenizationParametersJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "protocolVersion");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("protocolVersion", "protocolVersion", jsonReader);
                }
            } else if (Q == 1 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("publicKey", "publicKey", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("protocolVersion", "protocolVersion", jsonReader);
        } else if (str2 != null) {
            return new GooglePayTokenizationParameters(str, str2);
        } else {
            throw C18215a.m30728g("publicKey", "publicKey", jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        GooglePayTokenizationParameters googlePayTokenizationParameters = (GooglePayTokenizationParameters) obj;
        C19383o.m32797g(wVar, "writer");
        if (googlePayTokenizationParameters != null) {
            wVar.mo68522b();
            wVar.mo68529h("protocolVersion");
            this.stringAdapter.toJson(wVar, googlePayTokenizationParameters.f20569a);
            wVar.mo68529h("publicKey");
            this.stringAdapter.toJson(wVar, googlePayTokenizationParameters.f20570b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(GooglePayTokenizationParameters)";
    }
}
