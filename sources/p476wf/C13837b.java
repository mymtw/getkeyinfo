package p476wf;

import com.facebook.appevents.codeless.ViewIndexingTrigger;
import p365hg.C12882n;
import p401mg.C13080a;
import p453tf.C13418j;
import p453tf.C13442y;

/* renamed from: wf.b */
public final class C13837b implements ViewIndexingTrigger.C12220b {

    /* renamed from: a */
    public final /* synthetic */ C12882n f30454a;

    /* renamed from: b */
    public final /* synthetic */ String f30455b;

    public C13837b(C12882n nVar, String str) {
        this.f30454a = nVar;
        this.f30455b = str;
    }

    /* renamed from: a */
    public final void mo39315a() {
        C12882n nVar = this.f30454a;
        boolean z = false;
        boolean z2 = nVar != null && nVar.f28406j;
        String str = C13418j.f29381a;
        String str2 = C13442y.f29447a;
        Class<C13442y> cls = C13442y.class;
        if (!C13080a.m20762b(cls)) {
            try {
                C13442y.f29456j.mo46124e();
                z = C13442y.f29453g.mo46131a();
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
        if (z2 && z) {
            String str3 = this.f30455b;
            Class<C13838c> cls2 = C13838c.class;
            if (!C13080a.m20762b(cls2)) {
                try {
                    if (!C13838c.f30462g) {
                        C13838c.f30462g = true;
                        C13418j.m21108d().execute(new C13836a(str3));
                    }
                } catch (Throwable th2) {
                    C13080a.m20761a(cls2, th2);
                }
            }
        }
    }
}
