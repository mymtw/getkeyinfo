package p756lr;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.api.Api;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C19383o;
import okio.ByteString;
import p568fn.C17782b;
import p758mr.C19918a;

/* renamed from: lr.x */
public final class C19913x implements C19897i {

    /* renamed from: b */
    public final C19893f f43916b = new C19893f();

    /* renamed from: c */
    public boolean f43917c;

    /* renamed from: d */
    public final C19888c0 f43918d;

    public C19913x(C19888c0 c0Var) {
        C19383o.m32797g(c0Var, "source");
        this.f43918d = c0Var;
    }

    /* renamed from: C */
    public final String mo72710C(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long a = mo72796a(b, 0, j2);
            if (a != -1) {
                return C19918a.m34062b(this.f43916b, a);
            }
            if (j2 < Long.MAX_VALUE && request(j2) && this.f43916b.mo72738h(j2 - 1) == ((byte) 13) && request(1 + j2) && this.f43916b.mo72738h(j2) == b) {
                return C19918a.m34062b(this.f43916b, j2);
            }
            C19893f fVar = new C19893f();
            C19893f fVar2 = this.f43916b;
            fVar2.mo72735f(fVar, 0, Math.min((long) 32, fVar2.f43876c));
            StringBuilder h = C0072d.m201h("\\n not found: limit=");
            h.append(Math.min(this.f43916b.f43876c, j));
            h.append(" content=");
            h.append(fVar.mo72759t().hex());
            h.append("…");
            throw new EOFException(h.toString());
        }
        throw new IllegalArgumentException(C0073e.m205e("limit < 0: ", j).toString());
    }

    /* renamed from: I */
    public final boolean mo72718I(long j, ByteString byteString) {
        C19383o.m32797g(byteString, "bytes");
        int size = byteString.size();
        if (!this.f43917c) {
            if (j >= 0 && size >= 0 && byteString.size() - 0 >= size) {
                int i = 0;
                while (i < size) {
                    long j2 = ((long) i) + j;
                    if (request(1 + j2) && this.f43916b.mo72738h(j2) == byteString.getByte(0 + i)) {
                        i++;
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: J */
    public final long mo68544J(C19893f fVar, long j) {
        C19383o.m32797g(fVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(C0073e.m205e("byteCount < 0: ", j).toString());
        } else if (!this.f43917c) {
            C19893f fVar2 = this.f43916b;
            if (fVar2.f43876c == 0 && this.f43918d.mo68544J(fVar2, (long) 8192) == -1) {
                return -1;
            }
            return this.f43916b.mo68544J(fVar, Math.min(j, this.f43916b.f43876c));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: L */
    public final String mo72719L() {
        return mo72710C(Long.MAX_VALUE);
    }

    /* renamed from: U */
    public final void mo72723U(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: X */
    public final ByteString mo72725X(long j) {
        mo72723U(j);
        return this.f43916b.mo72725X(j);
    }

    /* renamed from: a */
    public final long mo72796a(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f43917c) {
            long j3 = 0;
            if (j2 < 0) {
                z = false;
            }
            if (z) {
                while (j3 < j2) {
                    long i = this.f43916b.mo72740i(b, j3, j2);
                    if (i != -1) {
                        return i;
                    }
                    C19893f fVar = this.f43916b;
                    long j4 = fVar.f43876c;
                    if (j4 >= j2 || this.f43918d.mo68544J(fVar, (long) 8192) == -1) {
                        return -1;
                    }
                    j3 = Math.max(j3, j4);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + 0 + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: b */
    public final long mo72797b() {
        int i;
        mo72723U(1);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!request(j2)) {
                break;
            }
            byte h = this.f43916b.mo72738h(j);
            if ((h >= ((byte) 48) && h <= ((byte) 57)) || (j == 0 && h == ((byte) 45))) {
                j = j2;
            } else if (i == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9] or '-' character but was 0x");
                C17782b.m29844J(16);
                C17782b.m29844J(16);
                String num = Integer.toString(h, 16);
                C19383o.m32796f(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                sb.append(num);
                throw new NumberFormatException(sb.toString());
            }
        }
        return this.f43916b.mo72761u();
    }

    /* renamed from: b0 */
    public final int mo72728b0(C19908t tVar) {
        C19383o.m32797g(tVar, ResponseConstants.OPTIONS);
        if (!this.f43917c) {
            while (true) {
                int c = C19918a.m34063c(this.f43916b, tVar, true);
                if (c == -2) {
                    if (this.f43918d.mo68544J(this.f43916b, (long) 8192) == -1) {
                        break;
                    }
                } else if (c != -1) {
                    this.f43916b.skip((long) tVar.f43903b[c].size());
                    return c;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void close() {
        if (!this.f43917c) {
            this.f43917c = true;
            this.f43918d.close();
            this.f43916b.mo72726a();
        }
    }

    /* renamed from: d0 */
    public final byte[] mo72732d0() {
        this.f43916b.mo72764w0(this.f43918d);
        return this.f43916b.mo72732d0();
    }

    /* renamed from: e0 */
    public final boolean mo72733e0() {
        if (!this.f43917c) {
            return this.f43916b.mo72733e0() && this.f43918d.mo68544J(this.f43916b, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: g0 */
    public final long mo72737g0(C19896h hVar) {
        C19383o.m32797g(hVar, "sink");
        long j = 0;
        while (this.f43918d.mo68544J(this.f43916b, (long) 8192) != -1) {
            long d = this.f43916b.mo72731d();
            if (d > 0) {
                j += d;
                hVar.mo68512O(this.f43916b, d);
            }
        }
        C19893f fVar = this.f43916b;
        long j2 = fVar.f43876c;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        hVar.mo68512O(fVar, j2);
        return j3;
    }

    public final boolean isOpen() {
        return !this.f43917c;
    }

    /* renamed from: k0 */
    public final String mo72744k0(Charset charset) {
        this.f43916b.mo72764w0(this.f43918d);
        C19893f fVar = this.f43916b;
        return fVar.mo72770x(fVar.f43876c, charset);
    }

    /* renamed from: l */
    public final C19893f mo72745l() {
        return this.f43916b;
    }

    /* renamed from: m */
    public final C19890d0 mo68547m() {
        return this.f43918d.mo68547m();
    }

    public final C19913x peek() {
        return C19906r.m33998b(new C19911v(this));
    }

    public final int read(ByteBuffer byteBuffer) {
        C19383o.m32797g(byteBuffer, "sink");
        C19893f fVar = this.f43916b;
        if (fVar.f43876c == 0 && this.f43918d.mo68544J(fVar, (long) 8192) == -1) {
            return -1;
        }
        return this.f43916b.read(byteBuffer);
    }

    public final byte readByte() {
        mo72723U(1);
        return this.f43916b.readByte();
    }

    public final int readInt() {
        mo72723U(4);
        return this.f43916b.readInt();
    }

    public final short readShort() {
        mo72723U(2);
        return this.f43916b.readShort();
    }

    public final boolean request(long j) {
        C19893f fVar;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(C0073e.m205e("byteCount < 0: ", j).toString());
        } else if (!this.f43917c) {
            do {
                fVar = this.f43916b;
                if (fVar.f43876c >= j) {
                    return true;
                }
            } while (this.f43918d.mo68544J(fVar, (long) 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final void skip(long j) {
        if (!this.f43917c) {
            while (j > 0) {
                C19893f fVar = this.f43916b;
                if (fVar.f43876c == 0 && this.f43918d.mo68544J(fVar, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f43916b.f43876c);
                this.f43916b.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("buffer(");
        h.append(this.f43918d);
        h.append(')');
        return h.toString();
    }

    /* renamed from: w */
    public final long mo72763w(ByteString byteString) {
        C19383o.m32797g(byteString, "bytes");
        if (!this.f43917c) {
            long j = 0;
            while (true) {
                long j2 = this.f43916b.mo72742j(j, byteString);
                if (j2 != -1) {
                    return j2;
                }
                C19893f fVar = this.f43916b;
                long j3 = fVar.f43876c;
                if (this.f43918d.mo68544J(fVar, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (j3 - ((long) byteString.size())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo72772y0() {
        /*
            r5 = this;
            r0 = 1
            r5.mo72723U(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L_0x0062
            lr.f r2 = r5.f43916b
            long r3 = (long) r0
            byte r2 = r2.mo72738h(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0062
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            p568fn.C17782b.m29844J(r3)
            p568fn.C17782b.m29844J(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0062:
            lr.f r0 = r5.f43916b
            long r0 = r0.mo72772y0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p756lr.C19913x.mo72772y0():long");
    }

    /* renamed from: z */
    public final long mo72773z(ByteString byteString) {
        C19383o.m32797g(byteString, "targetBytes");
        if (!this.f43917c) {
            long j = 0;
            while (true) {
                long k = this.f43916b.mo72743k(j, byteString);
                if (k != -1) {
                    return k;
                }
                C19893f fVar = this.f43916b;
                long j2 = fVar.f43876c;
                if (this.f43918d.mo68544J(fVar, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: z0 */
    public final InputStream mo72774z0() {
        return new C19914a(this);
    }

    /* renamed from: lr.x$a */
    public static final class C19914a extends InputStream {

        /* renamed from: b */
        public final /* synthetic */ C19913x f43919b;

        public C19914a(C19913x xVar) {
            this.f43919b = xVar;
        }

        public final int available() {
            C19913x xVar = this.f43919b;
            if (!xVar.f43917c) {
                return (int) Math.min(xVar.f43916b.f43876c, (long) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
            throw new IOException("closed");
        }

        public final void close() {
            this.f43919b.close();
        }

        public final int read() {
            C19913x xVar = this.f43919b;
            if (!xVar.f43917c) {
                C19893f fVar = xVar.f43916b;
                if (fVar.f43876c == 0 && xVar.f43918d.mo68544J(fVar, (long) 8192) == -1) {
                    return -1;
                }
                return this.f43919b.f43916b.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public final String toString() {
            return this.f43919b + ".inputStream()";
        }

        public final int read(byte[] bArr, int i, int i2) {
            C19383o.m32797g(bArr, "data");
            if (!this.f43919b.f43917c) {
                C17782b.m29843I((long) bArr.length, (long) i, (long) i2);
                C19913x xVar = this.f43919b;
                C19893f fVar = xVar.f43916b;
                if (fVar.f43876c == 0 && xVar.f43918d.mo68544J(fVar, (long) 8192) == -1) {
                    return -1;
                }
                return this.f43919b.f43916b.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
