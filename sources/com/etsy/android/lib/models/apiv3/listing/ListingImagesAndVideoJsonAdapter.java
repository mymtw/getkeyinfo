package com.etsy.android.lib.models.apiv3.listing;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ListingImagesAndVideoJsonAdapter extends JsonAdapter<ListingImagesAndVideo> {
    public static final int $stable = 8;
    private volatile Constructor<ListingImagesAndVideo> constructorRef;
    private final JsonAdapter<List<ListingImage>> nullableListOfListingImageAdapter;
    private final JsonAdapter<ListingVideo> nullableListingVideoAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("images", "video");

    public ListingImagesAndVideoJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, ListingImage.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableListOfListingImageAdapter = yVar.mo68558c(d, emptySet, "images");
        this.nullableListingVideoAdapter = yVar.mo68558c(ListingVideo.class, emptySet, "video");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListingImagesAndVideo)";
    }

    public ListingImagesAndVideo fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        List list = null;
        ListingVideo listingVideo = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                list = this.nullableListOfListingImageAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (Q == 1) {
                listingVideo = this.nullableListingVideoAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.mo68413e();
        if (i == -4) {
            return new ListingImagesAndVideo(list, listingVideo);
        }
        Constructor<ListingImagesAndVideo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ListingImagesAndVideo.class.getDeclaredConstructor(new Class[]{List.class, ListingVideo.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ListingImagesAndVideo::c…his.constructorRef = it }");
        }
        ListingImagesAndVideo newInstance = constructor.newInstance(new Object[]{list, listingVideo, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ListingImagesAndVideo listingImagesAndVideo) {
        C19383o.m32797g(wVar, "writer");
        if (listingImagesAndVideo != null) {
            wVar.mo68522b();
            wVar.mo68529h("images");
            this.nullableListOfListingImageAdapter.toJson(wVar, listingImagesAndVideo.getImages());
            wVar.mo68529h("video");
            this.nullableListingVideoAdapter.toJson(wVar, listingImagesAndVideo.getVideo());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
