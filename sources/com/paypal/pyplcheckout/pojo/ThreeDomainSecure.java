package com.paypal.pyplcheckout.pojo;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ThreeDomainSecure {
    @C18417a("encryptedId")
    private final String encryptedId;
    @C18417a("experience")
    private final String experience;
    @C18417a("method")
    private final String method;
    @C18417a("parameter")
    private final String parameter;
    @C18417a("redirectUrl")
    private final Url redirectUrl;
    @C18417a("status")
    private final String status;

    public ThreeDomainSecure(String str, String str2, Url url, String str3, String str4, String str5) {
        this.status = str;
        this.encryptedId = str2;
        this.redirectUrl = url;
        this.method = str3;
        this.parameter = str4;
        this.experience = str5;
    }

    public static /* synthetic */ ThreeDomainSecure copy$default(ThreeDomainSecure threeDomainSecure, String str, String str2, Url url, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = threeDomainSecure.status;
        }
        if ((i & 2) != 0) {
            str2 = threeDomainSecure.encryptedId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            url = threeDomainSecure.redirectUrl;
        }
        Url url2 = url;
        if ((i & 8) != 0) {
            str3 = threeDomainSecure.method;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = threeDomainSecure.parameter;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = threeDomainSecure.experience;
        }
        return threeDomainSecure.copy(str, str6, url2, str7, str8, str5);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.encryptedId;
    }

    public final Url component3() {
        return this.redirectUrl;
    }

    public final String component4() {
        return this.method;
    }

    public final String component5() {
        return this.parameter;
    }

    public final String component6() {
        return this.experience;
    }

    public final ThreeDomainSecure copy(String str, String str2, Url url, String str3, String str4, String str5) {
        return new ThreeDomainSecure(str, str2, url, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDomainSecure)) {
            return false;
        }
        ThreeDomainSecure threeDomainSecure = (ThreeDomainSecure) obj;
        return C19383o.m32792b(this.status, threeDomainSecure.status) && C19383o.m32792b(this.encryptedId, threeDomainSecure.encryptedId) && C19383o.m32792b(this.redirectUrl, threeDomainSecure.redirectUrl) && C19383o.m32792b(this.method, threeDomainSecure.method) && C19383o.m32792b(this.parameter, threeDomainSecure.parameter) && C19383o.m32792b(this.experience, threeDomainSecure.experience);
    }

    public final String getEncryptedId() {
        return this.encryptedId;
    }

    public final String getExperience() {
        return this.experience;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getParameter() {
        return this.parameter;
    }

    public final Url getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.encryptedId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Url url = this.redirectUrl;
        int hashCode3 = (hashCode2 + (url == null ? 0 : url.hashCode())) * 31;
        String str3 = this.method;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.parameter;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.experience;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        String str = this.status;
        String str2 = this.encryptedId;
        Url url = this.redirectUrl;
        String str3 = this.method;
        String str4 = this.parameter;
        String str5 = this.experience;
        StringBuilder f = C0388a.m1050f("ThreeDomainSecure(status=", str, ", encryptedId=", str2, ", redirectUrl=");
        f.append(url);
        f.append(", method=");
        f.append(str3);
        f.append(", parameter=");
        return C0073e.m210j(f, str4, ", experience=", str5, ")");
    }
}
