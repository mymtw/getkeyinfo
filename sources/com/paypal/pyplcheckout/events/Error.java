package com.paypal.pyplcheckout.events;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

public final class Error<F> extends ResultData {
    private final F data;

    public Error(F f) {
        super((DefaultConstructorMarker) null);
        this.data = f;
    }

    public static /* synthetic */ Error copy$default(Error error, F f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = error.data;
        }
        return error.copy(f);
    }

    public final F component1() {
        return this.data;
    }

    public final Error<F> copy(F f) {
        return new Error<>(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Error) && C19383o.m32792b(this.data, ((Error) obj).data);
    }

    public final F getData() {
        return this.data;
    }

    public int hashCode() {
        F f = this.data;
        if (f == null) {
            return 0;
        }
        return f.hashCode();
    }

    public String toString() {
        return C13983i.m21494m("Error(data=", this.data, ")");
    }
}
