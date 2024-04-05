package p350fe;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p363he.C12822e;

/* renamed from: fe.g */
public abstract class C12731g {

    /* renamed from: fe.g$a */
    public static final class C12732a extends C12731g {

        /* renamed from: a */
        public final String f28053a;

        public C12732a(String str) {
            C19383o.m32797g(str, "errorMsg");
            this.f28053a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12732a) && C19383o.m32792b(this.f28053a, ((C12732a) obj).f28053a);
        }

        public final int hashCode() {
            return this.f28053a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("Error(errorMsg="), this.f28053a, ')');
        }
    }

    /* renamed from: fe.g$b */
    public static final class C12733b extends C12731g {

        /* renamed from: a */
        public final C12822e f28054a;

        public C12733b(C12822e eVar) {
            this.f28054a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12733b) && C19383o.m32792b(this.f28054a, ((C12733b) obj).f28054a);
        }

        public final int hashCode() {
            return this.f28054a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(navigationKey=");
            h.append(this.f28054a);
            h.append(')');
            return h.toString();
        }
    }
}
