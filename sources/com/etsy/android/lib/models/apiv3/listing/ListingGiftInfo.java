package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ListingGiftInfo {
    public static final int $stable = 8;
    private final String description;
    private final Boolean isEligible;
    private final Boolean offersGiftMessage;
    private final Image previewImage;
    private final Money price;
    private final String shopName;

    public ListingGiftInfo() {
        this((String) null, (Boolean) null, (Boolean) null, (Image) null, (Money) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public ListingGiftInfo(@C17402n(name = "description") String str, @C17402n(name = "is_eligible") Boolean bool, @C17402n(name = "offers_gift_message") Boolean bool2, @C17402n(name = "preview_image") Image image, @C17402n(name = "price") Money money, @C17402n(name = "shop_name") String str2) {
        this.description = str;
        this.isEligible = bool;
        this.offersGiftMessage = bool2;
        this.previewImage = image;
        this.price = money;
        this.shopName = str2;
    }

    public static /* synthetic */ ListingGiftInfo copy$default(ListingGiftInfo listingGiftInfo, String str, Boolean bool, Boolean bool2, Image image, Money money, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listingGiftInfo.description;
        }
        if ((i & 2) != 0) {
            bool = listingGiftInfo.isEligible;
        }
        Boolean bool3 = bool;
        if ((i & 4) != 0) {
            bool2 = listingGiftInfo.offersGiftMessage;
        }
        Boolean bool4 = bool2;
        if ((i & 8) != 0) {
            image = listingGiftInfo.previewImage;
        }
        Image image2 = image;
        if ((i & 16) != 0) {
            money = listingGiftInfo.price;
        }
        Money money2 = money;
        if ((i & 32) != 0) {
            str2 = listingGiftInfo.shopName;
        }
        return listingGiftInfo.copy(str, bool3, bool4, image2, money2, str2);
    }

    public final String component1() {
        return this.description;
    }

    public final Boolean component2() {
        return this.isEligible;
    }

    public final Boolean component3() {
        return this.offersGiftMessage;
    }

    public final Image component4() {
        return this.previewImage;
    }

    public final Money component5() {
        return this.price;
    }

    public final String component6() {
        return this.shopName;
    }

    public final ListingGiftInfo copy(@C17402n(name = "description") String str, @C17402n(name = "is_eligible") Boolean bool, @C17402n(name = "offers_gift_message") Boolean bool2, @C17402n(name = "preview_image") Image image, @C17402n(name = "price") Money money, @C17402n(name = "shop_name") String str2) {
        return new ListingGiftInfo(str, bool, bool2, image, money, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingGiftInfo)) {
            return false;
        }
        ListingGiftInfo listingGiftInfo = (ListingGiftInfo) obj;
        return C19383o.m32792b(this.description, listingGiftInfo.description) && C19383o.m32792b(this.isEligible, listingGiftInfo.isEligible) && C19383o.m32792b(this.offersGiftMessage, listingGiftInfo.offersGiftMessage) && C19383o.m32792b(this.previewImage, listingGiftInfo.previewImage) && C19383o.m32792b(this.price, listingGiftInfo.price) && C19383o.m32792b(this.shopName, listingGiftInfo.shopName);
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getOffersGiftMessage() {
        return this.offersGiftMessage;
    }

    public final Image getPreviewImage() {
        return this.previewImage;
    }

    public final Money getPrice() {
        return this.price;
    }

    public final String getShopName() {
        return this.shopName;
    }

    public int hashCode() {
        String str = this.description;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isEligible;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.offersGiftMessage;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Image image = this.previewImage;
        int hashCode4 = (hashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        Money money = this.price;
        int hashCode5 = (hashCode4 + (money == null ? 0 : money.hashCode())) * 31;
        String str2 = this.shopName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode5 + i;
    }

    public final Boolean isEligible() {
        return this.isEligible;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingGiftInfo(description=");
        h.append(this.description);
        h.append(", isEligible=");
        h.append(this.isEligible);
        h.append(", offersGiftMessage=");
        h.append(this.offersGiftMessage);
        h.append(", previewImage=");
        h.append(this.previewImage);
        h.append(", price=");
        h.append(this.price);
        h.append(", shopName=");
        return C0391c.m1057c(h, this.shopName, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ListingGiftInfo(java.lang.String r6, java.lang.Boolean r7, java.lang.Boolean r8, com.etsy.android.lib.models.apiv3.listing.Image r9, com.etsy.android.lib.models.apiv3.listing.Money r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ListingGiftInfo.<init>(java.lang.String, java.lang.Boolean, java.lang.Boolean, com.etsy.android.lib.models.apiv3.listing.Image, com.etsy.android.lib.models.apiv3.listing.Money, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
