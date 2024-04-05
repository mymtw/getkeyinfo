package com.etsy.android.lib.dagger;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.network.C8732h;
import com.etsy.android.lib.network.C8734j;
import java.util.concurrent.TimeUnit;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p340ea.C12673n;
import p486y9.C13886b;
import p486y9.C13887c;
import p735br.C18980c;
import p753kq.C19857l;

public final class OkHttpClientHolder {

    /* renamed from: a */
    public C20009t f18996a;

    /* renamed from: b */
    public C20009t f18997b;

    public OkHttpClientHolder(C8732h hVar, C8734j jVar, C13886b bVar, final C12673n nVar) {
        C19383o.m32797g(hVar, "defaultV3Client");
        C19383o.m32797g(jVar, "defaultCookieHarvesterClient");
        C19383o.m32797g(bVar, "configUpdates");
        SubscribersKt.m32501f(bVar.mo46713a(), new C19857l<Throwable, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C19394m.f43287a;
            }

            public final void invoke(Throwable th) {
                C19383o.m32797g(th, "e");
                C12673n nVar = nVar;
                if (nVar != null) {
                    String message = th.getMessage();
                    if (message == null) {
                        message = "There was an error while observing the ConfigUpdateStream.";
                    }
                    nVar.mo45449a(message);
                }
            }
        }, new C19857l<C13887c, C19394m>(this) {
            public final /* synthetic */ OkHttpClientHolder this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke(C13887c cVar) {
                C19383o.m32797g(cVar, "event");
                C8623e eVar = cVar.f30553a.f18706f;
                if (eVar != null) {
                    OkHttpClientHolder okHttpClientHolder = this.this$0;
                    if (eVar.mo21132b(C8592b.f18843x0)) {
                        long e = eVar.mo21135e(C8592b.f18846y0);
                        long e2 = eVar.mo21135e(C8592b.f18849z0);
                        long e3 = eVar.mo21135e(C8592b.f18719A0);
                        long e4 = eVar.mo21135e(C8592b.f18722B0);
                        C20009t.C20010a b = okHttpClientHolder.f18996a.mo72991b();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        b.mo72995c(e, timeUnit);
                        b.f44311A = C18980c.m32098b(e2, timeUnit);
                        b.f44338x = C18980c.m32098b(e3, timeUnit);
                        b.mo72994b(e4, timeUnit);
                        okHttpClientHolder.f18996a = new C20009t(b);
                        C20009t.C20010a b2 = okHttpClientHolder.f18997b.mo72991b();
                        b2.mo72995c(e, timeUnit);
                        b2.f44311A = C18980c.m32098b(e2, timeUnit);
                        b2.f44338x = C18980c.m32098b(e3, timeUnit);
                        b2.mo72994b(e4, timeUnit);
                        okHttpClientHolder.f18997b = new C20009t(b2);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C13887c) obj);
                return C19394m.f43287a;
            }
        }, 2);
        this.f18996a = hVar.f19178a;
        this.f18997b = jVar.f19180a;
    }
}
