package com.paypal.pyplcheckout.events;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

public final class Success<E> extends ResultData {
    private final E data;

    public Success(E e) {
        super((DefaultConstructorMarker) null);
        this.data = e;
    }

    public static /* synthetic */ Success copy$default(Success success, E e, int i, Object obj) {
        if ((i & 1) != 0) {
            e = success.data;
        }
        return success.copy(e);
    }

    public final E component1() {
        return this.data;
    }

    public final Success<E> copy(E e) {
        return new Success<>(e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Success) && C19383o.m32792b(this.data, ((Success) obj).data);
    }

    public final E getData() {
        return this.data;
    }

    public int hashCode() {
        E e = this.data;
        if (e == null) {
            return 0;
        }
        return e.hashCode();
    }

    public String toString() {
        return C13983i.m21494m("Success(data=", this.data, ")");
    }
}
