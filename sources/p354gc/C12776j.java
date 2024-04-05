package p354gc;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: gc.j */
public abstract class C12776j {

    /* renamed from: gc.j$a */
    public static final class C12777a extends C12776j {

        /* renamed from: a */
        public final C12775i f28233a;

        public C12777a(C12775i iVar) {
            this.f28233a = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12777a) && C19383o.m32792b(this.f28233a, ((C12777a) obj).f28233a);
        }

        public final int hashCode() {
            C12775i iVar = this.f28233a;
            if (iVar == null) {
                return 0;
            }
            return iVar.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("CustomOrder(linkCard=");
            h.append(this.f28233a);
            h.append(')');
            return h.toString();
        }
    }
}
