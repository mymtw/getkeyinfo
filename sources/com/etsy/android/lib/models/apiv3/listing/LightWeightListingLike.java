package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

public final class LightWeightListingLike implements ListingLike {
    public static final int $stable = 8;
    private boolean hasCollections;
    private boolean isFavorite;
    private final EtsyId listingId;
    private final ListingImage listingImage;
    private final EtsyMoney price;
    private final EtsyId shopId;
    private final String shopName;
    private boolean shouldShowRelatedListings = true;
    private final String title;
    private final String url;

    public LightWeightListingLike(EtsyId etsyId, String str, EtsyMoney etsyMoney, String str2, ListingImage listingImage2, String str3, EtsyId etsyId2, boolean z, boolean z2) {
        C19383o.m32797g(etsyId, "listingId");
        this.listingId = etsyId;
        this.title = str;
        this.price = etsyMoney;
        this.url = str2;
        this.listingImage = listingImage2;
        this.shopName = str3;
        this.shopId = etsyId2;
        this.isFavorite = z;
        this.hasCollections = z2;
    }

    private final EtsyId component1() {
        return this.listingId;
    }

    private final String component2() {
        return this.title;
    }

    private final EtsyMoney component3() {
        return this.price;
    }

    private final String component4() {
        return this.url;
    }

    private final ListingImage component5() {
        return this.listingImage;
    }

    private final String component6() {
        return this.shopName;
    }

    private final EtsyId component7() {
        return this.shopId;
    }

    private final boolean component8() {
        return this.isFavorite;
    }

    private final boolean component9() {
        return this.hasCollections;
    }

    public static /* synthetic */ LightWeightListingLike copy$default(LightWeightListingLike lightWeightListingLike, EtsyId etsyId, String str, EtsyMoney etsyMoney, String str2, ListingImage listingImage2, String str3, EtsyId etsyId2, boolean z, boolean z2, int i, Object obj) {
        LightWeightListingLike lightWeightListingLike2 = lightWeightListingLike;
        int i2 = i;
        return lightWeightListingLike.copy((i2 & 1) != 0 ? lightWeightListingLike2.listingId : etsyId, (i2 & 2) != 0 ? lightWeightListingLike2.title : str, (i2 & 4) != 0 ? lightWeightListingLike2.price : etsyMoney, (i2 & 8) != 0 ? lightWeightListingLike2.url : str2, (i2 & 16) != 0 ? lightWeightListingLike2.listingImage : listingImage2, (i2 & 32) != 0 ? lightWeightListingLike2.shopName : str3, (i2 & 64) != 0 ? lightWeightListingLike2.shopId : etsyId2, (i2 & 128) != 0 ? lightWeightListingLike2.isFavorite : z, (i2 & 256) != 0 ? lightWeightListingLike2.hasCollections : z2);
    }

    public final LightWeightListingLike copy(EtsyId etsyId, String str, EtsyMoney etsyMoney, String str2, ListingImage listingImage2, String str3, EtsyId etsyId2, boolean z, boolean z2) {
        C19383o.m32797g(etsyId, "listingId");
        return new LightWeightListingLike(etsyId, str, etsyMoney, str2, listingImage2, str3, etsyId2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightWeightListingLike)) {
            return false;
        }
        LightWeightListingLike lightWeightListingLike = (LightWeightListingLike) obj;
        return C19383o.m32792b(this.listingId, lightWeightListingLike.listingId) && C19383o.m32792b(this.title, lightWeightListingLike.title) && C19383o.m32792b(this.price, lightWeightListingLike.price) && C19383o.m32792b(this.url, lightWeightListingLike.url) && C19383o.m32792b(this.listingImage, lightWeightListingLike.listingImage) && C19383o.m32792b(this.shopName, lightWeightListingLike.shopName) && C19383o.m32792b(this.shopId, lightWeightListingLike.shopId) && this.isFavorite == lightWeightListingLike.isFavorite && this.hasCollections == lightWeightListingLike.hasCollections;
    }

    public EtsyId getListingId() {
        return this.listingId;
    }

    public ListingImage getListingImage() {
        return this.listingImage;
    }

    @JsonIgnore
    public List<C8696j> getOnSeenTrackingEvents() {
        return ListingLike.DefaultImpls.getOnSeenTrackingEvents(this);
    }

    public EtsyMoney getPrice() {
        return this.price;
    }

    public EtsyId getShopId() {
        return this.shopId;
    }

    public String getShopName() {
        return this.shopName;
    }

    public String getTitle() {
        return this.title;
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
        return this.url;
    }

    public int getViewType() {
        return -1;
    }

    public boolean hasCollections() {
        return this.hasCollections;
    }

    public int hashCode() {
        int hashCode = this.listingId.hashCode() * 31;
        String str = this.title;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EtsyMoney etsyMoney = this.price;
        int hashCode3 = (hashCode2 + (etsyMoney == null ? 0 : etsyMoney.hashCode())) * 31;
        String str2 = this.url;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ListingImage listingImage2 = this.listingImage;
        int hashCode5 = (hashCode4 + (listingImage2 == null ? 0 : listingImage2.hashCode())) * 31;
        String str3 = this.shopName;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EtsyId etsyId = this.shopId;
        if (etsyId != null) {
            i = etsyId.hashCode();
        }
        int i2 = (hashCode6 + i) * 31;
        boolean z = this.isFavorite;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.hasCollections;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public boolean isAd() {
        return false;
    }

    public boolean isFavorite() {
        return this.isFavorite;
    }

    public void setHasCollections(boolean z) {
        this.hasCollections = z;
    }

    public void setIsFavorite(boolean z) {
        this.isFavorite = z;
    }

    @JsonIgnore
    public void setOnSeenTrackingEvents(List<C8696j> list) {
        ListingLike.DefaultImpls.setOnSeenTrackingEvents(this, list);
    }

    public void setShouldShowRelatedListings(boolean z) {
        this.shouldShowRelatedListings = z;
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
        return this.shouldShowRelatedListings;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("LightWeightListingLike(listingId=");
        h.append(this.listingId);
        h.append(", title=");
        h.append(this.title);
        h.append(", price=");
        h.append(this.price);
        h.append(", url=");
        h.append(this.url);
        h.append(", listingImage=");
        h.append(this.listingImage);
        h.append(", shopName=");
        h.append(this.shopName);
        h.append(", shopId=");
        h.append(this.shopId);
        h.append(", isFavorite=");
        h.append(this.isFavorite);
        h.append(", hasCollections=");
        return C0391c.m1058d(h, this.hasCollections, ')');
    }
}
