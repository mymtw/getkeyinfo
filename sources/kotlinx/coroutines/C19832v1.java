package kotlinx.coroutines;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlinx.coroutines.selects.C19805f;
import p514bk.C14088a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: kotlinx.coroutines.v1 */
public final class C19832v1<T, R> extends C19746j1 {

    /* renamed from: f */
    public final C19805f<R> f43843f;

    /* renamed from: g */
    public final C19861p<T, C19340c<? super R>, Object> f43844g;

    public C19832v1(C19805f<? super R> fVar, C19861p<? super T, ? super C19340c<? super R>, ? extends Object> pVar) {
        this.f43843f = fVar;
        this.f43844g = pVar;
    }

    /* renamed from: F */
    public final void mo72253F(Throwable th) {
        if (this.f43843f.mo72634k()) {
            C19749k1 G = mo72494G();
            C19805f<R> fVar = this.f43843f;
            C19861p<T, C19340c<? super R>, Object> pVar = this.f43844g;
            Object h0 = G.mo72521h0();
            if (h0 instanceof C19830v) {
                fVar.mo72636n(((C19830v) h0).f43842a);
            } else {
                C19543e0.m33322m0(pVar, C14088a.m21796y(h0), fVar.mo72635l(), (C19857l) null);
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo72253F((Throwable) obj);
        return C19394m.f43287a;
    }
}
