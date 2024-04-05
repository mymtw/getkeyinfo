package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ThreeDSContingencyData {
    @C18417a("causeName")
    private final String causeName;
    @C18417a("name")
    private final String name;
    @C18417a("resolution")
    private final ThreeDsResolution resolution;

    public ThreeDSContingencyData(String str, String str2, ThreeDsResolution threeDsResolution) {
        this.name = str;
        this.causeName = str2;
        this.resolution = threeDsResolution;
    }

    public static /* synthetic */ ThreeDSContingencyData copy$default(ThreeDSContingencyData threeDSContingencyData, String str, String str2, ThreeDsResolution threeDsResolution, int i, Object obj) {
        if ((i & 1) != 0) {
            str = threeDSContingencyData.name;
        }
        if ((i & 2) != 0) {
            str2 = threeDSContingencyData.causeName;
        }
        if ((i & 4) != 0) {
            threeDsResolution = threeDSContingencyData.resolution;
        }
        return threeDSContingencyData.copy(str, str2, threeDsResolution);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.causeName;
    }

    public final ThreeDsResolution component3() {
        return this.resolution;
    }

    public final ThreeDSContingencyData copy(String str, String str2, ThreeDsResolution threeDsResolution) {
        return new ThreeDSContingencyData(str, str2, threeDsResolution);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDSContingencyData)) {
            return false;
        }
        ThreeDSContingencyData threeDSContingencyData = (ThreeDSContingencyData) obj;
        return C19383o.m32792b(this.name, threeDSContingencyData.name) && C19383o.m32792b(this.causeName, threeDSContingencyData.causeName) && C19383o.m32792b(this.resolution, threeDSContingencyData.resolution);
    }

    public final String getCauseName() {
        return this.causeName;
    }

    public final String getName() {
        return this.name;
    }

    public final ThreeDsResolution getResolution() {
        return this.resolution;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.causeName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ThreeDsResolution threeDsResolution = this.resolution;
        if (threeDsResolution != null) {
            i = threeDsResolution.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.causeName;
        ThreeDsResolution threeDsResolution = this.resolution;
        StringBuilder f = C0388a.m1050f("ThreeDSContingencyData(name=", str, ", causeName=", str2, ", resolution=");
        f.append(threeDsResolution);
        f.append(")");
        return f.toString();
    }
}
