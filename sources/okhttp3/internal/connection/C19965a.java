package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20000q;
import okhttp3.C20009t;
import okhttp3.C20011u;
import okhttp3.C20018z;
import p739dr.C19006f;

/* renamed from: okhttp3.internal.connection.a */
public final class C19965a implements C20000q {

    /* renamed from: b */
    public static final C19965a f44121b = new C19965a();

    public final C20018z intercept(C20000q.C20001a aVar) throws IOException {
        C19006f fVar = (C19006f) aVar;
        C19971e eVar = fVar.f42347b;
        eVar.getClass();
        synchronized (eVar) {
            if (!eVar.f44164m) {
                throw new IllegalStateException("released".toString());
            } else if (!(!eVar.f44163l)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!eVar.f44162k) {
                C19394m mVar = C19394m.f43287a;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        C19970d dVar = eVar.f44158g;
        C19383o.m32794d(dVar);
        C20009t tVar = eVar.f44168q;
        C19383o.m32797g(tVar, "client");
        try {
            C19967c cVar = new C19967c(eVar, eVar.f44154c, dVar, dVar.mo72911a(fVar.f42352g, fVar.f42353h, fVar.f42354i, tVar.f44283C, tVar.f44291g, !C19383o.m32792b(fVar.f42351f.f44343c, "GET")).mo72929j(tVar, fVar));
            eVar.f44161j = cVar;
            eVar.f44166o = cVar;
            synchronized (eVar) {
                eVar.f44162k = true;
                eVar.f44163l = true;
            }
            if (!eVar.f44165n) {
                return C19006f.m32154c(fVar, 0, cVar, (C20011u) null, 61).mo70453a(fVar.f42351f);
            }
            throw new IOException("Canceled");
        } catch (RouteException e) {
            dVar.mo72913c(e.getLastConnectException());
            throw e;
        } catch (IOException e2) {
            dVar.mo72913c(e2);
            throw new RouteException(e2);
        }
    }
}
