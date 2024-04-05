package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8054g;
import p248tp.C8056i;
import p248tp.C8066r;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSubscribeOn */
public final class FlowableSubscribeOn<T> extends C19104a<T, T> {

    /* renamed from: d */
    public final C8066r f42663d;

    /* renamed from: e */
    public final boolean f42664e;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber */
    public static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements C8056i<T>, Subscription, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        public final C20024c<? super T> downstream;
        public final boolean nonScheduledRequests;
        public final AtomicLong requested = new AtomicLong();
        public C20023b<T> source;
        public final AtomicReference<Subscription> upstream = new AtomicReference<>();
        public final C8066r.C8069c worker;

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber$a */
        public static final class C19102a implements Runnable {

            /* renamed from: b */
            public final Subscription f42665b;

            /* renamed from: c */
            public final long f42666c;

            public C19102a(long j, Subscription subscription) {
                this.f42665b = subscription;
                this.f42666c = j;
            }

            public final void run() {
                this.f42665b.request(this.f42666c);
            }
        }

        public SubscribeOnSubscriber(C20024c<? super T> cVar, C8066r.C8069c cVar2, C20023b<T> bVar, boolean z) {
            this.downstream = cVar;
            this.worker = cVar2;
            this.source = bVar;
            this.nonScheduledRequests = !z;
        }

        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this.upstream, subscription)) {
                long andSet = this.requested.getAndSet(0);
                if (andSet != 0) {
                    requestUpstream(andSet, subscription);
                }
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                Subscription subscription = this.upstream.get();
                if (subscription != null) {
                    requestUpstream(j, subscription);
                    return;
                }
                C19382n.m32703D(this.requested, j);
                Subscription subscription2 = this.upstream.get();
                if (subscription2 != null) {
                    long andSet = this.requested.getAndSet(0);
                    if (andSet != 0) {
                        requestUpstream(andSet, subscription2);
                    }
                }
            }
        }

        public void requestUpstream(long j, Subscription subscription) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                subscription.request(j);
            } else {
                this.worker.mo20652a(new C19102a(j, subscription));
            }
        }

        public void run() {
            lazySet(Thread.currentThread());
            C20023b<T> bVar = this.source;
            this.source = null;
            bVar.subscribe(this);
        }
    }

    public FlowableSubscribeOn(C8054g<T> gVar, C8066r rVar, boolean z) {
        super(gVar);
        this.f42663d = rVar;
        this.f42664e = z;
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super T> cVar) {
        C8066r.C8069c b = this.f42663d.mo20646b();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(cVar, b, this.f42671c, this.f42664e);
        cVar.onSubscribe(subscribeOnSubscriber);
        b.mo20652a(subscribeOnSubscriber);
    }
}
