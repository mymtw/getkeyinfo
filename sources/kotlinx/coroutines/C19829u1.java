package kotlinx.coroutines;

import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;

/* renamed from: kotlinx.coroutines.u1 */
public final class C19829u1 extends C19746j1 {

    /* renamed from: f */
    public final C19340c<C19394m> f43840f;

    public C19829u1(C19753l lVar) {
        this.f43840f = lVar;
    }

    /* renamed from: F */
    public final void mo72253F(Throwable th) {
        this.f43840f.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo72253F((Throwable) obj);
        return C19394m.f43287a;
    }
}
