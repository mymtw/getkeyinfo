package com.etsy.android.search;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.search.CompositeSuggestions;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class CompositeSuggestions_RecentlyViewedJsonAdapter extends JsonAdapter<CompositeSuggestions.RecentlyViewed> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<CompositeSuggestions.RecentlyViewed.C8968a> imageAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("listing_id", "is_favorite", "title", ResponseConstants.IMG);
    private final JsonAdapter<String> stringAdapter;

    public CompositeSuggestions_RecentlyViewedJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "listing_id");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "is_favorite");
        this.imageAdapter = yVar.mo68558c(CompositeSuggestions.RecentlyViewed.C8968a.class, emptySet, ResponseConstants.IMG);
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        Boolean bool = null;
        String str2 = null;
        CompositeSuggestions.RecentlyViewed.C8968a aVar = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("listing_id", "listing_id", jsonReader);
                }
            } else if (Q == 1) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw C18215a.m30734m("is_favorite", "is_favorite", jsonReader);
                }
            } else if (Q == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw C18215a.m30734m("title", "title", jsonReader);
                }
            } else if (Q == 3 && (aVar = this.imageAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m(ResponseConstants.IMG, ResponseConstants.IMG, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("listing_id", "listing_id", jsonReader);
        } else if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (str2 == null) {
                throw C18215a.m30728g("title", "title", jsonReader);
            } else if (aVar != null) {
                return new CompositeSuggestions.RecentlyViewed(str, booleanValue, str2, aVar);
            } else {
                throw C18215a.m30728g(ResponseConstants.IMG, ResponseConstants.IMG, jsonReader);
            }
        } else {
            throw C18215a.m30728g("is_favorite", "is_favorite", jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        CompositeSuggestions.RecentlyViewed recentlyViewed = (CompositeSuggestions.RecentlyViewed) obj;
        C19383o.m32797g(wVar, "writer");
        if (recentlyViewed != null) {
            wVar.mo68522b();
            wVar.mo68529h("listing_id");
            this.stringAdapter.toJson(wVar, recentlyViewed.f19779a);
            wVar.mo68529h("is_favorite");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(recentlyViewed.f19780b));
            wVar.mo68529h("title");
            this.stringAdapter.toJson(wVar, recentlyViewed.f19781c);
            wVar.mo68529h(ResponseConstants.IMG);
            this.imageAdapter.toJson(wVar, recentlyViewed.f19782d);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CompositeSuggestions.RecentlyViewed)";
    }
}
