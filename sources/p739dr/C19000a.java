package p739dr;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import okhttp3.C19928a0;
import okhttp3.C19952i;
import okhttp3.C19984j;
import okhttp3.C19994o;
import okhttp3.C20000q;
import okhttp3.C20002r;
import okhttp3.C20011u;
import okhttp3.C20016y;
import okhttp3.C20018z;
import p568fn.C17782b;
import p735br.C18980c;
import p756lr.C19903o;
import p756lr.C19906r;

/* renamed from: dr.a */
public final class C19000a implements C20000q {

    /* renamed from: b */
    public final C19984j f42341b;

    public C19000a(C19984j jVar) {
        C19383o.m32797g(jVar, "cookieJar");
        this.f42341b = jVar;
    }

    public final C20018z intercept(C20000q.C20001a aVar) throws IOException {
        boolean z;
        C19928a0 a0Var;
        C19006f fVar = (C19006f) aVar;
        C20011u uVar = fVar.f42351f;
        uVar.getClass();
        C20011u.C20012a aVar2 = new C20011u.C20012a(uVar);
        C20016y yVar = uVar.f44345e;
        if (yVar != null) {
            C20002r b = yVar.mo72944b();
            if (b != null) {
                aVar2.mo73000c("Content-Type", b.f44261a);
            }
            long a = yVar.mo72943a();
            if (a != -1) {
                aVar2.mo73000c(HttpHeaders.CONTENT_LENGTH, String.valueOf(a));
                aVar2.f44349c.mo72963f("Transfer-Encoding");
            } else {
                aVar2.mo73000c("Transfer-Encoding", "chunked");
                aVar2.f44349c.mo72963f(HttpHeaders.CONTENT_LENGTH);
            }
        }
        int i = 0;
        if (uVar.f44344d.mo72948a("Host") == null) {
            aVar2.mo73000c("Host", C18980c.m32117u(uVar.f44342b, false));
        }
        if (uVar.f44344d.mo72948a("Connection") == null) {
            aVar2.mo73000c("Connection", "Keep-Alive");
        }
        if (uVar.f44344d.mo72948a("Accept-Encoding") == null && uVar.f44344d.mo72948a("Range") == null) {
            aVar2.mo73000c("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        List<C19952i> a2 = this.f42341b.mo38909a(uVar.f44342b);
        if (!a2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (T next : a2) {
                int i2 = i + 1;
                if (i >= 0) {
                    C19952i iVar = (C19952i) next;
                    if (i > 0) {
                        sb.append("; ");
                    }
                    sb.append(iVar.f44054a);
                    sb.append('=');
                    sb.append(iVar.f44055b);
                    i = i2;
                } else {
                    C17782b.m29877o0();
                    throw null;
                }
            }
            String sb2 = sb.toString();
            C19383o.m32796f(sb2, "StringBuilder().apply(builderAction).toString()");
            aVar2.mo73000c("Cookie", sb2);
        }
        if (uVar.f44344d.mo72948a("User-Agent") == null) {
            aVar2.mo73000c("User-Agent", "okhttp/4.9.1");
        }
        C20018z a3 = fVar.mo70453a(aVar2.mo72999b());
        C19005e.m32153b(this.f42341b, uVar.f44342b, a3.f44367h);
        C20018z.C20019a aVar3 = new C20018z.C20019a(a3);
        aVar3.f44375a = uVar;
        if (z && C19457k.m33019W0("gzip", C20018z.m34284b(a3, "Content-Encoding"), true) && C19005e.m32152a(a3) && (a0Var = a3.f44368i) != null) {
            C19903o oVar = new C19903o(a0Var.mo70458f());
            C19994o.C19995a g = a3.f44367h.mo72952g();
            g.mo72963f("Content-Encoding");
            g.mo72963f(HttpHeaders.CONTENT_LENGTH);
            aVar3.mo73009c(g.mo72961d());
            aVar3.f44381g = new C19007g(C20018z.m34284b(a3, "Content-Type"), -1, C19906r.m33998b(oVar));
        }
        return aVar3.mo73008a();
    }
}
