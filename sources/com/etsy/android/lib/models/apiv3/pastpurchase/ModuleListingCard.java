package com.etsy.android.lib.models.apiv3.pastpurchase;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class ModuleListingCard {
    public static final int $stable = 8;
    private final String contentSource;
    private final ListingImage img;
    private boolean isFav;
    private boolean isInCollections;
    private final long listingId;
    private final String listingTitle;
    private final String listingUrl;
    private final long shopId;

    public ModuleListingCard(@C17402n(name = "listing_id") long j, @C17402n(name = "title") String str, @C17402n(name = "url") String str2, @C17402n(name = "img") ListingImage listingImage, @C17402n(name = "is_favorite") boolean z, @C17402n(name = "is_in_collections") boolean z2, @C17402n(name = "shop_id") long j2, @C17402n(name = "content_source") String str3) {
        C19383o.m32797g(str2, "listingUrl");
        this.listingId = j;
        this.listingTitle = str;
        this.listingUrl = str2;
        this.img = listingImage;
        this.isFav = z;
        this.isInCollections = z2;
        this.shopId = j2;
        this.contentSource = str3;
    }

    public static /* synthetic */ ModuleListingCard copy$default(ModuleListingCard moduleListingCard, long j, String str, String str2, ListingImage listingImage, boolean z, boolean z2, long j2, String str3, int i, Object obj) {
        ModuleListingCard moduleListingCard2 = moduleListingCard;
        int i2 = i;
        return moduleListingCard.copy((i2 & 1) != 0 ? moduleListingCard2.listingId : j, (i2 & 2) != 0 ? moduleListingCard2.listingTitle : str, (i2 & 4) != 0 ? moduleListingCard2.listingUrl : str2, (i2 & 8) != 0 ? moduleListingCard2.img : listingImage, (i2 & 16) != 0 ? moduleListingCard2.isFav : z, (i2 & 32) != 0 ? moduleListingCard2.isInCollections : z2, (i2 & 64) != 0 ? moduleListingCard2.shopId : j2, (i2 & 128) != 0 ? moduleListingCard2.contentSource : str3);
    }

    public final long component1() {
        return this.listingId;
    }

    public final String component2() {
        return this.listingTitle;
    }

    public final String component3() {
        return this.listingUrl;
    }

    public final ListingImage component4() {
        return this.img;
    }

    public final boolean component5() {
        return this.isFav;
    }

    public final boolean component6() {
        return this.isInCollections;
    }

    public final long component7() {
        return this.shopId;
    }

    public final String component8() {
        return this.contentSource;
    }

    public final ModuleListingCard copy(@C17402n(name = "listing_id") long j, @C17402n(name = "title") String str, @C17402n(name = "url") String str2, @C17402n(name = "img") ListingImage listingImage, @C17402n(name = "is_favorite") boolean z, @C17402n(name = "is_in_collections") boolean z2, @C17402n(name = "shop_id") long j2, @C17402n(name = "content_source") String str3) {
        String str4 = str2;
        C19383o.m32797g(str4, "listingUrl");
        return new ModuleListingCard(j, str, str4, listingImage, z, z2, j2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleListingCard)) {
            return false;
        }
        ModuleListingCard moduleListingCard = (ModuleListingCard) obj;
        return this.listingId == moduleListingCard.listingId && C19383o.m32792b(this.listingTitle, moduleListingCard.listingTitle) && C19383o.m32792b(this.listingUrl, moduleListingCard.listingUrl) && C19383o.m32792b(this.img, moduleListingCard.img) && this.isFav == moduleListingCard.isFav && this.isInCollections == moduleListingCard.isInCollections && this.shopId == moduleListingCard.shopId && C19383o.m32792b(this.contentSource, moduleListingCard.contentSource);
    }

    public final String getContentSource() {
        return this.contentSource;
    }

    public final ListingImage getImg() {
        return this.img;
    }

    public final long getListingId() {
        return this.listingId;
    }

    public final String getListingTitle() {
        return this.listingTitle;
    }

    public final String getListingUrl() {
        return this.listingUrl;
    }

    public final long getShopId() {
        return this.shopId;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.listingId) * 31;
        String str = this.listingTitle;
        int i = 0;
        int e = C0023f.m105e(this.listingUrl, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        ListingImage listingImage = this.img;
        int hashCode2 = (e + (listingImage == null ? 0 : listingImage.hashCode())) * 31;
        boolean z = this.isFav;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.isInCollections;
        if (!z3) {
            z2 = z3;
        }
        int b = C0071c.m190b(this.shopId, (i2 + (z2 ? 1 : 0)) * 31, 31);
        String str2 = this.contentSource;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return b + i;
    }

    public final boolean isFav() {
        return this.isFav;
    }

    public final boolean isInCollections() {
        return this.isInCollections;
    }

    public final void setFav(boolean z) {
        this.isFav = z;
    }

    public final void setInCollections(boolean z) {
        this.isInCollections = z;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ModuleListingCard(listingId=");
        h.append(this.listingId);
        h.append(", listingTitle=");
        h.append(this.listingTitle);
        h.append(", listingUrl=");
        h.append(this.listingUrl);
        h.append(", img=");
        h.append(this.img);
        h.append(", isFav=");
        h.append(this.isFav);
        h.append(", isInCollections=");
        h.append(this.isInCollections);
        h.append(", shopId=");
        h.append(this.shopId);
        h.append(", contentSource=");
        return C0391c.m1057c(h, this.contentSource, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ModuleListingCard(long r15, java.lang.String r17, java.lang.String r18, com.etsy.android.lib.models.apiv3.listing.ListingImage r19, boolean r20, boolean r21, long r22, java.lang.String r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r17
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r19
        L_0x0013:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L_0x001a
            r9 = r3
            goto L_0x001c
        L_0x001a:
            r9 = r20
        L_0x001c:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0022
            r10 = r3
            goto L_0x0024
        L_0x0022:
            r10 = r21
        L_0x0024:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x002a
            r13 = r2
            goto L_0x002c
        L_0x002a:
            r13 = r24
        L_0x002c:
            r3 = r14
            r4 = r15
            r7 = r18
            r11 = r22
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.pastpurchase.ModuleListingCard.<init>(long, java.lang.String, java.lang.String, com.etsy.android.lib.models.apiv3.listing.ListingImage, boolean, boolean, long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
