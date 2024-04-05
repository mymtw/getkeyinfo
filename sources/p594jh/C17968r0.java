package p594jh;

import com.google.android.exoplayer2.source.C14344i;
import p513bj.C14049b0;

/* renamed from: jh.r0 */
public final class C17968r0 {

    /* renamed from: a */
    public final C14344i.C14345a f39249a;

    /* renamed from: b */
    public final long f39250b;

    /* renamed from: c */
    public final long f39251c;

    /* renamed from: d */
    public final long f39252d;

    /* renamed from: e */
    public final long f39253e;

    /* renamed from: f */
    public final boolean f39254f;

    /* renamed from: g */
    public final boolean f39255g;

    /* renamed from: h */
    public final boolean f39256h;

    public C17968r0(C14344i.C14345a aVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        this.f39249a = aVar;
        this.f39250b = j;
        this.f39251c = j2;
        this.f39252d = j3;
        this.f39253e = j4;
        this.f39254f = z;
        this.f39255g = z2;
        this.f39256h = z3;
    }

    /* renamed from: a */
    public final C17968r0 mo69517a(long j) {
        if (j == this.f39251c) {
            return this;
        }
        return new C17968r0(this.f39249a, this.f39250b, j, this.f39252d, this.f39253e, this.f39254f, this.f39255g, this.f39256h);
    }

    /* renamed from: b */
    public final C17968r0 mo69518b(long j) {
        if (j == this.f39250b) {
            return this;
        }
        return new C17968r0(this.f39249a, j, this.f39251c, this.f39252d, this.f39253e, this.f39254f, this.f39255g, this.f39256h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17968r0.class != obj.getClass()) {
            return false;
        }
        C17968r0 r0Var = (C17968r0) obj;
        return this.f39250b == r0Var.f39250b && this.f39251c == r0Var.f39251c && this.f39252d == r0Var.f39252d && this.f39253e == r0Var.f39253e && this.f39254f == r0Var.f39254f && this.f39255g == r0Var.f39255g && this.f39256h == r0Var.f39256h && C14049b0.m21628a(this.f39249a, r0Var.f39249a);
    }

    public final int hashCode() {
        return ((((((((((((((this.f39249a.hashCode() + 527) * 31) + ((int) this.f39250b)) * 31) + ((int) this.f39251c)) * 31) + ((int) this.f39252d)) * 31) + ((int) this.f39253e)) * 31) + (this.f39254f ? 1 : 0)) * 31) + (this.f39255g ? 1 : 0)) * 31) + (this.f39256h ? 1 : 0);
    }
}
