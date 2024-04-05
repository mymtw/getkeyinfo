package kotlin;

import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import kotlin.jvm.internal.C19383o;

/* renamed from: kotlin.g */
public final class C19354g implements Comparable<C19354g> {

    /* renamed from: b */
    public final int f43202b;

    public /* synthetic */ C19354g(int i) {
        this.f43202b = i;
    }

    public final int compareTo(Object obj) {
        return C19383o.m32799i(this.f43202b ^ Integer.MIN_VALUE, ((C19354g) obj).f43202b ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C19354g) && this.f43202b == ((C19354g) obj).f43202b;
    }

    public final int hashCode() {
        return this.f43202b;
    }

    public final String toString() {
        return String.valueOf(((long) this.f43202b) & UnsignedInteger.INT_MASK);
    }
}
