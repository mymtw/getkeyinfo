package p756lr;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C19383o;

/* renamed from: lr.o */
public final class C19903o implements C19888c0 {

    /* renamed from: b */
    public byte f43890b;

    /* renamed from: c */
    public final C19913x f43891c;

    /* renamed from: d */
    public final Inflater f43892d;

    /* renamed from: e */
    public final C19904p f43893e;

    /* renamed from: f */
    public final CRC32 f43894f = new CRC32();

    public C19903o(C19888c0 c0Var) {
        C19383o.m32797g(c0Var, "source");
        C19913x xVar = new C19913x(c0Var);
        this.f43891c = xVar;
        Inflater inflater = new Inflater(true);
        this.f43892d = inflater;
        this.f43893e = new C19904p(xVar, inflater);
    }

    /* renamed from: a */
    public static void m33989a(int i, int i2, String str) {
        if (i2 != i) {
            throw new IOException(C0388a.m1049e(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3, "%s: actual 0x%08x != expected 0x%08x", "java.lang.String.format(this, *args)"));
        }
    }

    /* renamed from: J */
    public final long mo68544J(C19893f fVar, long j) throws IOException {
        long j2;
        C19893f fVar2 = fVar;
        long j3 = j;
        C19383o.m32797g(fVar2, "sink");
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        boolean z = false;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(C0073e.m205e("byteCount < 0: ", j3).toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f43890b == 0) {
                this.f43891c.mo72723U(10);
                byte h = this.f43891c.f43916b.mo72738h(3);
                boolean z2 = ((h >> 1) & 1) == 1;
                if (z2) {
                    mo72789b(this.f43891c.f43916b, 0, 10);
                }
                m33989a(8075, this.f43891c.readShort(), "ID1ID2");
                this.f43891c.skip(8);
                if (((h >> 2) & 1) == 1) {
                    this.f43891c.mo72723U(2);
                    if (z2) {
                        mo72789b(this.f43891c.f43916b, 0, 2);
                    }
                    short readShort = this.f43891c.f43916b.readShort() & 65535;
                    long j4 = (long) ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8)));
                    this.f43891c.mo72723U(j4);
                    if (z2) {
                        j2 = j4;
                        mo72789b(this.f43891c.f43916b, 0, j4);
                    } else {
                        j2 = j4;
                    }
                    this.f43891c.skip(j2);
                }
                if (((h >> 3) & 1) == 1) {
                    long a = this.f43891c.mo72796a((byte) 0, 0, Long.MAX_VALUE);
                    if (a != -1) {
                        if (z2) {
                            mo72789b(this.f43891c.f43916b, 0, a + 1);
                        }
                        this.f43891c.skip(a + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((h >> 4) & 1) == 1) {
                    z = true;
                }
                if (z) {
                    long a2 = this.f43891c.mo72796a((byte) 0, 0, Long.MAX_VALUE);
                    if (a2 != -1) {
                        if (z2) {
                            mo72789b(this.f43891c.f43916b, 0, a2 + 1);
                        }
                        this.f43891c.skip(a2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z2) {
                    C19913x xVar = this.f43891c;
                    xVar.mo72723U(2);
                    short readShort2 = xVar.f43916b.readShort() & 65535;
                    m33989a((short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) ((int) this.f43894f.getValue()), "FHCRC");
                    this.f43894f.reset();
                }
                this.f43890b = 1;
            }
            if (this.f43890b == 1) {
                long j5 = fVar2.f43876c;
                long J = this.f43893e.mo68544J(fVar2, j3);
                if (J != -1) {
                    mo72789b(fVar, j5, J);
                    return J;
                }
                this.f43890b = 2;
            }
            if (this.f43890b == 2) {
                C19913x xVar2 = this.f43891c;
                xVar2.mo72723U(4);
                int readInt = xVar2.f43916b.readInt();
                m33989a(((readInt & 255) << 24) | ((readInt & -16777216) >>> 24) | ((readInt & 16711680) >>> 8) | ((readInt & 65280) << 8), (int) this.f43894f.getValue(), "CRC");
                C19913x xVar3 = this.f43891c;
                xVar3.mo72723U(4);
                int readInt2 = xVar3.f43916b.readInt();
                m33989a(((readInt2 & 255) << 24) | ((readInt2 & -16777216) >>> 24) | ((readInt2 & 16711680) >>> 8) | ((readInt2 & 65280) << 8), (int) this.f43892d.getBytesWritten(), "ISIZE");
                this.f43890b = 3;
                if (!this.f43891c.mo72733e0()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    /* renamed from: b */
    public final void mo72789b(C19893f fVar, long j, long j2) {
        C19915y yVar = fVar.f43875b;
        C19383o.m32794d(yVar);
        while (true) {
            int i = yVar.f43922c;
            int i2 = yVar.f43921b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            yVar = yVar.f43925f;
            C19383o.m32794d(yVar);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) yVar.f43921b) + j);
            int min = (int) Math.min((long) (yVar.f43922c - i3), j2);
            this.f43894f.update(yVar.f43920a, i3, min);
            j2 -= (long) min;
            yVar = yVar.f43925f;
            C19383o.m32794d(yVar);
            j = 0;
        }
    }

    public final void close() throws IOException {
        this.f43893e.close();
    }

    /* renamed from: m */
    public final C19890d0 mo68547m() {
        return this.f43891c.mo68547m();
    }
}
