package p505aj;

import android.net.Uri;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.common.base.C15795m;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;
import p513bj.C14049b0;
import p513bj.C14075p;

/* renamed from: aj.o */
public final class C14008o extends C13996d {

    /* renamed from: e */
    public final boolean f30827e = false;

    /* renamed from: f */
    public final int f30828f;

    /* renamed from: g */
    public final int f30829g;

    /* renamed from: h */
    public final String f30830h;

    /* renamed from: i */
    public final C14011q f30831i;

    /* renamed from: j */
    public final C14011q f30832j;

    /* renamed from: k */
    public C15795m<String> f30833k;

    /* renamed from: l */
    public C14002i f30834l;

    /* renamed from: m */
    public HttpURLConnection f30835m;

    /* renamed from: n */
    public InputStream f30836n;

    /* renamed from: o */
    public boolean f30837o;

    /* renamed from: p */
    public int f30838p;

    /* renamed from: q */
    public long f30839q;

    /* renamed from: r */
    public long f30840r;

    /* renamed from: aj.o$a */
    public static final class C14009a implements C14010p {

        /* renamed from: a */
        public final C14011q f30841a = new C14011q();

        /* renamed from: b */
        public String f30842b;

        /* renamed from: c */
        public int f30843c = 8000;

        /* renamed from: d */
        public int f30844d = 8000;

        /* renamed from: a */
        public final C13999g mo46816a() {
            return new C14008o(this.f30842b, this.f30843c, this.f30844d, this.f30841a);
        }
    }

    public C14008o(String str, int i, int i2, C14011q qVar) {
        super(true);
        this.f30830h = str;
        this.f30828f = i;
        this.f30829g = i2;
        this.f30831i = qVar;
        this.f30833k = null;
        this.f30832j = new C14011q();
    }

    /* renamed from: p */
    public static URL m21561p(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            String valueOf = String.valueOf(protocol);
            throw new ProtocolException(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "));
        }
        throw new ProtocolException("Null location redirect");
    }

    /* renamed from: s */
    public static void m21562s(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = C14049b0.f30913a) >= 19 && i <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r12 != 0) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f7  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo46812b(p505aj.C14002i r21) throws com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException {
        /*
            r20 = this;
            r1 = r20
            r6 = r21
            java.lang.String r2 = "Unable to connect"
            r1.f30834l = r6
            r3 = 0
            r1.f30840r = r3
            r1.f30839q = r3
            r20.mo46809m(r21)
            r5 = 1
            java.net.HttpURLConnection r0 = r20.mo46834q(r21)     // Catch:{ IOException -> 0x0257 }
            r1.f30835m = r0     // Catch:{ IOException -> 0x0257 }
            int r7 = r0.getResponseCode()     // Catch:{ IOException -> 0x024c }
            r1.f30838p = r7     // Catch:{ IOException -> 0x024c }
            java.lang.String r7 = r0.getResponseMessage()     // Catch:{ IOException -> 0x024c }
            int r2 = r1.f30838p
            java.lang.String r8 = "Content-Range"
            r9 = 200(0xc8, float:2.8E-43)
            r10 = -1
            if (r2 < r9) goto L_0x01be
            r12 = 299(0x12b, float:4.19E-43)
            if (r2 <= r12) goto L_0x0032
            goto L_0x01be
        L_0x0032:
            java.lang.String r2 = r0.getContentType()
            com.google.common.base.m<java.lang.String> r7 = r1.f30833k
            if (r7 == 0) goto L_0x004a
            boolean r7 = r7.apply(r2)
            if (r7 == 0) goto L_0x0041
            goto L_0x004a
        L_0x0041:
            r20.mo46833o()
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException
            r0.<init>(r2, r6)
            throw r0
        L_0x004a:
            int r2 = r1.f30838p
            if (r2 != r9) goto L_0x0055
            long r12 = r6.f30779f
            int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r12 = r3
        L_0x0056:
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r2 = r0.getHeaderField(r2)
            java.lang.String r7 = "gzip"
            boolean r2 = r7.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x0145
            long r14 = r6.f30780g
            int r7 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x006e
            r1.f30839q = r14
            goto L_0x0149
        L_0x006e:
            java.lang.String r7 = "Content-Length"
            java.lang.String r7 = r0.getHeaderField(r7)
            java.lang.String r8 = r0.getHeaderField(r8)
            java.util.regex.Pattern r9 = p505aj.C14012r.f30847a
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r14 = "]"
            java.lang.String r15 = "HttpUtil"
            if (r9 != 0) goto L_0x00a6
            long r10 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x0089 }
            goto L_0x00a8
        L_0x0089:
            r9 = 28
            int r9 = androidx.compose.animation.C0391c.m1055a(r7, r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            java.lang.String r9 = "Unexpected Content-Length ["
            r10.append(r9)
            r10.append(r7)
            r10.append(r14)
            java.lang.String r9 = r10.toString()
            android.util.Log.e(r15, r9)
        L_0x00a6:
            r10 = -1
        L_0x00a8:
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x0138
            java.util.regex.Pattern r9 = p505aj.C14012r.f30847a
            java.util.regex.Matcher r9 = r9.matcher(r8)
            boolean r16 = r9.matches()
            if (r16 == 0) goto L_0x0138
            r3 = 2
            java.lang.String r3 = r9.group(r3)     // Catch:{ NumberFormatException -> 0x011b }
            r3.getClass()     // Catch:{ NumberFormatException -> 0x011b }
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x011b }
            java.lang.String r9 = r9.group(r5)     // Catch:{ NumberFormatException -> 0x011b }
            r9.getClass()     // Catch:{ NumberFormatException -> 0x011b }
            long r18 = java.lang.Long.parseLong(r9)     // Catch:{ NumberFormatException -> 0x011b }
            long r3 = r3 - r18
            r18 = 1
            long r3 = r3 + r18
            r16 = 0
            int r9 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r9 >= 0) goto L_0x00df
            r10 = r3
            goto L_0x0138
        L_0x00df:
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 == 0) goto L_0x0138
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ NumberFormatException -> 0x011b }
            int r9 = r9.length()     // Catch:{ NumberFormatException -> 0x011b }
            int r9 = r9 + 26
            java.lang.String r16 = java.lang.String.valueOf(r8)     // Catch:{ NumberFormatException -> 0x011b }
            int r16 = r16.length()     // Catch:{ NumberFormatException -> 0x011b }
            int r9 = r9 + r16
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x011b }
            r5.<init>(r9)     // Catch:{ NumberFormatException -> 0x011b }
            java.lang.String r9 = "Inconsistent headers ["
            r5.append(r9)     // Catch:{ NumberFormatException -> 0x011b }
            r5.append(r7)     // Catch:{ NumberFormatException -> 0x011b }
            java.lang.String r7 = "] ["
            r5.append(r7)     // Catch:{ NumberFormatException -> 0x011b }
            r5.append(r8)     // Catch:{ NumberFormatException -> 0x011b }
            r5.append(r14)     // Catch:{ NumberFormatException -> 0x011b }
            java.lang.String r5 = r5.toString()     // Catch:{ NumberFormatException -> 0x011b }
            android.util.Log.w(r15, r5)     // Catch:{ NumberFormatException -> 0x011b }
            long r10 = java.lang.Math.max(r10, r3)     // Catch:{ NumberFormatException -> 0x011b }
            goto L_0x0138
        L_0x011b:
            r3 = 27
            int r3 = androidx.compose.animation.C0391c.m1055a(r8, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Unexpected Content-Range ["
            r4.append(r3)
            r4.append(r8)
            r4.append(r14)
            java.lang.String r3 = r4.toString()
            android.util.Log.e(r15, r3)
        L_0x0138:
            r3 = -1
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0140
            long r10 = r10 - r12
            goto L_0x0142
        L_0x0140:
            r10 = -1
        L_0x0142:
            r1.f30839q = r10
            goto L_0x0149
        L_0x0145:
            long r3 = r6.f30780g
            r1.f30839q = r3
        L_0x0149:
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x01b3 }
            r1.f30836n = r0     // Catch:{ IOException -> 0x01b3 }
            if (r2 == 0) goto L_0x015a
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x01b3 }
            java.io.InputStream r2 = r1.f30836n     // Catch:{ IOException -> 0x01b3 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x01b3 }
            r1.f30836n = r0     // Catch:{ IOException -> 0x01b3 }
        L_0x015a:
            r2 = 1
            r1.f30837o = r2
            r20.mo46810n(r21)
            r2 = 0
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0167
            goto L_0x019b
        L_0x0167:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r0]     // Catch:{ IOException -> 0x01a8 }
        L_0x016b:
            int r5 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x019b
            long r7 = (long) r0     // Catch:{ IOException -> 0x01a8 }
            long r7 = java.lang.Math.min(r12, r7)     // Catch:{ IOException -> 0x01a8 }
            int r0 = (int) r7     // Catch:{ IOException -> 0x01a8 }
            java.io.InputStream r5 = r1.f30836n     // Catch:{ IOException -> 0x01a8 }
            int r7 = p513bj.C14049b0.f30913a     // Catch:{ IOException -> 0x01a8 }
            r7 = 0
            int r0 = r5.read(r4, r7, r0)     // Catch:{ IOException -> 0x01a8 }
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ IOException -> 0x01a8 }
            boolean r5 = r5.isInterrupted()     // Catch:{ IOException -> 0x01a8 }
            if (r5 != 0) goto L_0x0195
            r5 = -1
            if (r0 != r5) goto L_0x018d
            r0 = 0
            goto L_0x019c
        L_0x018d:
            long r7 = (long) r0     // Catch:{ IOException -> 0x01a8 }
            long r12 = r12 - r7
            r1.mo46807k(r0)     // Catch:{ IOException -> 0x01a8 }
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x016b
        L_0x0195:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ IOException -> 0x01a8 }
            r0.<init>()     // Catch:{ IOException -> 0x01a8 }
            throw r0     // Catch:{ IOException -> 0x01a8 }
        L_0x019b:
            r0 = 1
        L_0x019c:
            if (r0 == 0) goto L_0x01a1
            long r2 = r1.f30839q
            return r2
        L_0x01a1:
            com.google.android.exoplayer2.upstream.DataSourceException r0 = new com.google.android.exoplayer2.upstream.DataSourceException     // Catch:{ IOException -> 0x01a8 }
            r2 = 0
            r0.<init>(r2)     // Catch:{ IOException -> 0x01a8 }
            throw r0     // Catch:{ IOException -> 0x01a8 }
        L_0x01a8:
            r0 = move-exception
            r20.mo46833o()
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r2 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r3 = 1
            r2.<init>((java.io.IOException) r0, (p505aj.C14002i) r6, (int) r3)
            throw r2
        L_0x01b3:
            r0 = move-exception
            r3 = 1
            r20.mo46833o()
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r2 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r2.<init>((java.io.IOException) r0, (p505aj.C14002i) r6, (int) r3)
            throw r2
        L_0x01be:
            java.util.Map r5 = r0.getHeaderFields()
            int r2 = r1.f30838p
            r9 = 416(0x1a0, float:5.83E-43)
            if (r2 != r9) goto L_0x0208
            java.lang.String r2 = r0.getHeaderField(r8)
            java.util.regex.Pattern r3 = p505aj.C14012r.f30847a
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x01d5
            goto L_0x01ee
        L_0x01d5:
            java.util.regex.Pattern r3 = p505aj.C14012r.f30848b
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L_0x01ee
            r3 = 1
            java.lang.String r2 = r2.group(r3)
            r2.getClass()
            long r10 = java.lang.Long.parseLong(r2)
            goto L_0x01f1
        L_0x01ee:
            r3 = 1
            r10 = -1
        L_0x01f1:
            long r12 = r6.f30779f
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x0208
            r1.f30837o = r3
            r20.mo46810n(r21)
            long r2 = r6.f30780g
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0205
            goto L_0x0207
        L_0x0205:
            r2 = 0
        L_0x0207:
            return r2
        L_0x0208:
            java.io.InputStream r0 = r0.getErrorStream()
            if (r0 == 0) goto L_0x022a
            int r2 = p513bj.C14049b0.f30913a     // Catch:{ IOException -> 0x022d }
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x022d }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x022d }
            r3.<init>()     // Catch:{ IOException -> 0x022d }
        L_0x0219:
            int r4 = r0.read(r2)     // Catch:{ IOException -> 0x022d }
            r8 = -1
            if (r4 == r8) goto L_0x0225
            r8 = 0
            r3.write(r2, r8, r4)     // Catch:{ IOException -> 0x022d }
            goto L_0x0219
        L_0x0225:
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x022d }
            goto L_0x022f
        L_0x022a:
            byte[] r0 = p513bj.C14049b0.f30918f     // Catch:{ IOException -> 0x022d }
            goto L_0x022f
        L_0x022d:
            byte[] r0 = p513bj.C14049b0.f30918f
        L_0x022f:
            r20.mo46833o()
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r8 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException
            int r3 = r1.f30838p
            r2 = r8
            r4 = r7
            r6 = r21
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            int r0 = r1.f30838p
            if (r0 != r9) goto L_0x024b
            com.google.android.exoplayer2.upstream.DataSourceException r0 = new com.google.android.exoplayer2.upstream.DataSourceException
            r2 = 0
            r0.<init>(r2)
            r8.initCause(r0)
        L_0x024b:
            throw r8
        L_0x024c:
            r0 = move-exception
            r20.mo46833o()
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r3 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r4 = 1
            r3.<init>(r2, r0, r6, r4)
            throw r3
        L_0x0257:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x0270
            java.lang.String r3 = p001a0.C0005b.m56q0(r3)
            java.lang.String r4 = "cleartext http traffic.*not permitted.*"
            boolean r3 = r3.matches(r4)
            if (r3 == 0) goto L_0x0270
            com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException r2 = new com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
            r2.<init>(r0, r6)
            throw r2
        L_0x0270:
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r3 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r4 = 1
            r3.<init>(r2, r0, r6, r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p505aj.C14008o.mo46812b(aj.i):long");
    }

    public final void close() throws HttpDataSource$HttpDataSourceException {
        try {
            InputStream inputStream = this.f30836n;
            if (inputStream != null) {
                long j = this.f30839q;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f30840r;
                }
                m21562s(this.f30835m, j2);
                inputStream.close();
            }
            this.f30836n = null;
            mo46833o();
            if (this.f30837o) {
                this.f30837o = false;
                mo46808l();
            }
        } catch (IOException e) {
            C14002i iVar = this.f30834l;
            int i = C14049b0.f30913a;
            throw new HttpDataSource$HttpDataSourceException(e, iVar, 3);
        } catch (Throwable th) {
            this.f30836n = null;
            mo46833o();
            if (this.f30837o) {
                this.f30837o = false;
                mo46808l();
            }
            throw th;
        }
    }

    /* renamed from: d */
    public final Map<String, List<String>> mo46815d() {
        HttpURLConnection httpURLConnection = this.f30835m;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f30835m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: o */
    public final void mo46833o() {
        HttpURLConnection httpURLConnection = this.f30835m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C14075p.m21698j("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f30835m = null;
        }
    }

    /* renamed from: q */
    public final HttpURLConnection mo46834q(C14002i iVar) throws IOException {
        HttpURLConnection r;
        C14002i iVar2 = iVar;
        URL url = new URL(iVar2.f30774a.toString());
        int i = iVar2.f30776c;
        byte[] bArr = iVar2.f30777d;
        long j = iVar2.f30779f;
        long j2 = iVar2.f30780g;
        int i2 = 1;
        int i3 = 0;
        boolean z = (iVar2.f30782i & 1) == 1;
        if (!this.f30827e) {
            return mo46835r(url, i, bArr, j, j2, z, true, iVar2.f30778e);
        }
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                Map<String, String> map = iVar2.f30778e;
                int i5 = i4;
                byte[] bArr2 = bArr;
                int i6 = i2;
                long j3 = j2;
                long j4 = j;
                r = mo46835r(url, i, bArr, j, j2, z, false, map);
                int responseCode = r.getResponseCode();
                String headerField = r.getHeaderField("Location");
                if ((i == i6 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    r.disconnect();
                    url = m21561p(url, headerField);
                } else if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return r;
                } else {
                    r.disconnect();
                    url = m21561p(url, headerField);
                    bArr2 = null;
                    i = i6;
                }
                i3 = i5;
                i2 = i6;
                bArr = bArr2;
                j2 = j3;
                j = j4;
                iVar2 = iVar;
            } else {
                throw new NoRouteToHostException(C0072d.m200g(31, "Too many redirects: ", i4));
            }
        }
        return r;
    }

    /* renamed from: r */
    public final HttpURLConnection mo46835r(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        Map<String, String> map2;
        String str;
        String str2;
        Map<String, String> map3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f30828f);
        httpURLConnection.setReadTimeout(this.f30829g);
        HashMap hashMap = new HashMap();
        C14011q qVar = this.f30831i;
        if (qVar != null) {
            synchronized (qVar) {
                if (qVar.f30846b == null) {
                    qVar.f30846b = Collections.unmodifiableMap(new HashMap(qVar.f30845a));
                }
                map3 = qVar.f30846b;
            }
            hashMap.putAll(map3);
        }
        C14011q qVar2 = this.f30832j;
        synchronized (qVar2) {
            if (qVar2.f30846b == null) {
                qVar2.f30846b = Collections.unmodifiableMap(new HashMap(qVar2.f30845a));
            }
            map2 = qVar2.f30846b;
        }
        hashMap.putAll(map2);
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = C14012r.f30847a;
        if (j == 0 && j2 == -1) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(j);
            sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            str = sb.toString();
        }
        if (str != null) {
            httpURLConnection.setRequestProperty("Range", str);
        }
        String str3 = this.f30830h;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (i == 1) {
            str2 = "GET";
        } else if (i == 2) {
            str2 = "POST";
        } else if (i == 3) {
            str2 = "HEAD";
        } else {
            throw new IllegalStateException();
        }
        httpURLConnection.setRequestMethod(str2);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f30839q;
            if (j != -1) {
                long j2 = j - this.f30840r;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j2);
            }
            InputStream inputStream = this.f30836n;
            int i3 = C14049b0.f30913a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.f30840r += (long) read;
                mo46807k(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            C14002i iVar = this.f30834l;
            int i4 = C14049b0.f30913a;
            throw new HttpDataSource$HttpDataSourceException(e, iVar, 2);
        }
    }
}
