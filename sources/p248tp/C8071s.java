package p248tp;

import java.util.concurrent.TimeUnit;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19207i;
import p145io.reactivex.internal.operators.single.SingleObserveOn;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p145io.reactivex.internal.operators.single.SingleTimer;
import p145io.reactivex.internal.operators.single.SingleToObservable;
import p145io.reactivex.internal.operators.single.SingleZipArray;
import p145io.reactivex.internal.util.ExceptionHelper;
import p287xp.C8335c;
import p313aq.C8538c;
import p503zp.C13967c;
import p738dq.C18990a;

/* renamed from: tp.s */
public abstract class C8071s<T> implements C8075w<T> {
    /* renamed from: e */
    public static C19207i m16251e(Object obj) {
        if (obj != null) {
            return new C19207i(obj);
        }
        throw new NullPointerException("item is null");
    }

    /* renamed from: j */
    public static SingleTimer m16252j(long j, TimeUnit timeUnit) {
        C8066r rVar = C18990a.f42332a;
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (rVar != null) {
            return new SingleTimer(j, timeUnit, rVar);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    /* renamed from: l */
    public static SingleZipArray m16253l(C8071s sVar, C8071s sVar2, C8335c cVar) {
        if (sVar2 != null) {
            return new SingleZipArray(new Functions.C12956a(cVar), new C8075w[]{sVar, sVar2});
        }
        throw new NullPointerException("source2 is null");
    }

    /* renamed from: a */
    public final void mo20655a(C8073u<? super T> uVar) {
        if (uVar != null) {
            try {
                mo20659h(uVar);
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } else {
            throw new NullPointerException("observer is null");
        }
    }

    /* renamed from: d */
    public final T mo20656d() {
        C8538c cVar = new C8538c();
        mo20655a(cVar);
        if (cVar.getCount() != 0) {
            try {
                cVar.await();
            } catch (InterruptedException e) {
                cVar.f18602e = true;
                Disposable disposable = cVar.f18601d;
                if (disposable != null) {
                    disposable.dispose();
                }
                throw ExceptionHelper.m32485d(e);
            }
        }
        Throwable th = cVar.f18600c;
        if (th == null) {
            return cVar.f18599b;
        }
        throw ExceptionHelper.m32485d(th);
    }

    /* renamed from: f */
    public final SingleObserveOn mo20657f(C8066r rVar) {
        if (rVar != null) {
            return new SingleObserveOn(this, rVar);
        }
        throw new NullPointerException("scheduler is null");
    }

    /* renamed from: g */
    public final ConsumerSingleObserver mo20658g(Consumer consumer, Consumer consumer2) {
        if (consumer == null) {
            throw new NullPointerException("onSuccess is null");
        } else if (consumer2 != null) {
            ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(consumer, consumer2);
            mo20655a(consumerSingleObserver);
            return consumerSingleObserver;
        } else {
            throw new NullPointerException("onError is null");
        }
    }

    /* renamed from: h */
    public abstract void mo20659h(C8073u<? super T> uVar);

    /* renamed from: i */
    public final SingleSubscribeOn mo20660i(C8066r rVar) {
        if (rVar != null) {
            return new SingleSubscribeOn(this, rVar);
        }
        throw new NullPointerException("scheduler is null");
    }

    /* renamed from: k */
    public final C8061n<T> mo20661k() {
        return this instanceof C13967c ? ((C13967c) this).mo46784b() : new SingleToObservable(this);
    }
}
