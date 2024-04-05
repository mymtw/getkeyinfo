package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Image2;
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

public final class Image2JsonAdapter extends JsonAdapter<Image2> {
    public static final int $stable = 8;
    private volatile Constructor<Image2> constructorRef;
    private final JsonAdapter<List<Image2.Source>> listOfSourceAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("key", "url", ResponseConstants.SOURCES);
    private final JsonAdapter<String> stringAdapter;

    public Image2JsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "key");
        this.listOfSourceAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, Image2.Source.class), emptySet, ResponseConstants.SOURCES);
    }

    public String toString() {
        return "GeneratedJsonAdapter(Image2)";
    }

    public Image2 fromJson(JsonReader jsonReader) {
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str != null) {
                    i &= -2;
                } else {
                    throw C18215a.m30734m("key", "key", jsonReader);
                }
            } else if (Q == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 != null) {
                    i &= -3;
                } else {
                    throw C18215a.m30734m("url", "url", jsonReader);
                }
            } else if (Q == 2) {
                list = this.listOfSourceAdapter.fromJson(jsonReader);
                if (list != null) {
                    i &= -5;
                } else {
                    throw C18215a.m30734m(ResponseConstants.SOURCES, ResponseConstants.SOURCES, jsonReader);
                }
            } else {
                continue;
            }
        }
        jsonReader.mo68413e();
        if (i == -8) {
            C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str2, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(list, "null cannot be cast to non-null type kotlin.collections.List<com.etsy.android.lib.models.apiv3.Image2.Source>");
            return new Image2(str, str2, list);
        }
        Constructor<Image2> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Image2.class.getDeclaredConstructor(new Class[]{cls, cls, List.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "Image2::class.java.getDe…his.constructorRef = it }");
        }
        Image2 newInstance = constructor.newInstance(new Object[]{str, str2, list, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, Image2 image2) {
        C19383o.m32797g(wVar, "writer");
        if (image2 != null) {
            wVar.mo68522b();
            wVar.mo68529h("key");
            this.stringAdapter.toJson(wVar, image2.getKey());
            wVar.mo68529h("url");
            this.stringAdapter.toJson(wVar, image2.getUrl());
            wVar.mo68529h(ResponseConstants.SOURCES);
            this.listOfSourceAdapter.toJson(wVar, image2.getSources());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
