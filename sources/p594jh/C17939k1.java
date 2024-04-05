package p594jh;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.source.ads.C14290a;
import p513bj.C14049b0;
import p513bj.C14075p;
import p594jh.C17954o0;

/* renamed from: jh.k1 */
public abstract class C17939k1 {

    /* renamed from: a */
    public static final C17940a f39097a = new C17940a();

    /* renamed from: jh.k1$a */
    public class C17940a extends C17939k1 {
        /* renamed from: b */
        public final int mo47698b(Object obj) {
            return -1;
        }

        /* renamed from: f */
        public final C17941b mo47630f(int i, C17941b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: h */
        public final int mo47700h() {
            return 0;
        }

        /* renamed from: l */
        public final Object mo47699l(int i) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: n */
        public final C17942c mo47631n(int i, C17942c cVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: o */
        public final int mo47701o() {
            return 0;
        }
    }

    /* renamed from: jh.k1$b */
    public static final class C17941b {

        /* renamed from: a */
        public Object f39098a;

        /* renamed from: b */
        public Object f39099b;

        /* renamed from: c */
        public int f39100c;

        /* renamed from: d */
        public long f39101d;

        /* renamed from: e */
        public long f39102e;

        /* renamed from: f */
        public boolean f39103f;

        /* renamed from: g */
        public C14290a f39104g = C14290a.f31769g;

        /* renamed from: a */
        public final long mo69482a(int i, int i2) {
            C14290a.C14291a aVar = this.f39104g.f31773d[i];
            if (aVar.f31776a != -1) {
                return aVar.f31779d[i2];
            }
            return -9223372036854775807L;
        }

        /* renamed from: b */
        public final int mo69483b(long j) {
            C14290a aVar = this.f39104g;
            long j2 = this.f39101d;
            aVar.getClass();
            if (j == Long.MIN_VALUE) {
                return -1;
            }
            if (j2 != -9223372036854775807L && j >= j2) {
                return -1;
            }
            int i = 0;
            while (true) {
                long[] jArr = aVar.f31772c;
                if (i >= jArr.length) {
                    break;
                }
                long j3 = jArr[i];
                if ((j3 == Long.MIN_VALUE || j3 > j) && aVar.f31773d[i].mo47666b()) {
                    break;
                }
                i++;
            }
            if (i < aVar.f31772c.length) {
                return i;
            }
            return -1;
        }

        /* renamed from: c */
        public final int mo69484c(int i) {
            return this.f39104g.f31773d[i].mo47665a(-1);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C17941b.class.equals(obj.getClass())) {
                return false;
            }
            C17941b bVar = (C17941b) obj;
            return C14049b0.m21628a(this.f39098a, bVar.f39098a) && C14049b0.m21628a(this.f39099b, bVar.f39099b) && this.f39100c == bVar.f39100c && this.f39101d == bVar.f39101d && this.f39102e == bVar.f39102e && this.f39103f == bVar.f39103f && C14049b0.m21628a(this.f39104g, bVar.f39104g);
        }

        public final int hashCode() {
            Object obj = this.f39098a;
            int i = 0;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f39099b;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            long j = this.f39101d;
            long j2 = this.f39102e;
            return this.f39104g.hashCode() + ((((((((((hashCode + i) * 31) + this.f39100c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f39103f ? 1 : 0)) * 31);
        }
    }

    /* renamed from: jh.k1$c */
    public static final class C17942c {

        /* renamed from: r */
        public static final Object f39105r = new Object();

        /* renamed from: s */
        public static final C17954o0 f39106s;

        /* renamed from: a */
        public Object f39107a = f39105r;
        @Deprecated

        /* renamed from: b */
        public Object f39108b;

        /* renamed from: c */
        public C17954o0 f39109c = f39106s;

        /* renamed from: d */
        public Object f39110d;

        /* renamed from: e */
        public long f39111e;

        /* renamed from: f */
        public long f39112f;

        /* renamed from: g */
        public long f39113g;

        /* renamed from: h */
        public boolean f39114h;

        /* renamed from: i */
        public boolean f39115i;
        @Deprecated

        /* renamed from: j */
        public boolean f39116j;

        /* renamed from: k */
        public C17954o0.C17959e f39117k;

        /* renamed from: l */
        public boolean f39118l;

        /* renamed from: m */
        public long f39119m;

        /* renamed from: n */
        public long f39120n;

        /* renamed from: o */
        public int f39121o;

        /* renamed from: p */
        public int f39122p;

        /* renamed from: q */
        public long f39123q;

        static {
            C17954o0.C17956b bVar = new C17954o0.C17956b();
            bVar.f39145a = "com.google.android.exoplayer2.Timeline";
            bVar.f39146b = Uri.EMPTY;
            f39106s = bVar.mo69497a();
        }

        /* renamed from: a */
        public final boolean mo69487a() {
            C14075p.m21694f(this.f39116j == (this.f39117k != null));
            return this.f39117k != null;
        }

        /* renamed from: b */
        public final void mo69488b(C17954o0 o0Var, Object obj, long j, long j2, long j3, boolean z, boolean z2, C17954o0.C17959e eVar, long j4, long j5, long j6) {
            C17954o0.C17960f fVar;
            C17954o0 o0Var2 = o0Var;
            C17954o0.C17959e eVar2 = eVar;
            this.f39107a = f39105r;
            this.f39109c = o0Var2 != null ? o0Var2 : f39106s;
            this.f39108b = (o0Var2 == null || (fVar = o0Var2.f39138b) == null) ? null : fVar.f39196h;
            this.f39110d = obj;
            this.f39111e = j;
            this.f39112f = j2;
            this.f39113g = j3;
            this.f39114h = z;
            this.f39115i = z2;
            this.f39116j = eVar2 != null;
            this.f39117k = eVar2;
            this.f39119m = j4;
            this.f39120n = j5;
            this.f39121o = 0;
            this.f39122p = 0;
            this.f39123q = j6;
            this.f39118l = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C17942c.class.equals(obj.getClass())) {
                return false;
            }
            C17942c cVar = (C17942c) obj;
            return C14049b0.m21628a(this.f39107a, cVar.f39107a) && C14049b0.m21628a(this.f39109c, cVar.f39109c) && C14049b0.m21628a(this.f39110d, cVar.f39110d) && C14049b0.m21628a(this.f39117k, cVar.f39117k) && this.f39111e == cVar.f39111e && this.f39112f == cVar.f39112f && this.f39113g == cVar.f39113g && this.f39114h == cVar.f39114h && this.f39115i == cVar.f39115i && this.f39118l == cVar.f39118l && this.f39119m == cVar.f39119m && this.f39120n == cVar.f39120n && this.f39121o == cVar.f39121o && this.f39122p == cVar.f39122p && this.f39123q == cVar.f39123q;
        }

        public final int hashCode() {
            int hashCode = (this.f39109c.hashCode() + ((this.f39107a.hashCode() + 217) * 31)) * 31;
            Object obj = this.f39110d;
            int i = 0;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            C17954o0.C17959e eVar = this.f39117k;
            if (eVar != null) {
                i = eVar.hashCode();
            }
            long j = this.f39111e;
            long j2 = this.f39112f;
            long j3 = this.f39113g;
            long j4 = this.f39119m;
            long j5 = this.f39120n;
            long j6 = this.f39123q;
            return ((((((((((((((((((((((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f39114h ? 1 : 0)) * 31) + (this.f39115i ? 1 : 0)) * 31) + (this.f39118l ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f39121o) * 31) + this.f39122p) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    /* renamed from: a */
    public int mo69294a(boolean z) {
        return mo69481p() ? -1 : 0;
    }

    /* renamed from: b */
    public abstract int mo47698b(Object obj);

    /* renamed from: c */
    public int mo69295c(boolean z) {
        if (mo69481p()) {
            return -1;
        }
        return mo47701o() - 1;
    }

    /* renamed from: d */
    public final int mo69475d(int i, C17941b bVar, C17942c cVar, int i2, boolean z) {
        int i3 = mo47630f(i, bVar, false).f39100c;
        if (mo69480m(i3, cVar).f39122p != i) {
            return i + 1;
        }
        int e = mo69296e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return mo69480m(e, cVar).f39121o;
    }

    /* renamed from: e */
    public int mo69296e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo69295c(z) ? mo69294a(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == mo69295c(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17939k1)) {
            return false;
        }
        C17939k1 k1Var = (C17939k1) obj;
        if (k1Var.mo47701o() != mo47701o() || k1Var.mo47700h() != mo47700h()) {
            return false;
        }
        C17942c cVar = new C17942c();
        C17941b bVar = new C17941b();
        C17942c cVar2 = new C17942c();
        C17941b bVar2 = new C17941b();
        for (int i = 0; i < mo47701o(); i++) {
            if (!mo69480m(i, cVar).equals(k1Var.mo69480m(i, cVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo47700h(); i2++) {
            if (!mo47630f(i2, bVar, true).equals(k1Var.mo47630f(i2, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public abstract C17941b mo47630f(int i, C17941b bVar, boolean z);

    /* renamed from: g */
    public C17941b mo69297g(Object obj, C17941b bVar) {
        return mo47630f(mo47698b(obj), bVar, true);
    }

    /* renamed from: h */
    public abstract int mo47700h();

    public final int hashCode() {
        C17942c cVar = new C17942c();
        C17941b bVar = new C17941b();
        int o = mo47701o() + 217;
        for (int i = 0; i < mo47701o(); i++) {
            o = (o * 31) + mo69480m(i, cVar).hashCode();
        }
        int h = mo47700h() + (o * 31);
        for (int i2 = 0; i2 < mo47700h(); i2++) {
            h = (h * 31) + mo47630f(i2, bVar, true).hashCode();
        }
        return h;
    }

    /* renamed from: i */
    public final Pair<Object, Long> mo69478i(C17942c cVar, C17941b bVar, int i, long j) {
        Pair<Object, Long> j2 = mo69479j(cVar, bVar, i, j, 0);
        j2.getClass();
        return j2;
    }

    /* renamed from: j */
    public final Pair<Object, Long> mo69479j(C17942c cVar, C17941b bVar, int i, long j, long j2) {
        C14075p.m21693e(i, mo47701o());
        mo47631n(i, cVar, j2);
        if (j == -9223372036854775807L) {
            j = cVar.f39119m;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.f39121o;
        mo47630f(i2, bVar, false);
        while (i2 < cVar.f39122p && bVar.f39102e != j) {
            int i3 = i2 + 1;
            if (mo47630f(i3, bVar, false).f39102e > j) {
                break;
            }
            i2 = i3;
        }
        mo47630f(i2, bVar, true);
        Object obj = bVar.f39099b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(j - bVar.f39102e));
    }

    /* renamed from: k */
    public int mo69298k(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo69294a(z) ? mo69295c(z) : i - 1;
            }
            throw new IllegalStateException();
        } else if (i == mo69294a(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    /* renamed from: l */
    public abstract Object mo47699l(int i);

    /* renamed from: m */
    public final C17942c mo69480m(int i, C17942c cVar) {
        return mo47631n(i, cVar, 0);
    }

    /* renamed from: n */
    public abstract C17942c mo47631n(int i, C17942c cVar, long j);

    /* renamed from: o */
    public abstract int mo47701o();

    /* renamed from: p */
    public final boolean mo69481p() {
        return mo47701o() == 0;
    }
}
