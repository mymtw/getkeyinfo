package p412oc;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.favorites.search.clusters.ClusterItem;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: oc.c */
public abstract class C13151c {

    /* renamed from: oc.c$a */
    public static final class C13152a extends C13151c {

        /* renamed from: a */
        public final String f28926a;

        /* renamed from: b */
        public final int f28927b;

        /* renamed from: c */
        public final Throwable f28928c;

        public C13152a(String str, int i, Throwable th) {
            this.f28926a = str;
            this.f28927b = i;
            this.f28928c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13152a)) {
                return false;
            }
            C13152a aVar = (C13152a) obj;
            return C19383o.m32792b(this.f28926a, aVar.f28926a) && this.f28927b == aVar.f28927b && C19383o.m32792b(this.f28928c, aVar.f28928c);
        }

        public final int hashCode() {
            String str = this.f28926a;
            int i = 0;
            int a = C0069a.m170a(this.f28927b, (str == null ? 0 : str.hashCode()) * 31, 31);
            Throwable th = this.f28928c;
            if (th != null) {
                i = th.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.f28926a);
            h.append(", code=");
            h.append(this.f28927b);
            h.append(", exception=");
            return C0070b.m185h(h, this.f28928c, ')');
        }
    }

    /* renamed from: oc.c$b */
    public static final class C13153b extends C13151c {

        /* renamed from: a */
        public final List<ClusterItem> f28929a;

        public C13153b(List<ClusterItem> list) {
            C19383o.m32797g(list, "clusters");
            this.f28929a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13153b) && C19383o.m32792b(this.f28929a, ((C13153b) obj).f28929a);
        }

        public final int hashCode() {
            return this.f28929a.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("Success(clusters="), this.f28929a, ')');
        }
    }
}
