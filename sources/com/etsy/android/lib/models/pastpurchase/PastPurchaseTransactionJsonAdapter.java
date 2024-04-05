package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class PastPurchaseTransactionJsonAdapter extends JsonAdapter<PastPurchaseTransaction> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<PastPurchaseTransaction> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<PastPurchaseListing> nullablePastPurchaseListingAdapter;
    private final JsonAdapter<PastPurchaseMainImage> nullablePastPurchaseMainImageAdapter;
    private final JsonAdapter<PastPurchaseUser> nullablePastPurchaseUserAdapter;
    private final JsonAdapter<PastPurchasesGiftCardDesign> nullablePastPurchasesGiftCardDesignAdapter;
    private final JsonAdapter<ReceiptUserReview> nullableReceiptUserReviewAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.TRANSACTION_ID, ResponseConstants.QUANTITY, ResponseConstants.IS_GIFT_CARD, "title", ResponseConstants.PRICE, ResponseConstants.CURRENCY_CODE, ResponseConstants.IS_FEEDBACK_MUTABLE, ResponseConstants.Includes.MAINIMAGE, ResponseConstants.Includes.GIFT_CARD_DESIGN, ResponseConstants.LISTING_V2, ResponseConstants.Includes.USER_REVIEW, ResponseConstants.Includes.SELLER);

    public PastPurchaseTransactionJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls, emptySet, "transactionId");
        this.intAdapter = yVar.mo68558c(Integer.TYPE, emptySet, ResponseConstants.QUANTITY);
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isGiftCard");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "title");
        this.nullablePastPurchaseMainImageAdapter = yVar.mo68558c(PastPurchaseMainImage.class, emptySet, "mainImage");
        this.nullablePastPurchasesGiftCardDesignAdapter = yVar.mo68558c(PastPurchasesGiftCardDesign.class, emptySet, "giftCardDesign");
        this.nullablePastPurchaseListingAdapter = yVar.mo68558c(PastPurchaseListing.class, emptySet, ResponseConstants.LISTING);
        this.nullableReceiptUserReviewAdapter = yVar.mo68558c(ReceiptUserReview.class, emptySet, "userReview");
        this.nullablePastPurchaseUserAdapter = yVar.mo68558c(PastPurchaseUser.class, emptySet, "seller");
    }

    public String toString() {
        return "GeneratedJsonAdapter(PastPurchaseTransaction)";
    }

    public PastPurchaseTransaction fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.mo68410b();
        int i = -1;
        Long l = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        PastPurchaseMainImage pastPurchaseMainImage = null;
        PastPurchasesGiftCardDesign pastPurchasesGiftCardDesign = null;
        PastPurchaseListing pastPurchaseListing = null;
        ReceiptUserReview receiptUserReview = null;
        PastPurchaseUser pastPurchaseUser = null;
        Boolean bool2 = bool;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    l = this.longAdapter.fromJson(jsonReader2);
                    if (l != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("transactionId", ResponseConstants.TRANSACTION_ID, jsonReader2);
                    }
                case 1:
                    num = this.intAdapter.fromJson(jsonReader2);
                    if (num != null) {
                        break;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.QUANTITY, ResponseConstants.QUANTITY, jsonReader2);
                    }
                case 2:
                    bool = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool != null) {
                        i &= -5;
                        break;
                    } else {
                        throw C18215a.m30734m("isGiftCard", ResponseConstants.IS_GIFT_CARD, jsonReader2);
                    }
                case 3:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    bool2 = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool2 != null) {
                        i &= -65;
                        break;
                    } else {
                        throw C18215a.m30734m("isFeedbackMutable", ResponseConstants.IS_FEEDBACK_MUTABLE, jsonReader2);
                    }
                case 7:
                    pastPurchaseMainImage = this.nullablePastPurchaseMainImageAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
                case 8:
                    pastPurchasesGiftCardDesign = this.nullablePastPurchasesGiftCardDesignAdapter.fromJson(jsonReader2);
                    i &= -257;
                    break;
                case 9:
                    pastPurchaseListing = this.nullablePastPurchaseListingAdapter.fromJson(jsonReader2);
                    i &= -513;
                    break;
                case 10:
                    receiptUserReview = this.nullableReceiptUserReviewAdapter.fromJson(jsonReader2);
                    i &= -1025;
                    break;
                case 11:
                    pastPurchaseUser = this.nullablePastPurchaseUserAdapter.fromJson(jsonReader2);
                    i &= -2049;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i != -4093) {
            Constructor<PastPurchaseTransaction> constructor = this.constructorRef;
            if (constructor == null) {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                constructor = PastPurchaseTransaction.class.getDeclaredConstructor(new Class[]{Long.TYPE, cls2, cls3, cls, cls, cls, cls3, PastPurchaseMainImage.class, PastPurchasesGiftCardDesign.class, PastPurchaseListing.class, ReceiptUserReview.class, PastPurchaseUser.class, cls2, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "PastPurchaseTransaction:…his.constructorRef = it }");
            }
            Object[] objArr = new Object[14];
            if (l != null) {
                objArr[0] = Long.valueOf(l.longValue());
                if (num != null) {
                    objArr[1] = Integer.valueOf(num.intValue());
                    objArr[2] = bool;
                    objArr[3] = str;
                    objArr[4] = str2;
                    objArr[5] = str3;
                    objArr[6] = bool2;
                    objArr[7] = pastPurchaseMainImage;
                    objArr[8] = pastPurchasesGiftCardDesign;
                    objArr[9] = pastPurchaseListing;
                    objArr[10] = receiptUserReview;
                    objArr[11] = pastPurchaseUser;
                    objArr[12] = Integer.valueOf(i);
                    objArr[13] = null;
                    PastPurchaseTransaction newInstance = constructor.newInstance(objArr);
                    C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return newInstance;
                }
                throw C18215a.m30728g(ResponseConstants.QUANTITY, ResponseConstants.QUANTITY, jsonReader2);
            }
            throw C18215a.m30728g("transactionId", ResponseConstants.TRANSACTION_ID, jsonReader2);
        } else if (l != null) {
            long longValue = l.longValue();
            if (num != null) {
                return new PastPurchaseTransaction(longValue, num.intValue(), bool.booleanValue(), str, str2, str3, bool2.booleanValue(), pastPurchaseMainImage, pastPurchasesGiftCardDesign, pastPurchaseListing, receiptUserReview, pastPurchaseUser);
            }
            throw C18215a.m30728g(ResponseConstants.QUANTITY, ResponseConstants.QUANTITY, jsonReader2);
        } else {
            throw C18215a.m30728g("transactionId", ResponseConstants.TRANSACTION_ID, jsonReader2);
        }
    }

    public void toJson(C17412w wVar, PastPurchaseTransaction pastPurchaseTransaction) {
        C19383o.m32797g(wVar, "writer");
        if (pastPurchaseTransaction != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.TRANSACTION_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(pastPurchaseTransaction.getTransactionId()));
            wVar.mo68529h(ResponseConstants.QUANTITY);
            this.intAdapter.toJson(wVar, Integer.valueOf(pastPurchaseTransaction.getQuantity()));
            wVar.mo68529h(ResponseConstants.IS_GIFT_CARD);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(pastPurchaseTransaction.isGiftCard()));
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseTransaction.getTitle());
            wVar.mo68529h(ResponseConstants.PRICE);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseTransaction.getPrice());
            wVar.mo68529h(ResponseConstants.CURRENCY_CODE);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseTransaction.getCurrencyCode());
            wVar.mo68529h(ResponseConstants.IS_FEEDBACK_MUTABLE);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(pastPurchaseTransaction.isFeedbackMutable()));
            wVar.mo68529h(ResponseConstants.Includes.MAINIMAGE);
            this.nullablePastPurchaseMainImageAdapter.toJson(wVar, pastPurchaseTransaction.getMainImage());
            wVar.mo68529h(ResponseConstants.Includes.GIFT_CARD_DESIGN);
            this.nullablePastPurchasesGiftCardDesignAdapter.toJson(wVar, pastPurchaseTransaction.getGiftCardDesign());
            wVar.mo68529h(ResponseConstants.LISTING_V2);
            this.nullablePastPurchaseListingAdapter.toJson(wVar, pastPurchaseTransaction.getListing());
            wVar.mo68529h(ResponseConstants.Includes.USER_REVIEW);
            this.nullableReceiptUserReviewAdapter.toJson(wVar, pastPurchaseTransaction.getUserReview());
            wVar.mo68529h(ResponseConstants.Includes.SELLER);
            this.nullablePastPurchaseUserAdapter.toJson(wVar, pastPurchaseTransaction.getSeller());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
