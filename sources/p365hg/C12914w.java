package p365hg;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p365hg.C12889o;

/* renamed from: hg.w */
public final class C12914w {

    /* renamed from: a */
    public static final String f28479a = C12914w.class.getSimpleName();

    /* renamed from: b */
    public static C12889o f28480b;

    /* renamed from: c */
    public static final C12914w f28481c = new C12914w();

    /* renamed from: hg.w$a */
    public static final class C12915a extends BufferedInputStream {

        /* renamed from: b */
        public HttpURLConnection f28482b;

        public C12915a(InputStream inputStream, HttpURLConnection httpURLConnection) {
            super(inputStream, 8192);
            this.f28482b = httpURLConnection;
        }

        public final void close() throws IOException {
            super.close();
            C12869i0.m20572k(this.f28482b);
        }
    }

    /* renamed from: a */
    public static final synchronized C12889o m20624a() throws IOException {
        C12889o oVar;
        synchronized (C12914w.class) {
            if (f28480b == null) {
                f28480b = new C12889o(f28479a, new C12889o.C12895d());
            }
            oVar = f28480b;
            if (oVar == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return oVar;
    }

    /* renamed from: b */
    public static final BufferedInputStream m20625b(Uri uri) {
        if (uri == null) {
            return null;
        }
        f28481c.getClass();
        if (!m20627d(uri)) {
            return null;
        }
        try {
            C12889o a = m20624a();
            String uri2 = uri.toString();
            C19383o.m32796f(uri2, "uri.toString()");
            AtomicLong atomicLong = C12889o.f28426h;
            return a.mo45649b(uri2, (String) null);
        } catch (IOException e) {
            C12845c0.f28334f.mo45625a(LoggingBehavior.CACHE, 5, f28479a, e.toString());
            return null;
        }
    }

    /* renamed from: c */
    public static final InputStream m20626c(HttpURLConnection httpURLConnection) throws IOException {
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        Uri parse = Uri.parse(httpURLConnection.getURL().toString());
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            f28481c.getClass();
            if (m20627d(parse)) {
                C12889o a = m20624a();
                String uri = parse.toString();
                C19383o.m32796f(uri, "uri.toString()");
                return new C12889o.C12894c(new C12915a(inputStream, httpURLConnection), a.mo45650c(uri, (String) null));
            }
        } catch (IOException unused) {
        }
        return inputStream;
    }

    /* renamed from: d */
    public static boolean m20627d(Uri uri) {
        if (uri != null) {
            String host = uri.getHost();
            if (host == null || !C19457k.m33018V0(host, "fbcdn.net")) {
                return host != null && C19457k.m33025c1(host, "fbcdn", false) && C19457k.m33018V0(host, "akamaihd.net");
            }
            return true;
        }
    }
}
