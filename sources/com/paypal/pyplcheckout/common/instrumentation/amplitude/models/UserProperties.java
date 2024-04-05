package com.paypal.pyplcheckout.common.instrumentation.amplitude.models;

import android.support.p013v4.media.C0073e;
import com.paypal.pyplcheckout.utils.IgnoreGeneratedTestReport;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

@IgnoreGeneratedTestReport
public final class UserProperties {
    @C18417a("device_country")
    private final String deviceCountry;
    @C18417a("display_density")
    private final String displayDensity;
    @C18417a("ip_country")
    private final String ipCountry;
    @C18417a("is_accessibility_enabled")
    private final boolean isAccessibilityEnabled;

    public UserProperties(boolean z, String str, String str2, String str3) {
        C19383o.m32797g(str, "displayDensity");
        this.isAccessibilityEnabled = z;
        this.displayDensity = str;
        this.ipCountry = str2;
        this.deviceCountry = str3;
    }

    public static /* synthetic */ UserProperties copy$default(UserProperties userProperties, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = userProperties.isAccessibilityEnabled;
        }
        if ((i & 2) != 0) {
            str = userProperties.displayDensity;
        }
        if ((i & 4) != 0) {
            str2 = userProperties.ipCountry;
        }
        if ((i & 8) != 0) {
            str3 = userProperties.deviceCountry;
        }
        return userProperties.copy(z, str, str2, str3);
    }

    public final boolean component1() {
        return this.isAccessibilityEnabled;
    }

    public final String component2() {
        return this.displayDensity;
    }

    public final String component3() {
        return this.ipCountry;
    }

    public final String component4() {
        return this.deviceCountry;
    }

    public final UserProperties copy(boolean z, String str, String str2, String str3) {
        C19383o.m32797g(str, "displayDensity");
        return new UserProperties(z, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProperties)) {
            return false;
        }
        UserProperties userProperties = (UserProperties) obj;
        return this.isAccessibilityEnabled == userProperties.isAccessibilityEnabled && C19383o.m32792b(this.displayDensity, userProperties.displayDensity) && C19383o.m32792b(this.ipCountry, userProperties.ipCountry) && C19383o.m32792b(this.deviceCountry, userProperties.deviceCountry);
    }

    public final String getDeviceCountry() {
        return this.deviceCountry;
    }

    public final String getDisplayDensity() {
        return this.displayDensity;
    }

    public final String getIpCountry() {
        return this.ipCountry;
    }

    public int hashCode() {
        boolean z = this.isAccessibilityEnabled;
        if (z) {
            z = true;
        }
        int e = C0023f.m105e(this.displayDensity, (z ? 1 : 0) * true, 31);
        String str = this.ipCountry;
        int i = 0;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceCountry;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final boolean isAccessibilityEnabled() {
        return this.isAccessibilityEnabled;
    }

    public String toString() {
        boolean z = this.isAccessibilityEnabled;
        String str = this.displayDensity;
        String str2 = this.ipCountry;
        String str3 = this.deviceCountry;
        StringBuilder sb = new StringBuilder();
        sb.append("UserProperties(isAccessibilityEnabled=");
        sb.append(z);
        sb.append(", displayDensity=");
        sb.append(str);
        sb.append(", ipCountry=");
        return C0073e.m210j(sb, str2, ", deviceCountry=", str3, ")");
    }
}
