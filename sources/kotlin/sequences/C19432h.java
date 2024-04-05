package kotlin.sequences;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import p755lq.C19875a;

/* renamed from: kotlin.sequences.h */
public final class C19432h<T> extends C19433i<T> implements Iterator<T>, C19340c<C19394m>, C19875a {

    /* renamed from: b */
    public int f43355b;

    /* renamed from: c */
    public T f43356c;

    /* renamed from: d */
    public Iterator<? extends T> f43357d;

    /* renamed from: e */
    public C19340c<? super C19394m> f43358e;

    /* renamed from: a */
    public final CoroutineSingletons mo72006a(Object obj, C19340c cVar) {
        this.f43356c = obj;
        this.f43355b = 3;
        this.f43358e = cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C19383o.m32797g(cVar, "frame");
        return coroutineSingletons;
    }

    /* renamed from: b */
    public final Object mo72007b(Iterator<? extends T> it, C19340c<? super C19394m> cVar) {
        if (!it.hasNext()) {
            return C19394m.f43287a;
        }
        this.f43357d = it;
        this.f43355b = 2;
        this.f43358e = cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C19383o.m32797g(cVar, "frame");
        return coroutineSingletons;
    }

    /* renamed from: c */
    public final RuntimeException mo72008c() {
        int i = this.f43355b;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        StringBuilder h = C0072d.m201h("Unexpected state of the iterator: ");
        h.append(this.f43355b);
        return new IllegalStateException(h.toString());
    }

    public final CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public final boolean hasNext() {
        while (true) {
            int i = this.f43355b;
            if (i != 0) {
                if (i == 1) {
                    Iterator<? extends T> it = this.f43357d;
                    C19383o.m32794d(it);
                    if (it.hasNext()) {
                        this.f43355b = 2;
                        return true;
                    }
                    this.f43357d = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw mo72008c();
                }
            }
            this.f43355b = 5;
            C19340c<? super C19394m> cVar = this.f43358e;
            C19383o.m32794d(cVar);
            this.f43358e = null;
            cVar.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
        }
    }

    public final T next() {
        int i = this.f43355b;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        } else if (i == 2) {
            this.f43355b = 1;
            Iterator<? extends T> it = this.f43357d;
            C19383o.m32794d(it);
            return it.next();
        } else if (i == 3) {
            this.f43355b = 0;
            T t = this.f43356c;
            this.f43356c = null;
            return t;
        } else {
            throw mo72008c();
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void resumeWith(Object obj) {
        C0761x.m1684O0(obj);
        this.f43355b = 4;
    }
}
