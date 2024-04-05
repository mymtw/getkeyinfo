package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.operators.single.C19208j;
import p248tp.C8071s;
import p248tp.C8073u;
import p248tp.C8075w;
import p287xp.C8339g;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.single.SingleZipArray */
public final class SingleZipArray<T, R> extends C8071s<R> {

    /* renamed from: b */
    public final C8075w<? extends T>[] f42912b;

    /* renamed from: c */
    public final C8339g<? super Object[], ? extends R> f42913c;

    /* renamed from: io.reactivex.internal.operators.single.SingleZipArray$ZipCoordinator */
    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -5556924161382950569L;
        public final C8073u<? super R> downstream;
        public final ZipSingleObserver<T>[] observers;
        public final Object[] values;
        public final C8339g<? super Object[], ? extends R> zipper;

        public ZipCoordinator(C8073u<? super R> uVar, int i, C8339g<? super Object[], ? extends R> gVar) {
            super(i);
            this.downstream = uVar;
            this.zipper = gVar;
            ZipSingleObserver<T>[] zipSingleObserverArr = new ZipSingleObserver[i];
            for (int i2 = 0; i2 < i; i2++) {
                zipSingleObserverArr[i2] = new ZipSingleObserver<>(this, i2);
            }
            this.observers = zipSingleObserverArr;
            this.values = new Object[i];
        }

        public void dispose() {
            if (getAndSet(0) > 0) {
                for (ZipSingleObserver<T> dispose : this.observers) {
                    dispose.dispose();
                }
            }
        }

        public void disposeExcept(int i) {
            ZipSingleObserver<T>[] zipSingleObserverArr = this.observers;
            int length = zipSingleObserverArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                zipSingleObserverArr[i2].dispose();
            }
            while (true) {
                i++;
                if (i < length) {
                    zipSingleObserverArr[i].dispose();
                } else {
                    return;
                }
            }
        }

        public void innerError(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                disposeExcept(i);
                this.downstream.onError(th);
                return;
            }
            C18981a.m32123b(th);
        }

        public void innerSuccess(T t, int i) {
            this.values[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    Object apply = this.zipper.apply(this.values);
                    C12965a.m20650b(apply, "The zipper returned a null value");
                    this.downstream.onSuccess(apply);
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    this.downstream.onError(th);
                }
            }
        }

        public boolean isDisposed() {
            return get() <= 0;
        }
    }

    /* renamed from: io.reactivex.internal.operators.single.SingleZipArray$ZipSingleObserver */
    public static final class ZipSingleObserver<T> extends AtomicReference<Disposable> implements C8073u<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        public final int index;
        public final ZipCoordinator<T, ?> parent;

        public ZipSingleObserver(ZipCoordinator<T, ?> zipCoordinator, int i) {
            this.parent = zipCoordinator;
            this.index = i;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public void onError(Throwable th) {
            this.parent.innerError(th, this.index);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onSuccess(T t) {
            this.parent.innerSuccess(t, this.index);
        }
    }

    /* renamed from: io.reactivex.internal.operators.single.SingleZipArray$a */
    public final class C19194a implements C8339g<T, R> {
        public C19194a() {
        }

        public final R apply(T t) throws Exception {
            R apply = SingleZipArray.this.f42913c.apply(new Object[]{t});
            C12965a.m20650b(apply, "The zipper returned a null value");
            return apply;
        }
    }

    public SingleZipArray(Functions.C12956a aVar, C8075w[] wVarArr) {
        this.f42912b = wVarArr;
        this.f42913c = aVar;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super R> uVar) {
        C8075w<? extends T>[] wVarArr = this.f42912b;
        int length = wVarArr.length;
        int i = 0;
        if (length == 1) {
            wVarArr[0].mo20655a(new C19208j.C19209a(uVar, new C19194a()));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(uVar, length, this.f42913c);
        uVar.onSubscribe(zipCoordinator);
        while (i < length && !zipCoordinator.isDisposed()) {
            C8075w<? extends T> wVar = wVarArr[i];
            if (wVar == null) {
                zipCoordinator.innerError(new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                wVar.mo20655a(zipCoordinator.observers[i]);
                i++;
            }
        }
    }
}
