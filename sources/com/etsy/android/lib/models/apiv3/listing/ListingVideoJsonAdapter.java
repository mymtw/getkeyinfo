package com.etsy.android.lib.models.apiv3.listing;

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

public final class ListingVideoJsonAdapter extends JsonAdapter<ListingVideo> {
    public static final int $stable = 8;
    private volatile Constructor<ListingVideo> constructorRef;
    private final JsonAdapter<List<Map<String, String>>> nullableListOfMapOfStringStringAdapter;
    private final JsonAdapter<List<VideoSize>> nullableListOfVideoSizeAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("url", "thumbnail_url", "poster_url", ResponseConstants.SOURCES, "listing_card_sources");

    public ListingVideoJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "url");
        this.nullableListOfMapOfStringStringAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, C17387a0.m29126d(Map.class, cls, cls)), emptySet, ResponseConstants.SOURCES);
        this.nullableListOfVideoSizeAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, VideoSize.class), emptySet, "listingCardSources");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListingVideo)";
    }

    public ListingVideo fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        List list2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -2;
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -3;
            } else if (Q == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -5;
            } else if (Q == 3) {
                list = this.nullableListOfMapOfStringStringAdapter.fromJson(jsonReader2);
                i &= -9;
            } else if (Q == 4) {
                list2 = this.nullableListOfVideoSizeAdapter.fromJson(jsonReader2);
                i &= -17;
            }
        }
        jsonReader.mo68413e();
        if (i == -32) {
            return new ListingVideo(str, str2, str3, list, list2);
        }
        Constructor<ListingVideo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ListingVideo.class.getDeclaredConstructor(new Class[]{cls, cls, cls, List.class, List.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ListingVideo::class.java…his.constructorRef = it }");
        }
        ListingVideo newInstance = constructor.newInstance(new Object[]{str, str2, str3, list, list2, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ListingVideo listingVideo) {
        C19383o.m32797g(wVar, "writer");
        if (listingVideo != null) {
            wVar.mo68522b();
            wVar.mo68529h("url");
            this.nullableStringAdapter.toJson(wVar, listingVideo.getUrl());
            wVar.mo68529h("thumbnail_url");
            this.nullableStringAdapter.toJson(wVar, listingVideo.getThumbnailUrl());
            wVar.mo68529h("poster_url");
            this.nullableStringAdapter.toJson(wVar, listingVideo.getPosterUrl());
            wVar.mo68529h(ResponseConstants.SOURCES);
            this.nullableListOfMapOfStringStringAdapter.toJson(wVar, listingVideo.getSources());
            wVar.mo68529h("listing_card_sources");
            this.nullableListOfVideoSizeAdapter.toJson(wVar, listingVideo.getListingCardSources());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
