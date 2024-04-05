package kotlinx.coroutines;

import kotlin.C19394m;
import kotlinx.coroutines.internal.C19722g;

/* renamed from: kotlinx.coroutines.n */
public final class C19759n extends C19704h1 {

    /* renamed from: f */
    public final C19753l<?> f43718f;

    public C19759n(C19753l<?> lVar) {
        this.f43718f = lVar;
    }

    /* renamed from: F */
    public final void mo72253F(Throwable th) {
        C19753l<?> lVar = this.f43718f;
        Throwable k = lVar.mo72533k(mo72494G());
        if (!(!lVar.mo72550p() ? false : ((C19722g) lVar.f43709e).mo72457k(k))) {
            lVar.mo72495D(k);
            if (!lVar.mo72550p()) {
                lVar.mo72545h();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo72253F((Throwable) obj);
        return C19394m.f43287a;
    }
}
