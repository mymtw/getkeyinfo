package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlin.text.C19446a;
import p735br.C18980c;
import p756lr.C19897i;

/* renamed from: okhttp3.a0 */
public abstract class C19928a0 implements Closeable {

    /* renamed from: c */
    public static final C19930b f43959c = new C19930b();

    /* renamed from: b */
    public C19929a f43960b;

    /* renamed from: okhttp3.a0$a */
    public static final class C19929a extends Reader {

        /* renamed from: b */
        public boolean f43961b;

        /* renamed from: c */
        public InputStreamReader f43962c;

        /* renamed from: d */
        public final C19897i f43963d;

        /* renamed from: e */
        public final Charset f43964e;

        public C19929a(C19897i iVar, Charset charset) {
            C19383o.m32797g(iVar, "source");
            C19383o.m32797g(charset, "charset");
            this.f43963d = iVar;
            this.f43964e = charset;
        }

        public final void close() throws IOException {
            this.f43961b = true;
            InputStreamReader inputStreamReader = this.f43962c;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            } else {
                this.f43963d.close();
            }
        }

        public final int read(char[] cArr, int i, int i2) throws IOException {
            C19383o.m32797g(cArr, "cbuf");
            if (!this.f43961b) {
                InputStreamReader inputStreamReader = this.f43962c;
                if (inputStreamReader == null) {
                    inputStreamReader = new InputStreamReader(this.f43963d.mo72774z0(), C18980c.m32113q(this.f43963d, this.f43964e));
                    this.f43962c = inputStreamReader;
                }
                return inputStreamReader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    /* renamed from: okhttp3.a0$b */
    public static final class C19930b {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        kotlin.reflect.C19421p.m32917E(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo72841a() throws java.io.IOException {
        /*
            r7 = this;
            long r0 = r7.mo70456d()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0051
            lr.i r2 = r7.mo70458f()
            r3 = 0
            byte[] r4 = r2.mo72732d0()     // Catch:{ all -> 0x004a }
            kotlin.reflect.C19421p.m32917E(r2, r3)
            int r2 = r4.length
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0049
            long r5 = (long) r2
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0025
            goto L_0x0049
        L_0x0025:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x0049:
            return r4
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            kotlin.reflect.C19421p.m32917E(r2, r0)
            throw r1
        L_0x0051:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Cannot buffer entire body for content length: "
            java.lang.String r0 = android.support.p013v4.media.C0073e.m205e(r3, r0)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C19928a0.mo72841a():byte[]");
    }

    /* renamed from: b */
    public final Reader mo72842b() {
        Charset charset;
        C19929a aVar = this.f43960b;
        if (aVar == null) {
            C19897i f = mo70458f();
            C20002r e = mo70457e();
            if (e == null || (charset = e.mo72983a(C19446a.f43373b)) == null) {
                charset = C19446a.f43373b;
            }
            aVar = new C19929a(f, charset);
            this.f43960b = aVar;
        }
        return aVar;
    }

    public void close() {
        C18980c.m32099c(mo70458f());
    }

    /* renamed from: d */
    public abstract long mo70456d();

    /* renamed from: e */
    public abstract C20002r mo70457e();

    /* renamed from: f */
    public abstract C19897i mo70458f();

    /* renamed from: g */
    public final String mo72844g() throws IOException {
        Charset charset;
        C19897i f = mo70458f();
        try {
            C20002r e = mo70457e();
            if (e == null || (charset = e.mo72983a(C19446a.f43373b)) == null) {
                charset = C19446a.f43373b;
            }
            String k0 = f.mo72744k0(C18980c.m32113q(f, charset));
            C19421p.m32917E(f, (Throwable) null);
            return k0;
        } catch (Throwable th) {
            C19421p.m32917E(f, th);
            throw th;
        }
    }
}
