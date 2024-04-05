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

public final class ShopReviewJsonAdapter extends JsonAdapter<ShopReview> {
    public static final int $stable = 8;
    private volatile Constructor<ShopReview> constructorRef;
    private final JsonAdapter<AppreciationPhoto> nullableAppreciationPhotoAdapter;
    private final JsonAdapter<ShopTransaction> nullableShopTransactionAdapter;
    private final JsonAdapter<ShopsReviewsUserCard> nullableShopsReviewsUserCardAdapter;
    private final JsonAdapter<TransactionReview> nullableTransactionReviewAdapter;
    private final JsonAdapter<Video> nullableVideoAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.APPRECIATION_PHOTO, ResponseConstants.APPRECIATION_VIDEO, "buyer_user", "review", "shop_user", "transaction");

    public ShopReviewJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableAppreciationPhotoAdapter = yVar.mo68558c(AppreciationPhoto.class, emptySet, "appreciationPhoto");
        this.nullableVideoAdapter = yVar.mo68558c(Video.class, emptySet, "appreciationVideo");
        this.nullableShopsReviewsUserCardAdapter = yVar.mo68558c(ShopsReviewsUserCard.class, emptySet, "buyerUser");
        this.nullableTransactionReviewAdapter = yVar.mo68558c(TransactionReview.class, emptySet, "review");
        this.nullableShopTransactionAdapter = yVar.mo68558c(ShopTransaction.class, emptySet, "transaction");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopReview)";
    }

    public ShopReview fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<ShopsReviewsUserCard> cls = ShopsReviewsUserCard.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        AppreciationPhoto appreciationPhoto = null;
        Video video = null;
        ShopsReviewsUserCard shopsReviewsUserCard = null;
        TransactionReview transactionReview = null;
        ShopsReviewsUserCard shopsReviewsUserCard2 = null;
        ShopTransaction shopTransaction = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    appreciationPhoto = this.nullableAppreciationPhotoAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    video = this.nullableVideoAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    shopsReviewsUserCard = this.nullableShopsReviewsUserCardAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    transactionReview = this.nullableTransactionReviewAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    shopsReviewsUserCard2 = this.nullableShopsReviewsUserCardAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    shopTransaction = this.nullableShopTransactionAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -64) {
            return new ShopReview(appreciationPhoto, video, shopsReviewsUserCard, transactionReview, shopsReviewsUserCard2, shopTransaction);
        }
        Constructor<ShopReview> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ShopReview.class.getDeclaredConstructor(new Class[]{AppreciationPhoto.class, Video.class, cls, TransactionReview.class, cls, ShopTransaction.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ShopReview::class.java.g…his.constructorRef = it }");
        }
        ShopReview newInstance = constructor.newInstance(new Object[]{appreciationPhoto, video, shopsReviewsUserCard, transactionReview, shopsReviewsUserCard2, shopTransaction, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ShopReview shopReview) {
        C19383o.m32797g(wVar, "writer");
        if (shopReview != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.APPRECIATION_PHOTO);
            this.nullableAppreciationPhotoAdapter.toJson(wVar, shopReview.getAppreciationPhoto());
            wVar.mo68529h(ResponseConstants.APPRECIATION_VIDEO);
            this.nullableVideoAdapter.toJson(wVar, shopReview.getAppreciationVideo());
            wVar.mo68529h("buyer_user");
            this.nullableShopsReviewsUserCardAdapter.toJson(wVar, shopReview.getBuyerUser());
            wVar.mo68529h("review");
            this.nullableTransactionReviewAdapter.toJson(wVar, shopReview.getReview());
            wVar.mo68529h("shop_user");
            this.nullableShopsReviewsUserCardAdapter.toJson(wVar, shopReview.getShopUser());
            wVar.mo68529h("transaction");
            this.nullableShopTransactionAdapter.toJson(wVar, shopReview.getTransaction());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
