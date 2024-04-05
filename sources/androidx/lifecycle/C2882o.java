package androidx.lifecycle;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p753kq.C19861p;

/* renamed from: androidx.lifecycle.o */
public abstract class C2882o implements C19525d0 {
    /* renamed from: a */
    public abstract Lifecycle mo10742a();

    /* renamed from: b */
    public final void mo10833b(C19861p pVar) {
        C19697g.m33468f(this, (CoroutineContext) null, (CoroutineStart) null, new LifecycleCoroutineScope$launchWhenCreated$1(this, pVar, (C19340c<? super LifecycleCoroutineScope$launchWhenCreated$1>) null), 3);
    }

    /* renamed from: c */
    public final void mo10834c(C19861p pVar) {
        C19697g.m33468f(this, (CoroutineContext) null, (CoroutineStart) null, new LifecycleCoroutineScope$launchWhenStarted$1(this, pVar, (C19340c<? super LifecycleCoroutineScope$launchWhenStarted$1>) null), 3);
    }
}
