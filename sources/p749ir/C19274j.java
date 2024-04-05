package p749ir;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C19383o;
import okhttp3.Protocol;

/* renamed from: ir.j */
public final class C19274j implements C19276k {

    /* renamed from: a */
    public C19276k f43144a;

    /* renamed from: b */
    public final C19275a f43145b;

    /* renamed from: ir.j$a */
    public interface C19275a {
        /* renamed from: a */
        boolean mo71433a(SSLSocket sSLSocket);

        /* renamed from: b */
        C19276k mo71434b(SSLSocket sSLSocket);
    }

    public C19274j(C19275a aVar) {
        this.f43145b = aVar;
    }

    /* renamed from: a */
    public final boolean mo71423a(SSLSocket sSLSocket) {
        return this.f43145b.mo71433a(sSLSocket);
    }

    /* renamed from: b */
    public final String mo71424b(SSLSocket sSLSocket) {
        C19276k kVar;
        synchronized (this) {
            if (this.f43144a == null && this.f43145b.mo71433a(sSLSocket)) {
                this.f43144a = this.f43145b.mo71434b(sSLSocket);
            }
            kVar = this.f43144a;
        }
        if (kVar != null) {
            return kVar.mo71424b(sSLSocket);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo71425c(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C19276k kVar;
        C19383o.m32797g(list, "protocols");
        synchronized (this) {
            if (this.f43144a == null && this.f43145b.mo71433a(sSLSocket)) {
                this.f43144a = this.f43145b.mo71434b(sSLSocket);
            }
            kVar = this.f43144a;
        }
        if (kVar != null) {
            kVar.mo71425c(sSLSocket, str, list);
        }
    }

    public final boolean isSupported() {
        return true;
    }
}
