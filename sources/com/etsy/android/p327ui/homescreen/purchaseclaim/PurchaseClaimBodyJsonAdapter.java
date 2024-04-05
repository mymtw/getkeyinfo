package com.etsy.android.p327ui.homescreen.purchaseclaim;

import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.homescreen.purchaseclaim.PurchaseClaimBodyJsonAdapter */
public final class PurchaseClaimBodyJsonAdapter extends JsonAdapter<PurchaseClaimBody> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("order_claiming_token", "order_claiming_signature");
    private final JsonAdapter<String> stringAdapter;

    public PurchaseClaimBodyJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
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
                    throw C18215a.m30734m(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, "order_claiming_token", jsonReader);
                }
            } else if (Q == 1 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("signature", "order_claiming_signature", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, "order_claiming_token", jsonReader);
        } else if (str2 != null) {
            return new PurchaseClaimBody(str, str2);
        } else {
            throw C18215a.m30728g("signature", "order_claiming_signature", jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        PurchaseClaimBody purchaseClaimBody = (PurchaseClaimBody) obj;
        C19383o.m32797g(wVar, "writer");
        if (purchaseClaimBody != null) {
            wVar.mo68522b();
            wVar.mo68529h("order_claiming_token");
            this.stringAdapter.toJson(wVar, purchaseClaimBody.f22205a);
            wVar.mo68529h("order_claiming_signature");
            this.stringAdapter.toJson(wVar, purchaseClaimBody.f22206b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PurchaseClaimBody)";
    }
}
