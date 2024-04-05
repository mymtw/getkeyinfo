package com.etsy.android.lib.session;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class FeatureJsonAdapter extends JsonAdapter<Feature> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("name", ResponseConstants.ENABLED, "variant");
    private final JsonAdapter<String> stringAdapter;

    public FeatureJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "name");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, ResponseConstants.ENABLED);
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "variant");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        Boolean bool = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("name", "name", jsonReader);
                }
            } else if (Q == 1) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw C18215a.m30734m(ResponseConstants.ENABLED, ResponseConstants.ENABLED, jsonReader);
                }
            } else if (Q == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("name", "name", jsonReader);
        } else if (bool != null) {
            return new Feature(str, bool.booleanValue(), str2);
        } else {
            throw C18215a.m30728g(ResponseConstants.ENABLED, ResponseConstants.ENABLED, jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        Feature feature = (Feature) obj;
        C19383o.m32797g(wVar, "writer");
        if (feature != null) {
            wVar.mo68522b();
            wVar.mo68529h("name");
            this.stringAdapter.toJson(wVar, feature.f19530a);
            wVar.mo68529h(ResponseConstants.ENABLED);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(feature.f19531b));
            wVar.mo68529h("variant");
            this.nullableStringAdapter.toJson(wVar, feature.f19532c);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Feature)";
    }
}
