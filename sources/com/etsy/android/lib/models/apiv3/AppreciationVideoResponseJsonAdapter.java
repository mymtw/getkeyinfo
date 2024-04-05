package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class AppreciationVideoResponseJsonAdapter extends JsonAdapter<AppreciationVideoResponse> {
    public static final int $stable = 8;
    private final JsonAdapter<AppreciationVideo> appreciationVideoAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.VIDEO_ID, "video");

    public AppreciationVideoResponseJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls, emptySet, "videoId");
        this.appreciationVideoAdapter = yVar.mo68558c(AppreciationVideo.class, emptySet, "video");
    }

    public String toString() {
        return "GeneratedJsonAdapter(AppreciationVideoResponse)";
    }

    public AppreciationVideoResponse fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Long l = null;
        AppreciationVideo appreciationVideo = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw C18215a.m30734m("videoId", ResponseConstants.VIDEO_ID, jsonReader);
                }
            } else if (Q == 1 && (appreciationVideo = this.appreciationVideoAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("video", "video", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (l != null) {
            long longValue = l.longValue();
            if (appreciationVideo != null) {
                return new AppreciationVideoResponse(longValue, appreciationVideo);
            }
            throw C18215a.m30728g("video", "video", jsonReader);
        }
        throw C18215a.m30728g("videoId", ResponseConstants.VIDEO_ID, jsonReader);
    }

    public void toJson(C17412w wVar, AppreciationVideoResponse appreciationVideoResponse) {
        C19383o.m32797g(wVar, "writer");
        if (appreciationVideoResponse != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.VIDEO_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(appreciationVideoResponse.getVideoId()));
            wVar.mo68529h("video");
            this.appreciationVideoAdapter.toJson(wVar, appreciationVideoResponse.getVideo());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
