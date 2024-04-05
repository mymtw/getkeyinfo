package p314ba;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: ba.d */
public interface C8545d {

    /* renamed from: ba.d$a */
    public static final class C8546a implements C8545d {

        /* renamed from: a */
        public final String f18613a;

        /* renamed from: b */
        public final int f18614b;

        /* renamed from: c */
        public final Throwable f18615c;

        public C8546a(String str, int i, Throwable th) {
            this.f18613a = str;
            this.f18614b = i;
            this.f18615c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8546a)) {
                return false;
            }
            C8546a aVar = (C8546a) obj;
            return C19383o.m32792b(this.f18613a, aVar.f18613a) && this.f18614b == aVar.f18614b && C19383o.m32792b(this.f18615c, aVar.f18615c);
        }

        public final int hashCode() {
            String str = this.f18613a;
            int i = 0;
            int a = C0069a.m170a(this.f18614b, (str == null ? 0 : str.hashCode()) * 31, 31);
            Throwable th = this.f18615c;
            if (th != null) {
                i = th.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.f18613a);
            h.append(", code=");
            h.append(this.f18614b);
            h.append(", cause=");
            return C0070b.m185h(h, this.f18615c, ')');
        }
    }

    /* renamed from: ba.d$b */
    public static final class C8547b implements C8545d {

        /* renamed from: a */
        public static final C8547b f18616a = new C8547b();
    }
}
