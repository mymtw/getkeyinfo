package p594jh;

import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer2.source.C14344i;
import com.google.android.exoplayer2.source.ads.C14290a;
import com.google.common.collect.ImmutableList;
import p513bj.C14075p;
import p594jh.C17939k1;
import p602kh.C18086u0;

/* renamed from: jh.t0 */
public final class C17972t0 {

    /* renamed from: a */
    public final C17939k1.C17941b f39262a = new C17939k1.C17941b();

    /* renamed from: b */
    public final C17939k1.C17942c f39263b = new C17939k1.C17942c();

    /* renamed from: c */
    public final C18086u0 f39264c;

    /* renamed from: d */
    public final Handler f39265d;

    /* renamed from: e */
    public long f39266e;

    /* renamed from: f */
    public int f39267f;

    /* renamed from: g */
    public boolean f39268g;

    /* renamed from: h */
    public C17966q0 f39269h;

    /* renamed from: i */
    public C17966q0 f39270i;

    /* renamed from: j */
    public C17966q0 f39271j;

    /* renamed from: k */
    public int f39272k;

    /* renamed from: l */
    public Object f39273l;

    /* renamed from: m */
    public long f39274m;

    public C17972t0(C18086u0 u0Var, Handler handler) {
        this.f39264c = u0Var;
        this.f39265d = handler;
    }

    /* renamed from: m */
    public static C14344i.C14345a m30346m(C17939k1 k1Var, Object obj, long j, long j2, C17939k1.C17941b bVar) {
        Object obj2 = obj;
        long j3 = j;
        C17939k1 k1Var2 = k1Var;
        C17939k1.C17941b bVar2 = bVar;
        k1Var.mo69297g(obj2, bVar2);
        C14290a aVar = bVar2.f39104g;
        long j4 = bVar2.f39101d;
        int length = aVar.f31772c.length - 1;
        while (length >= 0) {
            boolean z = false;
            if (j3 != Long.MIN_VALUE) {
                long j5 = aVar.f31772c[length];
                if (j5 != Long.MIN_VALUE ? j3 < j5 : !(j4 != -9223372036854775807L && j3 >= j4)) {
                    z = true;
                }
            }
            if (!z) {
                break;
            }
            length--;
        }
        if (length < 0 || !aVar.f31773d[length].mo47666b()) {
            length = -1;
        }
        if (length == -1) {
            return new C14344i.C14345a(obj2, bVar2.mo69483b(j3), j2);
        }
        long j6 = j2;
        return new C14344i.C14345a(obj, j2, length, bVar2.mo69484c(length));
    }

    /* renamed from: a */
    public final C17966q0 mo69522a() {
        C17966q0 q0Var = this.f39269h;
        if (q0Var == null) {
            return null;
        }
        if (q0Var == this.f39270i) {
            this.f39270i = q0Var.f39244l;
        }
        q0Var.mo69515f();
        int i = this.f39272k - 1;
        this.f39272k = i;
        if (i == 0) {
            this.f39271j = null;
            C17966q0 q0Var2 = this.f39269h;
            this.f39273l = q0Var2.f39234b;
            this.f39274m = q0Var2.f39238f.f39249a.f39349d;
        }
        this.f39269h = this.f39269h.f39244l;
        mo69531j();
        return this.f39269h;
    }

    /* renamed from: b */
    public final void mo69523b() {
        if (this.f39272k != 0) {
            C17966q0 q0Var = this.f39269h;
            C14075p.m21696h(q0Var);
            this.f39273l = q0Var.f39234b;
            this.f39274m = q0Var.f39238f.f39249a.f39349d;
            while (q0Var != null) {
                q0Var.mo69515f();
                q0Var = q0Var.f39244l;
            }
            this.f39269h = null;
            this.f39271j = null;
            this.f39270i = null;
            this.f39272k = 0;
            mo69531j();
        }
    }

    /* renamed from: c */
    public final C17968r0 mo69524c(C17939k1 k1Var, C17966q0 q0Var, long j) {
        long j2;
        C17939k1 k1Var2 = k1Var;
        C17966q0 q0Var2 = q0Var;
        C17968r0 r0Var = q0Var2.f39238f;
        long j3 = (q0Var2.f39247o + r0Var.f39253e) - j;
        long j4 = 0;
        if (r0Var.f39254f) {
            int d = k1Var.mo69475d(k1Var2.mo47698b(r0Var.f39249a.f39346a), this.f39262a, this.f39263b, this.f39267f, this.f39268g);
            if (d == -1) {
                return null;
            }
            int i = k1Var2.mo47630f(d, this.f39262a, true).f39100c;
            Object obj = this.f39262a.f39099b;
            long j5 = r0Var.f39249a.f39349d;
            if (k1Var2.mo69480m(i, this.f39263b).f39121o == d) {
                Pair<Object, Long> j6 = k1Var.mo69479j(this.f39263b, this.f39262a, i, -9223372036854775807L, Math.max(0, j3));
                if (j6 == null) {
                    return null;
                }
                obj = j6.first;
                long longValue = ((Long) j6.second).longValue();
                C17966q0 q0Var3 = q0Var2.f39244l;
                if (q0Var3 == null || !q0Var3.f39234b.equals(obj)) {
                    j5 = this.f39266e;
                    this.f39266e = 1 + j5;
                } else {
                    j5 = q0Var3.f39238f.f39249a.f39349d;
                }
                j2 = longValue;
                j4 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            return mo69525d(k1Var, m30346m(k1Var, obj, j2, j5, this.f39262a), j4, j2);
        }
        C14344i.C14345a aVar = r0Var.f39249a;
        k1Var2.mo69297g(aVar.f39346a, this.f39262a);
        if (aVar.mo69559a()) {
            int i2 = aVar.f39347b;
            C14290a.C14291a aVar2 = this.f39262a.f39104g.f31773d[i2];
            int i3 = aVar2.f31776a;
            if (i3 == -1) {
                return null;
            }
            int a = aVar2.mo47665a(aVar.f39348c);
            if (a < i3) {
                return mo69526e(k1Var, aVar.f39346a, i2, a, r0Var.f39251c, aVar.f39349d);
            }
            long j7 = r0Var.f39251c;
            if (j7 == -9223372036854775807L) {
                C17939k1.C17942c cVar = this.f39263b;
                C17939k1.C17941b bVar = this.f39262a;
                Pair<Object, Long> j8 = k1Var.mo69479j(cVar, bVar, bVar.f39100c, -9223372036854775807L, Math.max(0, j3));
                if (j8 == null) {
                    return null;
                }
                j7 = ((Long) j8.second).longValue();
            }
            return mo69527f(k1Var, aVar.f39346a, j7, r0Var.f39251c, aVar.f39349d);
        }
        int c = this.f39262a.mo69484c(aVar.f39350e);
        C17939k1.C17941b bVar2 = this.f39262a;
        int i4 = aVar.f39350e;
        if (c == bVar2.f39104g.f31773d[i4].f31776a) {
            Object obj2 = aVar.f39346a;
            long j9 = r0Var.f39253e;
            return mo69527f(k1Var, obj2, j9, j9, aVar.f39349d);
        }
        return mo69526e(k1Var, aVar.f39346a, i4, c, r0Var.f39253e, aVar.f39349d);
    }

    /* renamed from: d */
    public final C17968r0 mo69525d(C17939k1 k1Var, C14344i.C14345a aVar, long j, long j2) {
        C14344i.C14345a aVar2 = aVar;
        C17939k1 k1Var2 = k1Var;
        k1Var.mo69297g(aVar2.f39346a, this.f39262a);
        if (aVar.mo69559a()) {
            return mo69526e(k1Var, aVar2.f39346a, aVar2.f39347b, aVar2.f39348c, j, aVar2.f39349d);
        }
        return mo69527f(k1Var, aVar2.f39346a, j2, j, aVar2.f39349d);
    }

    /* renamed from: e */
    public final C17968r0 mo69526e(C17939k1 k1Var, Object obj, int i, int i2, long j, long j2) {
        int i3 = i;
        int i4 = i2;
        C14344i.C14345a aVar = new C14344i.C14345a(obj, j2, i, i2);
        long a = k1Var.mo69297g(obj, this.f39262a).mo69482a(i3, i4);
        long j3 = i4 == this.f39262a.mo69484c(i3) ? this.f39262a.f39104g.f31774e : 0;
        return new C17968r0(aVar, (a == -9223372036854775807L || j3 < a) ? j3 : Math.max(0, a - 1), j, -9223372036854775807L, a, false, false, false);
    }

    /* renamed from: f */
    public final C17968r0 mo69527f(C17939k1 k1Var, Object obj, long j, long j2, long j3) {
        C17939k1 k1Var2 = k1Var;
        Object obj2 = obj;
        long j4 = j;
        k1Var2.mo69297g(obj2, this.f39262a);
        int b = this.f39262a.mo69483b(j4);
        C14344i.C14345a aVar = new C14344i.C14345a(obj2, b, j3);
        boolean z = !aVar.mo69559a() && b == -1;
        boolean i = mo69530i(k1Var2, aVar);
        boolean h = mo69529h(k1Var2, aVar, z);
        long j5 = b != -1 ? this.f39262a.f39104g.f31772c[b] : -9223372036854775807L;
        long j6 = (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? this.f39262a.f39101d : j5;
        if (j6 != -9223372036854775807L && j4 >= j6) {
            j4 = Math.max(0, j6 - 1);
        }
        return new C17968r0(aVar, j4, j2, j5, j6, z, i, h);
    }

    /* renamed from: g */
    public final C17968r0 mo69528g(C17939k1 k1Var, C17968r0 r0Var) {
        long j;
        C14344i.C14345a aVar = r0Var.f39249a;
        boolean z = !aVar.mo69559a() && aVar.f39350e == -1;
        boolean i = mo69530i(k1Var, aVar);
        boolean h = mo69529h(k1Var, aVar, z);
        k1Var.mo69297g(r0Var.f39249a.f39346a, this.f39262a);
        if (aVar.mo69559a()) {
            j = this.f39262a.mo69482a(aVar.f39347b, aVar.f39348c);
        } else {
            j = r0Var.f39252d;
            if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
                j = this.f39262a.f39101d;
            }
        }
        return new C17968r0(aVar, r0Var.f39250b, r0Var.f39251c, r0Var.f39252d, j, z, i, h);
    }

    /* renamed from: h */
    public final boolean mo69529h(C17939k1 k1Var, C14344i.C14345a aVar, boolean z) {
        int b = k1Var.mo47698b(aVar.f39346a);
        if (k1Var.mo69480m(k1Var.mo47630f(b, this.f39262a, false).f39100c, this.f39263b).f39115i) {
            return false;
        }
        return (k1Var.mo69475d(b, this.f39262a, this.f39263b, this.f39267f, this.f39268g) == -1) && z;
    }

    /* renamed from: i */
    public final boolean mo69530i(C17939k1 k1Var, C14344i.C14345a aVar) {
        if (!(!aVar.mo69559a() && aVar.f39350e == -1)) {
            return false;
        }
        return k1Var.mo69480m(k1Var.mo69297g(aVar.f39346a, this.f39262a).f39100c, this.f39263b).f39122p == k1Var.mo47698b(aVar.f39346a);
    }

    /* renamed from: j */
    public final void mo69531j() {
        if (this.f39264c != null) {
            ImmutableList.C15953a builder = ImmutableList.builder();
            for (C17966q0 q0Var = this.f39269h; q0Var != null; q0Var = q0Var.f39244l) {
                builder.mo56633b(q0Var.f39238f.f39249a);
            }
            C17966q0 q0Var2 = this.f39270i;
            this.f39265d.post(new C17970s0(this, builder, q0Var2 == null ? null : q0Var2.f39238f.f39249a));
        }
    }

    /* renamed from: k */
    public final boolean mo69532k(C17966q0 q0Var) {
        boolean z = false;
        C14075p.m21694f(q0Var != null);
        if (q0Var.equals(this.f39271j)) {
            return false;
        }
        this.f39271j = q0Var;
        while (true) {
            q0Var = q0Var.f39244l;
            if (q0Var == null) {
                break;
            }
            if (q0Var == this.f39270i) {
                this.f39270i = this.f39269h;
                z = true;
            }
            q0Var.mo69515f();
            this.f39272k--;
        }
        C17966q0 q0Var2 = this.f39271j;
        if (q0Var2.f39244l != null) {
            q0Var2.mo69511b();
            q0Var2.f39244l = null;
            q0Var2.mo69512c();
        }
        mo69531j();
        return z;
    }

    /* renamed from: l */
    public final C14344i.C14345a mo69533l(C17939k1 k1Var, Object obj, long j) {
        long j2;
        int b;
        int i = k1Var.mo69297g(obj, this.f39262a).f39100c;
        Object obj2 = this.f39273l;
        if (obj2 == null || (b = k1Var.mo47698b(obj2)) == -1 || k1Var.mo47630f(b, this.f39262a, false).f39100c != i) {
            C17966q0 q0Var = this.f39269h;
            while (true) {
                if (q0Var == null) {
                    C17966q0 q0Var2 = this.f39269h;
                    while (true) {
                        if (q0Var2 != null) {
                            int b2 = k1Var.mo47698b(q0Var2.f39234b);
                            if (b2 != -1 && k1Var.mo47630f(b2, this.f39262a, false).f39100c == i) {
                                j2 = q0Var2.f39238f.f39249a.f39349d;
                                break;
                            }
                            q0Var2 = q0Var2.f39244l;
                        } else {
                            j2 = this.f39266e;
                            this.f39266e = 1 + j2;
                            if (this.f39269h == null) {
                                this.f39273l = obj;
                                this.f39274m = j2;
                            }
                        }
                    }
                } else if (q0Var.f39234b.equals(obj)) {
                    j2 = q0Var.f39238f.f39249a.f39349d;
                    break;
                } else {
                    q0Var = q0Var.f39244l;
                }
            }
        } else {
            j2 = this.f39274m;
        }
        return m30346m(k1Var, obj, j, j2, this.f39262a);
    }

    /* renamed from: n */
    public final boolean mo69534n(C17939k1 k1Var) {
        C17966q0 q0Var;
        C17966q0 q0Var2 = this.f39269h;
        if (q0Var2 == null) {
            return true;
        }
        int b = k1Var.mo47698b(q0Var2.f39234b);
        while (true) {
            b = k1Var.mo69475d(b, this.f39262a, this.f39263b, this.f39267f, this.f39268g);
            while (true) {
                q0Var = q0Var2.f39244l;
                if (q0Var != null && !q0Var2.f39238f.f39254f) {
                    q0Var2 = q0Var;
                }
            }
            if (b == -1 || q0Var == null || k1Var.mo47698b(q0Var.f39234b) != b) {
                boolean k = mo69532k(q0Var2);
                q0Var2.f39238f = mo69528g(k1Var, q0Var2.f39238f);
            } else {
                q0Var2 = q0Var;
            }
        }
        boolean k2 = mo69532k(q0Var2);
        q0Var2.f39238f = mo69528g(k1Var, q0Var2.f39238f);
        return !k2;
    }

    /* renamed from: o */
    public final boolean mo69535o(C17939k1 k1Var, long j, long j2) {
        C17968r0 r0Var;
        boolean k;
        C17939k1 k1Var2 = k1Var;
        C17966q0 q0Var = this.f39269h;
        C17966q0 q0Var2 = null;
        while (q0Var != null) {
            C17968r0 r0Var2 = q0Var.f39238f;
            if (q0Var2 == null) {
                r0Var = mo69528g(k1Var2, r0Var2);
                long j3 = j;
            } else {
                C17968r0 c = mo69524c(k1Var2, q0Var2, j);
                if (c == null) {
                    k = mo69532k(q0Var2);
                } else {
                    if (!(r0Var2.f39250b == c.f39250b && r0Var2.f39249a.equals(c.f39249a))) {
                        k = mo69532k(q0Var2);
                    } else {
                        r0Var = c;
                    }
                }
                return !k;
            }
            q0Var.f39238f = r0Var.mo69517a(r0Var2.f39251c);
            long j4 = r0Var2.f39253e;
            long j5 = r0Var.f39253e;
            if (!(j4 == -9223372036854775807L || j4 == j5)) {
                return !mo69532k(q0Var) && !(q0Var == this.f39270i && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j5 > -9223372036854775807L ? 1 : (j5 == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : q0Var.f39247o + j5) ? 1 : (j2 == ((j5 > -9223372036854775807L ? 1 : (j5 == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : q0Var.f39247o + j5) ? 0 : -1)) >= 0));
            }
            q0Var2 = q0Var;
            q0Var = q0Var.f39244l;
        }
        return true;
    }
}
