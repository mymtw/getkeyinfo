package com.etsy.android.p072ad;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ad.ProlistLogResponseJsonAdapter */
public final class ProlistLogResponseJsonAdapter extends JsonAdapter<ProlistLogResponse> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("success", "num_buffered");

    public ProlistLogResponseJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.booleanAdapter = yVar.mo68558c(cls, emptySet, "success");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "numBuffered");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Boolean bool = null;
        Integer num = null;
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
                num = this.nullableIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (bool != null) {
            return new ProlistLogResponse(bool.booleanValue(), num);
        }
        throw C18215a.m30728g("success", "success", jsonReader);
    }

    public final void toJson(C17412w wVar, Object obj) {
        ProlistLogResponse prolistLogResponse = (ProlistLogResponse) obj;
        C19383o.m32797g(wVar, "writer");
        if (prolistLogResponse != null) {
            wVar.mo68522b();
            wVar.mo68529h("success");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(prolistLogResponse.f14105a));
            wVar.mo68529h("num_buffered");
            this.nullableIntAdapter.toJson(wVar, prolistLogResponse.f14106b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ProlistLogResponse)";
    }
}
