package com.etsy.android.lib.models.apiv3.sdl;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SearchPageLinkJsonAdapter extends JsonAdapter<SearchPageLink> {
    public static final int $stable = 8;
    private volatile Constructor<SearchPageLink> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.TAXONOMY_ID, ResponseConstants.PAGE_TYPE, ResponseConstants.PAGE_TITLE);

    public SearchPageLinkJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableStringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "taxonomyStringId");
    }

    public String toString() {
        return "GeneratedJsonAdapter(SearchPageLink)";
    }

    public SearchPageLink fromJson(JsonReader jsonReader) {
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
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
                i &= -2;
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (Q == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (i == -4) {
            return new SearchPageLink(str, str2, str3);
        }
        Constructor<SearchPageLink> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SearchPageLink.class.getDeclaredConstructor(new Class[]{cls, cls, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "SearchPageLink::class.ja…his.constructorRef = it }");
        }
        SearchPageLink newInstance = constructor.newInstance(new Object[]{str, str2, str3, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, SearchPageLink searchPageLink) {
        C19383o.m32797g(wVar, "writer");
        if (searchPageLink != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.TAXONOMY_ID);
            this.nullableStringAdapter.toJson(wVar, searchPageLink.getTaxonomyStringId());
            wVar.mo68529h(ResponseConstants.PAGE_TYPE);
            this.nullableStringAdapter.toJson(wVar, searchPageLink.getPageType());
            wVar.mo68529h(ResponseConstants.PAGE_TITLE);
            this.nullableStringAdapter.toJson(wVar, searchPageLink.getPageTitle());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
