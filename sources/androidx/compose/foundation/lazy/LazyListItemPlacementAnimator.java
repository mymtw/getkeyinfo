package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.C0454t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.collections.C19324q;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p174m0.C7287g;
import p568fn.C17782b;
import p764pq.C20057i;

public final class LazyListItemPlacementAnimator {

    /* renamed from: a */
    public final C19525d0 f1574a;

    /* renamed from: b */
    public final boolean f1575b;

    /* renamed from: c */
    public final LinkedHashMap f1576c = new LinkedHashMap();

    /* renamed from: d */
    public Map<Object, Integer> f1577d = C19294b0.m32559p0();

    /* renamed from: e */
    public int f1578e = -1;

    /* renamed from: f */
    public int f1579f;

    /* renamed from: g */
    public int f1580g = -1;

    /* renamed from: h */
    public int f1581h;

    /* renamed from: i */
    public final LinkedHashSet f1582i = new LinkedHashSet();

    public LazyListItemPlacementAnimator(C19525d0 d0Var, boolean z) {
        C19383o.m32797g(d0Var, "scope");
        this.f1574a = d0Var;
        this.f1575b = z;
    }

    /* renamed from: b */
    public static int m1773b(ArrayList arrayList, int i, int i2) {
        if (!arrayList.isEmpty() && i >= ((C0858q) C19327t.m32638T0(arrayList)).f1834b && i <= ((C0858q) C19327t.m32645a1(arrayList)).f1834b) {
            if (i - ((C0858q) C19327t.m32638T0(arrayList)).f1834b >= ((C0858q) C19327t.m32645a1(arrayList)).f1834b - i) {
                int Y = C17782b.m29859Y(arrayList);
                while (-1 < Y) {
                    C0858q qVar = (C0858q) arrayList.get(Y);
                    int i3 = qVar.f1834b;
                    if (i3 != i) {
                        if (i3 < i) {
                            break;
                        }
                        Y--;
                    } else {
                        return qVar.f1837e;
                    }
                }
            } else {
                int i4 = 0;
                int size = arrayList.size();
                while (i4 < size) {
                    C0858q qVar2 = (C0858q) arrayList.get(i4);
                    int i5 = qVar2.f1834b;
                    if (i5 != i) {
                        if (i5 > i) {
                            break;
                        }
                        i4++;
                    } else {
                        return qVar2.f1837e;
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    public final int mo4192a(int i, int i2, int i3, long j, boolean z, int i4, int i5, ArrayList arrayList) {
        int i6 = this.f1580g;
        int i7 = 0;
        boolean z2 = z ? i6 > i : i6 < i;
        int i8 = this.f1578e;
        boolean z3 = z ? i8 < i : i8 > i;
        if (z2) {
            C20057i D0 = !z ? C19388s.m32816D0(i6 + 1, i) : C19388s.m32816D0(i + 1, i6);
            int i9 = D0.f44414b;
            int i10 = D0.f44415c;
            if (i9 <= i10) {
                while (true) {
                    i7 += m1773b(arrayList, i9, i3);
                    if (i9 == i10) {
                        break;
                    }
                    i9++;
                }
            }
            return mo4193c(j) + i4 + this.f1581h + i7;
        } else if (!z3) {
            return i5;
        } else {
            C20057i D02 = !z ? C19388s.m32816D0(i + 1, i8) : C19388s.m32816D0(i8 + 1, i);
            int i11 = D02.f44414b;
            int i12 = D02.f44415c;
            if (i11 <= i12) {
                while (true) {
                    i2 += m1773b(arrayList, i11, i3);
                    if (i11 == i12) {
                        break;
                    }
                    i11++;
                }
            }
            return mo4193c(j) + (this.f1579f - i2);
        }
    }

    /* renamed from: c */
    public final int mo4193c(long j) {
        if (this.f1575b) {
            return C7287g.m13992b(j);
        }
        int i = C7287g.f16165c;
        return (int) (j >> 32);
    }

    /* renamed from: d */
    public final void mo4194d(C0858q qVar, C0776c cVar) {
        C0858q qVar2 = qVar;
        C0776c cVar2 = cVar;
        while (cVar2.f1624b.size() > qVar2.f1841i.size()) {
            C19324q.m32632N0(cVar2.f1624b);
        }
        while (cVar2.f1624b.size() < qVar2.f1841i.size()) {
            int size = cVar2.f1624b.size();
            long d = qVar2.mo4396d(size);
            ArrayList arrayList = cVar2.f1624b;
            long j = cVar2.f1623a;
            arrayList.add(new C0867z(qVar2.mo4395c(size), C19421p.m32949o(((int) (d >> 32)) - ((int) (j >> 32)), C7287g.m13992b(d) - C7287g.m13992b(j))));
        }
        ArrayList arrayList2 = cVar2.f1624b;
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            C0867z zVar = (C0867z) arrayList2.get(i);
            long j2 = zVar.f1875c;
            long j3 = cVar2.f1623a;
            long o = C19421p.m32949o(((int) (j2 >> 32)) + ((int) (j3 >> 32)), C7287g.m13992b(j3) + C7287g.m13992b(j2));
            long d2 = qVar2.mo4396d(i);
            zVar.f1873a = qVar2.mo4395c(i);
            C0454t<C7287g> b = qVar2.mo4394b(i);
            if (!(o == d2)) {
                long j4 = cVar2.f1623a;
                zVar.f1875c = C19421p.m32949o(((int) (d2 >> 32)) - ((int) (j4 >> 32)), C7287g.m13992b(d2) - C7287g.m13992b(j4));
                if (b != null) {
                    zVar.f1876d.setValue(Boolean.TRUE);
                    C19697g.m33468f(this.f1574a, (CoroutineContext) null, (CoroutineStart) null, new LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1(zVar, b, (C19340c<? super LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1>) null), 3);
                }
            }
        }
    }
}
