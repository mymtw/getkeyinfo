package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ShopsManufacturer {
    public static final int $stable = 0;
    private final String createDate;
    private final String description;
    private final String geonameId;
    private final String location;
    private final Long manufacturerId;
    private final String name;
    private final String udpateDate;

    public ShopsManufacturer() {
        this((Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public ShopsManufacturer(@C17402n(name = "manufacturer_id") Long l, @C17402n(name = "name") String str, @C17402n(name = "description") String str2, @C17402n(name = "location") String str3, @C17402n(name = "geoname_id") String str4, @C17402n(name = "create_date") String str5, @C17402n(name = "update_date") String str6) {
        this.manufacturerId = l;
        this.name = str;
        this.description = str2;
        this.location = str3;
        this.geonameId = str4;
        this.createDate = str5;
        this.udpateDate = str6;
    }

    public static /* synthetic */ ShopsManufacturer copy$default(ShopsManufacturer shopsManufacturer, Long l, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            l = shopsManufacturer.manufacturerId;
        }
        if ((i & 2) != 0) {
            str = shopsManufacturer.name;
        }
        String str7 = str;
        if ((i & 4) != 0) {
            str2 = shopsManufacturer.description;
        }
        String str8 = str2;
        if ((i & 8) != 0) {
            str3 = shopsManufacturer.location;
        }
        String str9 = str3;
        if ((i & 16) != 0) {
            str4 = shopsManufacturer.geonameId;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = shopsManufacturer.createDate;
        }
        String str11 = str5;
        if ((i & 64) != 0) {
            str6 = shopsManufacturer.udpateDate;
        }
        return shopsManufacturer.copy(l, str7, str8, str9, str10, str11, str6);
    }

    public final Long component1() {
        return this.manufacturerId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.location;
    }

    public final String component5() {
        return this.geonameId;
    }

    public final String component6() {
        return this.createDate;
    }

    public final String component7() {
        return this.udpateDate;
    }

    public final ShopsManufacturer copy(@C17402n(name = "manufacturer_id") Long l, @C17402n(name = "name") String str, @C17402n(name = "description") String str2, @C17402n(name = "location") String str3, @C17402n(name = "geoname_id") String str4, @C17402n(name = "create_date") String str5, @C17402n(name = "update_date") String str6) {
        return new ShopsManufacturer(l, str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopsManufacturer)) {
            return false;
        }
        ShopsManufacturer shopsManufacturer = (ShopsManufacturer) obj;
        return C19383o.m32792b(this.manufacturerId, shopsManufacturer.manufacturerId) && C19383o.m32792b(this.name, shopsManufacturer.name) && C19383o.m32792b(this.description, shopsManufacturer.description) && C19383o.m32792b(this.location, shopsManufacturer.location) && C19383o.m32792b(this.geonameId, shopsManufacturer.geonameId) && C19383o.m32792b(this.createDate, shopsManufacturer.createDate) && C19383o.m32792b(this.udpateDate, shopsManufacturer.udpateDate);
    }

    public final String getCreateDate() {
        return this.createDate;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getGeonameId() {
        return this.geonameId;
    }

    public final String getLocation() {
        return this.location;
    }

    public final Long getManufacturerId() {
        return this.manufacturerId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUdpateDate() {
        return this.udpateDate;
    }

    public int hashCode() {
        Long l = this.manufacturerId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.location;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.geonameId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.createDate;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.udpateDate;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopsManufacturer(manufacturerId=");
        h.append(this.manufacturerId);
        h.append(", name=");
        h.append(this.name);
        h.append(", description=");
        h.append(this.description);
        h.append(", location=");
        h.append(this.location);
        h.append(", geonameId=");
        h.append(this.geonameId);
        h.append(", createDate=");
        h.append(this.createDate);
        h.append(", udpateDate=");
        return C0391c.m1057c(h, this.udpateDate, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShopsManufacturer(java.lang.Long r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ShopsManufacturer.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
