package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8053f;
import p287xp.C8335c;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableGenerate$GeneratorSubscription */
final class FlowableGenerate$GeneratorSubscription<T, S> extends AtomicLong implements C8053f<T>, Subscription {
    private static final long serialVersionUID = 7565982551505011832L;
    public volatile boolean cancelled;
    public final Consumer<? super S> disposeState;
    public final C20024c<? super T> downstream;
    public final C8335c<S, ? super C8053f<T>, S> generator;
    public boolean hasNext;
    public S state;
    public boolean terminate;

    public FlowableGenerate$GeneratorSubscription(C20024c<? super T> cVar, C8335c<S, ? super C8053f<T>, S> cVar2, Consumer<? super S> consumer, S s) {
        this.downstream = cVar;
        this.generator = cVar2;
        this.disposeState = consumer;
        this.state = s;
    }

    /* renamed from: a */
    public final void mo70698a(S s) {
        try {
            this.disposeState.accept(s);
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            C18981a.m32123b(th);
        }
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            if (C19382n.m32703D(this, 1) == 0) {
                S s = this.state;
                this.state = null;
                mo70698a(s);
            }
        }
    }

    public void onComplete() {
        if (!this.terminate) {
            this.terminate = true;
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.terminate) {
            C18981a.m32123b(th);
            return;
        }
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        this.terminate = true;
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        if (this.terminate) {
            return;
        }
        if (this.hasNext) {
            onError(new IllegalStateException("onNext already called in this generate turn"));
        } else if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            this.hasNext = true;
            this.downstream.onNext(t);
        }
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j) && C19382n.m32703D(this, j) == 0) {
            S s = this.state;
            C8335c<S, ? super C8053f<T>, S> cVar = this.generator;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            this.state = s;
                            j = addAndGet(-j2);
                        }
                    } else if (this.cancelled) {
                        this.state = null;
                        mo70698a(s);
                        return;
                    } else {
                        this.hasNext = false;
                        try {
                            s = cVar.apply(s, this);
                            if (this.terminate) {
                                this.cancelled = true;
                                this.state = null;
                                mo70698a(s);
                                return;
                            }
                            j2++;
                        } catch (Throwable th) {
                            C19421p.m32940h0(th);
                            this.cancelled = true;
                            this.state = null;
                            onError(th);
                            mo70698a(s);
                            return;
                        }
                    }
                }
            } while (j != 0);
        }
    }
}
