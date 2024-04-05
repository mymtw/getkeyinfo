package p756lr;

import android.support.p013v4.media.C0072d;
import java.io.OutputStream;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

/* renamed from: lr.u */
public final class C19910u implements C19882a0 {

    /* renamed from: b */
    public final OutputStream f43905b;

    /* renamed from: c */
    public final C19890d0 f43906c;

    public C19910u(OutputStream outputStream, C19890d0 d0Var) {
        this.f43905b = outputStream;
        this.f43906c = d0Var;
    }

    /* renamed from: O */
    public final void mo68512O(C19893f fVar, long j) {
        C19383o.m32797g(fVar, "source");
        C17782b.m29843I(fVar.f43876c, 0, j);
        while (j > 0) {
            this.f43906c.mo72704f();
            C19915y yVar = fVar.f43875b;
            C19383o.m32794d(yVar);
            int min = (int) Math.min(j, (long) (yVar.f43922c - yVar.f43921b));
            this.f43905b.write(yVar.f43920a, yVar.f43921b, min);
            int i = yVar.f43921b + min;
            yVar.f43921b = i;
            long j2 = (long) min;
            j -= j2;
            fVar.f43876c -= j2;
            if (i == yVar.f43922c) {
                fVar.f43875b = yVar.mo72806a();
                C19916z.m34045a(yVar);
            }
        }
    }

    public final void close() {
        this.f43905b.close();
    }

    public final void flush() {
        this.f43905b.flush();
    }

    /* renamed from: m */
    public final C19890d0 mo68515m() {
        return this.f43906c;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("sink(");
        h.append(this.f43905b);
        h.append(')');
        return h.toString();
    }
}
