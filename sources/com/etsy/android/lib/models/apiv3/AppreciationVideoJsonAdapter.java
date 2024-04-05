package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class AppreciationVideoJsonAdapter extends JsonAdapter<AppreciationVideo> {
    public static final int $stable = 8;
    private final JsonAdapter<List<Source>> nullableListOfSourceAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("url", "poster_url", "thumbnail_url", ResponseConstants.SOURCES, ResponseConstants.WIDTH, ResponseConstants.HEIGHT);

    public AppreciationVideoJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "url");
        this.nullableListOfSourceAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, Source.class), emptySet, ResponseConstants.SOURCES);
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, ResponseConstants.WIDTH);
    }

    public String toString() {
        return "GeneratedJsonAdapter(AppreciationVideo)";
    }

    public AppreciationVideo fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        Long l = null;
        Long l2 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    list = this.nullableListOfSourceAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    l = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new AppreciationVideo(str, str2, str3, list, l, l2);
    }

    public void toJson(C17412w wVar, AppreciationVideo appreciationVideo) {
        C19383o.m32797g(wVar, "writer");
        if (appreciationVideo != null) {
            wVar.mo68522b();
            wVar.mo68529h("url");
            this.nullableStringAdapter.toJson(wVar, appreciationVideo.getUrl());
            wVar.mo68529h("poster_url");
            this.nullableStringAdapter.toJson(wVar, appreciationVideo.getPosterUrl());
            wVar.mo68529h("thumbnail_url");
            this.nullableStringAdapter.toJson(wVar, appreciationVideo.getThumbnailUrl());
            wVar.mo68529h(ResponseConstants.SOURCES);
            this.nullableListOfSourceAdapter.toJson(wVar, appreciationVideo.getSources());
            wVar.mo68529h(ResponseConstants.WIDTH);
            this.nullableLongAdapter.toJson(wVar, appreciationVideo.getWidth());
            wVar.mo68529h(ResponseConstants.HEIGHT);
            this.nullableLongAdapter.toJson(wVar, appreciationVideo.getHeight());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
