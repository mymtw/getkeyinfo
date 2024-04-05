package com.paypal.pyplcheckout.pojo;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ThreeDSJwtSpecification {
    @C18417a("jwtDuration")
    private final String jwtDuration;
    @C18417a("jwtIssuer")
    private final String jwtIssuer;
    @C18417a("jwtOrgUnitId")
    private final String jwtOrgUnitId;
    @C18417a("type")
    private final String type;

    public ThreeDSJwtSpecification(String str, String str2, String str3, String str4) {
        this.jwtIssuer = str;
        this.jwtOrgUnitId = str2;
        this.type = str3;
        this.jwtDuration = str4;
    }

    public static /* synthetic */ ThreeDSJwtSpecification copy$default(ThreeDSJwtSpecification threeDSJwtSpecification, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = threeDSJwtSpecification.jwtIssuer;
        }
        if ((i & 2) != 0) {
            str2 = threeDSJwtSpecification.jwtOrgUnitId;
        }
        if ((i & 4) != 0) {
            str3 = threeDSJwtSpecification.type;
        }
        if ((i & 8) != 0) {
            str4 = threeDSJwtSpecification.jwtDuration;
        }
        return threeDSJwtSpecification.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.jwtIssuer;
    }

    public final String component2() {
        return this.jwtOrgUnitId;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.jwtDuration;
    }

    public final ThreeDSJwtSpecification copy(String str, String str2, String str3, String str4) {
        return new ThreeDSJwtSpecification(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDSJwtSpecification)) {
            return false;
        }
        ThreeDSJwtSpecification threeDSJwtSpecification = (ThreeDSJwtSpecification) obj;
        return C19383o.m32792b(this.jwtIssuer, threeDSJwtSpecification.jwtIssuer) && C19383o.m32792b(this.jwtOrgUnitId, threeDSJwtSpecification.jwtOrgUnitId) && C19383o.m32792b(this.type, threeDSJwtSpecification.type) && C19383o.m32792b(this.jwtDuration, threeDSJwtSpecification.jwtDuration);
    }

    public final String getJwtDuration() {
        return this.jwtDuration;
    }

    public final String getJwtIssuer() {
        return this.jwtIssuer;
    }

    public final String getJwtOrgUnitId() {
        return this.jwtOrgUnitId;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.jwtIssuer;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.jwtOrgUnitId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.jwtDuration;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.jwtIssuer;
        String str2 = this.jwtOrgUnitId;
        return C0073e.m210j(C0388a.m1050f("ThreeDSJwtSpecification(jwtIssuer=", str, ", jwtOrgUnitId=", str2, ", type="), this.type, ", jwtDuration=", this.jwtDuration, ")");
    }
}
