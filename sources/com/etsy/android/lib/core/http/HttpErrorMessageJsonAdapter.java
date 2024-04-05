package com.etsy.android.lib.core.http;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class HttpErrorMessageJsonAdapter extends JsonAdapter<HttpErrorMessage> {
    public static final int $stable = 8;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("error");

    public HttpErrorMessageJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableStringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "error");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new HttpErrorMessage(str);
    }

    public final void toJson(C17412w wVar, Object obj) {
        HttpErrorMessage httpErrorMessage = (HttpErrorMessage) obj;
        C19383o.m32797g(wVar, "writer");
        if (httpErrorMessage != null) {
            wVar.mo68522b();
            wVar.mo68529h("error");
            this.nullableStringAdapter.toJson(wVar, httpErrorMessage.f18955a);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(HttpErrorMessage)";
    }
}
