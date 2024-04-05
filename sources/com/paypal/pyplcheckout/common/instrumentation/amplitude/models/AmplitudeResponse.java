package com.paypal.pyplcheckout.common.instrumentation.amplitude.models;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class AmplitudeResponse {
    @C18417a("code")
    private final int code;
    @C18417a("error")
    private final String error;

    public AmplitudeResponse(int i, String str) {
        this.code = i;
        this.error = str;
    }

    public static /* synthetic */ AmplitudeResponse copy$default(AmplitudeResponse amplitudeResponse, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = amplitudeResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = amplitudeResponse.error;
        }
        return amplitudeResponse.copy(i, str);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.error;
    }

    public final AmplitudeResponse copy(int i, String str) {
        return new AmplitudeResponse(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmplitudeResponse)) {
            return false;
        }
        AmplitudeResponse amplitudeResponse = (AmplitudeResponse) obj;
        return this.code == amplitudeResponse.code && C19383o.m32792b(this.error, amplitudeResponse.error);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.code) * 31;
        String str = this.error;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.code;
        String str = this.error;
        return "AmplitudeResponse(code=" + i + ", error=" + str + ")";
    }
}
