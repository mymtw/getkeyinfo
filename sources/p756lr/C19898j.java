package p756lr;

import android.support.p013v4.media.C0072d;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.C19383o;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p568fn.C17782b;

/* renamed from: lr.j */
public final class C19898j implements C19882a0 {

    /* renamed from: b */
    public boolean f43879b;

    /* renamed from: c */
    public final C19896h f43880c;

    /* renamed from: d */
    public final Deflater f43881d;

    public C19898j(C19912w wVar, Deflater deflater) {
        this.f43880c = wVar;
        this.f43881d = deflater;
    }

    /* renamed from: O */
    public final void mo68512O(C19893f fVar, long j) throws IOException {
        C19383o.m32797g(fVar, "source");
        C17782b.m29843I(fVar.f43876c, 0, j);
        while (j > 0) {
            C19915y yVar = fVar.f43875b;
            C19383o.m32794d(yVar);
            int min = (int) Math.min(j, (long) (yVar.f43922c - yVar.f43921b));
            this.f43881d.setInput(yVar.f43920a, yVar.f43921b, min);
            mo72785a(false);
            long j2 = (long) min;
            fVar.f43876c -= j2;
            int i = yVar.f43921b + min;
            yVar.f43921b = i;
            if (i == yVar.f43922c) {
                fVar.f43875b = yVar.mo72806a();
                C19916z.m34045a(yVar);
            }
            j -= j2;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    public final void mo72785a(boolean z) {
        C19915y c0;
        int i;
        C19893f l = this.f43880c.mo72745l();
        while (true) {
            c0 = l.mo72729c0(1);
            if (z) {
                Deflater deflater = this.f43881d;
                byte[] bArr = c0.f43920a;
                int i2 = c0.f43922c;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.f43881d;
                byte[] bArr2 = c0.f43920a;
                int i3 = c0.f43922c;
                i = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (i > 0) {
                c0.f43922c += i;
                l.f43876c += (long) i;
                this.f43880c.mo72706A();
            } else if (this.f43881d.needsInput()) {
                break;
            }
        }
        if (c0.f43921b == c0.f43922c) {
            l.f43875b = c0.mo72806a();
            C19916z.m34045a(c0);
        }
    }

    public final void close() throws IOException {
        if (!this.f43879b) {
            Throwable th = null;
            try {
                this.f43881d.finish();
                mo72785a(false);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f43881d.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f43880c.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f43879b = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void flush() throws IOException {
        mo72785a(true);
        this.f43880c.flush();
    }

    /* renamed from: m */
    public final C19890d0 mo68515m() {
        return this.f43880c.mo68515m();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("DeflaterSink(");
        h.append(this.f43880c);
        h.append(')');
        return h.toString();
    }
}
