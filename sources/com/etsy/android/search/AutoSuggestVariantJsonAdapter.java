package com.etsy.android.search;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class AutoSuggestVariantJsonAdapter extends JsonAdapter<AutoSuggestVariant> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("variant");
    private final JsonAdapter<String> stringAdapter;

    public AutoSuggestVariantJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "variant");
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
            } else if (Q == 0 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("variant", "variant", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str != null) {
            return new AutoSuggestVariant(str);
        }
        throw C18215a.m30728g("variant", "variant", jsonReader);
    }

    public final void toJson(C17412w wVar, Object obj) {
        AutoSuggestVariant autoSuggestVariant = (AutoSuggestVariant) obj;
        C19383o.m32797g(wVar, "writer");
        if (autoSuggestVariant != null) {
            wVar.mo68522b();
            wVar.mo68529h("variant");
            this.stringAdapter.toJson(wVar, autoSuggestVariant.f19774a);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AutoSuggestVariant)";
    }
}
