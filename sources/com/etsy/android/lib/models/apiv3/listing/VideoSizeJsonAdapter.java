package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class VideoSizeJsonAdapter extends JsonAdapter<VideoSize> {
    public static final int $stable = 8;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.FORMAT, "type", "url");
    private final JsonAdapter<String> stringAdapter;

    public VideoSizeJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, ResponseConstants.FORMAT);
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "type");
    }

    public String toString() {
        return "GeneratedJsonAdapter(VideoSize)";
    }

    public VideoSize fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
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
            } else if (Q == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw C18215a.m30734m("type", "type", jsonReader);
                }
            } else if (Q == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str2 != null) {
            return new VideoSize(str, str2, str3);
        }
        throw C18215a.m30728g("type", "type", jsonReader);
    }

    public void toJson(C17412w wVar, VideoSize videoSize) {
        C19383o.m32797g(wVar, "writer");
        if (videoSize != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.FORMAT);
            this.nullableStringAdapter.toJson(wVar, videoSize.getFormat());
            wVar.mo68529h("type");
            this.stringAdapter.toJson(wVar, videoSize.getType());
            wVar.mo68529h("url");
            this.nullableStringAdapter.toJson(wVar, videoSize.getUrl());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
