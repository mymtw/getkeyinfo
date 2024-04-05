package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: com.airbnb.lottie.n */
public final class C4849n<T> {

    /* renamed from: e */
    public static ExecutorService f11015e = Executors.newCachedThreadPool();

    /* renamed from: a */
    public final LinkedHashSet f11016a;

    /* renamed from: b */
    public final LinkedHashSet f11017b;

    /* renamed from: c */
    public final Handler f11018c;

    /* renamed from: d */
    public volatile C4841l<T> f11019d;

    /* renamed from: com.airbnb.lottie.n$a */
    public class C4850a extends FutureTask<C4841l<T>> {
        public C4850a(Callable<C4841l<T>> callable) {
            super(callable);
        }

        public final void done() {
            if (!isCancelled()) {
                try {
                    C4849n.this.mo14620b((C4841l) get());
                } catch (InterruptedException | ExecutionException e) {
                    C4849n.this.mo14620b(new C4841l(e));
                }
            }
        }
    }

    public C4849n() {
        throw null;
    }

    public C4849n(Callable<C4841l<T>> callable) {
        this.f11016a = new LinkedHashSet(1);
        this.f11017b = new LinkedHashSet(1);
        this.f11018c = new Handler(Looper.getMainLooper());
        this.f11019d = null;
        f11015e.execute(new C4850a(callable));
    }

    /* renamed from: a */
    public final synchronized void mo14619a(C4838i iVar) {
        if (!(this.f11019d == null || this.f11019d.f10902a == null)) {
            iVar.onResult(this.f11019d.f10902a);
        }
        this.f11016a.add(iVar);
    }

    /* renamed from: b */
    public final void mo14620b(C4841l<T> lVar) {
        if (this.f11019d == null) {
            this.f11019d = lVar;
            this.f11018c.post(new C4842m(this));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
