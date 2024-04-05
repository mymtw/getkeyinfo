package p145io.reactivex.internal.operators.single;

import java.util.Iterator;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.observers.BasicIntQueueDisposable;
import p248tp.C8073u;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.operators.single.SingleFlatMapIterableObservable$FlatMapIterableObserver */
final class SingleFlatMapIterableObservable$FlatMapIterableObserver<T, R> extends BasicIntQueueDisposable<R> implements C8073u<T> {
    private static final long serialVersionUID = -8938804753851907758L;
    public volatile boolean cancelled;
    public final Observer<? super R> downstream;

    /* renamed from: it */
    public volatile Iterator<? extends R> f42901it;
    public final C8339g<? super T, ? extends Iterable<? extends R>> mapper;
    public boolean outputFused;
    public Disposable upstream;

    public SingleFlatMapIterableObservable$FlatMapIterableObserver(Observer<? super R> observer, C8339g<? super T, ? extends Iterable<? extends R>> gVar) {
        this.downstream = observer;
        this.mapper = gVar;
    }

    public void clear() {
        this.f42901it = null;
    }

    public void dispose() {
        this.cancelled = true;
        this.upstream.dispose();
        this.upstream = DisposableHelper.DISPOSED;
    }

    public boolean isDisposed() {
        return this.cancelled;
    }

    public boolean isEmpty() {
        return this.f42901it == null;
    }

    public void onError(Throwable th) {
        this.upstream = DisposableHelper.DISPOSED;
        this.downstream.onError(th);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }

    public void onSuccess(T t) {
        Observer<? super R> observer = this.downstream;
        try {
            Iterator<? extends R> it = ((Iterable) this.mapper.apply(t)).iterator();
            if (!it.hasNext()) {
                observer.onComplete();
            } else if (this.outputFused) {
                this.f42901it = it;
                observer.onNext(null);
                observer.onComplete();
            } else {
                while (!this.cancelled) {
                    try {
                        observer.onNext(it.next());
                        if (!this.cancelled) {
                            try {
                                if (!it.hasNext()) {
                                    observer.onComplete();
                                    return;
                                }
                            } catch (Throwable th) {
                                C19421p.m32940h0(th);
                                observer.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        C19421p.m32940h0(th2);
                        observer.onError(th2);
                        return;
                    }
                }
            }
        } catch (Throwable th3) {
            C19421p.m32940h0(th3);
            this.downstream.onError(th3);
        }
    }

    public R poll() throws Exception {
        Iterator<? extends R> it = this.f42901it;
        if (it == null) {
            return null;
        }
        R next = it.next();
        C12965a.m20650b(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.f42901it = null;
        }
        return next;
    }

    public int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.outputFused = true;
        return 2;
    }
}
