package com.etsy.android.lib.models.apiv3.listing;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class SvgIconDataJsonAdapter extends JsonAdapter<SvgIconData> {
    public static final int $stable = 8;
    private final JsonAdapter<List<PaymentIcon>> nullableListOfPaymentIconAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("payment_icons");

    public SvgIconDataJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableListOfPaymentIconAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, PaymentIcon.class), EmptySet.INSTANCE, "paymentIcons");
    }

    public String toString() {
        return "GeneratedJsonAdapter(SvgIconData)";
    }

    public SvgIconData fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                list = this.nullableListOfPaymentIconAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new SvgIconData(list);
    }

    public void toJson(C17412w wVar, SvgIconData svgIconData) {
        C19383o.m32797g(wVar, "writer");
        if (svgIconData != null) {
            wVar.mo68522b();
            wVar.mo68529h("payment_icons");
            this.nullableListOfPaymentIconAdapter.toJson(wVar, svgIconData.getPaymentIcons());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
