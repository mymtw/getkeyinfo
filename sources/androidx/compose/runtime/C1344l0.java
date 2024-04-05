package androidx.compose.runtime;

import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.runtime.l0 */
public final class C1344l0<N> implements C1299c<N> {

    /* renamed from: a */
    public final C1299c<N> f2936a;

    /* renamed from: b */
    public final int f2937b;

    /* renamed from: c */
    public int f2938c;

    public C1344l0(C1299c<N> cVar, int i) {
        C19383o.m32797g(cVar, "applier");
        this.f2936a = cVar;
        this.f2937b = i;
    }

    /* renamed from: a */
    public final void mo5639a(int i, int i2, int i3) {
        int i4 = this.f2938c == 0 ? this.f2937b : 0;
        this.f2936a.mo5639a(i + i4, i2 + i4, i3);
    }

    /* renamed from: b */
    public final void mo5640b(int i, int i2) {
        this.f2936a.mo5640b(i + (this.f2938c == 0 ? this.f2937b : 0), i2);
    }

    /* renamed from: c */
    public final void mo5641c(int i, N n) {
        this.f2936a.mo5641c(i + (this.f2938c == 0 ? this.f2937b : 0), n);
    }

    public final void clear() {
        ComposerKt.m2526c("Clear is not valid on OffsetApplier".toString());
        throw null;
    }

    /* renamed from: e */
    public final N mo5612e() {
        return this.f2936a.mo5612e();
    }

    /* renamed from: f */
    public final void mo5643f(int i, N n) {
        this.f2936a.mo5643f(i + (this.f2938c == 0 ? this.f2937b : 0), n);
    }

    /* renamed from: g */
    public final void mo5613g(N n) {
        this.f2938c++;
        this.f2936a.mo5613g(n);
    }

    /* renamed from: h */
    public final void mo5614h() {
        int i = this.f2938c;
        if (i > 0) {
            this.f2938c = i - 1;
            this.f2936a.mo5614h();
            return;
        }
        ComposerKt.m2526c("OffsetApplier up called with no corresponding down".toString());
        throw null;
    }
}
