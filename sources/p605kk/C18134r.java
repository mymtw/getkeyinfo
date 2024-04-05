package p605kk;

import androidx.work.C3421k;
import java.util.concurrent.Executor;

/* renamed from: kk.r */
public final class C18134r<TResult> implements C18139w<TResult> {

    /* renamed from: b */
    public final Executor f39590b;

    /* renamed from: c */
    public final Object f39591c = new Object();

    /* renamed from: d */
    public C18119c<TResult> f39592d;

    public C18134r(Executor executor, C18119c<TResult> cVar) {
        this.f39590b = executor;
        this.f39592d = cVar;
    }

    /* renamed from: c */
    public final void mo69682c(C18123g<TResult> gVar) {
        synchronized (this.f39591c) {
            if (this.f39592d != null) {
                this.f39590b.execute(new C3421k((Object) this, (Object) gVar, 2));
            }
        }
    }
}
