package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ReviewImage;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ReviewVideoJsonAdapter extends JsonAdapter<ReviewVideo> {
    public static final int $stable = 8;
    private volatile Constructor<ReviewVideo> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Video> nullableVideoAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("video", ResponseConstants.TRANSACTION_ID, "listing_id", ReviewImage.REVIEW_RATING, ReviewImage.REVIEW_TEXT, "review_translated", ReviewImage.BUYER_NAME, "buyer_is_active", ResponseConstants.CREATE_DATE);

    public ReviewVideoJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableVideoAdapter = yVar.mo68558c(Video.class, emptySet, "video");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "transactionId");
        this.nullableFloatAdapter = yVar.mo68558c(Float.class, emptySet, ResponseConstants.RATING);
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "review");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "isBuyerActive");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ReviewVideo)";
    }

    public ReviewVideo fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        Class<Long> cls2 = Long.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Video video = null;
        Long l = null;
        Long l2 = null;
        Float f = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        Long l3 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    video = this.nullableVideoAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    f = this.nullableFloatAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
                case 8:
                    l3 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -257;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -512) {
            return new ReviewVideo(video, l, l2, f, str, str2, str3, bool, l3);
        }
        Constructor<ReviewVideo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ReviewVideo.class.getDeclaredConstructor(new Class[]{Video.class, cls2, cls2, Float.class, cls, cls, cls, Boolean.class, cls2, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ReviewVideo::class.java.…his.constructorRef = it }");
        }
        ReviewVideo newInstance = constructor.newInstance(new Object[]{video, l, l2, f, str, str2, str3, bool, l3, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ReviewVideo reviewVideo) {
        C19383o.m32797g(wVar, "writer");
        if (reviewVideo != null) {
            wVar.mo68522b();
            wVar.mo68529h("video");
            this.nullableVideoAdapter.toJson(wVar, reviewVideo.getVideo());
            wVar.mo68529h(ResponseConstants.TRANSACTION_ID);
            this.nullableLongAdapter.toJson(wVar, reviewVideo.getTransactionId());
            wVar.mo68529h("listing_id");
            this.nullableLongAdapter.toJson(wVar, reviewVideo.getListingId());
            wVar.mo68529h(ReviewImage.REVIEW_RATING);
            this.nullableFloatAdapter.toJson(wVar, reviewVideo.getRating());
            wVar.mo68529h(ReviewImage.REVIEW_TEXT);
            this.nullableStringAdapter.toJson(wVar, reviewVideo.getReview());
            wVar.mo68529h("review_translated");
            this.nullableStringAdapter.toJson(wVar, reviewVideo.getTranslatedReview());
            wVar.mo68529h(ReviewImage.BUYER_NAME);
            this.nullableStringAdapter.toJson(wVar, reviewVideo.getBuyerName());
            wVar.mo68529h("buyer_is_active");
            this.nullableBooleanAdapter.toJson(wVar, reviewVideo.isBuyerActive());
            wVar.mo68529h(ResponseConstants.CREATE_DATE);
            this.nullableLongAdapter.toJson(wVar, reviewVideo.getCreateDate());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
