package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class PastPurchaseListing {
    public static final int $stable = 0;
    private final Boolean hasVariations;
    private final boolean isDigital;
    private final boolean isPersonalizable;
    private final boolean isVintage;
    private final long listingId;
    private final PastPurchasesReceiptListingState state;
    private final String title;

    public PastPurchaseListing() {
        this(0, (String) null, false, (Boolean) null, false, (PastPurchasesReceiptListingState) null, false, 127, (DefaultConstructorMarker) null);
    }

    public PastPurchaseListing(@C17402n(name = "listing_id") long j, @C17402n(name = "title") String str, @C17402n(name = "is_personalizable") boolean z, @C17402n(name = "has_variations") Boolean bool, @C17402n(name = "is_digital") boolean z2, @C17402n(name = "state") PastPurchasesReceiptListingState pastPurchasesReceiptListingState, @C17402n(name = "is_vintage") boolean z3) {
        this.listingId = j;
        this.title = str;
        this.isPersonalizable = z;
        this.hasVariations = bool;
        this.isDigital = z2;
        this.state = pastPurchasesReceiptListingState;
        this.isVintage = z3;
    }

    public static /* synthetic */ PastPurchaseListing copy$default(PastPurchaseListing pastPurchaseListing, long j, String str, boolean z, Boolean bool, boolean z2, PastPurchasesReceiptListingState pastPurchasesReceiptListingState, boolean z3, int i, Object obj) {
        PastPurchaseListing pastPurchaseListing2 = pastPurchaseListing;
        return pastPurchaseListing.copy((i & 1) != 0 ? pastPurchaseListing2.listingId : j, (i & 2) != 0 ? pastPurchaseListing2.title : str, (i & 4) != 0 ? pastPurchaseListing2.isPersonalizable : z, (i & 8) != 0 ? pastPurchaseListing2.hasVariations : bool, (i & 16) != 0 ? pastPurchaseListing2.isDigital : z2, (i & 32) != 0 ? pastPurchaseListing2.state : pastPurchasesReceiptListingState, (i & 64) != 0 ? pastPurchaseListing2.isVintage : z3);
    }

    public final long component1() {
        return this.listingId;
    }

    public final String component2() {
        return this.title;
    }

    public final boolean component3() {
        return this.isPersonalizable;
    }

    public final Boolean component4() {
        return this.hasVariations;
    }

    public final boolean component5() {
        return this.isDigital;
    }

    public final PastPurchasesReceiptListingState component6() {
        return this.state;
    }

    public final boolean component7() {
        return this.isVintage;
    }

    public final PastPurchaseListing copy(@C17402n(name = "listing_id") long j, @C17402n(name = "title") String str, @C17402n(name = "is_personalizable") boolean z, @C17402n(name = "has_variations") Boolean bool, @C17402n(name = "is_digital") boolean z2, @C17402n(name = "state") PastPurchasesReceiptListingState pastPurchasesReceiptListingState, @C17402n(name = "is_vintage") boolean z3) {
        return new PastPurchaseListing(j, str, z, bool, z2, pastPurchasesReceiptListingState, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PastPurchaseListing)) {
            return false;
        }
        PastPurchaseListing pastPurchaseListing = (PastPurchaseListing) obj;
        return this.listingId == pastPurchaseListing.listingId && C19383o.m32792b(this.title, pastPurchaseListing.title) && this.isPersonalizable == pastPurchaseListing.isPersonalizable && C19383o.m32792b(this.hasVariations, pastPurchaseListing.hasVariations) && this.isDigital == pastPurchaseListing.isDigital && this.state == pastPurchaseListing.state && this.isVintage == pastPurchaseListing.isVintage;
    }

    public final Boolean getHasVariations() {
        return this.hasVariations;
    }

    public final long getListingId() {
        return this.listingId;
    }

    public final PastPurchasesReceiptListingState getState() {
        return this.state;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.listingId) * 31;
        String str = this.title;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.isPersonalizable;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        Boolean bool = this.hasVariations;
        int hashCode3 = (i2 + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z3 = this.isDigital;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode3 + (z3 ? 1 : 0)) * 31;
        PastPurchasesReceiptListingState pastPurchasesReceiptListingState = this.state;
        if (pastPurchasesReceiptListingState != null) {
            i = pastPurchasesReceiptListingState.hashCode();
        }
        int i4 = (i3 + i) * 31;
        boolean z4 = this.isVintage;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public final boolean isDigital() {
        return this.isDigital;
    }

    public final boolean isPersonalizable() {
        return this.isPersonalizable;
    }

    public final boolean isVintage() {
        return this.isVintage;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PastPurchaseListing(listingId=");
        h.append(this.listingId);
        h.append(", title=");
        h.append(this.title);
        h.append(", isPersonalizable=");
        h.append(this.isPersonalizable);
        h.append(", hasVariations=");
        h.append(this.hasVariations);
        h.append(", isDigital=");
        h.append(this.isDigital);
        h.append(", state=");
        h.append(this.state);
        h.append(", isVintage=");
        return C0391c.m1058d(h, this.isVintage, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PastPurchaseListing(long r10, java.lang.String r12, boolean r13, java.lang.Boolean r14, boolean r15, com.etsy.android.lib.models.pastpurchase.PastPurchasesReceiptListingState r16, boolean r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18 & 1
            if (r0 == 0) goto L_0x0007
            r0 = 0
            goto L_0x0008
        L_0x0007:
            r0 = r10
        L_0x0008:
            r2 = r18 & 2
            r3 = 0
            if (r2 == 0) goto L_0x000f
            r2 = r3
            goto L_0x0010
        L_0x000f:
            r2 = r12
        L_0x0010:
            r4 = r18 & 4
            r5 = 0
            if (r4 == 0) goto L_0x0017
            r4 = r5
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r6 = r18 & 8
            if (r6 == 0) goto L_0x001f
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            goto L_0x0020
        L_0x001f:
            r6 = r14
        L_0x0020:
            r7 = r18 & 16
            if (r7 == 0) goto L_0x0026
            r7 = r5
            goto L_0x0027
        L_0x0026:
            r7 = r15
        L_0x0027:
            r8 = r18 & 32
            if (r8 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r3 = r16
        L_0x002e:
            r8 = r18 & 64
            if (r8 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r5 = r17
        L_0x0035:
            r10 = r9
            r11 = r0
            r13 = r2
            r14 = r4
            r15 = r6
            r16 = r7
            r17 = r3
            r18 = r5
            r10.<init>(r11, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.pastpurchase.PastPurchaseListing.<init>(long, java.lang.String, boolean, java.lang.Boolean, boolean, com.etsy.android.lib.models.pastpurchase.PastPurchasesReceiptListingState, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
