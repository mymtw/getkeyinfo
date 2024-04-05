package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ImageKeyJsonAdapter extends JsonAdapter<ImageKey> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("color", "extension", ResponseConstants.HEIGHT, ResponseConstants.HUE, ResponseConstants.IMAGE_ID, "image_type", "owner_id", ResponseConstants.SATURATION, "secret", "storage", ResponseConstants.VERSION, ResponseConstants.WIDTH);

    public ImageKeyJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "color");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, ResponseConstants.HEIGHT);
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "imageId");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ImageKey)";
    }

    public ImageKey fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        String str3 = null;
        Long l2 = null;
        Integer num3 = null;
        String str4 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    l = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    num3 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    num4 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    num5 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 11:
                    num6 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new ImageKey(str, str2, num, num2, l, str3, l2, num3, str4, num4, num5, num6);
    }

    public void toJson(C17412w wVar, ImageKey imageKey) {
        C19383o.m32797g(wVar, "writer");
        if (imageKey != null) {
            wVar.mo68522b();
            wVar.mo68529h("color");
            this.nullableStringAdapter.toJson(wVar, imageKey.getColor());
            wVar.mo68529h("extension");
            this.nullableStringAdapter.toJson(wVar, imageKey.getExtension());
            wVar.mo68529h(ResponseConstants.HEIGHT);
            this.nullableIntAdapter.toJson(wVar, imageKey.getHeight());
            wVar.mo68529h(ResponseConstants.HUE);
            this.nullableIntAdapter.toJson(wVar, imageKey.getHue());
            wVar.mo68529h(ResponseConstants.IMAGE_ID);
            this.nullableLongAdapter.toJson(wVar, imageKey.getImageId());
            wVar.mo68529h("image_type");
            this.nullableStringAdapter.toJson(wVar, imageKey.getImageType());
            wVar.mo68529h("owner_id");
            this.nullableLongAdapter.toJson(wVar, imageKey.getOwnerId());
            wVar.mo68529h(ResponseConstants.SATURATION);
            this.nullableIntAdapter.toJson(wVar, imageKey.getSaturation());
            wVar.mo68529h("secret");
            this.nullableStringAdapter.toJson(wVar, imageKey.getSecret());
            wVar.mo68529h("storage");
            this.nullableIntAdapter.toJson(wVar, imageKey.getStorage());
            wVar.mo68529h(ResponseConstants.VERSION);
            this.nullableIntAdapter.toJson(wVar, imageKey.getVersion());
            wVar.mo68529h(ResponseConstants.WIDTH);
            this.nullableIntAdapter.toJson(wVar, imageKey.getWidth());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
