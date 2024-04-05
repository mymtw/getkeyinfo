package p145io.reactivex.internal.operators.flowable;

import com.etsy.android.lib.push.registration.C8833f;
import org.reactivestreams.Subscription;
import p145io.reactivex.processors.C19250a;
import p248tp.C8054g;
import p287xp.C8339g;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableRetryWhen */
public final class FlowableRetryWhen<T> extends C19104a<T, T> {

    /* renamed from: d */
    public final C8339g<? super C8054g<Throwable>, ? extends C20023b<?>> f42656d;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableRetryWhen$RetryWhenSubscriber */
    public static final class RetryWhenSubscriber<T> extends FlowableRepeatWhen$WhenSourceSubscriber<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        public RetryWhenSubscriber(C20024c<? super T> cVar, C19250a<Throwable> aVar, Subscription subscription) {
            super(cVar, aVar, subscription);
        }

        public void onComplete() {
            this.receiver.cancel();
            this.downstream.onComplete();
        }

        public void onError(Throwable th) {
            again(th);
        }
    }

    public FlowableRetryWhen(FlowableCreate flowableCreate, C8833f fVar) {
        super(flowableCreate);
        this.f42656d = fVar;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [io.reactivex.processors.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20620d(p762or.C20024c<? super T> r6) {
        /*
            r5 = this;
            io.reactivex.subscribers.b r0 = new io.reactivex.subscribers.b
            r0.<init>(r6)
            io.reactivex.processors.UnicastProcessor r1 = new io.reactivex.processors.UnicastProcessor
            r2 = 0
            r3 = 8
            r1.<init>(r3, r2)
            boolean r2 = r1 instanceof p145io.reactivex.processors.C19251b
            if (r2 == 0) goto L_0x0012
            goto L_0x0018
        L_0x0012:
            io.reactivex.processors.b r2 = new io.reactivex.processors.b
            r2.<init>(r1)
            r1 = r2
        L_0x0018:
            xp.g<? super tp.g<java.lang.Throwable>, ? extends or.b<?>> r2 = r5.f42656d     // Catch:{ all -> 0x0042 }
            java.lang.Object r2 = r2.apply(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = "handler returned a null Publisher"
            p145io.reactivex.internal.functions.C12965a.m20650b(r2, r3)     // Catch:{ all -> 0x0042 }
            or.b r2 = (p762or.C20023b) r2     // Catch:{ all -> 0x0042 }
            io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenReceiver r3 = new io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenReceiver
            tp.g<T> r4 = r5.f42671c
            r3.<init>(r4)
            io.reactivex.internal.operators.flowable.FlowableRetryWhen$RetryWhenSubscriber r4 = new io.reactivex.internal.operators.flowable.FlowableRetryWhen$RetryWhenSubscriber
            r4.<init>(r0, r1, r3)
            r3.subscriber = r4
            r6.onSubscribe(r4)
            r2.subscribe(r3)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.onNext(r6)
            return
        L_0x0042:
            r0 = move-exception
            kotlin.reflect.C19421p.m32940h0(r0)
            p145io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.flowable.FlowableRetryWhen.mo20620d(or.c):void");
    }
}
