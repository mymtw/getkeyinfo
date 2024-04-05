package p576gn;

import com.google.firebase.perf.config.C16594a;
import com.google.firebase.perf.util.Timer;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import p568fn.C17781a;
import p616ln.C18208f;

/* renamed from: gn.a */
public final class C17800a {

    /* renamed from: e */
    public static final C17781a f38691e = C17781a.m29823d();

    /* renamed from: a */
    public final C17801b f38692a;

    /* renamed from: b */
    public final Timer f38693b;

    /* renamed from: c */
    public final ConcurrentHashMap f38694c = new ConcurrentHashMap();

    /* renamed from: d */
    public boolean f38695d = false;

    public C17800a(URL url, String str, C18208f fVar, Timer timer) {
        String url2 = url.toString();
        this.f38693b = timer;
        C17801b bVar = new C17801b(fVar);
        bVar.mo69042j(url2);
        bVar.mo69035c(str);
        this.f38692a = bVar;
        bVar.f38704i = true;
        if (!C16594a.m27423e().mo59258o()) {
            f38691e.mo69017e("HttpMetric feature is disabled. URL %s", url2);
            this.f38695d = true;
        }
    }
}
