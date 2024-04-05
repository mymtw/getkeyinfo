package p145io.reactivex.internal.operators.completable;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8050c;
import p248tp.C8052e;

/* renamed from: io.reactivex.internal.operators.completable.CompletableConcatIterable$ConcatInnerObserver */
final class CompletableConcatIterable$ConcatInnerObserver extends AtomicInteger implements C8050c {
    private static final long serialVersionUID = -7965400327305809232L;
    public final C8050c downstream;

    /* renamed from: sd */
    public final SequentialDisposable f42601sd = new SequentialDisposable();
    public final Iterator<? extends C8052e> sources;

    public CompletableConcatIterable$ConcatInnerObserver(C8050c cVar, Iterator<? extends C8052e> it) {
        this.downstream = cVar;
        this.sources = it;
    }

    public void next() {
        if (!this.f42601sd.isDisposed() && getAndIncrement() == 0) {
            Iterator<? extends C8052e> it = this.sources;
            while (!this.f42601sd.isDisposed()) {
                try {
                    if (!it.hasNext()) {
                        this.downstream.onComplete();
                        return;
                    }
                    try {
                        Object next = it.next();
                        C12965a.m20650b(next, "The CompletableSource returned is null");
                        ((C8052e) next).mo20607a(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } catch (Throwable th) {
                        C19421p.m32940h0(th);
                        this.downstream.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    C19421p.m32940h0(th2);
                    this.downstream.onError(th2);
                    return;
                }
            }
        }
    }

    public void onComplete() {
        next();
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onSubscribe(Disposable disposable) {
        this.f42601sd.replace(disposable);
    }
}
