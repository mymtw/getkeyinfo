package p040c9;

import com.etsy.android.lib.currency.C8637h;
import com.etsy.android.lib.logger.perf.C8708e;
import com.etsy.android.lib.util.C8890e0;
import dagger.internal.C17555d;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: c9.f */
public final class C4521f implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f9965a;

    /* renamed from: b */
    public final C4479c f9966b;

    /* renamed from: c */
    public final C19011a f9967c;

    public /* synthetic */ C4521f(C4479c cVar, C19011a aVar, int i) {
        this.f9965a = i;
        this.f9966b = cVar;
        this.f9967c = aVar;
    }

    public final Object get() {
        switch (this.f9965a) {
            case 0:
                C4479c cVar = this.f9966b;
                C8637h hVar = (C8637h) this.f9967c.get();
                cVar.getClass();
                C17782b.m29841G(hVar);
                return hVar;
            default:
                this.f9966b.getClass();
                return new C8708e((C8890e0) this.f9967c.get());
        }
    }
}
