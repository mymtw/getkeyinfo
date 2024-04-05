package com.etsy.android.search.savedsearch;

import com.etsy.android.lib.models.apiv3.vespa.SavableSearchQuery;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SaveSearchPutResponseJsonAdapter extends JsonAdapter<SaveSearchPutResponse> {
    public static final int $stable = 8;
    private volatile Constructor<SaveSearchPutResponse> constructorRef;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(SavableSearchQuery.SAVED_SEARCH_ID_FIELD_NAME);

    public SaveSearchPutResponseJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, EmptySet.INSTANCE, "savedSearchId");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Long l = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                l = this.nullableLongAdapter.fromJson(jsonReader);
                i &= -2;
            }
        }
        jsonReader.mo68413e();
        if (i == -2) {
            return new SaveSearchPutResponse(l);
        }
        Constructor<SaveSearchPutResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SaveSearchPutResponse.class.getDeclaredConstructor(new Class[]{Long.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "SaveSearchPutResponse::c…his.constructorRef = it }");
        }
        SaveSearchPutResponse newInstance = constructor.newInstance(new Object[]{l, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public final void toJson(C17412w wVar, Object obj) {
        SaveSearchPutResponse saveSearchPutResponse = (SaveSearchPutResponse) obj;
        C19383o.m32797g(wVar, "writer");
        if (saveSearchPutResponse != null) {
            wVar.mo68522b();
            wVar.mo68529h(SavableSearchQuery.SAVED_SEARCH_ID_FIELD_NAME);
            this.nullableLongAdapter.toJson(wVar, saveSearchPutResponse.f19802a);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SaveSearchPutResponse)";
    }
}
