package p040c9;

import com.etsy.android.lib.logger.analytics.AnalyticsUploadWorker;
import com.etsy.android.lib.network.C8733i;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p334da.C12632c;
import p334da.C12636f;
import p340ea.C12677p;
import p514bk.C14088a;

/* renamed from: c9.l0 */
public final class C4606l0 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10399b;

    public C4606l0(C4579j1 j1Var) {
        this.f10399b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        AnalyticsUploadWorker analyticsUploadWorker = (AnalyticsUploadWorker) obj;
        C4579j1 j1Var = this.f10399b;
        C14088a aVar = j1Var.f10342z;
        C8733i iVar = j1Var.f10264j4.get();
        aVar.getClass();
        C19383o.m32797g(iVar, "retrofit");
        Object b = iVar.f19179a.mo74387b(C12632c.class);
        C19383o.m32796f(b, "retrofit.webMoshiRetrofi…ticsEndpoint::class.java)");
        analyticsUploadWorker.f19056h = new C12636f(this.f10399b.f10212b0.get(), this.f10399b.f10131L0.get(), this.f10399b.mo14404m(), this.f10399b.f10334x1.get(), (C12632c) b, this.f10399b.f10260j0.get(), this.f10399b.f10086C0.get());
        analyticsUploadWorker.f19057i = new C12677p(this.f10399b.f10131L0.get());
    }
}
