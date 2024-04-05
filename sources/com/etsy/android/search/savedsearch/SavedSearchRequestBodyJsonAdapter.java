package com.etsy.android.search.savedsearch;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SavedSearchRequestBodyJsonAdapter extends JsonAdapter<SavedSearchRequestBody> {
    public static final int $stable = 8;
    private volatile Constructor<SavedSearchRequestBody> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("query", "filters", ResponseConstants.RESULTS, "total_results_count");

    public SavedSearchRequestBodyJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "query");
        this.nullableMapOfStringStringAdapter = yVar.mo68558c(C17387a0.m29126d(Map.class, cls, cls), emptySet, "filters");
        this.nullableListOfStringAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, ResponseConstants.RESULTS);
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "totalResultsCount");
    }

    public final Object fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        Map map = null;
        List list = null;
        Integer num = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -2;
            } else if (Q == 1) {
                map = this.nullableMapOfStringStringAdapter.fromJson(jsonReader2);
                i &= -3;
            } else if (Q == 2) {
                list = this.nullableListOfStringAdapter.fromJson(jsonReader2);
                i &= -5;
            } else if (Q == 3) {
                num = this.nullableIntAdapter.fromJson(jsonReader2);
                i &= -9;
            }
        }
        jsonReader.mo68413e();
        if (i == -16) {
            return new SavedSearchRequestBody(str, map, list, num);
        }
        Constructor<SavedSearchRequestBody> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SavedSearchRequestBody.class.getDeclaredConstructor(new Class[]{String.class, Map.class, List.class, Integer.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "SavedSearchRequestBody::…his.constructorRef = it }");
        }
        SavedSearchRequestBody newInstance = constructor.newInstance(new Object[]{str, map, list, num, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public final void toJson(C17412w wVar, Object obj) {
        SavedSearchRequestBody savedSearchRequestBody = (SavedSearchRequestBody) obj;
        C19383o.m32797g(wVar, "writer");
        if (savedSearchRequestBody != null) {
            wVar.mo68522b();
            wVar.mo68529h("query");
            this.nullableStringAdapter.toJson(wVar, savedSearchRequestBody.f19803a);
            wVar.mo68529h("filters");
            this.nullableMapOfStringStringAdapter.toJson(wVar, savedSearchRequestBody.f19804b);
            wVar.mo68529h(ResponseConstants.RESULTS);
            this.nullableListOfStringAdapter.toJson(wVar, savedSearchRequestBody.f19805c);
            wVar.mo68529h("total_results_count");
            this.nullableIntAdapter.toJson(wVar, savedSearchRequestBody.f19806d);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SavedSearchRequestBody)";
    }
}
