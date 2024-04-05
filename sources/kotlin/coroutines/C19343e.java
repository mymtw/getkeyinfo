package kotlin.coroutines;

import android.support.p013v4.media.C0072d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p744gq.C19059b;

/* renamed from: kotlin.coroutines.e */
public final class C19343e<T> implements C19340c<T>, C19059b {
    @Deprecated

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater<C19343e<?>, Object> f43196c = AtomicReferenceFieldUpdater.newUpdater(C19343e.class, Object.class, "result");

    /* renamed from: b */
    public final C19340c<T> f43197b;
    private volatile Object result;

    public C19343e(CoroutineSingletons coroutineSingletons, C19340c cVar) {
        this.f43197b = cVar;
        this.result = coroutineSingletons;
    }

    /* renamed from: a */
    public final Object mo71808a() {
        boolean z;
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            AtomicReferenceFieldUpdater<C19343e<?>, Object> atomicReferenceFieldUpdater = f43196c;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, coroutineSingletons2)) {
                    if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        if (!(obj instanceof Result.Failure)) {
            return obj;
        }
        throw ((Result.Failure) obj).exception;
    }

    public final C19059b getCallerFrame() {
        C19340c<T> cVar = this.f43197b;
        if (cVar instanceof C19059b) {
            return (C19059b) cVar;
        }
        return null;
    }

    public final CoroutineContext getContext() {
        return this.f43197b.getContext();
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            boolean z = false;
            if (obj2 == coroutineSingletons) {
                AtomicReferenceFieldUpdater<C19343e<?>, Object> atomicReferenceFieldUpdater = f43196c;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, obj)) {
                        if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj2 == coroutineSingletons2) {
                    AtomicReferenceFieldUpdater<C19343e<?>, Object> atomicReferenceFieldUpdater2 = f43196c;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.RESUMED;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons2, coroutineSingletons3)) {
                            if (atomicReferenceFieldUpdater2.get(this) != coroutineSingletons2) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        this.f43197b.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SafeContinuation for ");
        h.append(this.f43197b);
        return h.toString();
    }

    public C19343e(C19340c<? super T> cVar) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        this.f43197b = cVar;
        this.result = coroutineSingletons;
    }
}
