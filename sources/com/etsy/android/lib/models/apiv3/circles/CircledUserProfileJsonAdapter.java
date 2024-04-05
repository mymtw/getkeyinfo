package com.etsy.android.lib.models.apiv3.circles;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class CircledUserProfileJsonAdapter extends JsonAdapter<CircledUserProfile> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("image_url_75x75");
    private final JsonAdapter<String> stringAdapter;

    public CircledUserProfileJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "imageUrl");
    }

    public String toString() {
        return "GeneratedJsonAdapter(CircledUserProfile)";
    }

    public CircledUserProfile fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("imageUrl", "image_url_75x75", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str != null) {
            return new CircledUserProfile(str);
        }
        throw C18215a.m30728g("imageUrl", "image_url_75x75", jsonReader);
    }

    public void toJson(C17412w wVar, CircledUserProfile circledUserProfile) {
        C19383o.m32797g(wVar, "writer");
        if (circledUserProfile != null) {
            wVar.mo68522b();
            wVar.mo68529h("image_url_75x75");
            this.stringAdapter.toJson(wVar, circledUserProfile.getImageUrl());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
