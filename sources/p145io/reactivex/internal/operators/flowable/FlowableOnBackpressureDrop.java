package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop */
public final class FlowableOnBackpressureDrop<T> extends C19104a<T, T> implements Consumer<T> {

    /* renamed from: d */
    public final FlowableOnBackpressureDrop f42649d = this;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop$BackpressureDropSubscriber */
    public static final class BackpressureDropSubscriber<T> extends AtomicLong implements C8056i<T>, Subscription {
        private static final long serialVersionUID = -6246093802440953054L;
        public boolean done;
        public final C20024c<? super T> downstream;
        public final Consumer<? super T> onDrop;
        public Subscription upstream;

        public BackpressureDropSubscriber(C20024c<? super T> cVar, Consumer<? super T> consumer) {
            this.downstream = cVar;
            this.onDrop = consumer;
        }

        public void cancel() {
            this.upstream.cancel();
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                C18981a.m32123b(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        public void onNext(T t) {
            if (!this.done) {
                if (get() != 0) {
                    this.downstream.onNext(t);
                    C19382n.m32774u0(this, 1);
                    return;
                }
                try {
                    this.onDrop.accept(t);
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    cancel();
                    onError(th);
                }
            }
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C19382n.m32703D(this, j);
            }
        }
    }

    public FlowableOnBackpressureDrop(C19108e eVar) {
        super(eVar);
    }

    public final void accept(T t) {
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super T> cVar) {
        this.f42671c.mo20619c(new BackpressureDropSubscriber(cVar, this.f42649d));
    }
}
