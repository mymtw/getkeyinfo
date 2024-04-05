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

public final class ImageJsonAdapter extends JsonAdapter<Image> {
    public static final int $stable = 8;
    private volatile Constructor<Image> constructorRef;
    private final JsonAdapter<List<ImageSize>> nullableListOfImageSizeAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("key", ResponseConstants.SOURCES, "url");

    public ImageJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "key");
        this.nullableListOfImageSizeAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ImageSize.class), emptySet, ResponseConstants.SOURCES);
    }

    public String toString() {
        return "GeneratedJsonAdapter(Image)";
    }

    public Image fromJson(JsonReader jsonReader) {
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        List list = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (Q == 1) {
                list = this.nullableListOfImageSizeAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (Q == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.mo68413e();
        if (i == -8) {
            return new Image(str, list, str2);
        }
        Constructor<Image> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Image.class.getDeclaredConstructor(new Class[]{cls, List.class, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "Image::class.java.getDec…his.constructorRef = it }");
        }
        Image newInstance = constructor.newInstance(new Object[]{str, list, str2, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, Image image) {
        C19383o.m32797g(wVar, "writer");
        if (image != null) {
            wVar.mo68522b();
            wVar.mo68529h("key");
            this.nullableStringAdapter.toJson(wVar, image.getKey());
            wVar.mo68529h(ResponseConstants.SOURCES);
            this.nullableListOfImageSizeAdapter.toJson(wVar, image.getSources());
            wVar.mo68529h("url");
            this.nullableStringAdapter.toJson(wVar, image.getUrl());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
