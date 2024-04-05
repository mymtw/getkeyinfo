package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableUsing$UsingSubscriber */
final class FlowableUsing$UsingSubscriber<T, D> extends AtomicBoolean implements C8056i<T>, Subscription {
    private static final long serialVersionUID = 5904473792286235046L;
    public final Consumer<? super D> disposer;
    public final C20024c<? super T> downstream;
    public final boolean eager;
    public final D resource;
    public Subscription upstream;

    public FlowableUsing$UsingSubscriber(C20024c<? super T> cVar, D d, Consumer<? super D> consumer, boolean z) {
        this.downstream = cVar;
        this.resource = d;
        this.disposer = consumer;
        this.eager = z;
    }

    public void cancel() {
        disposeAfter();
        this.upstream.cancel();
    }

    public void disposeAfter() {
        if (compareAndSet(false, true)) {
            try {
                this.disposer.accept(this.resource);
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                C18981a.m32123b(th);
            }
        }
    }

    public void onComplete() {
        if (this.eager) {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    this.downstream.onError(th);
                    return;
                }
            }
            this.upstream.cancel();
            this.downstream.onComplete();
            return;
        }
        this.downstream.onComplete();
        this.upstream.cancel();
        disposeAfter();
    }

    public void onError(Throwable th) {
        if (this.eager) {
            Throwable th2 = null;
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th3) {
                    th2 = th3;
                    C19421p.m32940h0(th2);
                }
            }
            this.upstream.cancel();
            if (th2 != null) {
                this.downstream.onError(new CompositeException(th, th2));
                return;
            }
            this.downstream.onError(th);
            return;
        }
        this.downstream.onError(th);
        this.upstream.cancel();
        disposeAfter();
    }

    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
        }
    }

    public void request(long j) {
        this.upstream.request(j);
    }
}
