package com.etsy.android.lib.models.apiv3.listing;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class PaymentIconJsonAdapter extends JsonAdapter<PaymentIcon> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("is_paypal");

    public PaymentIconJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, EmptySet.INSTANCE, "isPaypal");
    }

    public String toString() {
        return "GeneratedJsonAdapter(PaymentIcon)";
    }

    public PaymentIcon fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Boolean bool = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new PaymentIcon(bool);
    }

    public void toJson(C17412w wVar, PaymentIcon paymentIcon) {
        C19383o.m32797g(wVar, "writer");
        if (paymentIcon != null) {
            wVar.mo68522b();
            wVar.mo68529h("is_paypal");
            this.nullableBooleanAdapter.toJson(wVar, paymentIcon.isPaypal());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
