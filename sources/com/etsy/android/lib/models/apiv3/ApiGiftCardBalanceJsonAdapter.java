package com.etsy.android.lib.models.apiv3;

import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ApiGiftCardBalanceJsonAdapter extends JsonAdapter<ApiGiftCardBalance> {
    public static final int $stable = 8;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("available", EventsNameKt.PENDING);

    public ApiGiftCardBalanceJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableStringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "available");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ApiGiftCardBalance)";
    }

    public ApiGiftCardBalance fromJson(JsonReader jsonReader) {
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
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new ApiGiftCardBalance(str, str2);
    }

    public void toJson(C17412w wVar, ApiGiftCardBalance apiGiftCardBalance) {
        C19383o.m32797g(wVar, "writer");
        if (apiGiftCardBalance != null) {
            wVar.mo68522b();
            wVar.mo68529h("available");
            this.nullableStringAdapter.toJson(wVar, apiGiftCardBalance.getAvailable());
            wVar.mo68529h(EventsNameKt.PENDING);
            this.nullableStringAdapter.toJson(wVar, apiGiftCardBalance.getPending());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
