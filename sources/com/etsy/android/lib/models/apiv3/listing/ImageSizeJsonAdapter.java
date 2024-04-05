package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ImageSizeJsonAdapter extends JsonAdapter<ImageSize> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.HEIGHT, "url", ResponseConstants.WIDTH);
    private final JsonAdapter<String> stringAdapter;

    public ImageSizeJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.intAdapter = yVar.mo68558c(cls, emptySet, ResponseConstants.HEIGHT);
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "url");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ImageSize)";
    }

    public ImageSize fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        String str = null;
        Integer num2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw C18215a.m30734m(ResponseConstants.HEIGHT, ResponseConstants.HEIGHT, jsonReader);
                }
            } else if (Q == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("url", "url", jsonReader);
                }
            } else if (Q == 2 && (num2 = this.intAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m(ResponseConstants.WIDTH, ResponseConstants.WIDTH, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (num != null) {
            int intValue = num.intValue();
            if (str == null) {
                throw C18215a.m30728g("url", "url", jsonReader);
            } else if (num2 != null) {
                return new ImageSize(intValue, str, num2.intValue());
            } else {
                throw C18215a.m30728g(ResponseConstants.WIDTH, ResponseConstants.WIDTH, jsonReader);
            }
        } else {
            throw C18215a.m30728g(ResponseConstants.HEIGHT, ResponseConstants.HEIGHT, jsonReader);
        }
    }

    public void toJson(C17412w wVar, ImageSize imageSize) {
        C19383o.m32797g(wVar, "writer");
        if (imageSize != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.HEIGHT);
            this.intAdapter.toJson(wVar, Integer.valueOf(imageSize.getHeight()));
            wVar.mo68529h("url");
            this.stringAdapter.toJson(wVar, imageSize.getUrl());
            wVar.mo68529h(ResponseConstants.WIDTH);
            this.intAdapter.toJson(wVar, Integer.valueOf(imageSize.getWidth()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
