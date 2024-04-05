package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ReviewImage;
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

public final class ReviewImageJsonAdapter extends JsonAdapter<ReviewImage> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ReviewImage> constructorRef;
    private final JsonAdapter<Image> nullableImageAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.IMAGE, ReviewImage.REVIEW_TEXT, "review_translated", ReviewImage.REVIEW_RATING, ResponseConstants.BUYER_AVATAR_URL, ReviewImage.BUYER_NAME, ResponseConstants.BUYER_PROFILE_URL, ResponseConstants.CREATE_DATE, ReviewImage.LISTING_ONLY, "listing_id", ResponseConstants.LISTING_TITLE, ResponseConstants.LISTING_IMAGES, ResponseConstants.TRANSACTION_ID);

    public ReviewImageJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        Class<String> cls = String.class;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableImageAdapter = yVar2.mo68558c(Image.class, emptySet, ResponseConstants.IMAGE);
        this.nullableStringAdapter = yVar2.mo68558c(cls, emptySet, "review");
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, ResponseConstants.RATING);
        this.nullableLongAdapter = yVar2.mo68558c(Long.class, emptySet, "createDate");
        this.booleanAdapter = yVar2.mo68558c(Boolean.TYPE, emptySet, "isListingOnly");
        this.nullableListOfStringAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, "listingImages");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ReviewImage)";
    }

    public ReviewImage fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.mo68410b();
        int i = -1;
        Image image = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Long l = null;
        Long l2 = null;
        String str6 = null;
        List list = null;
        String str7 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    image = this.nullableImageAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
                case 8:
                    bool = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool != null) {
                        i &= -257;
                        break;
                    } else {
                        throw C18215a.m30734m("isListingOnly", ReviewImage.LISTING_ONLY, jsonReader2);
                    }
                case 9:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -513;
                    break;
                case 10:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -1025;
                    break;
                case 11:
                    list = this.nullableListOfStringAdapter.fromJson(jsonReader2);
                    i &= -2049;
                    break;
                case 12:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -4097;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -8192) {
            return new ReviewImage(image, str, str2, num, str3, str4, str5, l, bool.booleanValue(), l2, str6, list, str7);
        }
        Constructor<ReviewImage> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ReviewImage.class.getDeclaredConstructor(new Class[]{Image.class, cls2, cls2, Integer.class, cls2, cls2, cls2, cls, Boolean.TYPE, cls, cls2, List.class, cls2, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ReviewImage::class.java.…his.constructorRef = it }");
        }
        ReviewImage newInstance = constructor.newInstance(new Object[]{image, str, str2, num, str3, str4, str5, l, bool, l2, str6, list, str7, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ReviewImage reviewImage) {
        C19383o.m32797g(wVar, "writer");
        if (reviewImage != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.IMAGE);
            this.nullableImageAdapter.toJson(wVar, reviewImage.getImage());
            wVar.mo68529h(ReviewImage.REVIEW_TEXT);
            this.nullableStringAdapter.toJson(wVar, reviewImage.getReview());
            wVar.mo68529h("review_translated");
            this.nullableStringAdapter.toJson(wVar, reviewImage.getTranslatedReview());
            wVar.mo68529h(ReviewImage.REVIEW_RATING);
            this.nullableIntAdapter.toJson(wVar, reviewImage.getRating());
            wVar.mo68529h(ResponseConstants.BUYER_AVATAR_URL);
            this.nullableStringAdapter.toJson(wVar, reviewImage.getBuyerAvatarUrl());
            wVar.mo68529h(ReviewImage.BUYER_NAME);
            this.nullableStringAdapter.toJson(wVar, reviewImage.getBuyerName());
            wVar.mo68529h(ResponseConstants.BUYER_PROFILE_URL);
            this.nullableStringAdapter.toJson(wVar, reviewImage.getBuyerProfileUrl());
            wVar.mo68529h(ResponseConstants.CREATE_DATE);
            this.nullableLongAdapter.toJson(wVar, reviewImage.getCreateDate());
            wVar.mo68529h(ReviewImage.LISTING_ONLY);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(reviewImage.isListingOnly()));
            wVar.mo68529h("listing_id");
            this.nullableLongAdapter.toJson(wVar, reviewImage.getListingId());
            wVar.mo68529h(ResponseConstants.LISTING_TITLE);
            this.nullableStringAdapter.toJson(wVar, reviewImage.getListingTitle());
            wVar.mo68529h(ResponseConstants.LISTING_IMAGES);
            this.nullableListOfStringAdapter.toJson(wVar, reviewImage.getListingImages());
            wVar.mo68529h(ResponseConstants.TRANSACTION_ID);
            this.nullableStringAdapter.toJson(wVar, reviewImage.getTransactionId());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
