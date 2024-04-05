package p756lr;

import android.support.p013v4.media.C0072d;
import java.io.IOException;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;

/* renamed from: lr.d */
public final class C19889d implements C19888c0 {

    /* renamed from: b */
    public final /* synthetic */ C19883b f43869b;

    /* renamed from: c */
    public final /* synthetic */ C19888c0 f43870c;

    public C19889d(C19886b0 b0Var, C19905q qVar) {
        this.f43869b = b0Var;
        this.f43870c = qVar;
    }

    /* renamed from: J */
    public final long mo68544J(C19893f fVar, long j) {
        C19383o.m32797g(fVar, "sink");
        C19883b bVar = this.f43869b;
        bVar.mo72694h();
        try {
            long J = this.f43870c.mo68544J(fVar, j);
            if (!bVar.mo72695i()) {
                return J;
            }
            throw bVar.mo70523j((IOException) null);
        } catch (IOException e) {
            e = e;
            if (bVar.mo72695i()) {
                e = bVar.mo70523j(e);
            }
            throw e;
        } finally {
            boolean i = bVar.mo72695i();
        }
    }

    public final void close() {
        C19883b bVar = this.f43869b;
        bVar.mo72694h();
        try {
            this.f43870c.close();
            C19394m mVar = C19394m.f43287a;
            if (bVar.mo72695i()) {
                throw bVar.mo70523j((IOException) null);
            }
        } catch (IOException e) {
            e = e;
            if (bVar.mo72695i()) {
                e = bVar.mo70523j(e);
            }
            throw e;
        } finally {
            boolean i = bVar.mo72695i();
        }
    }

    /* renamed from: m */
    public final C19890d0 mo68547m() {
        return this.f43869b;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AsyncTimeout.source(");
        h.append(this.f43870c);
        h.append(')');
        return h.toString();
    }
}
