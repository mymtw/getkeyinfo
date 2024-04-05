package p605kk;

import com.google.android.gms.measurement.internal.C15128x4;
import java.util.concurrent.Executor;

/* renamed from: kk.n */
public final class C18130n<TResult, TContinuationResult> implements C18139w<TResult> {

    /* renamed from: b */
    public final Executor f39579b;

    /* renamed from: c */
    public final C18116a<TResult, TContinuationResult> f39580c;

    /* renamed from: d */
    public final C18117a0<TContinuationResult> f39581d;

    public C18130n(Executor executor, C18116a<TResult, TContinuationResult> aVar, C18117a0<TContinuationResult> a0Var) {
        this.f39579b = executor;
        this.f39580c = aVar;
        this.f39581d = a0Var;
    }

    /* renamed from: c */
    public final void mo69682c(C18123g<TResult> gVar) {
        this.f39579b.execute(new C15128x4(2, (Object) this, (Object) gVar));
    }
}
