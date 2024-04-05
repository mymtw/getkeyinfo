package kotlin;

import kotlin.jvm.internal.C19383o;

/* renamed from: kotlin.e */
public final class C19352e implements Comparable<C19352e> {

    /* renamed from: b */
    public final byte f43199b;

    public /* synthetic */ C19352e(byte b) {
        this.f43199b = b;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return C19383o.m32799i(this.f43199b & 255, ((C19352e) obj).f43199b & 255);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C19352e) && this.f43199b == ((C19352e) obj).f43199b;
    }

    public final int hashCode() {
        return this.f43199b;
    }

    public final String toString() {
        return String.valueOf(this.f43199b & 255);
    }
}
