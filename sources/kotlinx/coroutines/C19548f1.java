package kotlinx.coroutines;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.Result;
import p514bk.C14088a;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.f1 */
public final class C19548f1 extends C19746j1 {

    /* renamed from: f */
    public final /* synthetic */ int f43504f;

    /* renamed from: g */
    public final Object f43505g;

    public /* synthetic */ C19548f1(Object obj, int i) {
        this.f43504f = i;
        this.f43505g = obj;
    }

    /* renamed from: F */
    public final void mo72253F(Throwable th) {
        switch (this.f43504f) {
            case 0:
                ((C19857l) this.f43505g).invoke(th);
                return;
            default:
                Object h0 = mo72494G().mo72521h0();
                if (h0 instanceof C19830v) {
                    ((C19753l) this.f43505g).resumeWith(Result.m35480constructorimpl(C0761x.m1673J(((C19830v) h0).f43842a)));
                    return;
                } else {
                    ((C19753l) this.f43505g).resumeWith(Result.m35480constructorimpl(C14088a.m21796y(h0)));
                    return;
                }
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f43504f) {
            case 0:
                mo72253F((Throwable) obj);
                return C19394m.f43287a;
            default:
                mo72253F((Throwable) obj);
                return C19394m.f43287a;
        }
    }
}
