package kotlin;

import kotlin.jvm.internal.C19383o;

/* renamed from: kotlin.k */
public final class C19392k implements Comparable<C19392k> {

    /* renamed from: b */
    public final short f43284b;

    public /* synthetic */ C19392k(short s) {
        this.f43284b = s;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return C19383o.m32799i(this.f43284b & 65535, ((C19392k) obj).f43284b & 65535);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C19392k) && this.f43284b == ((C19392k) obj).f43284b;
    }

    public final int hashCode() {
        return this.f43284b;
    }

    public final String toString() {
        return String.valueOf(this.f43284b & 65535);
    }
}
