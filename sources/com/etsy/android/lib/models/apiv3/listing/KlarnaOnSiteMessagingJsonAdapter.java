package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.apiv3.cart.InfoModal;
import com.etsy.android.lib.models.apiv3.cart.PaymentMethod;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class KlarnaOnSiteMessagingJsonAdapter extends JsonAdapter<KlarnaOnSiteMessaging> {
    public static final int $stable = 8;
    private final JsonAdapter<InfoModal> infoModalAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("text", PaymentMethod.INFO_MODAL);
    private final JsonAdapter<String> stringAdapter;

    public KlarnaOnSiteMessagingJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "text");
        this.infoModalAdapter = yVar.mo68558c(InfoModal.class, emptySet, "infoModal");
    }

    public String toString() {
        return "GeneratedJsonAdapter(KlarnaOnSiteMessaging)";
    }

    public KlarnaOnSiteMessaging fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        InfoModal infoModal = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("text", "text", jsonReader);
                }
            } else if (Q == 1 && (infoModal = this.infoModalAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("infoModal", PaymentMethod.INFO_MODAL, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("text", "text", jsonReader);
        } else if (infoModal != null) {
            return new KlarnaOnSiteMessaging(str, infoModal);
        } else {
            throw C18215a.m30728g("infoModal", PaymentMethod.INFO_MODAL, jsonReader);
        }
    }

    public void toJson(C17412w wVar, KlarnaOnSiteMessaging klarnaOnSiteMessaging) {
        C19383o.m32797g(wVar, "writer");
        if (klarnaOnSiteMessaging != null) {
            wVar.mo68522b();
            wVar.mo68529h("text");
            this.stringAdapter.toJson(wVar, klarnaOnSiteMessaging.getText());
            wVar.mo68529h(PaymentMethod.INFO_MODAL);
            this.infoModalAdapter.toJson(wVar, klarnaOnSiteMessaging.getInfoModal());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
