package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C19464a;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.selects.C19803d;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.channels.e */
public class C19501e<E> extends C19464a<C19394m> implements C19499d<E> {

    /* renamed from: d */
    public final C19499d<E> f43448d;

    public C19501e(CoroutineContext coroutineContext, AbstractChannel abstractChannel) {
        super(coroutineContext, true);
        this.f43448d = abstractChannel;
    }

    /* renamed from: C */
    public final boolean mo72187C(Throwable th) {
        return this.f43448d.mo72187C(th);
    }

    /* renamed from: E */
    public final Object mo72188E(E e, C19340c<? super C19394m> cVar) {
        return this.f43448d.mo72188E(e, cVar);
    }

    /* renamed from: F */
    public final boolean mo72189F() {
        return this.f43448d.mo72189F();
    }

    /* renamed from: L */
    public final void mo72208L(CancellationException cancellationException) {
        this.f43448d.mo72134a(cancellationException);
        mo72508K(cancellationException);
    }

    /* renamed from: a */
    public final void mo72134a(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(mo72096P(), (Throwable) null, this);
            }
            mo72208L(cancellationException);
        }
    }

    /* renamed from: c */
    public final void mo72190c(C19857l<? super Throwable, C19394m> lVar) {
        this.f43448d.mo72190c(lVar);
    }

    public final boolean isEmpty() {
        return this.f43448d.isEmpty();
    }

    public final C19502f<E> iterator() {
        return this.f43448d.iterator();
    }

    /* renamed from: l */
    public final Object mo72199l(E e) {
        return this.f43448d.mo72199l(e);
    }

    /* renamed from: o */
    public final Object mo72138o(ContinuationImpl continuationImpl) {
        return this.f43448d.mo72138o(continuationImpl);
    }

    public final boolean offer(E e) {
        return this.f43448d.offer(e);
    }

    /* renamed from: p */
    public final C19803d<E> mo72139p() {
        return this.f43448d.mo72139p();
    }

    /* renamed from: q */
    public final C19803d<C19503g<E>> mo72140q() {
        return this.f43448d.mo72140q();
    }

    /* renamed from: w */
    public final Object mo72144w() {
        return this.f43448d.mo72144w();
    }

    /* renamed from: y */
    public final Object mo72146y(C19340c<? super C19503g<? extends E>> cVar) {
        Object y = this.f43448d.mo72146y(cVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return y;
    }
}
