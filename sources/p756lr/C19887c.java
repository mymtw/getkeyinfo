package p756lr;

import android.support.p013v4.media.C0072d;
import java.io.IOException;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

/* renamed from: lr.c */
public final class C19887c implements C19882a0 {

    /* renamed from: b */
    public final /* synthetic */ C19883b f43867b;

    /* renamed from: c */
    public final /* synthetic */ C19882a0 f43868c;

    public C19887c(C19886b0 b0Var, C19910u uVar) {
        this.f43867b = b0Var;
        this.f43868c = uVar;
    }

    /* renamed from: O */
    public final void mo68512O(C19893f fVar, long j) {
        C19383o.m32797g(fVar, "source");
        C17782b.m29843I(fVar.f43876c, 0, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                C19915y yVar = fVar.f43875b;
                C19383o.m32794d(yVar);
                while (true) {
                    if (j2 >= ((long) 65536)) {
                        break;
                    }
                    j2 += (long) (yVar.f43922c - yVar.f43921b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        yVar = yVar.f43925f;
                        C19383o.m32794d(yVar);
                    }
                }
                C19883b bVar = this.f43867b;
                bVar.mo72694h();
                try {
                    this.f43868c.mo68512O(fVar, j2);
                    C19394m mVar = C19394m.f43287a;
                    if (!bVar.mo72695i()) {
                        j -= j2;
                    } else {
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
            } else {
                return;
            }
        }
    }

    public final void close() {
        C19883b bVar = this.f43867b;
        bVar.mo72694h();
        try {
            this.f43868c.close();
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

    public final void flush() {
        C19883b bVar = this.f43867b;
        bVar.mo72694h();
        try {
            this.f43868c.flush();
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
    public final C19890d0 mo68515m() {
        return this.f43867b;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AsyncTimeout.sink(");
        h.append(this.f43868c);
        h.append(')');
        return h.toString();
    }
}
