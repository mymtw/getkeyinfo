package p248tp;

import com.google.android.gms.common.api.Api;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.reflect.C19421p;
import p145io.reactivex.BackpressureStrategy;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.flowable.C19108e;
import p145io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import p145io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import p145io.reactivex.internal.operators.flowable.FlowableOnBackpressureError;
import p145io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import p145io.reactivex.internal.operators.observable.C19160f;
import p145io.reactivex.internal.operators.observable.C19179q;
import p145io.reactivex.internal.operators.observable.C19185v;
import p145io.reactivex.internal.operators.observable.ObservableCombineLatest;
import p145io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import p145io.reactivex.internal.operators.observable.ObservableFlatMap;
import p145io.reactivex.internal.operators.observable.ObservableObserveOn;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.internal.operators.observable.ObservableTimer;
import p287xp.C8333a;
import p287xp.C8335c;
import p287xp.C8339g;
import p503zp.C13971g;
import p736cq.C18981a;
import p738dq.C18990a;

/* renamed from: tp.n */
public abstract class C8061n<T> implements C8065q<T> {

    /* renamed from: tp.n$a */
    public static /* synthetic */ class C8062a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17575a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.reactivex.BackpressureStrategy[] r0 = p145io.reactivex.BackpressureStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17575a = r0
                io.reactivex.BackpressureStrategy r1 = p145io.reactivex.BackpressureStrategy.DROP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17575a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.reactivex.BackpressureStrategy r1 = p145io.reactivex.BackpressureStrategy.LATEST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17575a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.reactivex.BackpressureStrategy r1 = p145io.reactivex.BackpressureStrategy.MISSING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17575a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.reactivex.BackpressureStrategy r1 = p145io.reactivex.BackpressureStrategy.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p248tp.C8061n.C8062a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static ObservableCombineLatest m16233a(List list, C8339g gVar) {
        int i = C8054g.f17572b;
        if (list != null) {
            C12965a.m20651c(i, "bufferSize");
            return new ObservableCombineLatest((C8065q[]) null, list, gVar, i << 1);
        }
        throw new NullPointerException("sources is null");
    }

    /* renamed from: b */
    public static ObservableCombineLatest m16234b(C8061n nVar, C19179q qVar, C8335c cVar) {
        if (nVar != null) {
            Functions.C12956a aVar = new Functions.C12956a(cVar);
            int i = C8054g.f17572b;
            C8065q[] qVarArr = {nVar, qVar};
            C12965a.m20651c(i, "bufferSize");
            return new ObservableCombineLatest(qVarArr, (List) null, aVar, i << 1);
        }
        throw new NullPointerException("source1 is null");
    }

    /* renamed from: j */
    public static ObservableTimer m16235j(long j, TimeUnit timeUnit, C8066r rVar) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (rVar != null) {
            return new ObservableTimer(Math.max(j, 0), timeUnit, rVar);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    /* renamed from: c */
    public final ObservableDebounceTimed mo20633c(TimeUnit timeUnit) {
        C8066r rVar = C18990a.f42332a;
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (rVar != null) {
            return new ObservableDebounceTimed(this, rVar, timeUnit);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    /* renamed from: d */
    public final <R> C8061n<R> mo20634d(C8339g<? super T, ? extends C8065q<? extends R>> gVar) {
        C8061n<R> nVar;
        int i = C8054g.f17572b;
        C12965a.m20651c(Api.BaseClientBuilder.API_PRIORITY_OTHER, "maxConcurrency");
        C12965a.m20651c(i, "bufferSize");
        if (this instanceof C13971g) {
            Object call = ((C13971g) this).call();
            if (call == null) {
                return C19160f.f42828b;
            }
            nVar = new C19185v<>(gVar, call);
        } else {
            nVar = new ObservableFlatMap<>(this, gVar, i);
        }
        return nVar;
    }

    /* renamed from: e */
    public final ObservableObserveOn mo20635e(C8066r rVar) {
        int i = C8054g.f17572b;
        if (rVar != null) {
            C12965a.m20651c(i, "bufferSize");
            return new ObservableObserveOn(this, rVar, i);
        }
        throw new NullPointerException("scheduler is null");
    }

    /* renamed from: f */
    public final Disposable mo20636f(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C8333a aVar, Consumer<? super Disposable> consumer3) {
        if (consumer == null) {
            throw new NullPointerException("onNext is null");
        } else if (consumer2 == null) {
            throw new NullPointerException("onError is null");
        } else if (aVar != null) {
            LambdaObserver lambdaObserver = new LambdaObserver(consumer, consumer2, aVar, consumer3);
            subscribe(lambdaObserver);
            return lambdaObserver;
        } else {
            throw new NullPointerException("onComplete is null");
        }
    }

    /* renamed from: g */
    public final LambdaObserver mo20637g(Consumer consumer) {
        return (LambdaObserver) mo20636f(consumer, Functions.f28541e, Functions.f28539c, Functions.f28540d);
    }

    /* renamed from: h */
    public abstract void mo20638h(Observer<? super T> observer);

    /* renamed from: i */
    public final ObservableSubscribeOn mo20639i(C8066r rVar) {
        if (rVar != null) {
            return new ObservableSubscribeOn(this, rVar);
        }
        throw new NullPointerException("scheduler is null");
    }

    /* renamed from: k */
    public final C8054g<T> mo20640k(BackpressureStrategy backpressureStrategy) {
        C19108e eVar = new C19108e(this);
        int i = C8062a.f17575a[backpressureStrategy.ordinal()];
        if (i == 1) {
            return new FlowableOnBackpressureDrop(eVar);
        }
        if (i == 2) {
            return new FlowableOnBackpressureLatest(eVar);
        }
        if (i == 3) {
            return eVar;
        }
        if (i == 4) {
            return new FlowableOnBackpressureError(eVar);
        }
        int i2 = C8054g.f17572b;
        C12965a.m20651c(i2, "capacity");
        return new FlowableOnBackpressureBuffer(eVar, i2);
    }

    public final void subscribe(Observer<? super T> observer) {
        if (observer != null) {
            try {
                mo20638h(observer);
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                C18981a.m32123b(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } else {
            throw new NullPointerException("observer is null");
        }
    }
}
