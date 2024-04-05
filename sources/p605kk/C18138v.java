package p605kk;

import java.util.concurrent.Executor;

/* renamed from: kk.v */
public final class C18138v<TResult, TContinuationResult> implements C18121e<TContinuationResult>, C18120d, C18118b, C18139w {

    /* renamed from: b */
    public final Executor f39601b;

    /* renamed from: c */
    public final C18122f<TResult, TContinuationResult> f39602c;

    /* renamed from: d */
    public final C18117a0<TContinuationResult> f39603d;

    public C18138v(Executor executor, C18122f<TResult, TContinuationResult> fVar, C18117a0<TContinuationResult> a0Var) {
        this.f39601b = executor;
        this.f39602c = fVar;
        this.f39603d = a0Var;
    }

    /* renamed from: a */
    public final void mo414a(Exception exc) {
        this.f39603d.mo69672s(exc);
    }

    /* renamed from: b */
    public final void mo69676b() {
        this.f39603d.mo69674u();
    }

    /* renamed from: c */
    public final void mo69682c(C18123g<TResult> gVar) {
        this.f39601b.execute(new C18137u(this, gVar));
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f39603d.mo69673t(tcontinuationresult);
    }
}
