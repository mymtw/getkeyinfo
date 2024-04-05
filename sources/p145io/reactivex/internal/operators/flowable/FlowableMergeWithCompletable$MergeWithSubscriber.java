package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8050c;
import p248tp.C8056i;
import p514bk.C14088a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable$MergeWithSubscriber */
final class FlowableMergeWithCompletable$MergeWithSubscriber<T> extends AtomicInteger implements C8056i<T>, Subscription {
    private static final long serialVersionUID = -4592979584110982903L;
    public final C20024c<? super T> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public volatile boolean mainDone;
    public final AtomicReference<Subscription> mainSubscription = new AtomicReference<>();
    public volatile boolean otherDone;
    public final OtherObserver otherObserver = new OtherObserver(this);
    public final AtomicLong requested = new AtomicLong();

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable$MergeWithSubscriber$OtherObserver */
    public static final class OtherObserver extends AtomicReference<Disposable> implements C8050c {
        private static final long serialVersionUID = -2935427570954647017L;
        public final FlowableMergeWithCompletable$MergeWithSubscriber<?> parent;

        public OtherObserver(FlowableMergeWithCompletable$MergeWithSubscriber<?> flowableMergeWithCompletable$MergeWithSubscriber) {
            this.parent = flowableMergeWithCompletable$MergeWithSubscriber;
        }

        public void onComplete() {
            this.parent.otherComplete();
        }

        public void onError(Throwable th) {
            this.parent.otherError(th);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public FlowableMergeWithCompletable$MergeWithSubscriber(C20024c<? super T> cVar) {
        this.downstream = cVar;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this.mainSubscription);
        DisposableHelper.dispose(this.otherObserver);
    }

    public void onComplete() {
        this.mainDone = true;
        if (this.otherDone) {
            C14088a.m21790s(this.downstream, this, this.error);
        }
    }

    public void onError(Throwable th) {
        DisposableHelper.dispose(this.otherObserver);
        C14088a.m21792u(this.downstream, th, this, this.error);
    }

    public void onNext(T t) {
        C14088a.m21794w(this.downstream, t, this, this.error);
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.deferredSetOnce(this.mainSubscription, this.requested, subscription);
    }

    public void otherComplete() {
        this.otherDone = true;
        if (this.mainDone) {
            C14088a.m21790s(this.downstream, this, this.error);
        }
    }

    public void otherError(Throwable th) {
        SubscriptionHelper.cancel(this.mainSubscription);
        C14088a.m21792u(this.downstream, th, this, this.error);
    }

    public void request(long j) {
        SubscriptionHelper.deferredRequest(this.mainSubscription, this.requested, j);
    }
}
