package com.etsy.android.lib.models.apiv3.inappnotifications;

import android.support.p013v4.media.C0072d;
import androidx.core.widget.NestedScrollView;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class IANListingCard implements ListingLike, C8698l {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final ListingImage img;
    private boolean isFav;
    private boolean isInCollections;
    private final boolean isVacation;
    private final Long listingId;
    private final Integer listingState;
    private final String listingTitle;
    private final Long shopId;
    private boolean shouldShowRelatedListingsKt;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IANListingCard fake() {
            return new IANListingCard(687064958L, (String) null, ListingImage.Companion.fake(), false, false, false, (Integer) null, (Long) null, NestedScrollView.ANIMATED_SCROLL_GAP, (DefaultConstructorMarker) null);
        }
    }

    public IANListingCard() {
        this((Long) null, (String) null, (ListingImage) null, false, false, false, (Integer) null, (Long) null, 255, (DefaultConstructorMarker) null);
    }

    public IANListingCard(@C17402n(name = "listing_id") Long l, @C17402n(name = "title") String str, @C17402n(name = "img") ListingImage listingImage, @C17402n(name = "is_favorite") boolean z, @C17402n(name = "is_in_collections") boolean z2, @C17402n(name = "is_vacation") boolean z3, @C17402n(name = "state") Integer num, @C17402n(name = "shop_id") Long l2) {
        this.listingId = l;
        this.listingTitle = str;
        this.img = listingImage;
        this.isFav = z;
        this.isInCollections = z2;
        this.isVacation = z3;
        this.listingState = num;
        this.shopId = l2;
        this.shouldShowRelatedListingsKt = true;
    }

    public static /* synthetic */ IANListingCard copy$default(IANListingCard iANListingCard, Long l, String str, ListingImage listingImage, boolean z, boolean z2, boolean z3, Integer num, Long l2, int i, Object obj) {
        IANListingCard iANListingCard2 = iANListingCard;
        int i2 = i;
        return iANListingCard.copy((i2 & 1) != 0 ? iANListingCard2.listingId : l, (i2 & 2) != 0 ? iANListingCard2.listingTitle : str, (i2 & 4) != 0 ? iANListingCard2.img : listingImage, (i2 & 8) != 0 ? iANListingCard2.isFav : z, (i2 & 16) != 0 ? iANListingCard2.isInCollections : z2, (i2 & 32) != 0 ? iANListingCard2.isVacation : z3, (i2 & 64) != 0 ? iANListingCard2.listingState : num, (i2 & 128) != 0 ? iANListingCard2.shopId : l2);
    }

    public final Long component1() {
        return this.listingId;
    }

    public final String component2() {
        return this.listingTitle;
    }

    public final ListingImage component3() {
        return this.img;
    }

    public final boolean component4() {
        return this.isFav;
    }

    public final boolean component5() {
        return this.isInCollections;
    }

    public final boolean component6() {
        return this.isVacation;
    }

    public final Integer component7() {
        return this.listingState;
    }

    public final Long component8() {
        return this.shopId;
    }

    public final IANListingCard copy(@C17402n(name = "listing_id") Long l, @C17402n(name = "title") String str, @C17402n(name = "img") ListingImage listingImage, @C17402n(name = "is_favorite") boolean z, @C17402n(name = "is_in_collections") boolean z2, @C17402n(name = "is_vacation") boolean z3, @C17402n(name = "state") Integer num, @C17402n(name = "shop_id") Long l2) {
        return new IANListingCard(l, str, listingImage, z, z2, z3, num, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IANListingCard)) {
            return false;
        }
        IANListingCard iANListingCard = (IANListingCard) obj;
        return C19383o.m32792b(this.listingId, iANListingCard.listingId) && C19383o.m32792b(this.listingTitle, iANListingCard.listingTitle) && C19383o.m32792b(this.img, iANListingCard.img) && this.isFav == iANListingCard.isFav && this.isInCollections == iANListingCard.isInCollections && this.isVacation == iANListingCard.isVacation && C19383o.m32792b(this.listingState, iANListingCard.listingState) && C19383o.m32792b(this.shopId, iANListingCard.shopId);
    }

    public final ListingImage getImg() {
        return this.img;
    }

    /* renamed from: getListingId  reason: collision with other method in class */
    public final Long m34863getListingId() {
        return this.listingId;
    }

    public ListingImage getListingImage() {
        return this.img;
    }

    public final Integer getListingState() {
        return this.listingState;
    }

    public final String getListingTitle() {
        return this.listingTitle;
    }

    @JsonIgnore
    public List<C8696j> getOnSeenTrackingEvents() {
        return ListingLike.DefaultImpls.getOnSeenTrackingEvents(this);
    }

    public EtsyMoney getPrice() {
        return null;
    }

    /* renamed from: getShopId  reason: collision with other method in class */
    public final Long m34864getShopId() {
        return this.shopId;
    }

    public String getShopName() {
        return null;
    }

    public final boolean getShouldShowRelatedListingsKt() {
        return this.shouldShowRelatedListingsKt;
    }

    public String getTitle() {
        return null;
    }

    @JsonIgnore
    public int getTrackedPosition() {
        return ListingLike.DefaultImpls.getTrackedPosition(this);
    }

    @JsonIgnore
    public String getTrackingName() {
        return ListingLike.DefaultImpls.getTrackingName(this);
    }

    @JsonIgnore
    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        return ListingLike.DefaultImpls.getTrackingParameters(this);
    }

    public String getUrl() {
        return null;
    }

    public int getViewType() {
        return -1;
    }

    public boolean hasCollections() {
        return this.isInCollections;
    }

    public int hashCode() {
        Long l = this.listingId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.listingTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ListingImage listingImage = this.img;
        int hashCode3 = (hashCode2 + (listingImage == null ? 0 : listingImage.hashCode())) * 31;
        boolean z = this.isFav;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.isInCollections;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.isVacation;
        if (!z4) {
            z2 = z4;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        Integer num = this.listingState;
        int hashCode4 = (i4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.shopId;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode4 + i;
    }

    public boolean isAd() {
        return false;
    }

    public final boolean isFav() {
        return this.isFav;
    }

    public boolean isFavorite() {
        return this.isFav;
    }

    public final boolean isInCollections() {
        return this.isInCollections;
    }

    public final boolean isVacation() {
        return this.isVacation;
    }

    public final void setFav(boolean z) {
        this.isFav = z;
    }

    public void setHasCollections(boolean z) {
        this.isInCollections = z;
    }

    public final void setInCollections(boolean z) {
        this.isInCollections = z;
    }

    public void setIsFavorite(boolean z) {
        this.isFav = z;
    }

    @JsonIgnore
    public void setOnSeenTrackingEvents(List<C8696j> list) {
        ListingLike.DefaultImpls.setOnSeenTrackingEvents(this, list);
    }

    public void setShouldShowRelatedListings(boolean z) {
        this.shouldShowRelatedListingsKt = z;
    }

    public final void setShouldShowRelatedListingsKt(boolean z) {
        this.shouldShowRelatedListingsKt = z;
    }

    @JsonIgnore
    public void setTrackedPosition(int i) {
        ListingLike.DefaultImpls.setTrackedPosition(this, i);
    }

    @JsonIgnore
    public void setTrackingName(String str) {
        ListingLike.DefaultImpls.setTrackingName(this, str);
    }

    @JsonIgnore
    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
        ListingLike.DefaultImpls.setTrackingParameters(this, map);
    }

    public boolean shouldShowRelatedListings() {
        return this.shouldShowRelatedListingsKt;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("IANListingCard(listingId=");
        h.append(this.listingId);
        h.append(", listingTitle=");
        h.append(this.listingTitle);
        h.append(", img=");
        h.append(this.img);
        h.append(", isFav=");
        h.append(this.isFav);
        h.append(", isInCollections=");
        h.append(this.isInCollections);
        h.append(", isVacation=");
        h.append(this.isVacation);
        h.append(", listingState=");
        h.append(this.listingState);
        h.append(", shopId=");
        h.append(this.shopId);
        h.append(')');
        return h.toString();
    }

    public EtsyId getListingId() {
        Long l = this.listingId;
        return new EtsyId(l != null ? l.longValue() : 0);
    }

    public EtsyId getShopId() {
        Long l = this.shopId;
        return new EtsyId(l != null ? l.longValue() : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ IANListingCard(java.lang.Long r11, java.lang.String r12, com.etsy.android.lib.models.apiv3.listing.ListingImage r13, boolean r14, boolean r15, boolean r16, java.lang.Integer r17, java.lang.Long r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            r6 = 0
            if (r5 == 0) goto L_0x001f
            r5 = r6
            goto L_0x0020
        L_0x001f:
            r5 = r14
        L_0x0020:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0026
            r7 = r6
            goto L_0x0027
        L_0x0026:
            r7 = r15
        L_0x0027:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x002d
            r8 = r6
            goto L_0x002f
        L_0x002d:
            r8 = r16
        L_0x002f:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0038
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x003a
        L_0x0038:
            r6 = r17
        L_0x003a:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r2 = r18
        L_0x0041:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r7
            r17 = r8
            r18 = r6
            r19 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard.<init>(java.lang.Long, java.lang.String, com.etsy.android.lib.models.apiv3.listing.ListingImage, boolean, boolean, boolean, java.lang.Integer, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
