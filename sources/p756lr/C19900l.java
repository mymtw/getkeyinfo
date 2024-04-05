package p756lr;

import java.io.IOException;
import kotlin.jvm.internal.C19383o;

/* renamed from: lr.l */
public abstract class C19900l implements C19888c0 {

    /* renamed from: b */
    public final C19888c0 f43883b;

    public C19900l(C19888c0 c0Var) {
        C19383o.m32797g(c0Var, "delegate");
        this.f43883b = c0Var;
    }

    /* renamed from: J */
    public long mo68544J(C19893f fVar, long j) throws IOException {
        C19383o.m32797g(fVar, "sink");
        return this.f43883b.mo68544J(fVar, j);
    }

    public void close() throws IOException {
        this.f43883b.close();
    }

    /* renamed from: m */
    public final C19890d0 mo68547m() {
        return this.f43883b.mo68547m();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f43883b + ')';
    }
}
