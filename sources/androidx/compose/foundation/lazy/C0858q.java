package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.C0454t;
import androidx.compose.p015ui.layout.C1686i0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p174m0.C7287g;

/* renamed from: androidx.compose.foundation.lazy.q */
public final class C0858q implements C0827j {

    /* renamed from: a */
    public final int f1833a;

    /* renamed from: b */
    public final int f1834b;

    /* renamed from: c */
    public final Object f1835c;

    /* renamed from: d */
    public final int f1836d;

    /* renamed from: e */
    public final int f1837e;

    /* renamed from: f */
    public final int f1838f;

    /* renamed from: g */
    public final int f1839g;

    /* renamed from: h */
    public final boolean f1840h;

    /* renamed from: i */
    public final List<C0857p> f1841i;

    /* renamed from: j */
    public final LazyListItemPlacementAnimator f1842j;

    /* renamed from: k */
    public final long f1843k;

    /* renamed from: l */
    public final boolean f1844l;

    public C0858q() {
        throw null;
    }

    public C0858q(int i, int i2, Object obj, int i3, int i4, int i5, int i6, boolean z, ArrayList arrayList, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j) {
        this.f1833a = i;
        this.f1834b = i2;
        this.f1835c = obj;
        this.f1836d = i3;
        this.f1837e = i4;
        this.f1838f = i5;
        this.f1839g = i6;
        this.f1840h = z;
        this.f1841i = arrayList;
        this.f1842j = lazyListItemPlacementAnimator;
        this.f1843k = j;
        int size = arrayList.size();
        boolean z2 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            } else if (mo4394b(i7) != null) {
                z2 = true;
                break;
            } else {
                i7++;
            }
        }
        this.f1844l = z2;
    }

    /* renamed from: a */
    public final int mo4359a() {
        return this.f1836d;
    }

    /* renamed from: b */
    public final C0454t<C7287g> mo4394b(int i) {
        Object obj = this.f1841i.get(i).f1832c;
        if (obj instanceof C0454t) {
            return (C0454t) obj;
        }
        return null;
    }

    /* renamed from: c */
    public final int mo4395c(int i) {
        C1686i0 i0Var = this.f1841i.get(i).f1831b;
        return this.f1840h ? i0Var.f3723c : i0Var.f3722b;
    }

    /* renamed from: d */
    public final long mo4396d(int i) {
        return this.f1841i.get(i).f1830a;
    }

    /* renamed from: e */
    public final void mo4397e(C1686i0.C1687a aVar) {
        int i;
        long j;
        int i2;
        C1686i0.C1687a aVar2 = aVar;
        C19383o.m32797g(aVar2, "scope");
        int i3 = 0;
        C0858q qVar = this;
        for (int size = this.f1841i.size(); i3 < size; size = i) {
            C1686i0 i0Var = qVar.f1841i.get(i3).f1831b;
            int i4 = qVar.f1838f - (qVar.f1840h ? i0Var.f3723c : i0Var.f3722b);
            int i5 = qVar.f1839g;
            if (qVar.mo4394b(i3) != null) {
                LazyListItemPlacementAnimator lazyListItemPlacementAnimator = qVar.f1842j;
                Object obj = qVar.f1835c;
                j = qVar.mo4396d(i3);
                lazyListItemPlacementAnimator.getClass();
                C19383o.m32797g(obj, "key");
                C0776c cVar = (C0776c) lazyListItemPlacementAnimator.f1576c.get(obj);
                if (cVar == null) {
                    i = size;
                    i2 = i3;
                } else {
                    C0867z zVar = (C0867z) cVar.f1624b.get(i3);
                    long j2 = zVar.f1874b.mo3375e().f16166a;
                    long j3 = cVar.f1623a;
                    i2 = i3;
                    j = C19421p.m32949o(((int) (j2 >> 32)) + ((int) (j3 >> 32)), C7287g.m13992b(j3) + C7287g.m13992b(j2));
                    long j4 = zVar.f1875c;
                    long j5 = cVar.f1623a;
                    i = size;
                    long o = C19421p.m32949o(((int) (j4 >> 32)) + ((int) (j5 >> 32)), C7287g.m13992b(j5) + C7287g.m13992b(j4));
                    if (((Boolean) zVar.f1876d.getValue()).booleanValue() && ((lazyListItemPlacementAnimator.mo4193c(o) < i4 && lazyListItemPlacementAnimator.mo4193c(j) < i4) || (lazyListItemPlacementAnimator.mo4193c(o) > i5 && lazyListItemPlacementAnimator.mo4193c(j) > i5))) {
                        C19697g.m33468f(lazyListItemPlacementAnimator.f1574a, (CoroutineContext) null, (CoroutineStart) null, new LazyListItemPlacementAnimator$getAnimatedOffset$1(zVar, (C19340c<? super LazyListItemPlacementAnimator$getAnimatedOffset$1>) null), 3);
                    }
                }
                qVar = this;
                i3 = i2;
            } else {
                i = size;
                j = qVar.mo4396d(i3);
            }
            if (qVar.f1840h) {
                long j6 = qVar.f1843k;
                C1686i0.C1687a.m3588j(aVar2, i0Var, C19421p.m32949o(((int) (j >> 32)) + ((int) (j6 >> 32)), C7287g.m13992b(j6) + C7287g.m13992b(j)));
            } else {
                long j7 = qVar.f1843k;
                C1686i0.C1687a.m3585g(aVar2, i0Var, C19421p.m32949o(((int) (j >> 32)) + ((int) (j7 >> 32)), C7287g.m13992b(j7) + C7287g.m13992b(j)));
            }
            i3++;
        }
    }

    public final int getIndex() {
        return this.f1834b;
    }

    public final int getOffset() {
        return this.f1833a;
    }
}
