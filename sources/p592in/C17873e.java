package p592in;

import com.google.firebase.perf.p530v1.NetworkRequestMetric;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import p568fn.C17781a;
import p576gn.C17801b;

/* renamed from: in.e */
public final class C17873e {

    /* renamed from: f */
    public static final C17781a f38807f = C17781a.m29823d();

    /* renamed from: a */
    public final HttpURLConnection f38808a;

    /* renamed from: b */
    public final C17801b f38809b;

    /* renamed from: c */
    public long f38810c = -1;

    /* renamed from: d */
    public long f38811d = -1;

    /* renamed from: e */
    public final Timer f38812e;

    public C17873e(HttpURLConnection httpURLConnection, Timer timer, C17801b bVar) {
        this.f38808a = httpURLConnection;
        this.f38809b = bVar;
        this.f38812e = timer;
        bVar.mo69042j(httpURLConnection.getURL().toString());
    }

    /* renamed from: a */
    public final void mo69228a() throws IOException {
        if (this.f38810c == -1) {
            this.f38812e.reset();
            long micros = this.f38812e.getMicros();
            this.f38810c = micros;
            this.f38809b.mo69038f(micros);
        }
        try {
            this.f38808a.connect();
        } catch (IOException e) {
            this.f38809b.mo69041i(this.f38812e.getDurationMicros());
            C17876h.m30013c(this.f38809b);
            throw e;
        }
    }

    /* renamed from: b */
    public final Object mo69229b() throws IOException {
        mo69238i();
        this.f38809b.mo69036d(this.f38808a.getResponseCode());
        try {
            Object content = this.f38808a.getContent();
            if (content instanceof InputStream) {
                this.f38809b.mo69039g(this.f38808a.getContentType());
                return new C17869a((InputStream) content, this.f38809b, this.f38812e);
            }
            this.f38809b.mo69039g(this.f38808a.getContentType());
            this.f38809b.mo69040h((long) this.f38808a.getContentLength());
            this.f38809b.mo69041i(this.f38812e.getDurationMicros());
            this.f38809b.mo69034a();
            return content;
        } catch (IOException e) {
            this.f38809b.mo69041i(this.f38812e.getDurationMicros());
            C17876h.m30013c(this.f38809b);
            throw e;
        }
    }

    /* renamed from: c */
    public final Object mo69230c(Class[] clsArr) throws IOException {
        mo69238i();
        this.f38809b.mo69036d(this.f38808a.getResponseCode());
        try {
            Object content = this.f38808a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f38809b.mo69039g(this.f38808a.getContentType());
                return new C17869a((InputStream) content, this.f38809b, this.f38812e);
            }
            this.f38809b.mo69039g(this.f38808a.getContentType());
            this.f38809b.mo69040h((long) this.f38808a.getContentLength());
            this.f38809b.mo69041i(this.f38812e.getDurationMicros());
            this.f38809b.mo69034a();
            return content;
        } catch (IOException e) {
            this.f38809b.mo69041i(this.f38812e.getDurationMicros());
            C17876h.m30013c(this.f38809b);
            throw e;
        }
    }

    /* renamed from: d */
    public final InputStream mo69231d() {
        mo69238i();
        try {
            this.f38809b.mo69036d(this.f38808a.getResponseCode());
        } catch (IOException unused) {
            f38807f.mo69014a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f38808a.getErrorStream();
        return errorStream != null ? new C17869a(errorStream, this.f38809b, this.f38812e) : errorStream;
    }

    /* renamed from: e */
    public final C17869a mo69232e() throws IOException {
        mo69238i();
        this.f38809b.mo69036d(this.f38808a.getResponseCode());
        this.f38809b.mo69039g(this.f38808a.getContentType());
        try {
            return new C17869a(this.f38808a.getInputStream(), this.f38809b, this.f38812e);
        } catch (IOException e) {
            this.f38809b.mo69041i(this.f38812e.getDurationMicros());
            C17876h.m30013c(this.f38809b);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.f38808a.equals(obj);
    }

    /* renamed from: f */
    public final C17870b mo69234f() throws IOException {
        try {
            return new C17870b(this.f38808a.getOutputStream(), this.f38809b, this.f38812e);
        } catch (IOException e) {
            this.f38809b.mo69041i(this.f38812e.getDurationMicros());
            C17876h.m30013c(this.f38809b);
            throw e;
        }
    }

    /* renamed from: g */
    public final int mo69235g() throws IOException {
        mo69238i();
        if (this.f38811d == -1) {
            long durationMicros = this.f38812e.getDurationMicros();
            this.f38811d = durationMicros;
            NetworkRequestMetric.C16642b bVar = this.f38809b.f38700e;
            bVar.mo59761u();
            NetworkRequestMetric.m27506G((NetworkRequestMetric) bVar.f37158c, durationMicros);
        }
        try {
            int responseCode = this.f38808a.getResponseCode();
            this.f38809b.mo69036d(responseCode);
            return responseCode;
        } catch (IOException e) {
            this.f38809b.mo69041i(this.f38812e.getDurationMicros());
            C17876h.m30013c(this.f38809b);
            throw e;
        }
    }

    /* renamed from: h */
    public final String mo69236h() throws IOException {
        mo69238i();
        if (this.f38811d == -1) {
            long durationMicros = this.f38812e.getDurationMicros();
            this.f38811d = durationMicros;
            NetworkRequestMetric.C16642b bVar = this.f38809b.f38700e;
            bVar.mo59761u();
            NetworkRequestMetric.m27506G((NetworkRequestMetric) bVar.f37158c, durationMicros);
        }
        try {
            String responseMessage = this.f38808a.getResponseMessage();
            this.f38809b.mo69036d(this.f38808a.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            this.f38809b.mo69041i(this.f38812e.getDurationMicros());
            C17876h.m30013c(this.f38809b);
            throw e;
        }
    }

    public final int hashCode() {
        return this.f38808a.hashCode();
    }

    /* renamed from: i */
    public final void mo69238i() {
        if (this.f38810c == -1) {
            this.f38812e.reset();
            long micros = this.f38812e.getMicros();
            this.f38810c = micros;
            this.f38809b.mo69038f(micros);
        }
        String requestMethod = this.f38808a.getRequestMethod();
        if (requestMethod != null) {
            this.f38809b.mo69035c(requestMethod);
        } else if (this.f38808a.getDoOutput()) {
            this.f38809b.mo69035c("POST");
        } else {
            this.f38809b.mo69035c("GET");
        }
    }

    public final String toString() {
        return this.f38808a.toString();
    }
}
