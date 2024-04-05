package p145io.reactivex.internal.operators.observable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.operators.observable.ObservableGroupBy$GroupByObserver */
public final class ObservableGroupBy$GroupByObserver<T, K, V> extends AtomicInteger implements Observer<T>, Disposable {
    public static final Object NULL_KEY = new Object();
    private static final long serialVersionUID = -3688291656102519502L;
    public final int bufferSize;
    public final AtomicBoolean cancelled = new AtomicBoolean();
    public final boolean delayError;
    public final Observer<? super C19170k> downstream;
    public final Map<Object, C19170k<K, V>> groups;
    public final C8339g<? super T, ? extends K> keySelector;
    public Disposable upstream;
    public final C8339g<? super T, ? extends V> valueSelector;

    public ObservableGroupBy$GroupByObserver(Observer<? super C19170k> observer, C8339g<? super T, ? extends K> gVar, C8339g<? super T, ? extends V> gVar2, int i, boolean z) {
        this.downstream = observer;
        this.keySelector = gVar;
        this.valueSelector = gVar2;
        this.bufferSize = i;
        this.delayError = z;
        this.groups = new ConcurrentHashMap();
        lazySet(1);
    }

    public void cancel(K k) {
        if (k == null) {
            k = NULL_KEY;
        }
        this.groups.remove(k);
        if (decrementAndGet() == 0) {
            this.upstream.dispose();
        }
    }

    public void dispose() {
        if (this.cancelled.compareAndSet(false, true) && decrementAndGet() == 0) {
            this.upstream.dispose();
        }
    }

    public boolean isDisposed() {
        return this.cancelled.get();
    }

    public void onComplete() {
        ArrayList arrayList = new ArrayList(this.groups.values());
        this.groups.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C19170k) it.next()).f42851c.onComplete();
        }
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        ArrayList arrayList = new ArrayList(this.groups.values());
        this.groups.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C19170k) it.next()).f42851c.onError(th);
        }
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        try {
            Object apply = this.keySelector.apply(t);
            Object obj = apply != null ? apply : NULL_KEY;
            C19170k kVar = this.groups.get(obj);
            if (kVar == null) {
                if (!this.cancelled.get()) {
                    kVar = new C19170k(apply, new ObservableGroupBy$State(this.bufferSize, this, apply, this.delayError));
                    this.groups.put(obj, kVar);
                    getAndIncrement();
                    this.downstream.onNext(kVar);
                } else {
                    return;
                }
            }
            try {
                Object apply2 = this.valueSelector.apply(t);
                C12965a.m20650b(apply2, "The value supplied is null");
                kVar.f42851c.onNext(apply2);
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                this.upstream.dispose();
                onError(th);
            }
        } catch (Throwable th2) {
            C19421p.m32940h0(th2);
            this.upstream.dispose();
            onError(th2);
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }
}
