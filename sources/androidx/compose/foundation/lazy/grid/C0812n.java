package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p015ui.layout.C1665a;
import androidx.compose.p015ui.layout.C1712w;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.foundation.lazy.grid.n */
public final class C0812n implements C0811m, C1712w {

    /* renamed from: a */
    public final C0820v f1711a;

    /* renamed from: b */
    public final int f1712b;

    /* renamed from: c */
    public final boolean f1713c;

    /* renamed from: d */
    public final float f1714d;

    /* renamed from: e */
    public final List<C0805g> f1715e;

    /* renamed from: f */
    public final int f1716f;

    /* renamed from: g */
    public final /* synthetic */ C1712w f1717g;

    public C0812n(C0820v vVar, int i, boolean z, float f, C1712w wVar, List list, int i2, Orientation orientation) {
        C19383o.m32797g(wVar, "measureResult");
        C19383o.m32797g(list, "visibleItemsInfo");
        C19383o.m32797g(orientation, "orientation");
        this.f1711a = vVar;
        this.f1712b = i;
        this.f1713c = z;
        this.f1714d = f;
        this.f1715e = list;
        this.f1716f = i2;
        this.f1717g = wVar;
    }

    /* renamed from: a */
    public final int mo4330a() {
        return this.f1716f;
    }

    /* renamed from: b */
    public final List<C0805g> mo4331b() {
        return this.f1715e;
    }

    /* renamed from: c */
    public final void mo4344c() {
        this.f1717g.mo4344c();
    }

    /* renamed from: d */
    public final Map<C1665a, Integer> mo4345d() {
        return this.f1717g.mo4345d();
    }

    public final int getHeight() {
        return this.f1717g.getHeight();
    }

    public final int getWidth() {
        return this.f1717g.getWidth();
    }
}
