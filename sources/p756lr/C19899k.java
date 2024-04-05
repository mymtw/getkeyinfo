package p756lr;

import java.io.IOException;
import kotlin.jvm.internal.C19383o;

/* renamed from: lr.k */
public abstract class C19899k implements C19882a0 {

    /* renamed from: b */
    public final C19882a0 f43882b;

    public C19899k(C19882a0 a0Var) {
        C19383o.m32797g(a0Var, "delegate");
        this.f43882b = a0Var;
    }

    /* renamed from: O */
    public void mo68512O(C19893f fVar, long j) throws IOException {
        C19383o.m32797g(fVar, "source");
        this.f43882b.mo68512O(fVar, j);
    }

    public void close() throws IOException {
        this.f43882b.close();
    }

    public void flush() throws IOException {
        this.f43882b.flush();
    }

    /* renamed from: m */
    public final C19890d0 mo68515m() {
        return this.f43882b.mo68515m();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f43882b + ')';
    }
}
