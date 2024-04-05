package com.etsy.android.lib.models;

import com.etsy.android.lib.models.datatypes.EtsyId;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ShippingCarrier {
    public static final int $stable = 8;
    private final String carrierId;
    private String displayName;
    private final String providerId;
    private String providerName;
    private final String trackingNum;

    public ShippingCarrier() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public ShippingCarrier(@C17402n(name = "carrier_id") String str, @C17402n(name = "tracking_num") String str2, @C17402n(name = "provider_id") String str3, @C17402n(name = "display_name") String str4, @C17402n(name = "provider_name") String str5) {
        this.carrierId = str;
        this.trackingNum = str2;
        this.providerId = str3;
        this.displayName = str4;
        this.providerName = str5;
    }

    public static /* synthetic */ ShippingCarrier copy$default(ShippingCarrier shippingCarrier, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shippingCarrier.carrierId;
        }
        if ((i & 2) != 0) {
            str2 = shippingCarrier.trackingNum;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = shippingCarrier.providerId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = shippingCarrier.displayName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = shippingCarrier.providerName;
        }
        return shippingCarrier.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.carrierId;
    }

    public final String component2() {
        return this.trackingNum;
    }

    public final String component3() {
        return this.providerId;
    }

    public final String component4() {
        return this.displayName;
    }

    public final String component5() {
        return this.providerName;
    }

    public final ShippingCarrier copy(@C17402n(name = "carrier_id") String str, @C17402n(name = "tracking_num") String str2, @C17402n(name = "provider_id") String str3, @C17402n(name = "display_name") String str4, @C17402n(name = "provider_name") String str5) {
        return new ShippingCarrier(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingCarrier)) {
            return false;
        }
        ShippingCarrier shippingCarrier = (ShippingCarrier) obj;
        return C19383o.m32792b(this.carrierId, shippingCarrier.carrierId) && C19383o.m32792b(this.trackingNum, shippingCarrier.trackingNum) && C19383o.m32792b(this.providerId, shippingCarrier.providerId) && C19383o.m32792b(this.displayName, shippingCarrier.displayName) && C19383o.m32792b(this.providerName, shippingCarrier.providerName);
    }

    public final String getCarrierId() {
        return this.carrierId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final EtsyId getId() {
        String str = this.carrierId;
        if (str == null) {
            str = this.providerId;
        }
        return new EtsyId(str);
    }

    public final String getName() {
        String str = this.providerName;
        if (str != null) {
            return str;
        }
        String str2 = this.displayName;
        return str2 == null ? "" : str2;
    }

    public final String getProviderId() {
        return this.providerId;
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public final String getTrackingNum() {
        return this.trackingNum;
    }

    public int hashCode() {
        String str = this.carrierId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.trackingNum;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.providerId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.providerName;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final void setProviderName(String str) {
        this.providerName = str;
    }

    public String toString() {
        return getName();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShippingCarrier(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.ShippingCarrier.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShippingCarrier(String str) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        C19383o.m32797g(str, "name");
        this.displayName = str;
        this.providerName = str;
    }
}
