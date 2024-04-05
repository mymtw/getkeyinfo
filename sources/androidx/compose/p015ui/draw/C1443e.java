package androidx.compose.p015ui.draw;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.node.C1741h;
import androidx.compose.p015ui.node.DrawEntity;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.draw.e */
public final class C1443e implements C1442d {

    /* renamed from: b */
    public final C1440b f3135b;

    /* renamed from: c */
    public final C19857l<C1440b, C1445g> f3136c;

    public C1443e(C1440b bVar, C19857l<? super C1440b, C1445g> lVar) {
        C19383o.m32797g(bVar, "cacheDrawScope");
        C19383o.m32797g(lVar, "onBuildDrawCache");
        this.f3135b = bVar;
        this.f3136c = lVar;
    }

    /* renamed from: P */
    public final void mo3715P(C1741h hVar) {
        C1445g gVar = this.f3135b.f3133c;
        C19383o.m32794d(gVar);
        gVar.f3137a.invoke(hVar);
    }

    /* renamed from: X */
    public final void mo6172X(DrawEntity.C1719a aVar) {
        C19383o.m32797g(aVar, ResponseConstants.PARAMS);
        C1440b bVar = this.f3135b;
        bVar.getClass();
        bVar.f3132b = aVar;
        bVar.f3133c = null;
        this.f3136c.invoke(bVar);
        if (bVar.f3133c == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1443e)) {
            return false;
        }
        C1443e eVar = (C1443e) obj;
        return C19383o.m32792b(this.f3135b, eVar.f3135b) && C19383o.m32792b(this.f3136c, eVar.f3136c);
    }

    public final int hashCode() {
        return this.f3136c.hashCode() + (this.f3135b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("DrawContentCacheModifier(cacheDrawScope=");
        h.append(this.f3135b);
        h.append(", onBuildDrawCache=");
        h.append(this.f3136c);
        h.append(')');
        return h.toString();
    }
}
