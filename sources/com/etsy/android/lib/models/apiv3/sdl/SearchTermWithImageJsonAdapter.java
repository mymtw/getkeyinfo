package com.etsy.android.lib.models.apiv3.sdl;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SearchTermWithImageJsonAdapter extends JsonAdapter<SearchTermWithImage> {
    public static final int $stable = 8;
    private volatile Constructor<SearchTermWithImage> constructorRef;
    private final JsonAdapter<ListingImage> nullableListingImageAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("query", ResponseConstants.IMG, ResponseConstants.CONTENT_SOURCE);
    private final JsonAdapter<String> stringAdapter;

    public SearchTermWithImageJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "query");
        this.nullableListingImageAdapter = yVar.mo68558c(ListingImage.class, emptySet, ResponseConstants.IMAGE);
    }

    public String toString() {
        return "GeneratedJsonAdapter(SearchTermWithImage)";
    }

    public SearchTermWithImage fromJson(JsonReader jsonReader) {
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        ListingImage listingImage = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str != null) {
                    i &= -2;
                } else {
                    throw C18215a.m30734m("query", "query", jsonReader);
                }
            } else if (Q == 1) {
                listingImage = this.nullableListingImageAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (Q == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 != null) {
                    i &= -5;
                } else {
                    throw C18215a.m30734m("contentSource", ResponseConstants.CONTENT_SOURCE, jsonReader);
                }
            } else {
                continue;
            }
        }
        jsonReader.mo68413e();
        if (i == -8) {
            C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str2, "null cannot be cast to non-null type kotlin.String");
            return new SearchTermWithImage(str, listingImage, str2);
        }
        Constructor<SearchTermWithImage> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SearchTermWithImage.class.getDeclaredConstructor(new Class[]{cls, ListingImage.class, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "SearchTermWithImage::cla…his.constructorRef = it }");
        }
        SearchTermWithImage newInstance = constructor.newInstance(new Object[]{str, listingImage, str2, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, SearchTermWithImage searchTermWithImage) {
        C19383o.m32797g(wVar, "writer");
        if (searchTermWithImage != null) {
            wVar.mo68522b();
            wVar.mo68529h("query");
            this.stringAdapter.toJson(wVar, searchTermWithImage.getQuery());
            wVar.mo68529h(ResponseConstants.IMG);
            this.nullableListingImageAdapter.toJson(wVar, searchTermWithImage.getImage());
            wVar.mo68529h(ResponseConstants.CONTENT_SOURCE);
            this.stringAdapter.toJson(wVar, searchTermWithImage.getContentSource());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
