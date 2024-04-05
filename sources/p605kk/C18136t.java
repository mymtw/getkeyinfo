package p605kk;

import java.util.concurrent.Executor;
import p604kj.C18105j;

/* renamed from: kk.t */
public final class C18136t<TResult> implements C18139w<TResult> {

    /* renamed from: b */
    public final Executor f39596b;

    /* renamed from: c */
    public final Object f39597c = new Object();

    /* renamed from: d */
    public C18121e<? super TResult> f39598d;

    public C18136t(Executor executor, C18121e<? super TResult> eVar) {
        this.f39596b = executor;
        this.f39598d = eVar;
    }

    /* renamed from: c */
    public final void mo69682c(C18123g<TResult> gVar) {
        if (gVar.mo69668o()) {
            synchronized (this.f39597c) {
                if (this.f39598d != null) {
                    this.f39596b.execute(new C18105j((Object) this, (Object) gVar, 5));
                }
            }
        }
    }
}
