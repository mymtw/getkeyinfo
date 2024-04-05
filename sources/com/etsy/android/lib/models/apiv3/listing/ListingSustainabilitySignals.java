package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ListingSustainabilitySignals {
    public static final int $stable = 0;
    private final Boolean isDigital;
    private final Boolean isHandmade;
    private final Boolean isOrganic;
    private final Boolean isRecycled;
    private final Boolean isVintage;
    private final String location;

    public ListingSustainabilitySignals() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public ListingSustainabilitySignals(@C17402n(name = "is_digital") Boolean bool, @C17402n(name = "is_handmade") Boolean bool2, @C17402n(name = "is_organic") Boolean bool3, @C17402n(name = "is_recycled") Boolean bool4, @C17402n(name = "is_vintage") Boolean bool5, @C17402n(name = "location") String str) {
        this.isDigital = bool;
        this.isHandmade = bool2;
        this.isOrganic = bool3;
        this.isRecycled = bool4;
        this.isVintage = bool5;
        this.location = str;
    }

    public static /* synthetic */ ListingSustainabilitySignals copy$default(ListingSustainabilitySignals listingSustainabilitySignals, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = listingSustainabilitySignals.isDigital;
        }
        if ((i & 2) != 0) {
            bool2 = listingSustainabilitySignals.isHandmade;
        }
        Boolean bool6 = bool2;
        if ((i & 4) != 0) {
            bool3 = listingSustainabilitySignals.isOrganic;
        }
        Boolean bool7 = bool3;
        if ((i & 8) != 0) {
            bool4 = listingSustainabilitySignals.isRecycled;
        }
        Boolean bool8 = bool4;
        if ((i & 16) != 0) {
            bool5 = listingSustainabilitySignals.isVintage;
        }
        Boolean bool9 = bool5;
        if ((i & 32) != 0) {
            str = listingSustainabilitySignals.location;
        }
        return listingSustainabilitySignals.copy(bool, bool6, bool7, bool8, bool9, str);
    }

    public final Boolean component1() {
        return this.isDigital;
    }

    public final Boolean component2() {
        return this.isHandmade;
    }

    public final Boolean component3() {
        return this.isOrganic;
    }

    public final Boolean component4() {
        return this.isRecycled;
    }

    public final Boolean component5() {
        return this.isVintage;
    }

    public final String component6() {
        return this.location;
    }

    public final ListingSustainabilitySignals copy(@C17402n(name = "is_digital") Boolean bool, @C17402n(name = "is_handmade") Boolean bool2, @C17402n(name = "is_organic") Boolean bool3, @C17402n(name = "is_recycled") Boolean bool4, @C17402n(name = "is_vintage") Boolean bool5, @C17402n(name = "location") String str) {
        return new ListingSustainabilitySignals(bool, bool2, bool3, bool4, bool5, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingSustainabilitySignals)) {
            return false;
        }
        ListingSustainabilitySignals listingSustainabilitySignals = (ListingSustainabilitySignals) obj;
        return C19383o.m32792b(this.isDigital, listingSustainabilitySignals.isDigital) && C19383o.m32792b(this.isHandmade, listingSustainabilitySignals.isHandmade) && C19383o.m32792b(this.isOrganic, listingSustainabilitySignals.isOrganic) && C19383o.m32792b(this.isRecycled, listingSustainabilitySignals.isRecycled) && C19383o.m32792b(this.isVintage, listingSustainabilitySignals.isVintage) && C19383o.m32792b(this.location, listingSustainabilitySignals.location);
    }

    public final String getLocation() {
        return this.location;
    }

    public int hashCode() {
        Boolean bool = this.isDigital;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isHandmade;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isOrganic;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isRecycled;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isVintage;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str = this.location;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode5 + i;
    }

    public final Boolean isDigital() {
        return this.isDigital;
    }

    public final Boolean isHandmade() {
        return this.isHandmade;
    }

    public final Boolean isOrganic() {
        return this.isOrganic;
    }

    public final Boolean isRecycled() {
        return this.isRecycled;
    }

    public final Boolean isVintage() {
        return this.isVintage;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingSustainabilitySignals(isDigital=");
        h.append(this.isDigital);
        h.append(", isHandmade=");
        h.append(this.isHandmade);
        h.append(", isOrganic=");
        h.append(this.isOrganic);
        h.append(", isRecycled=");
        h.append(this.isRecycled);
        h.append(", isVintage=");
        h.append(this.isVintage);
        h.append(", location=");
        return C0391c.m1057c(h, this.location, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ListingSustainabilitySignals(java.lang.Boolean r6, java.lang.Boolean r7, java.lang.Boolean r8, java.lang.Boolean r9, java.lang.Boolean r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ListingSustainabilitySignals.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
