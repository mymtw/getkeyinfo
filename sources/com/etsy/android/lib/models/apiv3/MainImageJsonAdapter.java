package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class MainImageJsonAdapter extends JsonAdapter<MainImage> {
    public static final int $stable = 8;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.URL_FULLxFULL, ResponseConstants.URL_75x75, ResponseConstants.URL_170x135);
    private final JsonAdapter<String> stringAdapter;

    public MainImageJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "urlFullxFull");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "url75x75");
    }

    public String toString() {
        return "GeneratedJsonAdapter(MainImage)";
    }

    public MainImage fromJson(JsonReader jsonReader) {
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
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("urlFullxFull", ResponseConstants.URL_FULLxFULL, jsonReader);
                }
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str != null) {
            return new MainImage(str, str2, str3);
        }
        throw C18215a.m30728g("urlFullxFull", ResponseConstants.URL_FULLxFULL, jsonReader);
    }

    public void toJson(C17412w wVar, MainImage mainImage) {
        C19383o.m32797g(wVar, "writer");
        if (mainImage != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.URL_FULLxFULL);
            this.stringAdapter.toJson(wVar, mainImage.getUrlFullxFull());
            wVar.mo68529h(ResponseConstants.URL_75x75);
            this.nullableStringAdapter.toJson(wVar, mainImage.getUrl75x75());
            wVar.mo68529h(ResponseConstants.URL_170x135);
            this.nullableStringAdapter.toJson(wVar, mainImage.getUrl170x135());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
