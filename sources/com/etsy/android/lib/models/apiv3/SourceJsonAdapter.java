package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class SourceJsonAdapter extends JsonAdapter<Source> {
    public static final int $stable = 8;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.FORMAT, "type", "url");

    public SourceJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableStringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, ResponseConstants.FORMAT);
    }

    public String toString() {
        return "GeneratedJsonAdapter(Source)";
    }

    public Source fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new Source(str, str2, str3);
    }

    public void toJson(C17412w wVar, Source source) {
        C19383o.m32797g(wVar, "writer");
        if (source != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.FORMAT);
            this.nullableStringAdapter.toJson(wVar, source.getFormat());
            wVar.mo68529h("type");
            this.nullableStringAdapter.toJson(wVar, source.getType());
            wVar.mo68529h("url");
            this.nullableStringAdapter.toJson(wVar, source.getUrl());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
