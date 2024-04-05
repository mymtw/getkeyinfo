package p475we;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import p346fa.C12703a;

/* renamed from: we.c */
public final class C13827c {

    /* renamed from: a */
    public final C12703a f30439a;

    public C13827c(C12703a aVar) {
        C19383o.m32797g(aVar, "grafana");
        this.f30439a = aVar;
    }

    /* renamed from: a */
    public final void mo46666a(Throwable th) {
        C19383o.m32797g(th, "throwable");
        C12703a aVar = this.f30439a;
        StringBuilder h = C0072d.m201h("UpgradePrompt.error.");
        h.append(th.getClass().getSimpleName());
        aVar.mo45474a(h.toString());
    }
}
