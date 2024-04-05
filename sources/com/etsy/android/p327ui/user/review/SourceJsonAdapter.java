package com.etsy.android.p327ui.user.review;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.user.review.SourceJsonAdapter */
public final class SourceJsonAdapter extends JsonAdapter<Source> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.FORMAT, "type", "url");
    private final JsonAdapter<String> stringAdapter;

    public SourceJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, ResponseConstants.FORMAT);
    }

    public final Object fromJson(JsonReader jsonReader) {
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
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m(ResponseConstants.FORMAT, ResponseConstants.FORMAT, jsonReader);
                }
            } else if (Q == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw C18215a.m30734m("type", "type", jsonReader);
                }
            } else if (Q == 2 && (str3 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("url", "url", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g(ResponseConstants.FORMAT, ResponseConstants.FORMAT, jsonReader);
        } else if (str2 == null) {
            throw C18215a.m30728g("type", "type", jsonReader);
        } else if (str3 != null) {
            return new Source(str, str2, str3);
        } else {
            throw C18215a.m30728g("url", "url", jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        Source source = (Source) obj;
        C19383o.m32797g(wVar, "writer");
        if (source != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.FORMAT);
            this.stringAdapter.toJson(wVar, source.f26039a);
            wVar.mo68529h("type");
            this.stringAdapter.toJson(wVar, source.f26040b);
            wVar.mo68529h("url");
            this.stringAdapter.toJson(wVar, source.f26041c);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Source)";
    }
}
