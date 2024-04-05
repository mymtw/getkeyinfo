package p756lr;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.C19383o;

/* renamed from: lr.q */
public final class C19905q implements C19888c0 {

    /* renamed from: b */
    public final InputStream f43899b;

    /* renamed from: c */
    public final C19890d0 f43900c;

    public C19905q(InputStream inputStream, C19890d0 d0Var) {
        C19383o.m32797g(inputStream, "input");
        this.f43899b = inputStream;
        this.f43900c = d0Var;
    }

    /* renamed from: J */
    public final long mo68544J(C19893f fVar, long j) {
        C19383o.m32797g(fVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            try {
                this.f43900c.mo72704f();
                C19915y c0 = fVar.mo72729c0(1);
                int read = this.f43899b.read(c0.f43920a, c0.f43922c, (int) Math.min(j, (long) (8192 - c0.f43922c)));
                if (read != -1) {
                    c0.f43922c += read;
                    long j2 = (long) read;
                    fVar.f43876c += j2;
                    return j2;
                } else if (c0.f43921b != c0.f43922c) {
                    return -1;
                } else {
                    fVar.f43875b = c0.mo72806a();
                    C19916z.m34045a(c0);
                    return -1;
                }
            } catch (AssertionError e) {
                if (C19906r.m33999c(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException(C0073e.m205e("byteCount < 0: ", j).toString());
        }
    }

    public final void close() {
        this.f43899b.close();
    }

    /* renamed from: m */
    public final C19890d0 mo68547m() {
        return this.f43900c;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("source(");
        h.append(this.f43899b);
        h.append(')');
        return h.toString();
    }
}
