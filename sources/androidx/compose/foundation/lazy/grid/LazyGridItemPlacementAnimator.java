package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.C0454t;
import androidx.compose.p015ui.layout.C1686i0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.collections.C19324q;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p174m0.C7287g;

public final class LazyGridItemPlacementAnimator {

    /* renamed from: a */
    public final C19525d0 f1635a;

    /* renamed from: b */
    public final boolean f1636b;

    /* renamed from: c */
    public int f1637c;

    /* renamed from: d */
    public final LinkedHashMap f1638d = new LinkedHashMap();

    /* renamed from: e */
    public Map<Object, Integer> f1639e = C19294b0.m32559p0();

    /* renamed from: f */
    public int f1640f = -1;

    /* renamed from: g */
    public int f1641g;

    /* renamed from: h */
    public int f1642h = -1;

    /* renamed from: i */
    public int f1643i;

    /* renamed from: j */
    public final LinkedHashSet f1644j = new LinkedHashSet();

    public LazyGridItemPlacementAnimator(C19525d0 d0Var, boolean z) {
        C19383o.m32797g(d0Var, "scope");
        this.f1635a = d0Var;
        this.f1636b = z;
    }

    /* renamed from: a */
    public final int mo4276a(int i, int i2, int i3, long j, boolean z, int i4, int i5) {
        boolean z2 = false;
        if (this.f1637c != 0) {
            int i6 = this.f1642h;
            boolean z3 = z ? i6 > i : i6 < i;
            if (z ? this.f1640f < i : this.f1640f > i) {
                z2 = true;
            }
            if (z3) {
                int abs = Math.abs(i - this.f1642h);
                int i7 = this.f1637c;
                return mo4277b(j) + (((((abs + i7) - 1) / i7) - 1) * i3) + i4 + this.f1643i;
            } else if (!z2) {
                return i5;
            } else {
                int abs2 = Math.abs(this.f1640f - i);
                int i8 = this.f1637c;
                return mo4277b(j) + ((this.f1641g - i2) - (((((abs2 + i8) - 1) / i8) - 1) * i3));
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: b */
    public final int mo4277b(long j) {
        if (this.f1636b) {
            return C7287g.m13992b(j);
        }
        int i = C7287g.f16165c;
        return (int) (j >> 32);
    }

    /* renamed from: c */
    public final void mo4278c(C0814p pVar, C0803e eVar) {
        C0814p pVar2 = pVar;
        C0803e eVar2 = eVar;
        while (eVar2.f1705d.size() > pVar2.f1732m.size()) {
            C19324q.m32632N0(eVar2.f1705d);
        }
        while (eVar2.f1705d.size() < pVar2.f1732m.size()) {
            int size = eVar2.f1705d.size();
            long j = pVar2.f1720a;
            ArrayList arrayList = eVar2.f1705d;
            long j2 = eVar2.f1704c;
            long o = C19421p.m32949o(((int) (j >> 32)) - ((int) (j2 >> 32)), C7287g.m13992b(j) - C7287g.m13992b(j2));
            C1686i0 i0Var = pVar2.f1732m.get(size).f1718a;
            arrayList.add(new C0799a0(pVar2.f1731l ? i0Var.f3723c : i0Var.f3722b, o));
        }
        ArrayList arrayList2 = eVar2.f1705d;
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            C0799a0 a0Var = (C0799a0) arrayList2.get(i);
            long j3 = a0Var.f1698c;
            long j4 = eVar2.f1704c;
            long o2 = C19421p.m32949o(((int) (j3 >> 32)) + ((int) (j4 >> 32)), C7287g.m13992b(j4) + C7287g.m13992b(j3));
            long j5 = pVar2.f1721b;
            C1686i0 i0Var2 = pVar2.f1732m.get(i).f1718a;
            a0Var.f1696a = pVar2.f1731l ? i0Var2.f3723c : i0Var2.f3722b;
            C0454t<C7287g> e = pVar2.mo4348e(i);
            if (!(o2 == j5)) {
                long j6 = eVar2.f1704c;
                a0Var.f1698c = C19421p.m32949o(((int) (j5 >> 32)) - ((int) (j6 >> 32)), C7287g.m13992b(j5) - C7287g.m13992b(j6));
                if (e != null) {
                    a0Var.f1699d.setValue(Boolean.TRUE);
                    C19697g.m33468f(this.f1635a, (CoroutineContext) null, (CoroutineStart) null, new LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(a0Var, e, (C19340c<? super LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1>) null), 3);
                }
            }
        }
    }
}
