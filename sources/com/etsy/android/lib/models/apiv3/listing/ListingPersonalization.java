package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.currency.EtsyMoney;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ListingPersonalization {
    public static final int $stable = 8;
    private final Integer buyerPersonalizationCharCountMax;
    private final Boolean isPersonalizable;
    private final Boolean isRequired;
    private final String personalizationInstructions;
    private final EtsyMoney price;

    public ListingPersonalization() {
        this((Integer) null, (Boolean) null, (Boolean) null, (String) null, (EtsyMoney) null, 31, (DefaultConstructorMarker) null);
    }

    public ListingPersonalization(@C17402n(name = "buyer_personalization_char_count_max") Integer num, @C17402n(name = "is_personalizable") Boolean bool, @C17402n(name = "is_required") Boolean bool2, @C17402n(name = "personalization_instructions") String str, @C17402n(name = "price") EtsyMoney etsyMoney) {
        this.buyerPersonalizationCharCountMax = num;
        this.isPersonalizable = bool;
        this.isRequired = bool2;
        this.personalizationInstructions = str;
        this.price = etsyMoney;
    }

    public static /* synthetic */ ListingPersonalization copy$default(ListingPersonalization listingPersonalization, Integer num, Boolean bool, Boolean bool2, String str, EtsyMoney etsyMoney, int i, Object obj) {
        if ((i & 1) != 0) {
            num = listingPersonalization.buyerPersonalizationCharCountMax;
        }
        if ((i & 2) != 0) {
            bool = listingPersonalization.isPersonalizable;
        }
        Boolean bool3 = bool;
        if ((i & 4) != 0) {
            bool2 = listingPersonalization.isRequired;
        }
        Boolean bool4 = bool2;
        if ((i & 8) != 0) {
            str = listingPersonalization.personalizationInstructions;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            etsyMoney = listingPersonalization.price;
        }
        return listingPersonalization.copy(num, bool3, bool4, str2, etsyMoney);
    }

    public final Integer component1() {
        return this.buyerPersonalizationCharCountMax;
    }

    public final Boolean component2() {
        return this.isPersonalizable;
    }

    public final Boolean component3() {
        return this.isRequired;
    }

    public final String component4() {
        return this.personalizationInstructions;
    }

    public final EtsyMoney component5() {
        return this.price;
    }

    public final ListingPersonalization copy(@C17402n(name = "buyer_personalization_char_count_max") Integer num, @C17402n(name = "is_personalizable") Boolean bool, @C17402n(name = "is_required") Boolean bool2, @C17402n(name = "personalization_instructions") String str, @C17402n(name = "price") EtsyMoney etsyMoney) {
        return new ListingPersonalization(num, bool, bool2, str, etsyMoney);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingPersonalization)) {
            return false;
        }
        ListingPersonalization listingPersonalization = (ListingPersonalization) obj;
        return C19383o.m32792b(this.buyerPersonalizationCharCountMax, listingPersonalization.buyerPersonalizationCharCountMax) && C19383o.m32792b(this.isPersonalizable, listingPersonalization.isPersonalizable) && C19383o.m32792b(this.isRequired, listingPersonalization.isRequired) && C19383o.m32792b(this.personalizationInstructions, listingPersonalization.personalizationInstructions) && C19383o.m32792b(this.price, listingPersonalization.price);
    }

    public final Integer getBuyerPersonalizationCharCountMax() {
        return this.buyerPersonalizationCharCountMax;
    }

    public final String getPersonalizationInstructions() {
        return this.personalizationInstructions;
    }

    public final EtsyMoney getPrice() {
        return this.price;
    }

    public int hashCode() {
        Integer num = this.buyerPersonalizationCharCountMax;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.isPersonalizable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isRequired;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.personalizationInstructions;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        EtsyMoney etsyMoney = this.price;
        if (etsyMoney != null) {
            i = etsyMoney.hashCode();
        }
        return hashCode4 + i;
    }

    public final Boolean isPersonalizable() {
        return this.isPersonalizable;
    }

    public final Boolean isRequired() {
        return this.isRequired;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingPersonalization(buyerPersonalizationCharCountMax=");
        h.append(this.buyerPersonalizationCharCountMax);
        h.append(", isPersonalizable=");
        h.append(this.isPersonalizable);
        h.append(", isRequired=");
        h.append(this.isRequired);
        h.append(", personalizationInstructions=");
        h.append(this.personalizationInstructions);
        h.append(", price=");
        h.append(this.price);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ListingPersonalization(java.lang.Integer r5, java.lang.Boolean r6, java.lang.Boolean r7, java.lang.String r8, com.etsy.android.lib.currency.EtsyMoney r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ListingPersonalization.<init>(java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.String, com.etsy.android.lib.currency.EtsyMoney, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
