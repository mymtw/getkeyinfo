package com.etsy.android.lib.models;

import com.etsy.android.lib.models.apiv3.Image2;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ImageInfoJsonAdapter extends JsonAdapter<ImageInfo> {
    public static final int $stable = 8;
    private volatile Constructor<ImageInfo> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Image2> nullableImage2Adapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.IMAGE_ID, ResponseConstants.CREATE_DATE, ResponseConstants.IMAGE_ORDER, ResponseConstants.IMAGE_DATA);

    public ImageInfoJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls, emptySet, "imageId");
        this.intAdapter = yVar.mo68558c(Integer.TYPE, emptySet, "imageOrder");
        this.nullableImage2Adapter = yVar.mo68558c(Image2.class, emptySet, "imageData");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ImageInfo)";
    }

    public ImageInfo fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        Long l = 0L;
        Integer num = 0;
        jsonReader.mo68410b();
        int i = -1;
        Long l2 = null;
        Image2 image2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                l2 = this.longAdapter.fromJson(jsonReader2);
                if (l2 == null) {
                    throw C18215a.m30734m("imageId", ResponseConstants.IMAGE_ID, jsonReader2);
                }
            } else if (Q == 1) {
                l = this.longAdapter.fromJson(jsonReader2);
                if (l != null) {
                    i &= -3;
                } else {
                    throw C18215a.m30734m("createDate", ResponseConstants.CREATE_DATE, jsonReader2);
                }
            } else if (Q == 2) {
                num = this.intAdapter.fromJson(jsonReader2);
                if (num != null) {
                    i &= -5;
                } else {
                    throw C18215a.m30734m("imageOrder", ResponseConstants.IMAGE_ORDER, jsonReader2);
                }
            } else if (Q == 3) {
                image2 = this.nullableImage2Adapter.fromJson(jsonReader2);
                i &= -9;
            }
        }
        jsonReader.mo68413e();
        if (i != -15) {
            Constructor<ImageInfo> constructor = this.constructorRef;
            if (constructor == null) {
                Class cls = Long.TYPE;
                Class cls2 = Integer.TYPE;
                constructor = ImageInfo.class.getDeclaredConstructor(new Class[]{cls, cls, cls2, Image2.class, cls2, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "ImageInfo::class.java.ge…his.constructorRef = it }");
            }
            Object[] objArr = new Object[6];
            if (l2 != null) {
                objArr[0] = Long.valueOf(l2.longValue());
                objArr[1] = l;
                objArr[2] = num;
                objArr[3] = image2;
                objArr[4] = Integer.valueOf(i);
                objArr[5] = null;
                ImageInfo newInstance = constructor.newInstance(objArr);
                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw C18215a.m30728g("imageId", ResponseConstants.IMAGE_ID, jsonReader2);
        } else if (l2 != null) {
            return new ImageInfo(l2.longValue(), l.longValue(), num.intValue(), image2);
        } else {
            throw C18215a.m30728g("imageId", ResponseConstants.IMAGE_ID, jsonReader2);
        }
    }

    public void toJson(C17412w wVar, ImageInfo imageInfo) {
        C19383o.m32797g(wVar, "writer");
        if (imageInfo != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.IMAGE_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(imageInfo.getImageId()));
            wVar.mo68529h(ResponseConstants.CREATE_DATE);
            this.longAdapter.toJson(wVar, Long.valueOf(imageInfo.getCreateDate()));
            wVar.mo68529h(ResponseConstants.IMAGE_ORDER);
            this.intAdapter.toJson(wVar, Integer.valueOf(imageInfo.getImageOrder()));
            wVar.mo68529h(ResponseConstants.IMAGE_DATA);
            this.nullableImage2Adapter.toJson(wVar, imageInfo.getImageData());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
