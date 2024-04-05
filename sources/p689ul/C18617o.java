package p689ul;

import com.google.android.play.core.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;

/* renamed from: ul.o */
public final class C18617o<ResultT> extends C18606d<ResultT> {

    /* renamed from: a */
    public final Object f41106a = new Object();

    /* renamed from: b */
    public final C18613k f41107b = new C18613k();

    /* renamed from: c */
    public boolean f41108c;

    /* renamed from: d */
    public Object f41109d;

    /* renamed from: e */
    public Exception f41110e;

    /* renamed from: a */
    public final C18617o mo70114a(Executor executor, C18604b bVar) {
        this.f41107b.mo70123a(new C18610h(executor, bVar));
        mo70130j();
        return this;
    }

    /* renamed from: b */
    public final C18617o mo70115b(C18604b bVar) {
        mo70114a(C18607e.f41090a, bVar);
        return this;
    }

    /* renamed from: c */
    public final C18617o mo70116c(Executor executor, C18605c cVar) {
        this.f41107b.mo70123a(new C18611i(executor, cVar));
        mo70130j();
        return this;
    }

    /* renamed from: d */
    public final C18617o mo70117d(C18605c cVar) {
        mo70116c(C18607e.f41090a, cVar);
        return this;
    }

    /* renamed from: e */
    public final Exception mo70118e() {
        Exception exc;
        synchronized (this.f41106a) {
            exc = this.f41110e;
        }
        return exc;
    }

    /* renamed from: f */
    public final ResultT mo70119f() {
        ResultT resultt;
        synchronized (this.f41106a) {
            if (this.f41108c) {
                Exception exc = this.f41110e;
                if (exc == null) {
                    resultt = this.f41109d;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw new IllegalStateException("Task is not yet complete");
            }
        }
        return resultt;
    }

    /* renamed from: g */
    public final boolean mo70120g() {
        boolean z;
        synchronized (this.f41106a) {
            z = this.f41108c;
        }
        return z;
    }

    /* renamed from: h */
    public final boolean mo70121h() {
        boolean z;
        synchronized (this.f41106a) {
            z = false;
            if (this.f41108c && this.f41110e == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: i */
    public final C18617o mo70129i(C18603a aVar) {
        this.f41107b.mo70123a(new C18609g(C18607e.f41090a, aVar));
        mo70130j();
        return this;
    }

    /* renamed from: j */
    public final void mo70130j() {
        synchronized (this.f41106a) {
            if (this.f41108c) {
                this.f41107b.mo70124b(this);
            }
        }
    }
}
