package kotlin;

import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

/* renamed from: kotlin.i */
public final class C19356i implements Comparable<C19356i> {

    /* renamed from: b */
    public final long f43205b;

    public /* synthetic */ C19356i(long j) {
        this.f43205b = j;
    }

    /* renamed from: a */
    public static int m32678a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public final int compareTo(Object obj) {
        int i = ((this.f43205b ^ Long.MIN_VALUE) > (((C19356i) obj).f43205b ^ Long.MIN_VALUE) ? 1 : ((this.f43205b ^ Long.MIN_VALUE) == (((C19356i) obj).f43205b ^ Long.MIN_VALUE) ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C19356i) && this.f43205b == ((C19356i) obj).f43205b;
    }

    public final int hashCode() {
        return m32678a(this.f43205b);
    }

    public final String toString() {
        long j = this.f43205b;
        if (j >= 0) {
            C17782b.m29844J(10);
            String l = Long.toString(j, 10);
            C19383o.m32796f(l, "toString(this, checkRadix(radix))");
            return l;
        }
        long j2 = (long) 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        C17782b.m29844J(10);
        String l2 = Long.toString(j3, 10);
        C19383o.m32796f(l2, "toString(this, checkRadix(radix))");
        sb.append(l2);
        C17782b.m29844J(10);
        String l3 = Long.toString(j4, 10);
        C19383o.m32796f(l3, "toString(this, checkRadix(radix))");
        sb.append(l3);
        return sb.toString();
    }
}
