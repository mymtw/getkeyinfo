package com.etsy.android.lib.models.apiv3.search;

import com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SearchLandingSuggestions_RecentlyViewed_ImageJsonAdapter extends JsonAdapter<SearchLandingSuggestions.RecentlyViewed.Image> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("url");
    private final JsonAdapter<String> stringAdapter;

    public SearchLandingSuggestions_RecentlyViewed_ImageJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "url");
    }

    public String toString() {
        return "GeneratedJsonAdapter(SearchLandingSuggestions.RecentlyViewed.Image)";
    }

    public SearchLandingSuggestions.RecentlyViewed.Image fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("url", "url", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str != null) {
            return new SearchLandingSuggestions.RecentlyViewed.Image(str);
        }
        throw C18215a.m30728g("url", "url", jsonReader);
    }

    public void toJson(C17412w wVar, SearchLandingSuggestions.RecentlyViewed.Image image) {
        C19383o.m32797g(wVar, "writer");
        if (image != null) {
            wVar.mo68522b();
            wVar.mo68529h("url");
            this.stringAdapter.toJson(wVar, image.getUrl());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
