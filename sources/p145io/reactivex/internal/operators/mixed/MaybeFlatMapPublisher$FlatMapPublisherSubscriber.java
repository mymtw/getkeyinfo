package p145io.reactivex.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p248tp.C8058k;
import p287xp.C8339g;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.mixed.MaybeFlatMapPublisher$FlatMapPublisherSubscriber */
final class MaybeFlatMapPublisher$FlatMapPublisherSubscriber<T, R> extends AtomicReference<Subscription> implements C8056i<R>, C8058k<T>, Subscription {
    private static final long serialVersionUID = -8948264376121066672L;
    public final C20024c<? super R> downstream;
    public final C8339g<? super T, ? extends C20023b<? extends R>> mapper;
    public final AtomicLong requested = new AtomicLong();
    public Disposable upstream;

    public MaybeFlatMapPublisher$FlatMapPublisherSubscriber(C20024c<? super R> cVar, C8339g<? super T, ? extends C20023b<? extends R>> gVar) {
        this.downstream = cVar;
        this.mapper = gVar;
    }

    public void cancel() {
        this.upstream.dispose();
        SubscriptionHelper.cancel(this);
    }

    public void onComplete() {
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(R r) {
        this.downstream.onNext(r);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }

    public void onSuccess(T t) {
        try {
            Object apply = this.mapper.apply(t);
            C12965a.m20650b(apply, "The mapper returned a null Publisher");
            ((C20023b) apply).subscribe(this);
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            this.downstream.onError(th);
        }
    }

    public void request(long j) {
        SubscriptionHelper.deferredRequest(this, this.requested, j);
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.deferredSetOnce(this, this.requested, subscription);
    }
}
