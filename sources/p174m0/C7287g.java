package p174m0;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import kotlin.reflect.C19421p;

/* renamed from: m0.g */
public final class C7287g {

    /* renamed from: b */
    public static final long f16164b = C19421p.m32949o(0, 0);

    /* renamed from: c */
    public static final /* synthetic */ int f16165c = 0;

    /* renamed from: a */
    public final long f16166a;

    /* renamed from: m0.g$a */
    public static final class C7288a {
    }

    static {
        new C7288a();
    }

    public /* synthetic */ C7287g(long j) {
        this.f16166a = j;
    }

    /* renamed from: a */
    public static long m13991a(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = m13992b(j);
        }
        return C19421p.m32949o(i, i2);
    }

    /* renamed from: b */
    public static final int m13992b(long j) {
        return (int) (j & UnsignedInteger.INT_MASK);
    }

    /* renamed from: c */
    public static String m13993c(long j) {
        StringBuilder k = C0326j.m866k('(');
        k.append((int) (j >> 32));
        k.append(", ");
        k.append(m13992b(j));
        k.append(')');
        return k.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7287g) && this.f16166a == ((C7287g) obj).f16166a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16166a);
    }

    public final String toString() {
        return m13993c(this.f16166a);
    }
}
