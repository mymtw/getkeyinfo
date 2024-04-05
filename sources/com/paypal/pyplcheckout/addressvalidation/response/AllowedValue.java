package com.paypal.pyplcheckout.addressvalidation.response;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;

public final class AllowedValue {
    private final String displayText;
    private final String value;

    public AllowedValue(String str, String str2) {
        C19383o.m32797g(str, "displayText");
        C19383o.m32797g(str2, "value");
        this.displayText = str;
        this.value = str2;
    }

    public static /* synthetic */ AllowedValue copy$default(AllowedValue allowedValue, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = allowedValue.displayText;
        }
        if ((i & 2) != 0) {
            str2 = allowedValue.value;
        }
        return allowedValue.copy(str, str2);
    }

    public final String component1() {
        return this.displayText;
    }

    public final String component2() {
        return this.value;
    }

    public final AllowedValue copy(String str, String str2) {
        C19383o.m32797g(str, "displayText");
        C19383o.m32797g(str2, "value");
        return new AllowedValue(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllowedValue)) {
            return false;
        }
        AllowedValue allowedValue = (AllowedValue) obj;
        return C19383o.m32792b(this.displayText, allowedValue.displayText) && C19383o.m32792b(this.value, allowedValue.value);
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.displayText.hashCode() * 31);
    }

    public String toString() {
        return C0048b.m164c("AllowedValue(displayText=", this.displayText, ", value=", this.value, ")");
    }
}
