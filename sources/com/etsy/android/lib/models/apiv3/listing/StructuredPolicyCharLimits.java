package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class StructuredPolicyCharLimits {
    public static final int $stable = 0;
    private final Integer privacyPolicyOther;

    public StructuredPolicyCharLimits(@C17402n(name = "privacy_policy_other") Integer num) {
        this.privacyPolicyOther = num;
    }

    public static /* synthetic */ StructuredPolicyCharLimits copy$default(StructuredPolicyCharLimits structuredPolicyCharLimits, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = structuredPolicyCharLimits.privacyPolicyOther;
        }
        return structuredPolicyCharLimits.copy(num);
    }

    public final Integer component1() {
        return this.privacyPolicyOther;
    }

    public final StructuredPolicyCharLimits copy(@C17402n(name = "privacy_policy_other") Integer num) {
        return new StructuredPolicyCharLimits(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StructuredPolicyCharLimits) && C19383o.m32792b(this.privacyPolicyOther, ((StructuredPolicyCharLimits) obj).privacyPolicyOther);
    }

    public final Integer getPrivacyPolicyOther() {
        return this.privacyPolicyOther;
    }

    public int hashCode() {
        Integer num = this.privacyPolicyOther;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return C0023f.m109j(C0072d.m201h("StructuredPolicyCharLimits(privacyPolicyOther="), this.privacyPolicyOther, ')');
    }
}
