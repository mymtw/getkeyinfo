package p145io.reactivex.internal.operators.flowable;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.ExceptionHelper;
import p145io.reactivex.processors.UnicastProcessor;
import p248tp.C8054g;
import p287xp.C8335c;
import p287xp.C8339g;
import p503zp.C13973i;
import p736cq.C18981a;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableGroupJoin$GroupJoinSubscription */
final class FlowableGroupJoin$GroupJoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Subscription, C19111g {
    public static final Integer LEFT_CLOSE = 3;
    public static final Integer LEFT_VALUE = 1;
    public static final Integer RIGHT_CLOSE = 4;
    public static final Integer RIGHT_VALUE = 2;
    private static final long serialVersionUID = -6071216598687999801L;
    public final AtomicInteger active;
    public volatile boolean cancelled;
    public final C7091a disposables = new C7091a();
    public final C20024c<? super R> downstream;
    public final AtomicReference<Throwable> error = new AtomicReference<>();
    public final C8339g<? super TLeft, ? extends C20023b<TLeftEnd>> leftEnd;
    public int leftIndex;
    public final Map<Integer, UnicastProcessor<TRight>> lefts = new LinkedHashMap();
    public final C19213a<Object> queue = new C19213a<>(C8054g.f17572b);
    public final AtomicLong requested = new AtomicLong();
    public final C8335c<? super TLeft, ? super C8054g<TRight>, ? extends R> resultSelector;
    public final C8339g<? super TRight, ? extends C20023b<TRightEnd>> rightEnd;
    public int rightIndex;
    public final Map<Integer, TRight> rights = new LinkedHashMap();

    public FlowableGroupJoin$GroupJoinSubscription(C20024c<? super R> cVar, C8339g<? super TLeft, ? extends C20023b<TLeftEnd>> gVar, C8339g<? super TRight, ? extends C20023b<TRightEnd>> gVar2, C8335c<? super TLeft, ? super C8054g<TRight>, ? extends R> cVar2) {
        this.downstream = cVar;
        this.leftEnd = gVar;
        this.rightEnd = gVar2;
        this.resultSelector = cVar2;
        this.active = new AtomicInteger(2);
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }
    }

    public void cancelAll() {
        this.disposables.dispose();
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            C19213a<Object> aVar = this.queue;
            C20024c<? super R> cVar = this.downstream;
            int i = 1;
            while (!this.cancelled) {
                if (this.error.get() != null) {
                    aVar.clear();
                    cancelAll();
                    errorAll(cVar);
                    return;
                }
                boolean z = this.active.get() == 0;
                Integer num = (Integer) aVar.poll();
                boolean z2 = num == null;
                if (z && z2) {
                    for (UnicastProcessor<TRight> onComplete : this.lefts.values()) {
                        onComplete.onComplete();
                    }
                    this.lefts.clear();
                    this.rights.clear();
                    this.disposables.dispose();
                    cVar.onComplete();
                    return;
                } else if (z2) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    Object poll = aVar.poll();
                    if (num == LEFT_VALUE) {
                        UnicastProcessor unicastProcessor = new UnicastProcessor(C8054g.f17572b, (Runnable) null);
                        int i2 = this.leftIndex;
                        this.leftIndex = i2 + 1;
                        this.lefts.put(Integer.valueOf(i2), unicastProcessor);
                        try {
                            Object apply = this.leftEnd.apply(poll);
                            C12965a.m20650b(apply, "The leftEnd returned a null Publisher");
                            C20023b bVar = (C20023b) apply;
                            FlowableGroupJoin$LeftRightEndSubscriber flowableGroupJoin$LeftRightEndSubscriber = new FlowableGroupJoin$LeftRightEndSubscriber(this, true, i2);
                            this.disposables.mo19403b(flowableGroupJoin$LeftRightEndSubscriber);
                            bVar.subscribe(flowableGroupJoin$LeftRightEndSubscriber);
                            if (this.error.get() != null) {
                                aVar.clear();
                                cancelAll();
                                errorAll(cVar);
                                return;
                            }
                            try {
                                Object apply2 = this.resultSelector.apply(poll, unicastProcessor);
                                C12965a.m20650b(apply2, "The resultSelector returned a null value");
                                if (this.requested.get() != 0) {
                                    cVar.onNext(apply2);
                                    C19382n.m32774u0(this.requested, 1);
                                    for (TRight onNext : this.rights.values()) {
                                        unicastProcessor.onNext(onNext);
                                    }
                                } else {
                                    fail(new MissingBackpressureException("Could not emit value due to lack of requests"), cVar, aVar);
                                    return;
                                }
                            } catch (Throwable th) {
                                fail(th, cVar, aVar);
                                return;
                            }
                        } catch (Throwable th2) {
                            fail(th2, cVar, aVar);
                            return;
                        }
                    } else if (num == RIGHT_VALUE) {
                        int i3 = this.rightIndex;
                        this.rightIndex = i3 + 1;
                        this.rights.put(Integer.valueOf(i3), poll);
                        try {
                            Object apply3 = this.rightEnd.apply(poll);
                            C12965a.m20650b(apply3, "The rightEnd returned a null Publisher");
                            C20023b bVar2 = (C20023b) apply3;
                            FlowableGroupJoin$LeftRightEndSubscriber flowableGroupJoin$LeftRightEndSubscriber2 = new FlowableGroupJoin$LeftRightEndSubscriber(this, false, i3);
                            this.disposables.mo19403b(flowableGroupJoin$LeftRightEndSubscriber2);
                            bVar2.subscribe(flowableGroupJoin$LeftRightEndSubscriber2);
                            if (this.error.get() != null) {
                                aVar.clear();
                                cancelAll();
                                errorAll(cVar);
                                return;
                            }
                            for (UnicastProcessor<TRight> onNext2 : this.lefts.values()) {
                                onNext2.onNext(poll);
                            }
                        } catch (Throwable th3) {
                            fail(th3, cVar, aVar);
                            return;
                        }
                    } else if (num == LEFT_CLOSE) {
                        FlowableGroupJoin$LeftRightEndSubscriber flowableGroupJoin$LeftRightEndSubscriber3 = (FlowableGroupJoin$LeftRightEndSubscriber) poll;
                        UnicastProcessor remove = this.lefts.remove(Integer.valueOf(flowableGroupJoin$LeftRightEndSubscriber3.index));
                        this.disposables.mo19402a(flowableGroupJoin$LeftRightEndSubscriber3);
                        if (remove != null) {
                            remove.onComplete();
                        }
                    } else if (num == RIGHT_CLOSE) {
                        FlowableGroupJoin$LeftRightEndSubscriber flowableGroupJoin$LeftRightEndSubscriber4 = (FlowableGroupJoin$LeftRightEndSubscriber) poll;
                        this.rights.remove(Integer.valueOf(flowableGroupJoin$LeftRightEndSubscriber4.index));
                        this.disposables.mo19402a(flowableGroupJoin$LeftRightEndSubscriber4);
                    }
                }
            }
            aVar.clear();
        }
    }

    public void errorAll(C20024c<?> cVar) {
        Throwable b = ExceptionHelper.m32483b(this.error);
        for (UnicastProcessor<TRight> onError : this.lefts.values()) {
            onError.onError(b);
        }
        this.lefts.clear();
        this.rights.clear();
        cVar.onError(b);
    }

    public void fail(Throwable th, C20024c<?> cVar, C13973i<?> iVar) {
        C19421p.m32940h0(th);
        ExceptionHelper.m32482a(this.error, th);
        iVar.clear();
        cancelAll();
        errorAll(cVar);
    }

    public void innerClose(boolean z, FlowableGroupJoin$LeftRightEndSubscriber flowableGroupJoin$LeftRightEndSubscriber) {
        synchronized (this) {
            this.queue.mo71258a(z ? LEFT_CLOSE : RIGHT_CLOSE, flowableGroupJoin$LeftRightEndSubscriber);
        }
        drain();
    }

    public void innerCloseError(Throwable th) {
        if (ExceptionHelper.m32482a(this.error, th)) {
            drain();
        } else {
            C18981a.m32123b(th);
        }
    }

    public void innerComplete(FlowableGroupJoin$LeftRightSubscriber flowableGroupJoin$LeftRightSubscriber) {
        this.disposables.mo19404c(flowableGroupJoin$LeftRightSubscriber);
        this.active.decrementAndGet();
        drain();
    }

    public void innerError(Throwable th) {
        if (ExceptionHelper.m32482a(this.error, th)) {
            this.active.decrementAndGet();
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void innerValue(boolean z, Object obj) {
        synchronized (this) {
            this.queue.mo71258a(z ? LEFT_VALUE : RIGHT_VALUE, obj);
        }
        drain();
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this.requested, j);
        }
    }
}
