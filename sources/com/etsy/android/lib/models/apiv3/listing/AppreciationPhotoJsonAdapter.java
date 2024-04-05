package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class AppreciationPhotoJsonAdapter extends JsonAdapter<AppreciationPhoto> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<ImageKey> nullableImageKeyAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.CREATE_DATE, "create_source", ResponseConstants.IMAGE_ID, "image_key", ResponseConstants.IS_SELLER_APPROVED, ResponseConstants.STATUS, ResponseConstants.TRANSACTION_ID, "url", "url_1140xN", ResponseConstants.URL_170x135, "url_224xN", ResponseConstants.URL_300x300, ResponseConstants.URL_340x270, ResponseConstants.URL_570xN, "url_600x600", "url_642xN", ResponseConstants.URL_680X540, ResponseConstants.URL_75x75, ResponseConstants.URL_FULLxFULL);

    public AppreciationPhotoJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, "createDate");
        this.nullableStringAdapter = yVar2.mo68558c(String.class, emptySet, "createSource");
        this.nullableLongAdapter = yVar2.mo68558c(Long.class, emptySet, "imageId");
        this.nullableImageKeyAdapter = yVar2.mo68558c(ImageKey.class, emptySet, "imageKey");
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "isSellerApproved");
    }

    public String toString() {
        return "GeneratedJsonAdapter(AppreciationPhoto)";
    }

    public AppreciationPhoto fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        String str = null;
        Long l = null;
        ImageKey imageKey = null;
        Boolean bool = null;
        String str2 = null;
        Long l2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 2:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
                case 3:
                    imageKey = this.nullableImageKeyAdapter.fromJson(jsonReader2);
                    break;
                case 4:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 6:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
                case 7:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 8:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 9:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 10:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 11:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 12:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 13:
                    str9 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 14:
                    str10 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 15:
                    str11 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 16:
                    str12 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 17:
                    str13 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 18:
                    str14 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new AppreciationPhoto(num, str, l, imageKey, bool, str2, l2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public void toJson(C17412w wVar, AppreciationPhoto appreciationPhoto) {
        C19383o.m32797g(wVar, "writer");
        if (appreciationPhoto != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.CREATE_DATE);
            this.nullableIntAdapter.toJson(wVar, appreciationPhoto.getCreateDate());
            wVar.mo68529h("create_source");
            this.nullableStringAdapter.toJson(wVar, appreciationPhoto.getCreateSource());
            wVar.mo68529h(ResponseConstants.IMAGE_ID);
            this.nullableLongAdapter.toJson(wVar, appreciationPhoto.getImageId());
            wVar.mo68529h("image_key");
            this.nullableImageKeyAdapter.toJson(wVar, appreciationPhoto.getImageKey());
            wVar.mo68529h(ResponseConstants.IS_SELLER_APPROVED);
            this.nullableBooleanAdapter.toJson(wVar, appreciationPhoto.isSellerApproved());
            wVar.mo68529h(ResponseConstants.STATUS);
            this.nullableStringAdapter.toJson(wVar, appreciationPhoto.getStatus());
            wVar.mo68529h(ResponseConstants.TRANSACTION_ID);
            this.nullableLongAdapter.toJson(wVar, appreciationPhoto.getTransactionId());
            wVar.mo68529h("url");
            this.nullableStringAdapter.toJson(wVar, appreciationPhoto.getUrl());
            wVar.mo68529h("url_1140xN");
            this.nullableStringAdapter.toJson(wVar, appreciationPhoto.getUrl1140xN());
            wVar.mo68529h(ResponseConstants.URL_170x135);
            this.nullableStringAdapter.toJson(wVar, appreciationPhoto.getUrl170x135());
            wVar.mo68529h("url_224xN");
            this.nullableStringAdapter.toJson(wVar, appreciationPhoto.getUrl224xN());
            wVar.mo68529h(ResponseConstants.URL_300x300);
            this.nullableStringAdapter.toJson(wVar, appreciationPhoto.getUrl300x300());
            wVar.mo68529h(ResponseConstants.URL_340x270);
            this.nullableStringAdapter.toJson(wVar, appreciationPhoto.getUrl340x270());
            wVar.mo68529h(ResponseConstants.URL_570xN);
            this.nullableStringAdapter.toJson(wVar, appreciationPhoto.getUrl570xN());
            wVar.mo68529h("url_600x600");
            this.nullableStringAdapter.toJson(wVar, appreciationPhoto.getUrl600x600());
            wVar.mo68529h("url_642xN");
            this.nullableStringAdapter.toJson(wVar, appreciationPhoto.getUrl642xN());
            wVar.mo68529h(ResponseConstants.URL_680X540);
            this.nullableStringAdapter.toJson(wVar, appreciationPhoto.getUrl680x540());
            wVar.mo68529h(ResponseConstants.URL_75x75);
            this.nullableStringAdapter.toJson(wVar, appreciationPhoto.getUrl75x75());
            wVar.mo68529h(ResponseConstants.URL_FULLxFULL);
            this.nullableStringAdapter.toJson(wVar, appreciationPhoto.getUrlFullxfull());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
