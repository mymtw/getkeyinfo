package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p248tp.C8073u;
import p287xp.C8339g;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.single.SingleFlatMapPublisher$SingleFlatMapPublisherObserver */
final class SingleFlatMapPublisher$SingleFlatMapPublisherObserver<S, T> extends AtomicLong implements C8073u<S>, C8056i<T>, Subscription {
    private static final long serialVersionUID = 7759721921468635667L;
    public Disposable disposable;
    public final C20024c<? super T> downstream;
    public final C8339g<? super S, ? extends C20023b<? extends T>> mapper;
    public final AtomicReference<Subscription> parent = new AtomicReference<>();

    public SingleFlatMapPublisher$SingleFlatMapPublisherObserver(C20024c<? super T> cVar, C8339g<? super S, ? extends C20023b<? extends T>> gVar) {
        this.downstream = cVar;
        this.mapper = gVar;
    }

    public void cancel() {
        this.disposable.dispose();
        SubscriptionHelper.cancel(this.parent);
    }

    public void onComplete() {
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public void onSubscribe(Disposable disposable2) {
        this.disposable = disposable2;
        this.downstream.onSubscribe(this);
    }

    public void onSuccess(S s) {
        try {
            Object apply = this.mapper.apply(s);
            C12965a.m20650b(apply, "the mapper returned a null Publisher");
            ((C20023b) apply).subscribe(this);
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            this.downstream.onError(th);
        }
    }

    public void request(long j) {
        SubscriptionHelper.deferredRequest(this.parent, this, j);
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.deferredSetOnce(this.parent, this, subscription);
    }
}
