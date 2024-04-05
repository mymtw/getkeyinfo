package p365hg;

import p365hg.C12885n0;
import p401mg.C13080a;

/* renamed from: hg.o0 */
public final class C12899o0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C12885n0 f28443b;

    /* renamed from: c */
    public final /* synthetic */ C12885n0.C12888c f28444c;

    public C12899o0(C12885n0 n0Var, C12885n0.C12888c cVar) {
        this.f28443b = n0Var;
        this.f28444c = cVar;
    }

    public final void run() {
        if (!C13080a.m20762b(this)) {
            try {
                this.f28444c.f28424d.run();
                this.f28443b.mo45644b(this.f28444c);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
