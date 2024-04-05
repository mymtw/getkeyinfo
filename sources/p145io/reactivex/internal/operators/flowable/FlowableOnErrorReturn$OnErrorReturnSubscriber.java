package p145io.reactivex.internal.operators.flowable;

import kotlin.reflect.C19421p;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import p287xp.C8339g;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableOnErrorReturn$OnErrorReturnSubscriber */
final class FlowableOnErrorReturn$OnErrorReturnSubscriber<T> extends SinglePostCompleteSubscriber<T, T> {
    private static final long serialVersionUID = -3740826063558713822L;
    public final C8339g<? super Throwable, ? extends T> valueSupplier;

    public FlowableOnErrorReturn$OnErrorReturnSubscriber(C20024c<? super T> cVar, C8339g<? super Throwable, ? extends T> gVar) {
        super(cVar);
        this.valueSupplier = gVar;
    }

    public void onComplete() {
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        try {
            Object apply = this.valueSupplier.apply(th);
            C12965a.m20650b(apply, "The valueSupplier returned a null value");
            complete(apply);
        } catch (Throwable th2) {
            C19421p.m32940h0(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    public void onNext(T t) {
        this.produced++;
        this.downstream.onNext(t);
    }
}
