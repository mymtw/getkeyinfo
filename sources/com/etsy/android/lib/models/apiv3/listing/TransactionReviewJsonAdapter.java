package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class TransactionReviewJsonAdapter extends JsonAdapter<TransactionReview> {
    public static final int $stable = 8;
    private volatile Constructor<TransactionReview> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.BUYER_USER_ID, ResponseConstants.CREATE_DATE, "is_anonymous", "language", "listing_id", ResponseConstants.RATING, "review", "review_translated", ResponseConstants.TRANSACTION_ID);

    public TransactionReviewJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "buyerUserId");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "isAnonymous");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "language");
        this.nullableFloatAdapter = yVar.mo68558c(Float.class, emptySet, ResponseConstants.RATING);
    }

    public String toString() {
        return "GeneratedJsonAdapter(TransactionReview)";
    }

    public TransactionReview fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        Class<Long> cls2 = Long.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Long l = null;
        Long l2 = null;
        Boolean bool = null;
        String str = null;
        Long l3 = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Long l4 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    l3 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    f = this.nullableFloatAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
                case 8:
                    l4 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -257;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -512) {
            return new TransactionReview(l, l2, bool, str, l3, f, str2, str3, l4);
        }
        Constructor<TransactionReview> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TransactionReview.class.getDeclaredConstructor(new Class[]{cls2, cls2, Boolean.class, cls, cls2, Float.class, cls, cls, cls2, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "TransactionReview::class…his.constructorRef = it }");
        }
        TransactionReview newInstance = constructor.newInstance(new Object[]{l, l2, bool, str, l3, f, str2, str3, l4, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, TransactionReview transactionReview) {
        C19383o.m32797g(wVar, "writer");
        if (transactionReview != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.BUYER_USER_ID);
            this.nullableLongAdapter.toJson(wVar, transactionReview.getBuyerUserId());
            wVar.mo68529h(ResponseConstants.CREATE_DATE);
            this.nullableLongAdapter.toJson(wVar, transactionReview.getCreateDate());
            wVar.mo68529h("is_anonymous");
            this.nullableBooleanAdapter.toJson(wVar, transactionReview.isAnonymous());
            wVar.mo68529h("language");
            this.nullableStringAdapter.toJson(wVar, transactionReview.getLanguage());
            wVar.mo68529h("listing_id");
            this.nullableLongAdapter.toJson(wVar, transactionReview.getListingId());
            wVar.mo68529h(ResponseConstants.RATING);
            this.nullableFloatAdapter.toJson(wVar, transactionReview.getRating());
            wVar.mo68529h("review");
            this.nullableStringAdapter.toJson(wVar, transactionReview.getReview());
            wVar.mo68529h("review_translated");
            this.nullableStringAdapter.toJson(wVar, transactionReview.getTranslatedReview());
            wVar.mo68529h(ResponseConstants.TRANSACTION_ID);
            this.nullableLongAdapter.toJson(wVar, transactionReview.getTransactionId());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
