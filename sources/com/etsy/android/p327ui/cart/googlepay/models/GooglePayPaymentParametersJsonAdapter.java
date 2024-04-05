package com.etsy.android.p327ui.cart.googlepay.models;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.cart.googlepay.models.GooglePayPaymentParametersJsonAdapter */
public final class GooglePayPaymentParametersJsonAdapter extends JsonAdapter<GooglePayPaymentParameters> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<GooglePayBillingAddressParameters> googlePayBillingAddressParametersAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("allowedAuthMethods", "allowedCardNetworks", "billingAddressRequired", "billingAddressParameters");

    public GooglePayPaymentParametersJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, String.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.listOfStringAdapter = yVar.mo68558c(d, emptySet, "allowedAuthMethods");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "billingAddressRequired");
        this.googlePayBillingAddressParametersAdapter = yVar.mo68558c(GooglePayBillingAddressParameters.class, emptySet, "billingAddressParameters");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        List list = null;
        List list2 = null;
        Boolean bool = null;
        GooglePayBillingAddressParameters googlePayBillingAddressParameters = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                list = this.listOfStringAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw C18215a.m30734m("allowedAuthMethods", "allowedAuthMethods", jsonReader);
                }
            } else if (Q == 1) {
                list2 = this.listOfStringAdapter.fromJson(jsonReader);
                if (list2 == null) {
                    throw C18215a.m30734m("allowedCardNetworks", "allowedCardNetworks", jsonReader);
                }
            } else if (Q == 2) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw C18215a.m30734m("billingAddressRequired", "billingAddressRequired", jsonReader);
                }
            } else if (Q == 3 && (googlePayBillingAddressParameters = this.googlePayBillingAddressParametersAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("billingAddressParameters", "billingAddressParameters", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (list == null) {
            throw C18215a.m30728g("allowedAuthMethods", "allowedAuthMethods", jsonReader);
        } else if (list2 == null) {
            throw C18215a.m30728g("allowedCardNetworks", "allowedCardNetworks", jsonReader);
        } else if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (googlePayBillingAddressParameters != null) {
                return new GooglePayPaymentParameters(list, list2, booleanValue, googlePayBillingAddressParameters);
            }
            throw C18215a.m30728g("billingAddressParameters", "billingAddressParameters", jsonReader);
        } else {
            throw C18215a.m30728g("billingAddressRequired", "billingAddressRequired", jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        GooglePayPaymentParameters googlePayPaymentParameters = (GooglePayPaymentParameters) obj;
        C19383o.m32797g(wVar, "writer");
        if (googlePayPaymentParameters != null) {
            wVar.mo68522b();
            wVar.mo68529h("allowedAuthMethods");
            this.listOfStringAdapter.toJson(wVar, googlePayPaymentParameters.f20565a);
            wVar.mo68529h("allowedCardNetworks");
            this.listOfStringAdapter.toJson(wVar, googlePayPaymentParameters.f20566b);
            wVar.mo68529h("billingAddressRequired");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(googlePayPaymentParameters.f20567c));
            wVar.mo68529h("billingAddressParameters");
            this.googlePayBillingAddressParametersAdapter.toJson(wVar, googlePayPaymentParameters.f20568d);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(GooglePayPaymentParameters)";
    }
}
