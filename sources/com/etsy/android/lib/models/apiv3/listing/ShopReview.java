package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ShopReview {
    public static final int $stable = 8;
    private final AppreciationPhoto appreciationPhoto;
    private final Video appreciationVideo;
    private final ShopsReviewsUserCard buyerUser;
    private final TransactionReview review;
    private final ShopsReviewsUserCard shopUser;
    private final ShopTransaction transaction;

    public ShopReview() {
        this((AppreciationPhoto) null, (Video) null, (ShopsReviewsUserCard) null, (TransactionReview) null, (ShopsReviewsUserCard) null, (ShopTransaction) null, 63, (DefaultConstructorMarker) null);
    }

    public ShopReview(@C17402n(name = "appreciation_photo") AppreciationPhoto appreciationPhoto2, @C17402n(name = "appreciation_video") Video video, @C17402n(name = "buyer_user") ShopsReviewsUserCard shopsReviewsUserCard, @C17402n(name = "review") TransactionReview transactionReview, @C17402n(name = "shop_user") ShopsReviewsUserCard shopsReviewsUserCard2, @C17402n(name = "transaction") ShopTransaction shopTransaction) {
        this.appreciationPhoto = appreciationPhoto2;
        this.appreciationVideo = video;
        this.buyerUser = shopsReviewsUserCard;
        this.review = transactionReview;
        this.shopUser = shopsReviewsUserCard2;
        this.transaction = shopTransaction;
    }

    public static /* synthetic */ ShopReview copy$default(ShopReview shopReview, AppreciationPhoto appreciationPhoto2, Video video, ShopsReviewsUserCard shopsReviewsUserCard, TransactionReview transactionReview, ShopsReviewsUserCard shopsReviewsUserCard2, ShopTransaction shopTransaction, int i, Object obj) {
        if ((i & 1) != 0) {
            appreciationPhoto2 = shopReview.appreciationPhoto;
        }
        if ((i & 2) != 0) {
            video = shopReview.appreciationVideo;
        }
        Video video2 = video;
        if ((i & 4) != 0) {
            shopsReviewsUserCard = shopReview.buyerUser;
        }
        ShopsReviewsUserCard shopsReviewsUserCard3 = shopsReviewsUserCard;
        if ((i & 8) != 0) {
            transactionReview = shopReview.review;
        }
        TransactionReview transactionReview2 = transactionReview;
        if ((i & 16) != 0) {
            shopsReviewsUserCard2 = shopReview.shopUser;
        }
        ShopsReviewsUserCard shopsReviewsUserCard4 = shopsReviewsUserCard2;
        if ((i & 32) != 0) {
            shopTransaction = shopReview.transaction;
        }
        return shopReview.copy(appreciationPhoto2, video2, shopsReviewsUserCard3, transactionReview2, shopsReviewsUserCard4, shopTransaction);
    }

    public final AppreciationPhoto component1() {
        return this.appreciationPhoto;
    }

    public final Video component2() {
        return this.appreciationVideo;
    }

    public final ShopsReviewsUserCard component3() {
        return this.buyerUser;
    }

    public final TransactionReview component4() {
        return this.review;
    }

    public final ShopsReviewsUserCard component5() {
        return this.shopUser;
    }

    public final ShopTransaction component6() {
        return this.transaction;
    }

    public final ShopReview copy(@C17402n(name = "appreciation_photo") AppreciationPhoto appreciationPhoto2, @C17402n(name = "appreciation_video") Video video, @C17402n(name = "buyer_user") ShopsReviewsUserCard shopsReviewsUserCard, @C17402n(name = "review") TransactionReview transactionReview, @C17402n(name = "shop_user") ShopsReviewsUserCard shopsReviewsUserCard2, @C17402n(name = "transaction") ShopTransaction shopTransaction) {
        return new ShopReview(appreciationPhoto2, video, shopsReviewsUserCard, transactionReview, shopsReviewsUserCard2, shopTransaction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopReview)) {
            return false;
        }
        ShopReview shopReview = (ShopReview) obj;
        return C19383o.m32792b(this.appreciationPhoto, shopReview.appreciationPhoto) && C19383o.m32792b(this.appreciationVideo, shopReview.appreciationVideo) && C19383o.m32792b(this.buyerUser, shopReview.buyerUser) && C19383o.m32792b(this.review, shopReview.review) && C19383o.m32792b(this.shopUser, shopReview.shopUser) && C19383o.m32792b(this.transaction, shopReview.transaction);
    }

    public final AppreciationPhoto getAppreciationPhoto() {
        return this.appreciationPhoto;
    }

    public final Video getAppreciationVideo() {
        return this.appreciationVideo;
    }

    public final ShopsReviewsUserCard getBuyerUser() {
        return this.buyerUser;
    }

    public final TransactionReview getReview() {
        return this.review;
    }

    public final ShopsReviewsUserCard getShopUser() {
        return this.shopUser;
    }

    public final ShopTransaction getTransaction() {
        return this.transaction;
    }

    public int hashCode() {
        AppreciationPhoto appreciationPhoto2 = this.appreciationPhoto;
        int i = 0;
        int hashCode = (appreciationPhoto2 == null ? 0 : appreciationPhoto2.hashCode()) * 31;
        Video video = this.appreciationVideo;
        int hashCode2 = (hashCode + (video == null ? 0 : video.hashCode())) * 31;
        ShopsReviewsUserCard shopsReviewsUserCard = this.buyerUser;
        int hashCode3 = (hashCode2 + (shopsReviewsUserCard == null ? 0 : shopsReviewsUserCard.hashCode())) * 31;
        TransactionReview transactionReview = this.review;
        int hashCode4 = (hashCode3 + (transactionReview == null ? 0 : transactionReview.hashCode())) * 31;
        ShopsReviewsUserCard shopsReviewsUserCard2 = this.shopUser;
        int hashCode5 = (hashCode4 + (shopsReviewsUserCard2 == null ? 0 : shopsReviewsUserCard2.hashCode())) * 31;
        ShopTransaction shopTransaction = this.transaction;
        if (shopTransaction != null) {
            i = shopTransaction.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopReview(appreciationPhoto=");
        h.append(this.appreciationPhoto);
        h.append(", appreciationVideo=");
        h.append(this.appreciationVideo);
        h.append(", buyerUser=");
        h.append(this.buyerUser);
        h.append(", review=");
        h.append(this.review);
        h.append(", shopUser=");
        h.append(this.shopUser);
        h.append(", transaction=");
        h.append(this.transaction);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShopReview(com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto r6, com.etsy.android.lib.models.apiv3.listing.Video r7, com.etsy.android.lib.models.apiv3.listing.ShopsReviewsUserCard r8, com.etsy.android.lib.models.apiv3.listing.TransactionReview r9, com.etsy.android.lib.models.apiv3.listing.ShopsReviewsUserCard r10, com.etsy.android.lib.models.apiv3.listing.ShopTransaction r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ShopReview.<init>(com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto, com.etsy.android.lib.models.apiv3.listing.Video, com.etsy.android.lib.models.apiv3.listing.ShopsReviewsUserCard, com.etsy.android.lib.models.apiv3.listing.TransactionReview, com.etsy.android.lib.models.apiv3.listing.ShopsReviewsUserCard, com.etsy.android.lib.models.apiv3.listing.ShopTransaction, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
