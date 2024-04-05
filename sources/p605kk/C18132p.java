package p605kk;

import java.util.concurrent.Executor;

/* renamed from: kk.p */
public final class C18132p<TResult, TContinuationResult> implements C18121e<TContinuationResult>, C18120d, C18118b, C18139w {

    /* renamed from: b */
    public final Executor f39584b;

    /* renamed from: c */
    public final C18116a<TResult, C18123g<TContinuationResult>> f39585c;

    /* renamed from: d */
    public final C18117a0<TContinuationResult> f39586d;

    public C18132p(Executor executor, C18116a<TResult, C18123g<TContinuationResult>> aVar, C18117a0<TContinuationResult> a0Var) {
        this.f39584b = executor;
        this.f39585c = aVar;
        this.f39586d = a0Var;
    }

    /* renamed from: a */
    public final void mo414a(Exception exc) {
        this.f39586d.mo69672s(exc);
    }

    /* renamed from: b */
    public final void mo69676b() {
        this.f39586d.mo69674u();
    }

    /* renamed from: c */
    public final void mo69682c(C18123g<TResult> gVar) {
        this.f39584b.execute(new C18131o(this, gVar));
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f39586d.mo69673t(tcontinuationresult);
    }
}
