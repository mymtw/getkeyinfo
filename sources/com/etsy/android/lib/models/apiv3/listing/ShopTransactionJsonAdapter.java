package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ShopTransactionJsonAdapter extends JsonAdapter<ShopTransaction> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("image_color", "image_url_150x150", "image_url_small", ResponseConstants.LISTING_URL, ResponseConstants.RESPONSE, "response_is_deleted", "response_language", "seller_user_id", "title", ResponseConstants.TRANSACTION_ID);

    public ShopTransactionJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "imageColor");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "responseIsDeleted");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "sellerUserId");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopTransaction)";
    }

    public ShopTransaction fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool = null;
        String str6 = null;
        Long l = null;
        String str7 = null;
        Long l2 = null;
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
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    l = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new ShopTransaction(str, str2, str3, str4, str5, bool, str6, l, str7, l2);
    }

    public void toJson(C17412w wVar, ShopTransaction shopTransaction) {
        C19383o.m32797g(wVar, "writer");
        if (shopTransaction != null) {
            wVar.mo68522b();
            wVar.mo68529h("image_color");
            this.nullableStringAdapter.toJson(wVar, shopTransaction.getImageColor());
            wVar.mo68529h("image_url_150x150");
            this.nullableStringAdapter.toJson(wVar, shopTransaction.getImageUrl150x150());
            wVar.mo68529h("image_url_small");
            this.nullableStringAdapter.toJson(wVar, shopTransaction.getImageUrlSmall());
            wVar.mo68529h(ResponseConstants.LISTING_URL);
            this.nullableStringAdapter.toJson(wVar, shopTransaction.getListingUrl());
            wVar.mo68529h(ResponseConstants.RESPONSE);
            this.nullableStringAdapter.toJson(wVar, shopTransaction.getResponse());
            wVar.mo68529h("response_is_deleted");
            this.nullableBooleanAdapter.toJson(wVar, shopTransaction.getResponseIsDeleted());
            wVar.mo68529h("response_language");
            this.nullableStringAdapter.toJson(wVar, shopTransaction.getResponseLanguage());
            wVar.mo68529h("seller_user_id");
            this.nullableLongAdapter.toJson(wVar, shopTransaction.getSellerUserId());
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, shopTransaction.getTitle());
            wVar.mo68529h(ResponseConstants.TRANSACTION_ID);
            this.nullableLongAdapter.toJson(wVar, shopTransaction.getTransactionId());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
