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

/* renamed from: com.etsy.android.ui.cart.googlepay.models.GooglePayPaymentDataRequestJsonAdapter */
public final class GooglePayPaymentDataRequestJsonAdapter extends JsonAdapter<GooglePayPaymentDataRequest> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<GooglePayPaymentMethods>> listOfGooglePayPaymentMethodsAdapter;
    private final JsonAdapter<GooglePayMerchantInfo> nullableGooglePayMerchantInfoAdapter;
    private final JsonAdapter<GooglePayTransactionInfo> nullableGooglePayTransactionInfoAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("apiVersion", "apiVersionMinor", "merchantInfo", "allowedPaymentMethods", "transactionInfo");

    public GooglePayPaymentDataRequestJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.intAdapter = yVar.mo68558c(cls, emptySet, "apiVersion");
        this.nullableGooglePayMerchantInfoAdapter = yVar.mo68558c(GooglePayMerchantInfo.class, emptySet, "merchantInfo");
        this.listOfGooglePayPaymentMethodsAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, GooglePayPaymentMethods.class), emptySet, "allowedPaymentMethods");
        this.nullableGooglePayTransactionInfoAdapter = yVar.mo68558c(GooglePayTransactionInfo.class, emptySet, "transactionInfo");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        Integer num2 = null;
        GooglePayMerchantInfo googlePayMerchantInfo = null;
        List list = null;
        GooglePayTransactionInfo googlePayTransactionInfo = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw C18215a.m30734m("apiVersion", "apiVersion", jsonReader);
                }
            } else if (Q == 1) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw C18215a.m30734m("apiVersionMinor", "apiVersionMinor", jsonReader);
                }
            } else if (Q == 2) {
                googlePayMerchantInfo = this.nullableGooglePayMerchantInfoAdapter.fromJson(jsonReader);
            } else if (Q == 3) {
                list = this.listOfGooglePayPaymentMethodsAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw C18215a.m30734m("allowedPaymentMethods", "allowedPaymentMethods", jsonReader);
                }
            } else if (Q == 4) {
                googlePayTransactionInfo = this.nullableGooglePayTransactionInfoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                int intValue2 = num2.intValue();
                if (list != null) {
                    return new GooglePayPaymentDataRequest(intValue, intValue2, googlePayMerchantInfo, list, googlePayTransactionInfo);
                }
                throw C18215a.m30728g("allowedPaymentMethods", "allowedPaymentMethods", jsonReader);
            }
            throw C18215a.m30728g("apiVersionMinor", "apiVersionMinor", jsonReader);
        }
        throw C18215a.m30728g("apiVersion", "apiVersion", jsonReader);
    }

    public final void toJson(C17412w wVar, Object obj) {
        GooglePayPaymentDataRequest googlePayPaymentDataRequest = (GooglePayPaymentDataRequest) obj;
        C19383o.m32797g(wVar, "writer");
        if (googlePayPaymentDataRequest != null) {
            wVar.mo68522b();
            wVar.mo68529h("apiVersion");
            this.intAdapter.toJson(wVar, Integer.valueOf(googlePayPaymentDataRequest.f20557a));
            wVar.mo68529h("apiVersionMinor");
            this.intAdapter.toJson(wVar, Integer.valueOf(googlePayPaymentDataRequest.f20558b));
            wVar.mo68529h("merchantInfo");
            this.nullableGooglePayMerchantInfoAdapter.toJson(wVar, googlePayPaymentDataRequest.f20559c);
            wVar.mo68529h("allowedPaymentMethods");
            this.listOfGooglePayPaymentMethodsAdapter.toJson(wVar, googlePayPaymentDataRequest.f20560d);
            wVar.mo68529h("transactionInfo");
            this.nullableGooglePayTransactionInfoAdapter.toJson(wVar, googlePayPaymentDataRequest.f20561e);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(GooglePayPaymentDataRequest)";
    }
}
