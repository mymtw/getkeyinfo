package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ThreeDSContingencyContext {
    @C18417a("deviceDataCollectionUrl")
    private final Url deviceDataCollectionUrl;
    @C18417a("jwtSpecification")
    private final ThreeDSJwtSpecification jwtSpecification;
    @C18417a("reason")
    private final String reason;
    @C18417a("referenceId")
    private final String referenceId;
    @C18417a("source")
    private final String source;

    public ThreeDSContingencyContext(String str, String str2, String str3, Url url, ThreeDSJwtSpecification threeDSJwtSpecification) {
        C19383o.m32797g(threeDSJwtSpecification, "jwtSpecification");
        this.source = str;
        this.reason = str2;
        this.referenceId = str3;
        this.deviceDataCollectionUrl = url;
        this.jwtSpecification = threeDSJwtSpecification;
    }

    public static /* synthetic */ ThreeDSContingencyContext copy$default(ThreeDSContingencyContext threeDSContingencyContext, String str, String str2, String str3, Url url, ThreeDSJwtSpecification threeDSJwtSpecification, int i, Object obj) {
        if ((i & 1) != 0) {
            str = threeDSContingencyContext.source;
        }
        if ((i & 2) != 0) {
            str2 = threeDSContingencyContext.reason;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = threeDSContingencyContext.referenceId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            url = threeDSContingencyContext.deviceDataCollectionUrl;
        }
        Url url2 = url;
        if ((i & 16) != 0) {
            threeDSJwtSpecification = threeDSContingencyContext.jwtSpecification;
        }
        return threeDSContingencyContext.copy(str, str4, str5, url2, threeDSJwtSpecification);
    }

    public final String component1() {
        return this.source;
    }

    public final String component2() {
        return this.reason;
    }

    public final String component3() {
        return this.referenceId;
    }

    public final Url component4() {
        return this.deviceDataCollectionUrl;
    }

    public final ThreeDSJwtSpecification component5() {
        return this.jwtSpecification;
    }

    public final ThreeDSContingencyContext copy(String str, String str2, String str3, Url url, ThreeDSJwtSpecification threeDSJwtSpecification) {
        C19383o.m32797g(threeDSJwtSpecification, "jwtSpecification");
        return new ThreeDSContingencyContext(str, str2, str3, url, threeDSJwtSpecification);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDSContingencyContext)) {
            return false;
        }
        ThreeDSContingencyContext threeDSContingencyContext = (ThreeDSContingencyContext) obj;
        return C19383o.m32792b(this.source, threeDSContingencyContext.source) && C19383o.m32792b(this.reason, threeDSContingencyContext.reason) && C19383o.m32792b(this.referenceId, threeDSContingencyContext.referenceId) && C19383o.m32792b(this.deviceDataCollectionUrl, threeDSContingencyContext.deviceDataCollectionUrl) && C19383o.m32792b(this.jwtSpecification, threeDSContingencyContext.jwtSpecification);
    }

    public final Url getDeviceDataCollectionUrl() {
        return this.deviceDataCollectionUrl;
    }

    public final ThreeDSJwtSpecification getJwtSpecification() {
        return this.jwtSpecification;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.source;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reason;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.referenceId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Url url = this.deviceDataCollectionUrl;
        if (url != null) {
            i = url.hashCode();
        }
        return this.jwtSpecification.hashCode() + ((hashCode3 + i) * 31);
    }

    public String toString() {
        String str = this.source;
        String str2 = this.reason;
        String str3 = this.referenceId;
        Url url = this.deviceDataCollectionUrl;
        ThreeDSJwtSpecification threeDSJwtSpecification = this.jwtSpecification;
        StringBuilder f = C0388a.m1050f("ThreeDSContingencyContext(source=", str, ", reason=", str2, ", referenceId=");
        f.append(str3);
        f.append(", deviceDataCollectionUrl=");
        f.append(url);
        f.append(", jwtSpecification=");
        f.append(threeDSJwtSpecification);
        f.append(")");
        return f.toString();
    }
}
