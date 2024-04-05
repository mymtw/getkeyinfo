package com.etsy.android.lib.models.apiv3.sdl;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ColorPairJsonAdapter extends JsonAdapter<ColorPair> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("default", ResponseConstants.DARK);
    private final JsonAdapter<String> stringAdapter;

    public ColorPairJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "backgroundColorLight");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ColorPair)";
    }

    public ColorPair fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("backgroundColorLight", "default", jsonReader);
                }
            } else if (Q == 1 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("backgroundColorDark", ResponseConstants.DARK, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("backgroundColorLight", "default", jsonReader);
        } else if (str2 != null) {
            return new ColorPair(str, str2);
        } else {
            throw C18215a.m30728g("backgroundColorDark", ResponseConstants.DARK, jsonReader);
        }
    }

    public void toJson(C17412w wVar, ColorPair colorPair) {
        C19383o.m32797g(wVar, "writer");
        if (colorPair != null) {
            wVar.mo68522b();
            wVar.mo68529h("default");
            this.stringAdapter.toJson(wVar, colorPair.getBackgroundColorLight());
            wVar.mo68529h(ResponseConstants.DARK);
            this.stringAdapter.toJson(wVar, colorPair.getBackgroundColorDark());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
