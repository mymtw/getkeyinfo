package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
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

public final class VideoJsonAdapter extends JsonAdapter<Video> {
    public static final int $stable = 8;
    private volatile Constructor<Video> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<VideoSize>> nullableListOfVideoSizeAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("key", ResponseConstants.SOURCES, "url", "poster_url", "thumbnail_url", ResponseConstants.WIDTH, ResponseConstants.HEIGHT);

    public VideoJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "key");
        this.nullableListOfVideoSizeAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, VideoSize.class), emptySet, ResponseConstants.SOURCES);
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, ResponseConstants.WIDTH);
    }

    public String toString() {
        return "GeneratedJsonAdapter(Video)";
    }

    public Video fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Integer> cls = Integer.class;
        Class<String> cls2 = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        Integer num2 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    list = this.nullableListOfVideoSizeAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -128) {
            return new Video(str, list, str2, str3, str4, num, num2);
        }
        Constructor<Video> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Video.class.getDeclaredConstructor(new Class[]{cls2, List.class, cls2, cls2, cls2, cls, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "Video::class.java.getDec…his.constructorRef = it }");
        }
        Video newInstance = constructor.newInstance(new Object[]{str, list, str2, str3, str4, num, num2, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, Video video) {
        C19383o.m32797g(wVar, "writer");
        if (video != null) {
            wVar.mo68522b();
            wVar.mo68529h("key");
            this.nullableStringAdapter.toJson(wVar, video.getKey());
            wVar.mo68529h(ResponseConstants.SOURCES);
            this.nullableListOfVideoSizeAdapter.toJson(wVar, video.getSources());
            wVar.mo68529h("url");
            this.nullableStringAdapter.toJson(wVar, video.getUrl());
            wVar.mo68529h("poster_url");
            this.nullableStringAdapter.toJson(wVar, video.getPosterUrl());
            wVar.mo68529h("thumbnail_url");
            this.nullableStringAdapter.toJson(wVar, video.getThumbnailUrl());
            wVar.mo68529h(ResponseConstants.WIDTH);
            this.nullableIntAdapter.toJson(wVar, video.getWidth());
            wVar.mo68529h(ResponseConstants.HEIGHT);
            this.nullableIntAdapter.toJson(wVar, video.getHeight());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
