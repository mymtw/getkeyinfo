package p756lr;

import android.support.p013v4.media.C0073e;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.C19383o;

/* renamed from: lr.n */
public final class C19902n implements C19882a0 {

    /* renamed from: b */
    public final C19912w f43885b;

    /* renamed from: c */
    public final Deflater f43886c;

    /* renamed from: d */
    public final C19898j f43887d;

    /* renamed from: e */
    public boolean f43888e;

    /* renamed from: f */
    public final CRC32 f43889f = new CRC32();

    public C19902n(C19893f fVar) {
        C19912w wVar = new C19912w(fVar);
        this.f43885b = wVar;
        Deflater deflater = new Deflater(-1, true);
        this.f43886c = deflater;
        this.f43887d = new C19898j(wVar, deflater);
        C19893f fVar2 = wVar.f43913b;
        fVar2.mo72712D0(8075);
        fVar2.mo72771x0(8);
        fVar2.mo72771x0(0);
        fVar2.mo72711C0(0);
        fVar2.mo72771x0(0);
        fVar2.mo72771x0(0);
    }

    /* renamed from: O */
    public final void mo68512O(C19893f fVar, long j) throws IOException {
        C19383o.m32797g(fVar, "source");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0)) {
            throw new IllegalArgumentException(C0073e.m205e("byteCount < 0: ", j).toString());
        } else if (i != 0) {
            C19915y yVar = fVar.f43875b;
            C19383o.m32794d(yVar);
            long j2 = j;
            while (j2 > 0) {
                int min = (int) Math.min(j2, (long) (yVar.f43922c - yVar.f43921b));
                this.f43889f.update(yVar.f43920a, yVar.f43921b, min);
                j2 -= (long) min;
                yVar = yVar.f43925f;
                C19383o.m32794d(yVar);
            }
            this.f43887d.mo68512O(fVar, j);
        }
    }

    public final void close() throws IOException {
        if (!this.f43888e) {
            Throwable th = null;
            try {
                C19898j jVar = this.f43887d;
                jVar.f43881d.finish();
                jVar.mo72785a(false);
                this.f43885b.mo72792a((int) this.f43889f.getValue());
                this.f43885b.mo72792a((int) this.f43886c.getBytesRead());
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f43886c.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f43885b.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f43888e = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void flush() throws IOException {
        this.f43887d.flush();
    }

    /* renamed from: m */
    public final C19890d0 mo68515m() {
        return this.f43885b.mo68515m();
    }
}
