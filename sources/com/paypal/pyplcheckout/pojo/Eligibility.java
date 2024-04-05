package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class Eligibility {
    @C18417a("eligibility")
    private final Boolean eligibility;
    @C18417a("ineligibilityErrorMessage")
    private final String ineligibilityErrorMessage;
    @C18417a("ineligibilityReason")
    private final String ineligibilityReason;

    public Eligibility(Boolean bool, String str, String str2) {
        this.eligibility = bool;
        this.ineligibilityReason = str;
        this.ineligibilityErrorMessage = str2;
    }

    public static /* synthetic */ Eligibility copy$default(Eligibility eligibility2, Boolean bool, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = eligibility2.eligibility;
        }
        if ((i & 2) != 0) {
            str = eligibility2.ineligibilityReason;
        }
        if ((i & 4) != 0) {
            str2 = eligibility2.ineligibilityErrorMessage;
        }
        return eligibility2.copy(bool, str, str2);
    }

    public final Boolean component1() {
        return this.eligibility;
    }

    public final String component2() {
        return this.ineligibilityReason;
    }

    public final String component3() {
        return this.ineligibilityErrorMessage;
    }

    public final Eligibility copy(Boolean bool, String str, String str2) {
        return new Eligibility(bool, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Eligibility)) {
            return false;
        }
        Eligibility eligibility2 = (Eligibility) obj;
        return C19383o.m32792b(this.eligibility, eligibility2.eligibility) && C19383o.m32792b(this.ineligibilityReason, eligibility2.ineligibilityReason) && C19383o.m32792b(this.ineligibilityErrorMessage, eligibility2.ineligibilityErrorMessage);
    }

    public final Boolean getEligibility() {
        return this.eligibility;
    }

    public final String getIneligibilityErrorMessage() {
        return this.ineligibilityErrorMessage;
    }

    public final String getIneligibilityReason() {
        return this.ineligibilityReason;
    }

    public int hashCode() {
        Boolean bool = this.eligibility;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.ineligibilityReason;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ineligibilityErrorMessage;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        Boolean bool = this.eligibility;
        String str = this.ineligibilityReason;
        String str2 = this.ineligibilityErrorMessage;
        StringBuilder sb = new StringBuilder();
        sb.append("Eligibility(eligibility=");
        sb.append(bool);
        sb.append(", ineligibilityReason=");
        sb.append(str);
        sb.append(", ineligibilityErrorMessage=");
        return C0023f.m110k(sb, str2, ")");
    }
}
