package com.etsy.android.lib.network;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.google.firebase.perf.p530v1.NetworkRequestMetric;
import com.google.firebase.perf.util.Timer;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20016y;
import okhttp3.C20018z;
import p552dn.C17697b;
import p576gn.C17800a;
import p576gn.C17801b;
import p616ln.C18208f;
import p739dr.C19006f;

/* renamed from: com.etsy.android.lib.network.m */
public final class C8737m implements C20000q {

    /* renamed from: b */
    public final C8618c f19182b;

    public C8737m(C8618c cVar) {
        C19383o.m32797g(cVar, "etsyConfigMap");
        this.f19182b = cVar;
    }

    public final C20018z intercept(C20000q.C20001a aVar) {
        if (this.f19182b.mo21132b(C8592b.f18826r1)) {
            C19006f fVar = (C19006f) aVar;
            C20011u uVar = fVar.f42351f;
            URL h = uVar.f44342b.mo72972h();
            String str = uVar.f44343c;
            C20016y yVar = uVar.f44345e;
            long j = 0;
            long a = yVar != null ? yVar.mo72943a() : 0;
            if (a < 0) {
                a = 0;
            }
            C19383o.m32793c(C17697b.m29701a(), "FirebasePerformance.getInstance()");
            C17800a aVar2 = new C17800a(h, str, C18208f.f39882t, new Timer());
            aVar2.f38692a.mo69037e(a);
            aVar2.f38693b.reset();
            aVar2.f38692a.mo69038f(aVar2.f38693b.getMicros());
            C20018z a2 = fVar.mo70453a(fVar.f42351f);
            int i = a2.f44365f;
            C19928a0 a0Var = a2.f44368i;
            long d = a0Var != null ? a0Var.mo70456d() : 0;
            if (d >= 0) {
                j = d;
            }
            aVar2.f38692a.mo69036d(i);
            aVar2.f38692a.mo69040h(j);
            if (aVar2.f38695d) {
                return a2;
            }
            C17801b bVar = aVar2.f38692a;
            bVar.mo69041i(aVar2.f38693b.getDurationMicros());
            ConcurrentHashMap concurrentHashMap = aVar2.f38694c;
            NetworkRequestMetric.C16642b bVar2 = bVar.f38700e;
            bVar2.mo59761u();
            NetworkRequestMetric.m27508I((NetworkRequestMetric) bVar2.f37158c).clear();
            bVar2.mo59761u();
            NetworkRequestMetric.m27508I((NetworkRequestMetric) bVar2.f37158c).putAll(concurrentHashMap);
            bVar.mo69034a();
            return a2;
        }
        C19006f fVar2 = (C19006f) aVar;
        return fVar2.mo70453a(fVar2.f42351f);
    }
}
