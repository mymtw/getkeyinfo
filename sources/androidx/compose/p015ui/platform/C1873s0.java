package androidx.compose.p015ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1492b0;
import androidx.compose.p015ui.graphics.C1517e0;
import androidx.compose.p015ui.graphics.C1521g;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1606z;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p173m.C7279a;
import p174m0.C7282b;
import p288y.C8341a;
import p288y.C8343c;
import p288y.C8345d;
import p288y.C8346e;
import p288y.C8347f;
import p628nj.C18263b;

/* renamed from: androidx.compose.ui.platform.s0 */
public final class C1873s0 {

    /* renamed from: a */
    public C7282b f4134a;

    /* renamed from: b */
    public boolean f4135b = true;

    /* renamed from: c */
    public final Outline f4136c;

    /* renamed from: d */
    public long f4137d;

    /* renamed from: e */
    public C1530k0 f4138e;

    /* renamed from: f */
    public C1521g f4139f;

    /* renamed from: g */
    public C1492b0 f4140g;

    /* renamed from: h */
    public boolean f4141h;

    /* renamed from: i */
    public boolean f4142i;

    /* renamed from: j */
    public C1492b0 f4143j;

    /* renamed from: k */
    public C8346e f4144k;

    /* renamed from: l */
    public float f4145l;

    /* renamed from: m */
    public long f4146m;

    /* renamed from: n */
    public long f4147n;

    /* renamed from: o */
    public boolean f4148o;

    /* renamed from: p */
    public LayoutDirection f4149p;

    /* renamed from: q */
    public C1606z f4150q;

    public C1873s0(C7282b bVar) {
        C19383o.m32797g(bVar, "density");
        this.f4134a = bVar;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f4136c = outline;
        long j = C8347f.f18313b;
        this.f4137d = j;
        this.f4138e = C1517e0.f3292a;
        this.f4146m = C8343c.f18295b;
        this.f4147n = j;
        this.f4149p = LayoutDirection.Ltr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        if (r8 == false) goto L_0x0086;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7278a(androidx.compose.p015ui.graphics.C1537o r13) {
        /*
            r12 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            r12.mo7282e()
            androidx.compose.ui.graphics.b0 r0 = r12.f4140g
            r1 = 1
            if (r0 == 0) goto L_0x0012
            r13.mo6259k(r0, r1)
            goto L_0x00fa
        L_0x0012:
            float r0 = r12.f4145l
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x00cd
            androidx.compose.ui.graphics.b0 r2 = r12.f4143j
            y.e r3 = r12.f4144k
            if (r2 == 0) goto L_0x0086
            long r4 = r12.f4146m
            long r6 = r12.f4147n
            r8 = 0
            if (r3 == 0) goto L_0x0084
            boolean r9 = androidx.compose.foundation.layout.C0761x.m1740q0(r3)
            if (r9 != 0) goto L_0x002e
            goto L_0x0084
        L_0x002e:
            float r9 = r3.f18305a
            float r10 = p288y.C8343c.m16642c(r4)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x003a
            r9 = r1
            goto L_0x003b
        L_0x003a:
            r9 = r8
        L_0x003b:
            if (r9 == 0) goto L_0x0084
            float r9 = r3.f18306b
            float r10 = p288y.C8343c.m16643d(r4)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0049
            r9 = r1
            goto L_0x004a
        L_0x0049:
            r9 = r8
        L_0x004a:
            if (r9 == 0) goto L_0x0084
            float r9 = r3.f18307c
            float r10 = p288y.C8343c.m16642c(r4)
            float r11 = p288y.C8347f.m16656d(r6)
            float r11 = r11 + r10
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x005d
            r9 = r1
            goto L_0x005e
        L_0x005d:
            r9 = r8
        L_0x005e:
            if (r9 == 0) goto L_0x0084
            float r9 = r3.f18308d
            float r4 = p288y.C8343c.m16643d(r4)
            float r5 = p288y.C8347f.m16654b(r6)
            float r5 = r5 + r4
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0071
            r4 = r1
            goto L_0x0072
        L_0x0071:
            r4 = r8
        L_0x0072:
            if (r4 == 0) goto L_0x0084
            long r3 = r3.f18309e
            float r3 = p288y.C8341a.m16635b(r3)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0080
            r0 = r1
            goto L_0x0081
        L_0x0080:
            r0 = r8
        L_0x0081:
            if (r0 == 0) goto L_0x0084
            r8 = r1
        L_0x0084:
            if (r8 != 0) goto L_0x00c9
        L_0x0086:
            long r3 = r12.f4146m
            float r5 = p288y.C8343c.m16642c(r3)
            long r3 = r12.f4146m
            float r6 = p288y.C8343c.m16643d(r3)
            long r3 = r12.f4146m
            float r0 = p288y.C8343c.m16642c(r3)
            long r3 = r12.f4147n
            float r3 = p288y.C8347f.m16656d(r3)
            float r7 = r3 + r0
            long r3 = r12.f4146m
            float r0 = p288y.C8343c.m16643d(r3)
            long r3 = r12.f4147n
            float r3 = p288y.C8347f.m16654b(r3)
            float r8 = r3 + r0
            float r0 = r12.f4145l
            long r9 = androidx.activity.C0114h.m317s(r0, r0)
            y.e r0 = androidx.compose.foundation.layout.C0761x.m1712c(r5, r6, r7, r8, r9)
            if (r2 != 0) goto L_0x00bf
            androidx.compose.ui.graphics.g r2 = p628nj.C18263b.m30838d()
            goto L_0x00c2
        L_0x00bf:
            r2.reset()
        L_0x00c2:
            r2.mo6277d(r0)
            r12.f4144k = r0
            r12.f4143j = r2
        L_0x00c9:
            r13.mo6259k(r2, r1)
            goto L_0x00fa
        L_0x00cd:
            long r0 = r12.f4146m
            float r3 = p288y.C8343c.m16642c(r0)
            long r0 = r12.f4146m
            float r4 = p288y.C8343c.m16643d(r0)
            long r0 = r12.f4146m
            float r0 = p288y.C8343c.m16642c(r0)
            long r1 = r12.f4147n
            float r1 = p288y.C8347f.m16656d(r1)
            float r5 = r1 + r0
            long r0 = r12.f4146m
            float r0 = p288y.C8343c.m16643d(r0)
            long r1 = r12.f4147n
            float r1 = p288y.C8347f.m16654b(r1)
            float r6 = r1 + r0
            r7 = 1
            r2 = r13
            r2.mo6258j(r3, r4, r5, r6, r7)
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.C1873s0.mo7278a(androidx.compose.ui.graphics.o):void");
    }

    /* renamed from: b */
    public final Outline mo7279b() {
        mo7282e();
        if (!this.f4148o || !this.f4135b) {
            return null;
        }
        return this.f4136c;
    }

    /* renamed from: c */
    public final boolean mo7280c(long j) {
        C1606z zVar;
        if (!this.f4148o || (zVar = this.f4150q) == null) {
            return true;
        }
        float c = C8343c.m16642c(j);
        float d = C8343c.m16643d(j);
        boolean z = false;
        if (zVar instanceof C1606z.C1608b) {
            C8345d dVar = ((C1606z.C1608b) zVar).f3572a;
            if (dVar.f18301a <= c && c < dVar.f18303c && dVar.f18302b <= d && d < dVar.f18304d) {
                return true;
            }
        } else if (zVar instanceof C1606z.C1609c) {
            C8346e eVar = ((C1606z.C1609c) zVar).f3573a;
            if (c >= eVar.f18305a && c < eVar.f18307c && d >= eVar.f18306b && d < eVar.f18308d) {
                if (C8341a.m16635b(eVar.f18310f) + C8341a.m16635b(eVar.f18309e) <= eVar.f18307c - eVar.f18305a) {
                    if (C8341a.m16635b(eVar.f18311g) + C8341a.m16635b(eVar.f18312h) <= eVar.f18307c - eVar.f18305a) {
                        if (C8341a.m16636c(eVar.f18312h) + C8341a.m16636c(eVar.f18309e) <= eVar.f18308d - eVar.f18306b) {
                            if (C8341a.m16636c(eVar.f18311g) + C8341a.m16636c(eVar.f18310f) <= eVar.f18308d - eVar.f18306b) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    C1521g d2 = C18263b.m30838d();
                    d2.mo6277d(eVar);
                    return C0114h.m306k0(d2, c, d);
                }
                float b = C8341a.m16635b(eVar.f18309e) + eVar.f18305a;
                float c2 = C8341a.m16636c(eVar.f18309e) + eVar.f18306b;
                float b2 = eVar.f18307c - C8341a.m16635b(eVar.f18310f);
                float c3 = eVar.f18306b + C8341a.m16636c(eVar.f18310f);
                float b3 = eVar.f18307c - C8341a.m16635b(eVar.f18311g);
                float c4 = eVar.f18308d - C8341a.m16636c(eVar.f18311g);
                float c5 = eVar.f18308d - C8341a.m16636c(eVar.f18312h);
                float b4 = eVar.f18305a + C8341a.m16635b(eVar.f18312h);
                if (c < b && d < c2) {
                    return C0114h.m308m0(c, d, b, c2, eVar.f18309e);
                }
                if (c < b4 && d > c5) {
                    return C0114h.m308m0(c, d, b4, c5, eVar.f18312h);
                } else if (c > b2 && d < c3) {
                    return C0114h.m308m0(c, d, b2, c3, eVar.f18310f);
                } else if (c <= b3 || d <= c4) {
                    return true;
                } else {
                    return C0114h.m308m0(c, d, b3, c4, eVar.f18311g);
                }
            }
        } else if (zVar instanceof C1606z.C1607a) {
            return C0114h.m306k0(((C1606z.C1607a) zVar).f3571a, c, d);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo7281d(C1530k0 k0Var, float f, boolean z, float f2, LayoutDirection layoutDirection, C7282b bVar) {
        C19383o.m32797g(k0Var, "shape");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        C19383o.m32797g(bVar, "density");
        this.f4136c.setAlpha(f);
        boolean z2 = !C19383o.m32792b(this.f4138e, k0Var);
        if (z2) {
            this.f4138e = k0Var;
            this.f4141h = true;
        }
        boolean z3 = z || f2 > 0.0f;
        if (this.f4148o != z3) {
            this.f4148o = z3;
            this.f4141h = true;
        }
        if (this.f4149p != layoutDirection) {
            this.f4149p = layoutDirection;
            this.f4141h = true;
        }
        if (!C19383o.m32792b(this.f4134a, bVar)) {
            this.f4134a = bVar;
            this.f4141h = true;
        }
        return z2;
    }

    /* renamed from: e */
    public final void mo7282e() {
        if (this.f4141h) {
            this.f4146m = C8343c.f18295b;
            long j = this.f4137d;
            this.f4147n = j;
            this.f4145l = 0.0f;
            this.f4140g = null;
            this.f4141h = false;
            this.f4142i = false;
            if (!this.f4148o || C8347f.m16656d(j) <= 0.0f || C8347f.m16654b(this.f4137d) <= 0.0f) {
                this.f4136c.setEmpty();
                return;
            }
            this.f4135b = true;
            C1606z a = this.f4138e.mo3864a(this.f4137d, this.f4149p, this.f4134a);
            this.f4150q = a;
            if (a instanceof C1606z.C1608b) {
                C8345d dVar = ((C1606z.C1608b) a).f3572a;
                this.f4146m = C19421p.m32952q(dVar.f18301a, dVar.f18302b);
                this.f4147n = C0114h.m319t(dVar.f18303c - dVar.f18301a, dVar.f18304d - dVar.f18302b);
                this.f4136c.setRect(C7279a.m13954l(dVar.f18301a), C7279a.m13954l(dVar.f18302b), C7279a.m13954l(dVar.f18303c), C7279a.m13954l(dVar.f18304d));
            } else if (a instanceof C1606z.C1609c) {
                C8346e eVar = ((C1606z.C1609c) a).f3573a;
                float b = C8341a.m16635b(eVar.f18309e);
                this.f4146m = C19421p.m32952q(eVar.f18305a, eVar.f18306b);
                this.f4147n = C0114h.m319t(eVar.f18307c - eVar.f18305a, eVar.f18308d - eVar.f18306b);
                if (C0761x.m1740q0(eVar)) {
                    this.f4136c.setRoundRect(C7279a.m13954l(eVar.f18305a), C7279a.m13954l(eVar.f18306b), C7279a.m13954l(eVar.f18307c), C7279a.m13954l(eVar.f18308d), b);
                    this.f4145l = b;
                    return;
                }
                C1521g gVar = this.f4139f;
                if (gVar == null) {
                    gVar = C18263b.m30838d();
                    this.f4139f = gVar;
                }
                gVar.reset();
                gVar.mo6277d(eVar);
                mo7283f(gVar);
            } else if (a instanceof C1606z.C1607a) {
                mo7283f(((C1606z.C1607a) a).f3571a);
            }
        }
    }

    /* renamed from: f */
    public final void mo7283f(C1492b0 b0Var) {
        if (Build.VERSION.SDK_INT > 28 || b0Var.mo6273a()) {
            Outline outline = this.f4136c;
            if (b0Var instanceof C1521g) {
                outline.setConvexPath(((C1521g) b0Var).f3296a);
                this.f4142i = !this.f4136c.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            this.f4135b = false;
            this.f4136c.setEmpty();
            this.f4142i = true;
        }
        this.f4140g = b0Var;
    }
}
