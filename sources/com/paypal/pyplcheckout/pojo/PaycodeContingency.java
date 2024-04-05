package com.paypal.pyplcheckout.pojo;

import android.support.p013v4.media.C0071c;
import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class PaycodeContingency {
    @C18417a("attempts")
    private final int attempts;
    @C18417a("causeName")
    private final String causeName;
    @C18417a("name")
    private final String name;

    public PaycodeContingency(String str, String str2, int i) {
        this.name = str;
        this.causeName = str2;
        this.attempts = i;
    }

    public static /* synthetic */ PaycodeContingency copy$default(PaycodeContingency paycodeContingency, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = paycodeContingency.name;
        }
        if ((i2 & 2) != 0) {
            str2 = paycodeContingency.causeName;
        }
        if ((i2 & 4) != 0) {
            i = paycodeContingency.attempts;
        }
        return paycodeContingency.copy(str, str2, i);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.causeName;
    }

    public final int component3() {
        return this.attempts;
    }

    public final PaycodeContingency copy(String str, String str2, int i) {
        return new PaycodeContingency(str, str2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaycodeContingency)) {
            return false;
        }
        PaycodeContingency paycodeContingency = (PaycodeContingency) obj;
        return C19383o.m32792b(this.name, paycodeContingency.name) && C19383o.m32792b(this.causeName, paycodeContingency.causeName) && this.attempts == paycodeContingency.attempts;
    }

    public final int getAttempts() {
        return this.attempts;
    }

    public final String getCauseName() {
        return this.causeName;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.causeName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Integer.hashCode(this.attempts) + ((hashCode + i) * 31);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.causeName;
        return C0071c.m191c(C0388a.m1050f("PaycodeContingency(name=", str, ", causeName=", str2, ", attempts="), this.attempts, ")");
    }
}
