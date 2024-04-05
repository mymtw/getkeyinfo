package p395ma;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.Payment;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: ma.b */
public interface C13029b {

    /* renamed from: ma.b$a */
    public static final class C13030a implements C13029b {

        /* renamed from: a */
        public static final C13030a f28684a = new C13030a();
    }

    /* renamed from: ma.b$b */
    public static final class C13031b implements C13029b {

        /* renamed from: a */
        public final String f28685a;

        /* renamed from: b */
        public final int f28686b;

        /* renamed from: c */
        public final Throwable f28687c;

        public C13031b(String str, int i, Throwable th) {
            this.f28685a = str;
            this.f28686b = i;
            this.f28687c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13031b)) {
                return false;
            }
            C13031b bVar = (C13031b) obj;
            return C19383o.m32792b(this.f28685a, bVar.f28685a) && this.f28686b == bVar.f28686b && C19383o.m32792b(this.f28687c, bVar.f28687c);
        }

        public final int hashCode() {
            String str = this.f28685a;
            int i = 0;
            int a = C0069a.m170a(this.f28686b, (str == null ? 0 : str.hashCode()) * 31, 31);
            Throwable th = this.f28687c;
            if (th != null) {
                i = th.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.f28685a);
            h.append(", code=");
            h.append(this.f28686b);
            h.append(", exception=");
            return C0070b.m185h(h, this.f28687c, ')');
        }
    }

    /* renamed from: ma.b$c */
    public static final class C13032c implements C13029b {

        /* renamed from: a */
        public final Payment f28688a;

        public C13032c(Payment payment) {
            C19383o.m32797g(payment, ResponseConstants.PAYMENT);
            this.f28688a = payment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13032c) && C19383o.m32792b(this.f28688a, ((C13032c) obj).f28688a);
        }

        public final int hashCode() {
            return this.f28688a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(payment=");
            h.append(this.f28688a);
            h.append(')');
            return h.toString();
        }
    }
}
