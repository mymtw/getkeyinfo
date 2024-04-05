package p297z;

import android.graphics.Shader;
import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.graphics.C1490a0;
import androidx.compose.p015ui.graphics.C1492b0;
import androidx.compose.p015ui.graphics.C1516e;
import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.graphics.C1604x;
import androidx.compose.p015ui.unit.LayoutDirection;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import p173m.C7279a;
import p174m0.C7282b;
import p174m0.C7283c;
import p288y.C8341a;
import p288y.C8343c;
import p288y.C8347f;
import p628nj.C18263b;

/* renamed from: z.a */
public final class C8406a implements C8412e {

    /* renamed from: b */
    public final C8407a f18422b = new C8407a();

    /* renamed from: c */
    public final C8408b f18423c = new C8408b(this);

    /* renamed from: d */
    public C1516e f18424d;

    /* renamed from: e */
    public C1516e f18425e;

    /* renamed from: z.a$a */
    public static final class C8407a {

        /* renamed from: a */
        public C7282b f18426a;

        /* renamed from: b */
        public LayoutDirection f18427b;

        /* renamed from: c */
        public C1537o f18428c;

        /* renamed from: d */
        public long f18429d;

        public C8407a() {
            C7283c cVar = C7279a.f16148k;
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            C8414g gVar = new C8414g();
            long j = C8347f.f18313b;
            this.f18426a = cVar;
            this.f18427b = layoutDirection;
            this.f18428c = gVar;
            this.f18429d = j;
        }

        /* renamed from: a */
        public final void mo20987a(LayoutDirection layoutDirection) {
            C19383o.m32797g(layoutDirection, "<set-?>");
            this.f18427b = layoutDirection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8407a)) {
                return false;
            }
            C8407a aVar = (C8407a) obj;
            return C19383o.m32792b(this.f18426a, aVar.f18426a) && this.f18427b == aVar.f18427b && C19383o.m32792b(this.f18428c, aVar.f18428c) && C8347f.m16653a(this.f18429d, aVar.f18429d);
        }

        public final int hashCode() {
            int hashCode = this.f18427b.hashCode();
            int hashCode2 = this.f18428c.hashCode();
            long j = this.f18429d;
            int i = C8347f.f18315d;
            return Long.hashCode(j) + ((hashCode2 + ((hashCode + (this.f18426a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("DrawParams(density=");
            h.append(this.f18426a);
            h.append(", layoutDirection=");
            h.append(this.f18427b);
            h.append(", canvas=");
            h.append(this.f18428c);
            h.append(", size=");
            h.append(C8347f.m16657e(this.f18429d));
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: z.a$b */
    public static final class C8408b implements C8411d {

        /* renamed from: a */
        public final C8409b f18430a = new C8409b(this);

        /* renamed from: b */
        public final /* synthetic */ C8406a f18431b;

        public C8408b(C8406a aVar) {
            this.f18431b = aVar;
        }

        /* renamed from: a */
        public final C1537o mo20991a() {
            return this.f18431b.f18422b.f18428c;
        }

        /* renamed from: b */
        public final long mo20992b() {
            return this.f18431b.f18422b.f18429d;
        }

        /* renamed from: c */
        public final void mo20993c(long j) {
            this.f18431b.f18422b.f18429d = j;
        }
    }

    /* renamed from: c */
    public static C1490a0 m16743c(C8406a aVar, long j, C8413f fVar, float f, C1546t tVar, int i) {
        C1490a0 s = aVar.mo20986s(fVar);
        long r = m16746r(j, f);
        C1516e eVar = (C1516e) s;
        if (!C1545s.m3357c(eVar.mo6237a(), r)) {
            eVar.mo6241e(r);
        }
        if (eVar.f3290c != null) {
            eVar.mo6245h((Shader) null);
        }
        if (!C19383o.m32792b(eVar.f3291d, tVar)) {
            eVar.mo6247j(tVar);
        }
        boolean z = false;
        if (!(eVar.f3289b == i)) {
            eVar.mo6238b(i);
        }
        if (eVar.mo6248k() == 1) {
            z = true;
        }
        if (!z) {
            eVar.mo6240d(1);
        }
        return s;
    }

    /* renamed from: m */
    public static C1490a0 m16745m(C8406a aVar, long j, float f, int i, C18263b bVar, float f2, C1546t tVar, int i2) {
        C1516e eVar = aVar.f18425e;
        if (eVar == null) {
            eVar = new C1516e();
            eVar.mo6335u(1);
            aVar.f18425e = eVar;
        }
        long r = m16746r(j, f2);
        if (!C1545s.m3357c(eVar.mo6237a(), r)) {
            eVar.mo6241e(r);
        }
        if (eVar.f3290c != null) {
            eVar.mo6245h((Shader) null);
        }
        if (!C19383o.m32792b(eVar.f3291d, tVar)) {
            eVar.mo6247j(tVar);
        }
        boolean z = false;
        if (!(eVar.f3289b == i2)) {
            eVar.mo6238b(i2);
        }
        if (!(eVar.mo6329o() == f)) {
            eVar.mo6334t(f);
        }
        if (!(eVar.mo6328n() == 4.0f)) {
            eVar.mo6333s(4.0f);
        }
        if (!(eVar.mo6326l() == i)) {
            eVar.mo6331q(i);
        }
        if (!(eVar.mo6327m() == 0)) {
            eVar.mo6332r(0);
        }
        eVar.getClass();
        if (!C19383o.m32792b((Object) null, bVar)) {
            eVar.mo6330p(bVar);
        }
        if (eVar.mo6248k() == 1) {
            z = true;
        }
        if (!z) {
            eVar.mo6240d(1);
        }
        return eVar;
    }

    /* renamed from: r */
    public static long m16746r(long j, float f) {
        return !((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0) ? C1545s.m3356b(j, C1545s.m3358d(j) * f) : j;
    }

    /* renamed from: C0 */
    public final C8408b mo6900C0() {
        return this.f18423c;
    }

    /* renamed from: D0 */
    public final void mo6901D0(long j, float f, long j2, float f2, C8413f fVar, C1546t tVar, int i) {
        C8413f fVar2 = fVar;
        C19383o.m32797g(fVar2, "style");
        float f3 = f;
        long j3 = j2;
        this.f18422b.f18428c.mo6269w(f, j2, m16743c(this, j, fVar2, f2, tVar, i));
    }

    /* renamed from: F */
    public final void mo6902F(C1604x xVar, long j, float f, C8413f fVar, C1546t tVar, int i) {
        C19383o.m32797g(xVar, ResponseConstants.IMAGE);
        C19383o.m32797g(fVar, "style");
        this.f18422b.f18428c.mo6255g(xVar, j, mo20985f((C1533m) null, fVar, f, tVar, i, 1));
    }

    /* renamed from: F0 */
    public final void mo6903F0(long j, long j2, long j3, float f, C8413f fVar, C1546t tVar, int i) {
        C8413f fVar2 = fVar;
        C19383o.m32797g(fVar2, "style");
        this.f18422b.f18428c.mo6252d(C8343c.m16642c(j2), C8343c.m16643d(j2), C8347f.m16656d(j3) + C8343c.m16642c(j2), C8347f.m16654b(j3) + C8343c.m16643d(j2), m16743c(this, j, fVar2, f, tVar, i));
    }

    /* renamed from: H */
    public final void mo6904H(long j, long j2, long j3, float f, int i, C18263b bVar, float f2, C1546t tVar, int i2) {
        this.f18422b.f18428c.mo6263q(j2, j3, m16745m(this, j, f, i, bVar, f2, tVar, i2));
    }

    /* renamed from: I */
    public final void mo6905I(long j, long j2, long j3, float f, C8413f fVar, C1546t tVar, int i) {
        C8413f fVar2 = fVar;
        C19383o.m32797g(fVar2, "style");
        this.f18422b.f18428c.mo6253e(C8343c.m16642c(j2), C8343c.m16643d(j2), C8347f.m16656d(j3) + C8343c.m16642c(j2), C8347f.m16654b(j3) + C8343c.m16643d(j2), m16743c(this, j, fVar2, f, tVar, i));
    }

    /* renamed from: I0 */
    public final void mo6906I0(C1533m mVar, long j, long j2, float f, C8413f fVar, C1546t tVar, int i) {
        C19383o.m32797g(mVar, "brush");
        C8413f fVar2 = fVar;
        C19383o.m32797g(fVar2, "style");
        this.f18422b.f18428c.mo6252d(C8343c.m16642c(j), C8343c.m16643d(j), C8347f.m16656d(j2) + C8343c.m16642c(j), C8347f.m16654b(j2) + C8343c.m16643d(j), mo20985f(mVar, fVar2, f, tVar, i, 1));
    }

    /* renamed from: L */
    public final void mo6908L(long j, long j2, long j3, long j4, C8413f fVar, float f, C1546t tVar, int i) {
        C8413f fVar2 = fVar;
        C19383o.m32797g(fVar2, "style");
        this.f18422b.f18428c.mo6270x(C8343c.m16642c(j2), C8343c.m16643d(j2), C8347f.m16656d(j3) + C8343c.m16642c(j2), C8347f.m16654b(j3) + C8343c.m16643d(j2), C8341a.m16635b(j4), C8341a.m16636c(j4), m16743c(this, j, fVar2, f, tVar, i));
    }

    /* renamed from: L0 */
    public final void mo6909L0(C1604x xVar, long j, long j2, long j3, long j4, float f, C8413f fVar, C1546t tVar, int i, int i2) {
        C19383o.m32797g(xVar, ResponseConstants.IMAGE);
        C19383o.m32797g(fVar, "style");
        C1537o oVar = this.f18422b.f18428c;
        C1537o oVar2 = oVar;
        oVar2.mo6254f(xVar, j, j2, j3, j4, mo20985f((C1533m) null, fVar, f, tVar, i, i2));
    }

    /* renamed from: M0 */
    public final void mo6910M0(C1533m mVar, long j, long j2, long j3, float f, C8413f fVar, C1546t tVar, int i) {
        C1533m mVar2 = mVar;
        C19383o.m32797g(mVar, "brush");
        C19383o.m32797g(fVar, "style");
        this.f18422b.f18428c.mo6270x(C8343c.m16642c(j), C8343c.m16643d(j), C8343c.m16642c(j) + C8347f.m16656d(j2), C8343c.m16643d(j) + C8347f.m16654b(j2), C8341a.m16635b(j3), C8341a.m16636c(j3), mo20985f(mVar, fVar, f, tVar, i, 1));
    }

    /* renamed from: Q0 */
    public final void mo6912Q0(C1533m mVar, long j, long j2, float f, int i, C18263b bVar, float f2, C1546t tVar, int i2) {
        C1533m mVar2 = mVar;
        float f3 = f;
        int i3 = i;
        C18263b bVar2 = bVar;
        C1546t tVar2 = tVar;
        int i4 = i2;
        C19383o.m32797g(mVar, "brush");
        C1537o oVar = this.f18422b.f18428c;
        C1516e eVar = this.f18425e;
        if (eVar == null) {
            eVar = new C1516e();
            eVar.mo6335u(1);
            this.f18425e = eVar;
        }
        mVar.mo6359a(f2, mo6913b(), eVar);
        if (!C19383o.m32792b(eVar.f3291d, tVar2)) {
            eVar.mo6247j(tVar2);
        }
        boolean z = false;
        if (!(eVar.f3289b == i4)) {
            eVar.mo6238b(i4);
        }
        if (!(eVar.mo6329o() == f3)) {
            eVar.mo6334t(f3);
        }
        if (!(eVar.mo6328n() == 4.0f)) {
            eVar.mo6333s(4.0f);
        }
        if (!(eVar.mo6326l() == i3)) {
            eVar.mo6331q(i3);
        }
        if (!(eVar.mo6327m() == 0)) {
            eVar.mo6332r(0);
        }
        eVar.getClass();
        if (!C19383o.m32792b((Object) null, bVar2)) {
            eVar.mo6330p(bVar2);
        }
        if (eVar.mo6248k() == 1) {
            z = true;
        }
        if (!z) {
            eVar.mo6240d(1);
        }
        oVar.mo6263q(j, j2, eVar);
    }

    /* renamed from: c0 */
    public final void mo6914c0(C1492b0 b0Var, C1533m mVar, float f, C8413f fVar, C1546t tVar, int i) {
        C19383o.m32797g(b0Var, ResponseConstants.PATH);
        C19383o.m32797g(mVar, "brush");
        C19383o.m32797g(fVar, "style");
        this.f18422b.f18428c.mo6267u(b0Var, mo20985f(mVar, fVar, f, tVar, i, 1));
    }

    /* renamed from: f */
    public final C1490a0 mo20985f(C1533m mVar, C8413f fVar, float f, C1546t tVar, int i, int i2) {
        C1490a0 s = mo20986s(fVar);
        boolean z = true;
        if (mVar != null) {
            mVar.mo6359a(f, mo6913b(), s);
        } else {
            if (!(s.getAlpha() == f)) {
                s.setAlpha(f);
            }
        }
        if (!C19383o.m32792b(s.mo6239c(), tVar)) {
            s.mo6247j(tVar);
        }
        if (!(s.mo6242f() == i)) {
            s.mo6238b(i);
        }
        if (s.mo6248k() != i2) {
            z = false;
        }
        if (!z) {
            s.mo6240d(i2);
        }
        return s;
    }

    public final float getDensity() {
        return this.f18422b.f18426a.getDensity();
    }

    public final LayoutDirection getLayoutDirection() {
        return this.f18422b.f18427b;
    }

    /* renamed from: h0 */
    public final void mo6916h0(ArrayList arrayList, long j, float f, int i, C18263b bVar, float f2, C1546t tVar, int i2) {
        ArrayList arrayList2 = arrayList;
        this.f18422b.f18428c.mo6257i(m16745m(this, j, f, i, bVar, f2, tVar, i2), arrayList);
    }

    /* renamed from: k0 */
    public final void mo6917k0(long j, float f, float f2, long j2, long j3, float f3, C8413f fVar, C1546t tVar, int i) {
        C8413f fVar2 = fVar;
        C19383o.m32797g(fVar2, "style");
        this.f18422b.f18428c.mo6256h(C8343c.m16642c(j2), C8343c.m16643d(j2), C8347f.m16656d(j3) + C8343c.m16642c(j2), C8347f.m16654b(j3) + C8343c.m16643d(j2), f, f2, m16743c(this, j, fVar2, f3, tVar, i));
    }

    /* renamed from: s */
    public final C1490a0 mo20986s(C8413f fVar) {
        boolean z = false;
        if (C19383o.m32792b(fVar, C8415h.f18433a)) {
            C1516e eVar = this.f18424d;
            if (eVar != null) {
                return eVar;
            }
            C1516e eVar2 = new C1516e();
            eVar2.mo6335u(0);
            this.f18424d = eVar2;
            return eVar2;
        } else if (fVar instanceof C8416i) {
            C1516e eVar3 = this.f18425e;
            if (eVar3 == null) {
                eVar3 = new C1516e();
                eVar3.mo6335u(1);
                this.f18425e = eVar3;
            }
            float o = eVar3.mo6329o();
            C8416i iVar = (C8416i) fVar;
            float f = iVar.f18434a;
            if (!(o == f)) {
                eVar3.mo6334t(f);
            }
            int l = eVar3.mo6326l();
            int i = iVar.f18436c;
            if (!(l == i)) {
                eVar3.mo6331q(i);
            }
            float n = eVar3.mo6328n();
            float f2 = iVar.f18435b;
            if (!(n == f2)) {
                eVar3.mo6333s(f2);
            }
            int m = eVar3.mo6327m();
            int i2 = iVar.f18437d;
            if (m == i2) {
                z = true;
            }
            if (!z) {
                eVar3.mo6332r(i2);
            }
            eVar3.getClass();
            iVar.getClass();
            if (!C19383o.m32792b((Object) null, (Object) null)) {
                iVar.getClass();
                eVar3.mo6330p((C18263b) null);
            }
            return eVar3;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: w0 */
    public final float mo3800w0() {
        return this.f18422b.f18426a.mo3800w0();
    }

    /* renamed from: z0 */
    public final void mo6918z0(C1492b0 b0Var, long j, float f, C8413f fVar, C1546t tVar, int i) {
        C19383o.m32797g(b0Var, ResponseConstants.PATH);
        C19383o.m32797g(fVar, "style");
        this.f18422b.f18428c.mo6267u(b0Var, m16743c(this, j, fVar, f, tVar, i));
    }
}
