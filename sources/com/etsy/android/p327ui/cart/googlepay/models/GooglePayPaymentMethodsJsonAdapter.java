package com.etsy.android.p327ui.cart.googlepay.models;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.cart.googlepay.models.GooglePayPaymentMethodsJsonAdapter */
public final class GooglePayPaymentMethodsJsonAdapter extends JsonAdapter<GooglePayPaymentMethods> {
    public static final int $stable = 8;
    private final JsonAdapter<GooglePayPaymentParameters> googlePayPaymentParametersAdapter;
    private final JsonAdapter<GooglePayTokenizationSpecification> nullableGooglePayTokenizationSpecificationAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("type", "parameters", "tokenizationSpecification");
    private final JsonAdapter<String> stringAdapter;

    public GooglePayPaymentMethodsJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "type");
        this.googlePayPaymentParametersAdapter = yVar.mo68558c(GooglePayPaymentParameters.class, emptySet, "parameters");
        this.nullableGooglePayTokenizationSpecificationAdapter = yVar.mo68558c(GooglePayTokenizationSpecification.class, emptySet, "tokenizationSpecification");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        GooglePayPaymentParameters googlePayPaymentParameters = null;
        GooglePayTokenizationSpecification googlePayTokenizationSpecification = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("type", "type", jsonReader);
                }
            } else if (Q == 1) {
                googlePayPaymentParameters = this.googlePayPaymentParametersAdapter.fromJson(jsonReader);
                if (googlePayPaymentParameters == null) {
                    throw C18215a.m30734m("parameters", "parameters", jsonReader);
                }
            } else if (Q == 2) {
                googlePayTokenizationSpecification = this.nullableGooglePayTokenizationSpecificationAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("type", "type", jsonReader);
        } else if (googlePayPaymentParameters != null) {
            return new GooglePayPaymentMethods(str, googlePayPaymentParameters, googlePayTokenizationSpecification);
        } else {
            throw C18215a.m30728g("parameters", "parameters", jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        GooglePayPaymentMethods googlePayPaymentMethods = (GooglePayPaymentMethods) obj;
        C19383o.m32797g(wVar, "writer");
        if (googlePayPaymentMethods != null) {
            wVar.mo68522b();
            wVar.mo68529h("type");
            this.stringAdapter.toJson(wVar, googlePayPaymentMethods.f20562a);
            wVar.mo68529h("parameters");
            this.googlePayPaymentParametersAdapter.toJson(wVar, googlePayPaymentMethods.f20563b);
            wVar.mo68529h("tokenizationSpecification");
            this.nullableGooglePayTokenizationSpecificationAdapter.toJson(wVar, googlePayPaymentMethods.f20564c);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(GooglePayPaymentMethods)";
    }
}
