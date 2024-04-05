package kotlinx.coroutines.rx2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C19394m;
import kotlinx.coroutines.C19464a;
import kotlinx.coroutines.channels.C19513o;
import kotlinx.coroutines.channels.C19519u;
import kotlinx.coroutines.selects.C19804e;
import p145io.reactivex.exceptions.UndeliverableException;
import p568fn.C17782b;
import p753kq.C19857l;

public final class RxObservableCoroutine<T> extends C19464a<C19394m> implements C19513o<T>, C19804e<T, C19519u<? super T>> {

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43756d = AtomicIntegerFieldUpdater.newUpdater(RxObservableCoroutine.class, "_signal");
    private volatile /* synthetic */ int _signal;

    /* renamed from: C */
    public final boolean mo72187C(Throwable th) {
        return mo72508K(th);
    }

    /* renamed from: C0 */
    public final void mo72094C0(Throwable th, boolean z) {
        if (f43756d.compareAndSet(this, 0, -1)) {
            throw null;
        }
    }

    /* renamed from: D0 */
    public final void mo72095D0(Object obj) {
        C19394m mVar = (C19394m) obj;
        if (f43756d.compareAndSet(this, 0, -1)) {
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo72188E(T r5, kotlin.coroutines.C19340c<? super kotlin.C19394m> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.rx2.RxObservableCoroutine$send$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.rx2.RxObservableCoroutine$send$1 r0 = (kotlinx.coroutines.rx2.RxObservableCoroutine$send$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.rx2.RxObservableCoroutine$send$1 r0 = new kotlinx.coroutines.rx2.RxObservableCoroutine$send$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0039
            if (r1 != r2) goto L_0x0031
            java.lang.Object r5 = r0.L$1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.rx2.RxObservableCoroutine r0 = (kotlinx.coroutines.rx2.RxObservableCoroutine) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            r0.mo72601E0(r5)
            throw r3
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r2
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxObservableCoroutine.mo72188E(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: E0 */
    public final Throwable mo72601E0(T t) {
        if (!isActive()) {
            mo72602F0(mo72516Y(), mo72517Z());
            throw null;
        }
        try {
            throw null;
        } catch (Throwable th) {
            mo72508K(new UndeliverableException(th));
            throw null;
        }
    }

    /* renamed from: F */
    public final boolean mo72189F() {
        return !isActive();
    }

    /* renamed from: F0 */
    public final void mo72602F0(Throwable th, boolean z) {
        if (this._signal != -2) {
            this._signal = -2;
            Throwable th2 = th == null ? null : th;
            th2.getClass();
            if (th2 instanceof UndeliverableException) {
                if (!z) {
                    C19789b.m33749b(th, this.f43394c);
                    throw null;
                }
            }
            if (th2 == mo72398h()) {
                throw null;
            }
            try {
                throw null;
            } catch (Exception e) {
                C17782b.m29886t(th, e);
                C19789b.m33749b(th, this.f43394c);
            }
        } else {
            throw null;
        }
    }

    /* renamed from: c */
    public final void mo72190c(C19857l lVar) {
        throw new UnsupportedOperationException("RxObservableCoroutine doesn't support invokeOnClose");
    }

    /* renamed from: l */
    public final Object mo72199l(T t) {
        throw null;
    }

    public final boolean offer(T t) {
        return C19519u.C19520a.m33265a(this, t);
    }

    /* renamed from: t */
    public final C19519u<T> mo72217t() {
        return this;
    }
}
