package p505aj;

import android.content.Context;
import p505aj.C13999g;
import p505aj.C14008o;

/* renamed from: aj.n */
public final class C14007n implements C13999g.C14000a {

    /* renamed from: a */
    public final Context f30824a;

    /* renamed from: b */
    public final C14014t f30825b = null;

    /* renamed from: c */
    public final C13999g.C14000a f30826c;

    public C14007n(Context context, String str) {
        C14008o.C14009a aVar = new C14008o.C14009a();
        aVar.f30842b = str;
        this.f30824a = context.getApplicationContext();
        this.f30826c = aVar;
    }

    /* renamed from: a */
    public final C13999g mo46816a() {
        C14006m mVar = new C14006m(this.f30824a, this.f30826c.mo46816a());
        C14014t tVar = this.f30825b;
        if (tVar != null) {
            mVar.mo46806e(tVar);
        }
        return mVar;
    }
}
