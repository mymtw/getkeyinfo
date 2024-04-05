package kotlinx.coroutines.reactive;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19464a;
import kotlinx.coroutines.channels.C19513o;
import kotlinx.coroutines.channels.C19519u;
import kotlinx.coroutines.selects.C19804e;
import org.reactivestreams.Subscription;
import p514bk.C14088a;
import p568fn.C17782b;
import p753kq.C19857l;

public final class PublisherCoroutine<T> extends C19464a<C19394m> implements C19513o<T>, Subscription, C19804e<T, C19519u<? super T>> {

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f43736d = AtomicLongFieldUpdater.newUpdater(PublisherCoroutine.class, "_nRequested");
    private volatile /* synthetic */ long _nRequested;
    private volatile boolean cancelled;

    /* renamed from: C */
    public final boolean mo72187C(Throwable th) {
        return mo72508K(th);
    }

    /* renamed from: C0 */
    public final void mo72094C0(Throwable th, boolean z) {
        mo72575G0(th, z);
    }

    /* renamed from: D0 */
    public final void mo72095D0(Object obj) {
        C19394m mVar = (C19394m) obj;
        mo72575G0((Throwable) null, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo72188E(T r5, kotlin.coroutines.C19340c<? super kotlin.C19394m> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.reactive.PublisherCoroutine$send$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.reactive.PublisherCoroutine$send$1 r0 = (kotlinx.coroutines.reactive.PublisherCoroutine$send$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.reactive.PublisherCoroutine$send$1 r0 = new kotlinx.coroutines.reactive.PublisherCoroutine$send$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r2) goto L_0x0031
            java.lang.Object r5 = r0.L$1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.reactive.PublisherCoroutine r0 = (kotlinx.coroutines.reactive.PublisherCoroutine) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            java.lang.Throwable r5 = r0.mo72573E0(r5)
            throw r5
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
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.PublisherCoroutine.mo72188E(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: E0 */
    public final Throwable mo72573E0(T t) {
        if (t == null) {
            mo72576H0();
            throw new NullPointerException("Attempted to emit `null` inside a reactive publisher");
        } else if (!isActive()) {
            mo72576H0();
            return mo72398h();
        } else {
            try {
                throw null;
            } catch (Throwable th) {
                this.cancelled = true;
                boolean K = mo72508K(th);
                mo72576H0();
                if (K) {
                    return th;
                }
                throw null;
            }
        }
    }

    /* renamed from: F */
    public final boolean mo72189F() {
        return !isActive();
    }

    /* renamed from: F0 */
    public final void mo72574F0(Throwable th, boolean z) {
        if (this._nRequested != -2) {
            this._nRequested = -2;
            if (this.cancelled) {
                if (th != null) {
                    if (!z) {
                        throw null;
                    }
                }
                throw null;
            }
            th.getClass();
            try {
                throw null;
            } catch (Throwable th2) {
                if (th2 != th) {
                    C17782b.m29886t(th, th2);
                }
                C14088a.m21785m(th, this.f43394c);
                throw null;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: G0 */
    public final void mo72575G0(Throwable th, boolean z) {
        long j;
        int i;
        do {
            j = this._nRequested;
            if (j != -2) {
                i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                boolean z2 = true;
                if (i < 0) {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                return;
            }
        } while (!f43736d.compareAndSet(this, j, -1));
        if (i == 0) {
            mo72574F0(th, z);
            throw null;
        }
        throw null;
    }

    /* renamed from: H0 */
    public final void mo72576H0() {
        throw null;
    }

    /* renamed from: c */
    public final void mo72190c(C19857l lVar) {
        throw new UnsupportedOperationException("PublisherCoroutine doesn't support invokeOnClose");
    }

    public final void cancel() {
        this.cancelled = true;
        mo72134a((CancellationException) null);
    }

    /* renamed from: l */
    public final Object mo72199l(T t) {
        throw null;
    }

    public final boolean offer(T t) {
        return C19519u.C19520a.m33265a(this, t);
    }

    public final void request(long j) {
        long j2;
        int i;
        long j3;
        if (j <= 0) {
            mo72508K(new IllegalArgumentException(C19383o.m32802l(Long.valueOf(j), "non-positive subscription request ")));
            return;
        }
        do {
            j2 = this._nRequested;
            i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i >= 0) {
                long j4 = j2 + j;
                j3 = (j4 < 0 || j == Long.MAX_VALUE) ? Long.MAX_VALUE : j4;
                if (j2 == j3) {
                    return;
                }
            } else {
                return;
            }
        } while (!f43736d.compareAndSet(this, j2, j3));
        if (i == 0) {
            mo72576H0();
        }
    }

    /* renamed from: t */
    public final C19519u<T> mo72217t() {
        return this;
    }
}
