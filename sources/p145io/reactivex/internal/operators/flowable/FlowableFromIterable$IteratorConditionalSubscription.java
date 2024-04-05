package p145io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import kotlin.reflect.C19421p;
import p503zp.C13965a;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableFromIterable$IteratorConditionalSubscription */
final class FlowableFromIterable$IteratorConditionalSubscription<T> extends FlowableFromIterable$BaseRangeSubscription<T> {
    private static final long serialVersionUID = -6022804456014692607L;
    public final C13965a<? super T> downstream;

    public FlowableFromIterable$IteratorConditionalSubscription(C13965a<? super T> aVar, Iterator<? extends T> it) {
        super(it);
        this.downstream = aVar;
    }

    public void fastPath() {
        Iterator<? extends T> it = this.f42641it;
        C13965a<? super T> aVar = this.downstream;
        while (!this.cancelled) {
            try {
                Object next = it.next();
                if (!this.cancelled) {
                    if (next == null) {
                        aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    aVar.tryOnNext(next);
                    if (!this.cancelled) {
                        try {
                            if (!it.hasNext()) {
                                if (!this.cancelled) {
                                    aVar.onComplete();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            C19421p.m32940h0(th);
                            aVar.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th2) {
                C19421p.m32940h0(th2);
                aVar.onError(th2);
                return;
            }
        }
    }

    public void slowPath(long j) {
        Iterator<? extends T> it = this.f42641it;
        C13965a<? super T> aVar = this.downstream;
        do {
            long j2 = 0;
            while (true) {
                if (j2 == j) {
                    j = get();
                    if (j2 == j) {
                        j = addAndGet(-j2);
                    }
                } else if (!this.cancelled) {
                    try {
                        Object next = it.next();
                        if (!this.cancelled) {
                            if (next == null) {
                                aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean tryOnNext = aVar.tryOnNext(next);
                            if (!this.cancelled) {
                                try {
                                    if (!it.hasNext()) {
                                        if (!this.cancelled) {
                                            aVar.onComplete();
                                            return;
                                        }
                                        return;
                                    } else if (tryOnNext) {
                                        j2++;
                                    }
                                } catch (Throwable th) {
                                    C19421p.m32940h0(th);
                                    aVar.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        C19421p.m32940h0(th2);
                        aVar.onError(th2);
                        return;
                    }
                } else {
                    return;
                }
            }
        } while (j != 0);
    }
}
