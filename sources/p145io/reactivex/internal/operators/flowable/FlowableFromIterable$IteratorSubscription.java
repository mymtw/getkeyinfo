package p145io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import kotlin.reflect.C19421p;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableFromIterable$IteratorSubscription */
final class FlowableFromIterable$IteratorSubscription<T> extends FlowableFromIterable$BaseRangeSubscription<T> {
    private static final long serialVersionUID = -6022804456014692607L;
    public final C20024c<? super T> downstream;

    public FlowableFromIterable$IteratorSubscription(C20024c<? super T> cVar, Iterator<? extends T> it) {
        super(it);
        this.downstream = cVar;
    }

    public void fastPath() {
        Iterator<? extends T> it = this.f42641it;
        C20024c<? super T> cVar = this.downstream;
        while (!this.cancelled) {
            try {
                Object next = it.next();
                if (!this.cancelled) {
                    if (next == null) {
                        cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    cVar.onNext(next);
                    if (!this.cancelled) {
                        try {
                            if (!it.hasNext()) {
                                if (!this.cancelled) {
                                    cVar.onComplete();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            C19421p.m32940h0(th);
                            cVar.onError(th);
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
                cVar.onError(th2);
                return;
            }
        }
    }

    public void slowPath(long j) {
        Iterator<? extends T> it = this.f42641it;
        C20024c<? super T> cVar = this.downstream;
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
                                cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            cVar.onNext(next);
                            if (!this.cancelled) {
                                try {
                                    if (it.hasNext()) {
                                        j2++;
                                    } else if (!this.cancelled) {
                                        cVar.onComplete();
                                        return;
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th) {
                                    C19421p.m32940h0(th);
                                    cVar.onError(th);
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
                        cVar.onError(th2);
                        return;
                    }
                } else {
                    return;
                }
            }
        } while (j != 0);
    }
}
