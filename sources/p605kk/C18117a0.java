package p605kk;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: kk.a0 */
public final class C18117a0<TResult> extends C18123g<TResult> {

    /* renamed from: a */
    public final Object f39560a = new Object();

    /* renamed from: b */
    public final C18140x<TResult> f39561b = new C18140x<>();

    /* renamed from: c */
    public boolean f39562c;

    /* renamed from: d */
    public volatile boolean f39563d;

    /* renamed from: e */
    public TResult f39564e;

    /* renamed from: f */
    public Exception f39565f;

    /* renamed from: a */
    public final void mo69654a(Executor executor, C18118b bVar) {
        this.f39561b.mo69685a(new C18133q(executor, bVar));
        mo69675v();
    }

    /* renamed from: b */
    public final void mo69655b(Executor executor, C18119c cVar) {
        this.f39561b.mo69685a(new C18134r(executor, cVar));
        mo69675v();
    }

    /* renamed from: c */
    public final void mo69656c(C18119c cVar) {
        this.f39561b.mo69685a(new C18134r(C18125i.f39567a, cVar));
        mo69675v();
    }

    /* renamed from: d */
    public final C18117a0 mo69657d(Executor executor, C18120d dVar) {
        this.f39561b.mo69685a(new C18135s(executor, dVar));
        mo69675v();
        return this;
    }

    /* renamed from: e */
    public final C18117a0 mo69658e(Executor executor, C18121e eVar) {
        this.f39561b.mo69685a(new C18136t(executor, eVar));
        mo69675v();
        return this;
    }

    /* renamed from: f */
    public final C18117a0 mo69659f(C18121e eVar) {
        mo69658e(C18125i.f39567a, eVar);
        return this;
    }

    /* renamed from: g */
    public final <TContinuationResult> C18123g<TContinuationResult> mo69660g(Executor executor, C18116a<TResult, TContinuationResult> aVar) {
        C18117a0 a0Var = new C18117a0();
        this.f39561b.mo69685a(new C18130n(executor, aVar, a0Var));
        mo69675v();
        return a0Var;
    }

    /* renamed from: h */
    public final <TContinuationResult> C18123g<TContinuationResult> mo69661h(C18116a<TResult, TContinuationResult> aVar) {
        return mo69660g(C18125i.f39567a, aVar);
    }

    /* renamed from: i */
    public final <TContinuationResult> C18123g<TContinuationResult> mo69662i(Executor executor, C18116a<TResult, C18123g<TContinuationResult>> aVar) {
        C18117a0 a0Var = new C18117a0();
        this.f39561b.mo69685a(new C18132p(executor, aVar, a0Var));
        mo69675v();
        return a0Var;
    }

    /* renamed from: j */
    public final Exception mo69663j() {
        Exception exc;
        synchronized (this.f39560a) {
            exc = this.f39565f;
        }
        return exc;
    }

    /* renamed from: k */
    public final TResult mo69664k() {
        TResult tresult;
        synchronized (this.f39560a) {
            Preconditions.checkState(this.f39562c, "Task is not yet complete");
            if (!this.f39563d) {
                Exception exc = this.f39565f;
                if (exc == null) {
                    tresult = this.f39564e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return tresult;
    }

    /* renamed from: l */
    public final <X extends Throwable> TResult mo69665l(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f39560a) {
            Preconditions.checkState(this.f39562c, "Task is not yet complete");
            if (this.f39563d) {
                throw new CancellationException("Task is already canceled.");
            } else if (!cls.isInstance(this.f39565f)) {
                Exception exc = this.f39565f;
                if (exc == null) {
                    tresult = this.f39564e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.f39565f));
            }
        }
        return tresult;
    }

    /* renamed from: m */
    public final boolean mo69666m() {
        return this.f39563d;
    }

    /* renamed from: n */
    public final boolean mo69667n() {
        boolean z;
        synchronized (this.f39560a) {
            z = this.f39562c;
        }
        return z;
    }

    /* renamed from: o */
    public final boolean mo69668o() {
        boolean z;
        synchronized (this.f39560a) {
            z = false;
            if (this.f39562c && !this.f39563d && this.f39565f == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: p */
    public final <TContinuationResult> C18123g<TContinuationResult> mo69669p(Executor executor, C18122f<TResult, TContinuationResult> fVar) {
        C18117a0 a0Var = new C18117a0();
        this.f39561b.mo69685a(new C18138v(executor, fVar, a0Var));
        mo69675v();
        return a0Var;
    }

    /* renamed from: q */
    public final <TContinuationResult> C18123g<TContinuationResult> mo69670q(C18122f<TResult, TContinuationResult> fVar) {
        C18142z zVar = C18125i.f39567a;
        C18117a0 a0Var = new C18117a0();
        this.f39561b.mo69685a(new C18138v(zVar, fVar, a0Var));
        mo69675v();
        return a0Var;
    }

    /* renamed from: r */
    public final C18117a0 mo69671r(C18120d dVar) {
        mo69657d(C18125i.f39567a, dVar);
        return this;
    }

    /* renamed from: s */
    public final void mo69672s(Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f39560a) {
            if (!this.f39562c) {
                this.f39562c = true;
                this.f39565f = exc;
            } else {
                throw DuplicateTaskCompletionException.m24721of(this);
            }
        }
        this.f39561b.mo69686b(this);
    }

    /* renamed from: t */
    public final void mo69673t(TResult tresult) {
        synchronized (this.f39560a) {
            if (!this.f39562c) {
                this.f39562c = true;
                this.f39564e = tresult;
            } else {
                throw DuplicateTaskCompletionException.m24721of(this);
            }
        }
        this.f39561b.mo69686b(this);
    }

    /* renamed from: u */
    public final void mo69674u() {
        synchronized (this.f39560a) {
            if (!this.f39562c) {
                this.f39562c = true;
                this.f39563d = true;
                this.f39561b.mo69686b(this);
            }
        }
    }

    /* renamed from: v */
    public final void mo69675v() {
        synchronized (this.f39560a) {
            if (this.f39562c) {
                this.f39561b.mo69686b(this);
            }
        }
    }
}
