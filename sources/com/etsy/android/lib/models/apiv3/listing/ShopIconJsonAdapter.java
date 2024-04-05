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

public final class ShopIconJsonAdapter extends JsonAdapter<ShopIcon> {
    public static final int $stable = 8;
    private volatile Constructor<ShopIcon> constructorRef;
    private final JsonAdapter<List<ImageSize>> nullableListOfImageSizeAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.IMAGE_ID, "key", ResponseConstants.SOURCES, "url");

    public ShopIconJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "imageId");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "key");
        this.nullableListOfImageSizeAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ImageSize.class), emptySet, ResponseConstants.SOURCES);
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopIcon)";
    }

    public ShopIcon fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Long l = null;
        String str = null;
        List list = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                l = this.nullableLongAdapter.fromJson(jsonReader2);
                i &= -2;
            } else if (Q == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -3;
            } else if (Q == 2) {
                list = this.nullableListOfImageSizeAdapter.fromJson(jsonReader2);
                i &= -5;
            } else if (Q == 3) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -9;
            }
        }
        jsonReader.mo68413e();
        if (i == -16) {
            return new ShopIcon(l, str, list, str2);
        }
        Constructor<ShopIcon> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ShopIcon.class.getDeclaredConstructor(new Class[]{Long.class, cls, List.class, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ShopIcon::class.java.get…his.constructorRef = it }");
        }
        ShopIcon newInstance = constructor.newInstance(new Object[]{l, str, list, str2, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ShopIcon shopIcon) {
        C19383o.m32797g(wVar, "writer");
        if (shopIcon != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.IMAGE_ID);
            this.nullableLongAdapter.toJson(wVar, shopIcon.getImageId());
            wVar.mo68529h("key");
            this.nullableStringAdapter.toJson(wVar, shopIcon.getKey());
            wVar.mo68529h(ResponseConstants.SOURCES);
            this.nullableListOfImageSizeAdapter.toJson(wVar, shopIcon.getSources());
            wVar.mo68529h("url");
            this.nullableStringAdapter.toJson(wVar, shopIcon.getUrl());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
