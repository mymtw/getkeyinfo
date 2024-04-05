package p145io.reactivex.internal.operators.observable;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.util.ExceptionHelper;
import p248tp.C8054g;
import p248tp.C8065q;
import p287xp.C8335c;
import p287xp.C8339g;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableJoin$JoinDisposable */
final class ObservableJoin$JoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, C19171l {
    public static final Integer LEFT_CLOSE = 3;
    public static final Integer LEFT_VALUE = 1;
    public static final Integer RIGHT_CLOSE = 4;
    public static final Integer RIGHT_VALUE = 2;
    private static final long serialVersionUID = -6071216598687999801L;
    public final AtomicInteger active;
    public volatile boolean cancelled;
    public final C7091a disposables = new C7091a();
    public final Observer<? super R> downstream;
    public final AtomicReference<Throwable> error = new AtomicReference<>();
    public final C8339g<? super TLeft, ? extends C8065q<TLeftEnd>> leftEnd;
    public int leftIndex;
    public final Map<Integer, TLeft> lefts = new LinkedHashMap();
    public final C19213a<Object> queue = new C19213a<>(C8054g.f17572b);
    public final C8335c<? super TLeft, ? super TRight, ? extends R> resultSelector;
    public final C8339g<? super TRight, ? extends C8065q<TRightEnd>> rightEnd;
    public int rightIndex;
    public final Map<Integer, TRight> rights = new LinkedHashMap();

    public ObservableJoin$JoinDisposable(Observer<? super R> observer, C8339g<? super TLeft, ? extends C8065q<TLeftEnd>> gVar, C8339g<? super TRight, ? extends C8065q<TRightEnd>> gVar2, C8335c<? super TLeft, ? super TRight, ? extends R> cVar) {
        this.downstream = observer;
        this.leftEnd = gVar;
        this.rightEnd = gVar2;
        this.resultSelector = cVar;
        this.active = new AtomicInteger(2);
    }

    public void cancelAll() {
        this.disposables.dispose();
    }

    public void dispose() {
        if (!this.cancelled) {
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            C19213a<Object> aVar = this.queue;
            Observer<? super R> observer = this.downstream;
            int i = 1;
            while (!this.cancelled) {
                if (this.error.get() != null) {
                    aVar.clear();
                    cancelAll();
                    errorAll(observer);
                    return;
                }
                boolean z = this.active.get() == 0;
                Integer num = (Integer) aVar.poll();
                boolean z2 = num == null;
                if (z && z2) {
                    this.lefts.clear();
                    this.rights.clear();
                    this.disposables.dispose();
                    observer.onComplete();
                    return;
                } else if (z2) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    Object poll = aVar.poll();
                    if (num == LEFT_VALUE) {
                        int i2 = this.leftIndex;
                        this.leftIndex = i2 + 1;
                        this.lefts.put(Integer.valueOf(i2), poll);
                        try {
                            Object apply = this.leftEnd.apply(poll);
                            C12965a.m20650b(apply, "The leftEnd returned a null ObservableSource");
                            C8065q qVar = (C8065q) apply;
                            ObservableGroupJoin$LeftRightEndObserver observableGroupJoin$LeftRightEndObserver = new ObservableGroupJoin$LeftRightEndObserver(this, true, i2);
                            this.disposables.mo19403b(observableGroupJoin$LeftRightEndObserver);
                            qVar.subscribe(observableGroupJoin$LeftRightEndObserver);
                            if (this.error.get() != null) {
                                aVar.clear();
                                cancelAll();
                                errorAll(observer);
                                return;
                            }
                            for (TRight apply2 : this.rights.values()) {
                                try {
                                    Object apply3 = this.resultSelector.apply(poll, apply2);
                                    C12965a.m20650b(apply3, "The resultSelector returned a null value");
                                    observer.onNext(apply3);
                                } catch (Throwable th) {
                                    fail(th, observer, aVar);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            fail(th2, observer, aVar);
                            return;
                        }
                    } else if (num == RIGHT_VALUE) {
                        int i3 = this.rightIndex;
                        this.rightIndex = i3 + 1;
                        this.rights.put(Integer.valueOf(i3), poll);
                        try {
                            Object apply4 = this.rightEnd.apply(poll);
                            C12965a.m20650b(apply4, "The rightEnd returned a null ObservableSource");
                            C8065q qVar2 = (C8065q) apply4;
                            ObservableGroupJoin$LeftRightEndObserver observableGroupJoin$LeftRightEndObserver2 = new ObservableGroupJoin$LeftRightEndObserver(this, false, i3);
                            this.disposables.mo19403b(observableGroupJoin$LeftRightEndObserver2);
                            qVar2.subscribe(observableGroupJoin$LeftRightEndObserver2);
                            if (this.error.get() != null) {
                                aVar.clear();
                                cancelAll();
                                errorAll(observer);
                                return;
                            }
                            for (TLeft apply5 : this.lefts.values()) {
                                try {
                                    Object apply6 = this.resultSelector.apply(apply5, poll);
                                    C12965a.m20650b(apply6, "The resultSelector returned a null value");
                                    observer.onNext(apply6);
                                } catch (Throwable th3) {
                                    fail(th3, observer, aVar);
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            fail(th4, observer, aVar);
                            return;
                        }
                    } else if (num == LEFT_CLOSE) {
                        ObservableGroupJoin$LeftRightEndObserver observableGroupJoin$LeftRightEndObserver3 = (ObservableGroupJoin$LeftRightEndObserver) poll;
                        this.lefts.remove(Integer.valueOf(observableGroupJoin$LeftRightEndObserver3.index));
                        this.disposables.mo19402a(observableGroupJoin$LeftRightEndObserver3);
                    } else {
                        ObservableGroupJoin$LeftRightEndObserver observableGroupJoin$LeftRightEndObserver4 = (ObservableGroupJoin$LeftRightEndObserver) poll;
                        this.rights.remove(Integer.valueOf(observableGroupJoin$LeftRightEndObserver4.index));
                        this.disposables.mo19402a(observableGroupJoin$LeftRightEndObserver4);
                    }
                }
            }
            aVar.clear();
        }
    }

    public void errorAll(Observer<?> observer) {
        Throwable b = ExceptionHelper.m32483b(this.error);
        this.lefts.clear();
        this.rights.clear();
        observer.onError(b);
    }

    public void fail(Throwable th, Observer<?> observer, C19213a<?> aVar) {
        C19421p.m32940h0(th);
        ExceptionHelper.m32482a(this.error, th);
        aVar.clear();
        cancelAll();
        errorAll(observer);
    }

    public void innerClose(boolean z, ObservableGroupJoin$LeftRightEndObserver observableGroupJoin$LeftRightEndObserver) {
        synchronized (this) {
            this.queue.mo71258a(z ? LEFT_CLOSE : RIGHT_CLOSE, observableGroupJoin$LeftRightEndObserver);
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

    public void innerComplete(ObservableGroupJoin$LeftRightObserver observableGroupJoin$LeftRightObserver) {
        this.disposables.mo19404c(observableGroupJoin$LeftRightObserver);
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

    public boolean isDisposed() {
        return this.cancelled;
    }
}
