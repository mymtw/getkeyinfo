package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p015ui.layout.C1665a;
import androidx.compose.p015ui.layout.C1712w;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.foundation.lazy.n */
public final class C0853n implements C0852m, C1712w {

    /* renamed from: a */
    public final C0864w f1815a;

    /* renamed from: b */
    public final int f1816b;

    /* renamed from: c */
    public final boolean f1817c;

    /* renamed from: d */
    public final float f1818d;

    /* renamed from: e */
    public final List<C0827j> f1819e;

    /* renamed from: f */
    public final int f1820f;

    /* renamed from: g */
    public final /* synthetic */ C1712w f1821g;

    public C0853n(C0864w wVar, int i, boolean z, float f, C1712w wVar2, List list, int i2, Orientation orientation) {
        C19383o.m32797g(wVar2, "measureResult");
        C19383o.m32797g(list, "visibleItemsInfo");
        C19383o.m32797g(orientation, "orientation");
        this.f1815a = wVar;
        this.f1816b = i;
        this.f1817c = z;
        this.f1818d = f;
        this.f1819e = list;
        this.f1820f = i2;
        this.f1821g = wVar2;
    }

    /* renamed from: a */
    public final int mo4243a() {
        return this.f1820f;
    }

    /* renamed from: b */
    public final List<C0827j> mo4244b() {
        return this.f1819e;
    }

    /* renamed from: c */
    public final void mo4344c() {
        this.f1821g.mo4344c();
    }

    /* renamed from: d */
    public final Map<C1665a, Integer> mo4345d() {
        return this.f1821g.mo4345d();
    }

    public final int getHeight() {
        return this.f1821g.getHeight();
    }

    public final int getWidth() {
        return this.f1821g.getWidth();
    }
}
