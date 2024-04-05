package com.paypal.pyplcheckout.pojo;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;
import p650pn.C18417a;

public final class PortableShippingAddressRequest {
    @C18417a("addressLine1")
    private final String addressLine1;
    @C18417a("addressLine2")
    private final String addressLine2;
    @C18417a("addressLine3")
    private final String addressLine3;
    @C18417a("adminArea1")
    private final String adminArea1;
    @C18417a("adminArea2")
    private final String adminArea2;
    @C18417a("adminArea3")
    private final String adminArea3;
    @C18417a("adminArea4")
    private final String adminArea4;
    @C18417a("countryCode")
    private final String countryCode;
    @C18417a("familyName")
    private final String familyName;
    @C18417a("givenName")
    private final String givenName;
    @C18417a("normalize")
    private final Boolean normalize;
    @C18417a("postalCode")
    private final String postalCode;

    public PortableShippingAddressRequest(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        String str12 = str;
        C0048b.m167f(str12, "givenName", str2, "familyName", str3, "countryCode");
        this.givenName = str12;
        this.familyName = str2;
        this.countryCode = str3;
        this.normalize = bool;
        this.addressLine1 = str4;
        this.addressLine2 = str5;
        this.addressLine3 = str6;
        this.adminArea4 = str7;
        this.adminArea3 = str8;
        this.adminArea2 = str9;
        this.adminArea1 = str10;
        this.postalCode = str11;
    }

    public static /* synthetic */ PortableShippingAddressRequest copy$default(PortableShippingAddressRequest portableShippingAddressRequest, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
        PortableShippingAddressRequest portableShippingAddressRequest2 = portableShippingAddressRequest;
        int i2 = i;
        return portableShippingAddressRequest.copy((i2 & 1) != 0 ? portableShippingAddressRequest2.givenName : str, (i2 & 2) != 0 ? portableShippingAddressRequest2.familyName : str2, (i2 & 4) != 0 ? portableShippingAddressRequest2.countryCode : str3, (i2 & 8) != 0 ? portableShippingAddressRequest2.normalize : bool, (i2 & 16) != 0 ? portableShippingAddressRequest2.addressLine1 : str4, (i2 & 32) != 0 ? portableShippingAddressRequest2.addressLine2 : str5, (i2 & 64) != 0 ? portableShippingAddressRequest2.addressLine3 : str6, (i2 & 128) != 0 ? portableShippingAddressRequest2.adminArea4 : str7, (i2 & 256) != 0 ? portableShippingAddressRequest2.adminArea3 : str8, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? portableShippingAddressRequest2.adminArea2 : str9, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? portableShippingAddressRequest2.adminArea1 : str10, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? portableShippingAddressRequest2.postalCode : str11);
    }

    public final String component1() {
        return this.givenName;
    }

    public final String component10() {
        return this.adminArea2;
    }

    public final String component11() {
        return this.adminArea1;
    }

    public final String component12() {
        return this.postalCode;
    }

    public final String component2() {
        return this.familyName;
    }

    public final String component3() {
        return this.countryCode;
    }

    public final Boolean component4() {
        return this.normalize;
    }

    public final String component5() {
        return this.addressLine1;
    }

    public final String component6() {
        return this.addressLine2;
    }

    public final String component7() {
        return this.addressLine3;
    }

    public final String component8() {
        return this.adminArea4;
    }

    public final String component9() {
        return this.adminArea3;
    }

    public final PortableShippingAddressRequest copy(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        C19383o.m32797g(str, "givenName");
        String str12 = str2;
        C19383o.m32797g(str12, "familyName");
        String str13 = str3;
        C19383o.m32797g(str13, "countryCode");
        return new PortableShippingAddressRequest(str, str12, str13, bool, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PortableShippingAddressRequest)) {
            return false;
        }
        PortableShippingAddressRequest portableShippingAddressRequest = (PortableShippingAddressRequest) obj;
        return C19383o.m32792b(this.givenName, portableShippingAddressRequest.givenName) && C19383o.m32792b(this.familyName, portableShippingAddressRequest.familyName) && C19383o.m32792b(this.countryCode, portableShippingAddressRequest.countryCode) && C19383o.m32792b(this.normalize, portableShippingAddressRequest.normalize) && C19383o.m32792b(this.addressLine1, portableShippingAddressRequest.addressLine1) && C19383o.m32792b(this.addressLine2, portableShippingAddressRequest.addressLine2) && C19383o.m32792b(this.addressLine3, portableShippingAddressRequest.addressLine3) && C19383o.m32792b(this.adminArea4, portableShippingAddressRequest.adminArea4) && C19383o.m32792b(this.adminArea3, portableShippingAddressRequest.adminArea3) && C19383o.m32792b(this.adminArea2, portableShippingAddressRequest.adminArea2) && C19383o.m32792b(this.adminArea1, portableShippingAddressRequest.adminArea1) && C19383o.m32792b(this.postalCode, portableShippingAddressRequest.postalCode);
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getAddressLine3() {
        return this.addressLine3;
    }

    public final String getAdminArea1() {
        return this.adminArea1;
    }

    public final String getAdminArea2() {
        return this.adminArea2;
    }

    public final String getAdminArea3() {
        return this.adminArea3;
    }

    public final String getAdminArea4() {
        return this.adminArea4;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getFamilyName() {
        return this.familyName;
    }

    public final String getGivenName() {
        return this.givenName;
    }

    public final Boolean getNormalize() {
        return this.normalize;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.countryCode, C0023f.m105e(this.familyName, this.givenName.hashCode() * 31, 31), 31);
        Boolean bool = this.normalize;
        int i = 0;
        int hashCode = (e + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.addressLine1;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addressLine2;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressLine3;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adminArea4;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.adminArea3;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.adminArea2;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.adminArea1;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.postalCode;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        String str = this.givenName;
        String str2 = this.familyName;
        String str3 = this.countryCode;
        Boolean bool = this.normalize;
        String str4 = this.addressLine1;
        String str5 = this.addressLine2;
        String str6 = this.addressLine3;
        String str7 = this.adminArea4;
        String str8 = this.adminArea3;
        String str9 = this.adminArea2;
        String str10 = this.adminArea1;
        String str11 = this.postalCode;
        StringBuilder f = C0388a.m1050f("PortableShippingAddressRequest(givenName=", str, ", familyName=", str2, ", countryCode=");
        f.append(str3);
        f.append(", normalize=");
        f.append(bool);
        f.append(", addressLine1=");
        C0391c.m1061h(f, str4, ", addressLine2=", str5, ", addressLine3=");
        C0391c.m1061h(f, str6, ", adminArea4=", str7, ", adminArea3=");
        C0391c.m1061h(f, str8, ", adminArea2=", str9, ", adminArea1=");
        return C0073e.m210j(f, str10, ", postalCode=", str11, ")");
    }
}
