package androidx.compose.foundation.lazy.layout;

import androidx.compose.p015ui.layout.C1665a;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1696m0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.unit.LayoutDirection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.lazy.layout.g */
public final class C0844g implements C0843f, C1713x {

    /* renamed from: b */
    public final C0839c f1808b;

    /* renamed from: c */
    public final C1696m0 f1809c;

    /* renamed from: d */
    public final HashMap<Integer, C1686i0[]> f1810d = new HashMap<>();

    public C0844g(C0839c cVar, C1696m0 m0Var) {
        C19383o.m32797g(cVar, "itemContentFactory");
        C19383o.m32797g(m0Var, "subcomposeMeasureScope");
        this.f1808b = cVar;
        this.f1809c = m0Var;
    }

    /* renamed from: A */
    public final long mo3788A(long j) {
        return this.f1809c.mo3788A(j);
    }

    /* renamed from: B0 */
    public final float mo3789B0(float f) {
        return this.f1809c.mo3789B0(f);
    }

    /* renamed from: E0 */
    public final int mo3790E0(long j) {
        return this.f1809c.mo3790E0(j);
    }

    /* renamed from: K */
    public final C1686i0[] mo4386K(int i, long j) {
        C1686i0[] i0VarArr = this.f1810d.get(Integer.valueOf(i));
        if (i0VarArr != null) {
            return i0VarArr;
        }
        Object e = this.f1808b.f1797b.invoke().mo4201e(i);
        List<C1710u> T = this.f1809c.mo6700T(e, this.f1808b.mo4384a(i, e));
        int size = T.size();
        C1686i0[] i0VarArr2 = new C1686i0[size];
        for (int i2 = 0; i2 < size; i2++) {
            i0VarArr2[i2] = T.get(i2).mo6665J(j);
        }
        this.f1810d.put(Integer.valueOf(i), i0VarArr2);
        return i0VarArr2;
    }

    /* renamed from: V */
    public final int mo3791V(float f) {
        return this.f1809c.mo3791V(f);
    }

    /* renamed from: Z */
    public final C1712w mo4387Z(int i, int i2, Map<C1665a, Integer> map, C19857l<? super C1686i0.C1687a, C19394m> lVar) {
        C19383o.m32797g(map, "alignmentLines");
        C19383o.m32797g(lVar, "placementBlock");
        return this.f1809c.mo4387Z(i, i2, map, lVar);
    }

    /* renamed from: b0 */
    public final float mo3793b0(long j) {
        return this.f1809c.mo3793b0(j);
    }

    /* renamed from: e */
    public final float mo3794e(long j) {
        return this.f1809c.mo3794e(j);
    }

    public final float getDensity() {
        return this.f1809c.getDensity();
    }

    public final LayoutDirection getLayoutDirection() {
        return this.f1809c.getLayoutDirection();
    }

    /* renamed from: p */
    public final float mo3797p(int i) {
        return this.f1809c.mo3797p(i);
    }

    /* renamed from: q */
    public final float mo3798q(float f) {
        return this.f1809c.mo3798q(f);
    }

    /* renamed from: w */
    public final long mo3799w(long j) {
        return this.f1809c.mo3799w(j);
    }

    /* renamed from: w0 */
    public final float mo3800w0() {
        return this.f1809c.mo3800w0();
    }
}
