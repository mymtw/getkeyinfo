package okhttp3;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.Closeable;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19941d;
import okhttp3.C19994o;
import okhttp3.internal.connection.C19967c;

/* renamed from: okhttp3.z */
public final class C20018z implements Closeable {

    /* renamed from: b */
    public C19941d f44361b;

    /* renamed from: c */
    public final C20011u f44362c;

    /* renamed from: d */
    public final Protocol f44363d;

    /* renamed from: e */
    public final String f44364e;

    /* renamed from: f */
    public final int f44365f;

    /* renamed from: g */
    public final Handshake f44366g;

    /* renamed from: h */
    public final C19994o f44367h;

    /* renamed from: i */
    public final C19928a0 f44368i;

    /* renamed from: j */
    public final C20018z f44369j;

    /* renamed from: k */
    public final C20018z f44370k;

    /* renamed from: l */
    public final C20018z f44371l;

    /* renamed from: m */
    public final long f44372m;

    /* renamed from: n */
    public final long f44373n;

    /* renamed from: o */
    public final C19967c f44374o;

    public C20018z(C20011u uVar, Protocol protocol, String str, int i, Handshake handshake, C19994o oVar, C19928a0 a0Var, C20018z zVar, C20018z zVar2, C20018z zVar3, long j, long j2, C19967c cVar) {
        this.f44362c = uVar;
        this.f44363d = protocol;
        this.f44364e = str;
        this.f44365f = i;
        this.f44366g = handshake;
        this.f44367h = oVar;
        this.f44368i = a0Var;
        this.f44369j = zVar;
        this.f44370k = zVar2;
        this.f44371l = zVar3;
        this.f44372m = j;
        this.f44373n = j2;
        this.f44374o = cVar;
    }

    /* renamed from: b */
    public static String m34284b(C20018z zVar, String str) {
        zVar.getClass();
        String a = zVar.f44367h.mo72948a(str);
        if (a != null) {
            return a;
        }
        return null;
    }

    /* renamed from: a */
    public final C19941d mo73004a() {
        C19941d dVar = this.f44361b;
        if (dVar != null) {
            return dVar;
        }
        C19941d.C19943b bVar = C19941d.f43999o;
        C19994o oVar = this.f44367h;
        bVar.getClass();
        C19941d a = C19941d.C19943b.m34097a(oVar);
        this.f44361b = a;
        return a;
    }

    public final void close() {
        C19928a0 a0Var = this.f44368i;
        if (a0Var != null) {
            a0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    /* renamed from: d */
    public final boolean mo73006d() {
        int i = this.f44365f;
        return 200 <= i && 299 >= i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Response{protocol=");
        h.append(this.f44363d);
        h.append(", code=");
        h.append(this.f44365f);
        h.append(", message=");
        h.append(this.f44364e);
        h.append(", url=");
        h.append(this.f44362c.f44342b);
        h.append('}');
        return h.toString();
    }

    /* renamed from: okhttp3.z$a */
    public static class C20019a {

        /* renamed from: a */
        public C20011u f44375a;

        /* renamed from: b */
        public Protocol f44376b;

        /* renamed from: c */
        public int f44377c;

        /* renamed from: d */
        public String f44378d;

        /* renamed from: e */
        public Handshake f44379e;

        /* renamed from: f */
        public C19994o.C19995a f44380f;

        /* renamed from: g */
        public C19928a0 f44381g;

        /* renamed from: h */
        public C20018z f44382h;

        /* renamed from: i */
        public C20018z f44383i;

        /* renamed from: j */
        public C20018z f44384j;

        /* renamed from: k */
        public long f44385k;

        /* renamed from: l */
        public long f44386l;

        /* renamed from: m */
        public C19967c f44387m;

        public C20019a() {
            this.f44377c = -1;
            this.f44380f = new C19994o.C19995a();
        }

        /* renamed from: b */
        public static void m34287b(String str, C20018z zVar) {
            if (zVar != null) {
                boolean z = true;
                if (zVar.f44368i == null) {
                    if (zVar.f44369j == null) {
                        if (zVar.f44370k == null) {
                            if (zVar.f44371l != null) {
                                z = false;
                            }
                            if (!z) {
                                throw new IllegalArgumentException(C0326j.m864i(str, ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(C0326j.m864i(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(C0326j.m864i(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(C0326j.m864i(str, ".body != null").toString());
            }
        }

        /* renamed from: a */
        public final C20018z mo73008a() {
            int i = this.f44377c;
            if (i >= 0) {
                C20011u uVar = this.f44375a;
                if (uVar != null) {
                    Protocol protocol = this.f44376b;
                    if (protocol != null) {
                        String str = this.f44378d;
                        if (str != null) {
                            return new C20018z(uVar, protocol, str, i, this.f44379e, this.f44380f.mo72961d(), this.f44381g, this.f44382h, this.f44383i, this.f44384j, this.f44385k, this.f44386l, this.f44387m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            StringBuilder h = C0072d.m201h("code < 0: ");
            h.append(this.f44377c);
            throw new IllegalStateException(h.toString().toString());
        }

        /* renamed from: c */
        public final void mo73009c(C19994o oVar) {
            C19383o.m32797g(oVar, "headers");
            this.f44380f = oVar.mo72952g();
        }

        public C20019a(C20018z zVar) {
            C19383o.m32797g(zVar, ResponseConstants.RESPONSE);
            this.f44375a = zVar.f44362c;
            this.f44376b = zVar.f44363d;
            this.f44377c = zVar.f44365f;
            this.f44378d = zVar.f44364e;
            this.f44379e = zVar.f44366g;
            this.f44380f = zVar.f44367h.mo72952g();
            this.f44381g = zVar.f44368i;
            this.f44382h = zVar.f44369j;
            this.f44383i = zVar.f44370k;
            this.f44384j = zVar.f44371l;
            this.f44385k = zVar.f44372m;
            this.f44386l = zVar.f44373n;
            this.f44387m = zVar.f44374o;
        }
    }
}
