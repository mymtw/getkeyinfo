package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ShopTransaction {
    public static final int $stable = 0;
    private final String imageColor;
    private final String imageUrl150x150;
    private final String imageUrlSmall;
    private final String listingUrl;
    private final String response;
    private final Boolean responseIsDeleted;
    private final String responseLanguage;
    private final Long sellerUserId;
    private final String title;
    private final Long transactionId;

    public ShopTransaction(@C17402n(name = "image_color") String str, @C17402n(name = "image_url_150x150") String str2, @C17402n(name = "image_url_small") String str3, @C17402n(name = "listing_url") String str4, @C17402n(name = "response") String str5, @C17402n(name = "response_is_deleted") Boolean bool, @C17402n(name = "response_language") String str6, @C17402n(name = "seller_user_id") Long l, @C17402n(name = "title") String str7, @C17402n(name = "transaction_id") Long l2) {
        this.imageColor = str;
        this.imageUrl150x150 = str2;
        this.imageUrlSmall = str3;
        this.listingUrl = str4;
        this.response = str5;
        this.responseIsDeleted = bool;
        this.responseLanguage = str6;
        this.sellerUserId = l;
        this.title = str7;
        this.transactionId = l2;
    }

    public static /* synthetic */ ShopTransaction copy$default(ShopTransaction shopTransaction, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, Long l, String str7, Long l2, int i, Object obj) {
        ShopTransaction shopTransaction2 = shopTransaction;
        int i2 = i;
        return shopTransaction.copy((i2 & 1) != 0 ? shopTransaction2.imageColor : str, (i2 & 2) != 0 ? shopTransaction2.imageUrl150x150 : str2, (i2 & 4) != 0 ? shopTransaction2.imageUrlSmall : str3, (i2 & 8) != 0 ? shopTransaction2.listingUrl : str4, (i2 & 16) != 0 ? shopTransaction2.response : str5, (i2 & 32) != 0 ? shopTransaction2.responseIsDeleted : bool, (i2 & 64) != 0 ? shopTransaction2.responseLanguage : str6, (i2 & 128) != 0 ? shopTransaction2.sellerUserId : l, (i2 & 256) != 0 ? shopTransaction2.title : str7, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? shopTransaction2.transactionId : l2);
    }

    public final String component1() {
        return this.imageColor;
    }

    public final Long component10() {
        return this.transactionId;
    }

    public final String component2() {
        return this.imageUrl150x150;
    }

    public final String component3() {
        return this.imageUrlSmall;
    }

    public final String component4() {
        return this.listingUrl;
    }

    public final String component5() {
        return this.response;
    }

    public final Boolean component6() {
        return this.responseIsDeleted;
    }

    public final String component7() {
        return this.responseLanguage;
    }

    public final Long component8() {
        return this.sellerUserId;
    }

    public final String component9() {
        return this.title;
    }

    public final ShopTransaction copy(@C17402n(name = "image_color") String str, @C17402n(name = "image_url_150x150") String str2, @C17402n(name = "image_url_small") String str3, @C17402n(name = "listing_url") String str4, @C17402n(name = "response") String str5, @C17402n(name = "response_is_deleted") Boolean bool, @C17402n(name = "response_language") String str6, @C17402n(name = "seller_user_id") Long l, @C17402n(name = "title") String str7, @C17402n(name = "transaction_id") Long l2) {
        return new ShopTransaction(str, str2, str3, str4, str5, bool, str6, l, str7, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopTransaction)) {
            return false;
        }
        ShopTransaction shopTransaction = (ShopTransaction) obj;
        return C19383o.m32792b(this.imageColor, shopTransaction.imageColor) && C19383o.m32792b(this.imageUrl150x150, shopTransaction.imageUrl150x150) && C19383o.m32792b(this.imageUrlSmall, shopTransaction.imageUrlSmall) && C19383o.m32792b(this.listingUrl, shopTransaction.listingUrl) && C19383o.m32792b(this.response, shopTransaction.response) && C19383o.m32792b(this.responseIsDeleted, shopTransaction.responseIsDeleted) && C19383o.m32792b(this.responseLanguage, shopTransaction.responseLanguage) && C19383o.m32792b(this.sellerUserId, shopTransaction.sellerUserId) && C19383o.m32792b(this.title, shopTransaction.title) && C19383o.m32792b(this.transactionId, shopTransaction.transactionId);
    }

    public final String getImageColor() {
        return this.imageColor;
    }

    public final String getImageUrl150x150() {
        return this.imageUrl150x150;
    }

    public final String getImageUrlSmall() {
        return this.imageUrlSmall;
    }

    public final String getListingUrl() {
        return this.listingUrl;
    }

    public final String getResponse() {
        return this.response;
    }

    public final Boolean getResponseIsDeleted() {
        return this.responseIsDeleted;
    }

    public final String getResponseLanguage() {
        return this.responseLanguage;
    }

    public final Long getSellerUserId() {
        return this.sellerUserId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        String str = this.imageColor;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageUrl150x150;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrlSmall;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.listingUrl;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.response;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.responseIsDeleted;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.responseLanguage;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.sellerUserId;
        int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        String str7 = this.title;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l2 = this.transactionId;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopTransaction(imageColor=");
        h.append(this.imageColor);
        h.append(", imageUrl150x150=");
        h.append(this.imageUrl150x150);
        h.append(", imageUrlSmall=");
        h.append(this.imageUrlSmall);
        h.append(", listingUrl=");
        h.append(this.listingUrl);
        h.append(", response=");
        h.append(this.response);
        h.append(", responseIsDeleted=");
        h.append(this.responseIsDeleted);
        h.append(", responseLanguage=");
        h.append(this.responseLanguage);
        h.append(", sellerUserId=");
        h.append(this.sellerUserId);
        h.append(", title=");
        h.append(this.title);
        h.append(", transactionId=");
        h.append(this.transactionId);
        h.append(')');
        return h.toString();
    }
}
