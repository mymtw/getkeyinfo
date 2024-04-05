package p122h0;

import android.content.res.Resources;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.p015ui.graphics.vector.C1553c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;

/* renamed from: h0.b */
public final class C6906b {

    /* renamed from: a */
    public final HashMap<C6908b, WeakReference<C6907a>> f15284a = new HashMap<>();

    /* renamed from: h0.b$a */
    public static final class C6907a {

        /* renamed from: a */
        public final C1553c f15285a;

        /* renamed from: b */
        public final int f15286b;

        public C6907a(C1553c cVar, int i) {
            this.f15285a = cVar;
            this.f15286b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6907a)) {
                return false;
            }
            C6907a aVar = (C6907a) obj;
            return C19383o.m32792b(this.f15285a, aVar.f15285a) && this.f15286b == aVar.f15286b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f15286b) + (this.f15285a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ImageVectorEntry(imageVector=");
            h.append(this.f15285a);
            h.append(", configFlags=");
            return C0073e.m208h(h, this.f15286b, ')');
        }
    }

    /* renamed from: h0.b$b */
    public static final class C6908b {

        /* renamed from: a */
        public final Resources.Theme f15287a;

        /* renamed from: b */
        public final int f15288b;

        public C6908b(Resources.Theme theme, int i) {
            this.f15287a = theme;
            this.f15288b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6908b)) {
                return false;
            }
            C6908b bVar = (C6908b) obj;
            return C19383o.m32792b(this.f15287a, bVar.f15287a) && this.f15288b == bVar.f15288b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f15288b) + (this.f15287a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Key(theme=");
            h.append(this.f15287a);
            h.append(", id=");
            return C0073e.m208h(h, this.f15288b, ')');
        }
    }
}
