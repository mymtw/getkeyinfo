package p641on;

import androidx.profileinstaller.C3061f;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p605kk.C18117a0;
import p605kk.C18118b;
import p605kk.C18120d;
import p605kk.C18121e;
import p605kk.C18123g;
import p605kk.C18126j;

/* renamed from: on.d */
public final class C18325d {

    /* renamed from: d */
    public static final HashMap f40225d = new HashMap();

    /* renamed from: e */
    public static final C3061f f40226e = new C3061f(1);

    /* renamed from: a */
    public final ExecutorService f40227a;

    /* renamed from: b */
    public final C18331i f40228b;

    /* renamed from: c */
    public C18117a0 f40229c = null;

    /* renamed from: on.d$a */
    public static class C18326a<TResult> implements C18121e<TResult>, C18120d, C18118b {

        /* renamed from: b */
        public final CountDownLatch f40230b = new CountDownLatch(1);

        /* renamed from: a */
        public final void mo414a(Exception exc) {
            this.f40230b.countDown();
        }

        /* renamed from: b */
        public final void mo69676b() {
            this.f40230b.countDown();
        }

        public final void onSuccess(TResult tresult) {
            this.f40230b.countDown();
        }
    }

    public C18325d(ExecutorService executorService, C18331i iVar) {
        this.f40227a = executorService;
        this.f40228b = iVar;
    }

    /* renamed from: a */
    public static Object m30952a(C18123g gVar, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C18326a aVar = new C18326a();
        C3061f fVar = f40226e;
        gVar.mo69658e(fVar, aVar);
        gVar.mo69657d(fVar, aVar);
        gVar.mo69654a(fVar, aVar);
        if (!aVar.f40230b.await(5, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (gVar.mo69668o()) {
            return gVar.mo69664k();
        } else {
            throw new ExecutionException(gVar.mo69663j());
        }
    }

    /* renamed from: b */
    public final synchronized C18123g<C18327e> mo69860b() {
        C18117a0 a0Var = this.f40229c;
        if (a0Var == null || (a0Var.mo69667n() && !this.f40229c.mo69668o())) {
            ExecutorService executorService = this.f40227a;
            C18331i iVar = this.f40228b;
            Objects.requireNonNull(iVar);
            this.f40229c = C18126j.m30615c(executorService, new C18322a(iVar));
        }
        return this.f40229c;
    }
}
