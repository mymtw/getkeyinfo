package p365hg;

import com.facebook.FacebookException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C19394m;
import p453tf.C13418j;

/* renamed from: hg.n0 */
public final class C12885n0 {

    /* renamed from: a */
    public final ReentrantLock f28415a = new ReentrantLock();

    /* renamed from: b */
    public C12888c f28416b;

    /* renamed from: c */
    public C12888c f28417c;

    /* renamed from: d */
    public int f28418d;

    /* renamed from: e */
    public final int f28419e;

    /* renamed from: f */
    public final Executor f28420f;

    /* renamed from: hg.n0$a */
    public static final class C12886a {
        /* renamed from: a */
        public static final void m20606a(boolean z) {
            if (!z) {
                throw new FacebookException("Validation failed");
            }
        }
    }

    /* renamed from: hg.n0$b */
    public interface C12887b {
        /* renamed from: a */
        void mo45645a();

        boolean cancel();
    }

    /* renamed from: hg.n0$c */
    public final class C12888c implements C12887b {

        /* renamed from: a */
        public C12888c f28421a;

        /* renamed from: b */
        public C12888c f28422b;

        /* renamed from: c */
        public boolean f28423c;

        /* renamed from: d */
        public final Runnable f28424d;

        public C12888c(Runnable runnable) {
            this.f28424d = runnable;
        }

        /* renamed from: a */
        public final void mo45645a() {
            ReentrantLock reentrantLock = C12885n0.this.f28415a;
            reentrantLock.lock();
            try {
                if (!this.f28423c) {
                    C12885n0 n0Var = C12885n0.this;
                    n0Var.f28416b = mo45648c(n0Var.f28416b);
                    C12885n0 n0Var2 = C12885n0.this;
                    n0Var2.f28416b = mo45647b(n0Var2.f28416b, true);
                }
                C19394m mVar = C19394m.f43287a;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: b */
        public final C12888c mo45647b(C12888c cVar, boolean z) {
            boolean z2 = true;
            C12886a.m20606a(this.f28421a == null);
            if (this.f28422b != null) {
                z2 = false;
            }
            C12886a.m20606a(z2);
            if (cVar == null) {
                this.f28422b = this;
                this.f28421a = this;
                cVar = this;
            } else {
                this.f28421a = cVar;
                C12888c cVar2 = cVar.f28422b;
                this.f28422b = cVar2;
                if (cVar2 != null) {
                    cVar2.f28421a = this;
                }
                C12888c cVar3 = this.f28421a;
                if (cVar3 != null) {
                    cVar3.f28422b = cVar2 != null ? cVar2.f28421a : null;
                }
            }
            return z ? this : cVar;
        }

        /* renamed from: c */
        public final C12888c mo45648c(C12888c cVar) {
            boolean z = true;
            C12886a.m20606a(this.f28421a != null);
            if (this.f28422b == null) {
                z = false;
            }
            C12886a.m20606a(z);
            if (cVar == this && (cVar = this.f28421a) == this) {
                cVar = null;
            }
            C12888c cVar2 = this.f28421a;
            if (cVar2 != null) {
                cVar2.f28422b = this.f28422b;
            }
            C12888c cVar3 = this.f28422b;
            if (cVar3 != null) {
                cVar3.f28421a = cVar2;
            }
            this.f28422b = null;
            this.f28421a = null;
            return cVar;
        }

        public final boolean cancel() {
            ReentrantLock reentrantLock = C12885n0.this.f28415a;
            reentrantLock.lock();
            try {
                if (!this.f28423c) {
                    C12885n0 n0Var = C12885n0.this;
                    n0Var.f28416b = mo45648c(n0Var.f28416b);
                    return true;
                }
                C19394m mVar = C19394m.f43287a;
                reentrantLock.unlock();
                return false;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    static {
        new C12886a();
    }

    public C12885n0(int i) {
        Executor d = C13418j.m21108d();
        this.f28419e = i;
        this.f28420f = d;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static C12888c m20604a(C12885n0 n0Var, Runnable runnable) {
        n0Var.getClass();
        C12888c cVar = new C12888c(runnable);
        ReentrantLock reentrantLock = n0Var.f28415a;
        reentrantLock.lock();
        try {
            n0Var.f28416b = cVar.mo45647b(n0Var.f28416b, true);
            C19394m mVar = C19394m.f43287a;
            reentrantLock.unlock();
            n0Var.mo45644b((C12888c) null);
            return cVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo45644b(C12888c cVar) {
        C12888c cVar2;
        this.f28415a.lock();
        if (cVar != null) {
            this.f28417c = cVar.mo45648c(this.f28417c);
            this.f28418d--;
        }
        if (this.f28418d < this.f28419e) {
            cVar2 = this.f28416b;
            if (cVar2 != null) {
                this.f28416b = cVar2.mo45648c(cVar2);
                this.f28417c = cVar2.mo45647b(this.f28417c, false);
                this.f28418d++;
                cVar2.f28423c = true;
            }
        } else {
            cVar2 = null;
        }
        this.f28415a.unlock();
        if (cVar2 != null) {
            this.f28420f.execute(new C12899o0(this, cVar2));
        }
    }
}
