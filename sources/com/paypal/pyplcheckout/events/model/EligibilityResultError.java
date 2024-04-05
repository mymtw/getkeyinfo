package com.paypal.pyplcheckout.events.model;

import kotlin.jvm.internal.C19383o;

public final class EligibilityResultError {
    private final Exception exception;
    private final String message;

    public EligibilityResultError(String str, Exception exc) {
        C19383o.m32797g(str, "message");
        C19383o.m32797g(exc, "exception");
        this.message = str;
        this.exception = exc;
    }

    public static /* synthetic */ EligibilityResultError copy$default(EligibilityResultError eligibilityResultError, String str, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eligibilityResultError.message;
        }
        if ((i & 2) != 0) {
            exc = eligibilityResultError.exception;
        }
        return eligibilityResultError.copy(str, exc);
    }

    public final String component1() {
        return this.message;
    }

    public final Exception component2() {
        return this.exception;
    }

    public final EligibilityResultError copy(String str, Exception exc) {
        C19383o.m32797g(str, "message");
        C19383o.m32797g(exc, "exception");
        return new EligibilityResultError(str, exc);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EligibilityResultError)) {
            return false;
        }
        EligibilityResultError eligibilityResultError = (EligibilityResultError) obj;
        return C19383o.m32792b(this.message, eligibilityResultError.message) && C19383o.m32792b(this.exception, eligibilityResultError.exception);
    }

    public final Exception getException() {
        return this.exception;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.exception.hashCode() + (this.message.hashCode() * 31);
    }

    public String toString() {
        String str = this.message;
        Exception exc = this.exception;
        return "EligibilityResultError(message=" + str + ", exception=" + exc + ")";
    }
}
