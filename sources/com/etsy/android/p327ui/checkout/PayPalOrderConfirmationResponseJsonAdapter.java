package com.etsy.android.p327ui.checkout;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.checkout.PayPalOrderConfirmationResponseJsonAdapter */
public final class PayPalOrderConfirmationResponseJsonAdapter extends JsonAdapter<PayPalOrderConfirmationResponse> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("success", "order_id", "review_url");

    public PayPalOrderConfirmationResponseJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.booleanAdapter = yVar.mo68558c(cls, emptySet, "success");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "orderId");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw C18215a.m30734m("success", "success", jsonReader);
                }
            } else if (Q == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (bool != null) {
            return new PayPalOrderConfirmationResponse(bool.booleanValue(), str, str2);
        }
        throw C18215a.m30728g("success", "success", jsonReader);
    }

    public final void toJson(C17412w wVar, Object obj) {
        PayPalOrderConfirmationResponse payPalOrderConfirmationResponse = (PayPalOrderConfirmationResponse) obj;
        C19383o.m32797g(wVar, "writer");
        if (payPalOrderConfirmationResponse != null) {
            wVar.mo68522b();
            wVar.mo68529h("success");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(payPalOrderConfirmationResponse.f20924a));
            wVar.mo68529h("order_id");
            this.nullableStringAdapter.toJson(wVar, payPalOrderConfirmationResponse.f20925b);
            wVar.mo68529h("review_url");
            this.nullableStringAdapter.toJson(wVar, payPalOrderConfirmationResponse.f20926c);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PayPalOrderConfirmationResponse)";
    }
}
