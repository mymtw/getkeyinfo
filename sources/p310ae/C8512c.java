package p310ae;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;

/* renamed from: ae.c */
public abstract class C8512c {

    /* renamed from: ae.c$a */
    public static final class C8513a extends C8512c {

        /* renamed from: a */
        public static final C8513a f18528a = new C8513a();
    }

    /* renamed from: ae.c$b */
    public static final class C8514b extends C8512c {

        /* renamed from: a */
        public final int f18529a;

        public C8514b(int i) {
            this.f18529a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8514b) && this.f18529a == ((C8514b) obj).f18529a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f18529a);
        }

        public final String toString() {
            return C0073e.m208h(C0072d.m201h("GoBack(bottomNavTabId="), this.f18529a, ')');
        }
    }
}
