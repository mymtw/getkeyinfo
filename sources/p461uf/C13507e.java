package p461uf;

import com.facebook.appevents.AccessTokenAppIdPair;
import p401mg.C13080a;

/* renamed from: uf.e */
public final class C13507e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AccessTokenAppIdPair f29557b;

    /* renamed from: c */
    public final /* synthetic */ C13521n f29558c;

    public C13507e(AccessTokenAppIdPair accessTokenAppIdPair, C13521n nVar) {
        this.f29557b = accessTokenAppIdPair;
        this.f29558c = nVar;
    }

    public final void run() {
        if (!C13080a.m20762b(this)) {
            try {
                C13509g.m21273b(this.f29557b, this.f29558c);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
