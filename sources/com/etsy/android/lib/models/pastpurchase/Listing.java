package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class Listing {
    public static final int $stable = 0;
    private final Boolean hasVariations;
    private final Boolean isDigital;
    private final Boolean isPersonalizable;
    private final Boolean isVintage;
    private final Integer listingId;
    private final MainImage mainImage;
    private final Integer state;
    private final String title;

    public Listing(@C17402n(name = "listing_id") Integer num, @C17402n(name = "has_variations") Boolean bool, @C17402n(name = "is_personalizable") Boolean bool2, @C17402n(name = "is_digital") Boolean bool3, @C17402n(name = "state") Integer num2, @C17402n(name = "title") String str, @C17402n(name = "is_vintage") Boolean bool4, @C17402n(name = "main_image") MainImage mainImage2) {
        this.listingId = num;
        this.hasVariations = bool;
        this.isPersonalizable = bool2;
        this.isDigital = bool3;
        this.state = num2;
        this.title = str;
        this.isVintage = bool4;
        this.mainImage = mainImage2;
    }

    public static /* synthetic */ Listing copy$default(Listing listing, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, String str, Boolean bool4, MainImage mainImage2, int i, Object obj) {
        Listing listing2 = listing;
        int i2 = i;
        return listing.copy((i2 & 1) != 0 ? listing2.listingId : num, (i2 & 2) != 0 ? listing2.hasVariations : bool, (i2 & 4) != 0 ? listing2.isPersonalizable : bool2, (i2 & 8) != 0 ? listing2.isDigital : bool3, (i2 & 16) != 0 ? listing2.state : num2, (i2 & 32) != 0 ? listing2.title : str, (i2 & 64) != 0 ? listing2.isVintage : bool4, (i2 & 128) != 0 ? listing2.mainImage : mainImage2);
    }

    public final Integer component1() {
        return this.listingId;
    }

    public final Boolean component2() {
        return this.hasVariations;
    }

    public final Boolean component3() {
        return this.isPersonalizable;
    }

    public final Boolean component4() {
        return this.isDigital;
    }

    public final Integer component5() {
        return this.state;
    }

    public final String component6() {
        return this.title;
    }

    public final Boolean component7() {
        return this.isVintage;
    }

    public final MainImage component8() {
        return this.mainImage;
    }

    public final Listing copy(@C17402n(name = "listing_id") Integer num, @C17402n(name = "has_variations") Boolean bool, @C17402n(name = "is_personalizable") Boolean bool2, @C17402n(name = "is_digital") Boolean bool3, @C17402n(name = "state") Integer num2, @C17402n(name = "title") String str, @C17402n(name = "is_vintage") Boolean bool4, @C17402n(name = "main_image") MainImage mainImage2) {
        return new Listing(num, bool, bool2, bool3, num2, str, bool4, mainImage2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Listing)) {
            return false;
        }
        Listing listing = (Listing) obj;
        return C19383o.m32792b(this.listingId, listing.listingId) && C19383o.m32792b(this.hasVariations, listing.hasVariations) && C19383o.m32792b(this.isPersonalizable, listing.isPersonalizable) && C19383o.m32792b(this.isDigital, listing.isDigital) && C19383o.m32792b(this.state, listing.state) && C19383o.m32792b(this.title, listing.title) && C19383o.m32792b(this.isVintage, listing.isVintage) && C19383o.m32792b(this.mainImage, listing.mainImage);
    }

    public final Boolean getHasVariations() {
        return this.hasVariations;
    }

    public final Integer getListingId() {
        return this.listingId;
    }

    public final MainImage getMainImage() {
        return this.mainImage;
    }

    public final Integer getState() {
        return this.state;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.listingId;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.hasVariations;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isPersonalizable;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isDigital;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.state;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.title;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool4 = this.isVintage;
        int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        MainImage mainImage2 = this.mainImage;
        if (mainImage2 != null) {
            i = mainImage2.hashCode();
        }
        return hashCode7 + i;
    }

    public final Boolean isDigital() {
        return this.isDigital;
    }

    public final Boolean isPersonalizable() {
        return this.isPersonalizable;
    }

    public final Boolean isVintage() {
        return this.isVintage;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Listing(listingId=");
        h.append(this.listingId);
        h.append(", hasVariations=");
        h.append(this.hasVariations);
        h.append(", isPersonalizable=");
        h.append(this.isPersonalizable);
        h.append(", isDigital=");
        h.append(this.isDigital);
        h.append(", state=");
        h.append(this.state);
        h.append(", title=");
        h.append(this.title);
        h.append(", isVintage=");
        h.append(this.isVintage);
        h.append(", mainImage=");
        h.append(this.mainImage);
        h.append(')');
        return h.toString();
    }
}
