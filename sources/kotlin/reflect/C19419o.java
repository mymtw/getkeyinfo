package kotlin.reflect;

import android.support.p013v4.media.C0072d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

/* renamed from: kotlin.reflect.o */
public final class C19419o {

    /* renamed from: a */
    public final KVariance f43296a = null;

    /* renamed from: b */
    public final C19418n f43297b = null;

    /* renamed from: kotlin.reflect.o$a */
    public /* synthetic */ class C19420a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43298a;

        static {
            int[] iArr = new int[KVariance.values().length];
            iArr[KVariance.INVARIANT.ordinal()] = 1;
            iArr[KVariance.IN.ordinal()] = 2;
            iArr[KVariance.OUT.ordinal()] = 3;
            f43298a = iArr;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19419o)) {
            return false;
        }
        C19419o oVar = (C19419o) obj;
        return this.f43296a == oVar.f43296a && C19383o.m32792b(this.f43297b, oVar.f43297b);
    }

    public final int hashCode() {
        KVariance kVariance = this.f43296a;
        int hashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        if (this.f43297b == null) {
            return hashCode + 0;
        }
        throw null;
    }

    public final String toString() {
        KVariance kVariance = this.f43296a;
        int i = kVariance == null ? -1 : C19420a.f43298a[kVariance.ordinal()];
        if (i == -1) {
            return "*";
        }
        if (i == 1) {
            return String.valueOf(this.f43297b);
        }
        if (i == 2) {
            StringBuilder h = C0072d.m201h("in ");
            h.append(this.f43297b);
            return h.toString();
        } else if (i == 3) {
            StringBuilder h2 = C0072d.m201h("out ");
            h2.append(this.f43297b);
            return h2.toString();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
