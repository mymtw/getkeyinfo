package p505aj;

import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.exoplayer2.source.C14344i;
import com.google.common.collect.C16201n0;
import p505aj.C13992c;
import p602kh.C18054e0;
import p602kh.C18086u0;
import p602kh.C18089v0;

/* renamed from: aj.b */
public final /* synthetic */ class C13991b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C13992c.C13993a.C13994a.C13995a f30753b;

    /* renamed from: c */
    public final /* synthetic */ int f30754c;

    /* renamed from: d */
    public final /* synthetic */ long f30755d;

    /* renamed from: e */
    public final /* synthetic */ long f30756e;

    public /* synthetic */ C13991b(C13992c.C13993a.C13994a.C13995a aVar, int i, long j, long j2) {
        this.f30753b = aVar;
        this.f30754c = i;
        this.f30755d = j;
        this.f30756e = j2;
    }

    public final void run() {
        C13992c.C13993a.C13994a.C13995a aVar = this.f30753b;
        int i = this.f30754c;
        long j = this.f30755d;
        long j2 = this.f30756e;
        C18086u0 u0Var = (C18086u0) aVar.f30759b;
        C18086u0.C18087a aVar2 = u0Var.f39481d;
        C18089v0.C18090a F = u0Var.mo69617F(aVar2.f39487b.isEmpty() ? null : (C14344i.C14345a) C16201n0.m26211b(aVar2.f39487b));
        u0Var.mo69621J(F, CloseCodes.CLOSED_ABNORMALLY, new C18054e0(F, i, j, j2));
    }
}
