package p313aq;

import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p287xp.C8333a;
import p736cq.C18981a;

/* renamed from: aq.d */
public final class C8539d<T> implements Observer<T>, Disposable {

    /* renamed from: b */
    public final Observer<? super T> f18603b;

    /* renamed from: c */
    public final Consumer<? super Disposable> f18604c;

    /* renamed from: d */
    public final C8333a f18605d;

    /* renamed from: e */
    public Disposable f18606e;

    public C8539d(Observer<? super T> observer, Consumer<? super Disposable> consumer, C8333a aVar) {
        this.f18603b = observer;
        this.f18604c = consumer;
        this.f18605d = aVar;
    }

    public final void dispose() {
        Disposable disposable = this.f18606e;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper) {
            this.f18606e = disposableHelper;
            try {
                this.f18605d.run();
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                C18981a.m32123b(th);
            }
            disposable.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.f18606e.isDisposed();
    }

    public final void onComplete() {
        Disposable disposable = this.f18606e;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper) {
            this.f18606e = disposableHelper;
            this.f18603b.onComplete();
        }
    }

    public final void onError(Throwable th) {
        Disposable disposable = this.f18606e;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper) {
            this.f18606e = disposableHelper;
            this.f18603b.onError(th);
            return;
        }
        C18981a.m32123b(th);
    }

    public final void onNext(T t) {
        this.f18603b.onNext(t);
    }

    public final void onSubscribe(Disposable disposable) {
        try {
            this.f18604c.accept(disposable);
            if (DisposableHelper.validate(this.f18606e, disposable)) {
                this.f18606e = disposable;
                this.f18603b.onSubscribe(this);
            }
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            disposable.dispose();
            this.f18606e = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th, (Observer<?>) this.f18603b);
        }
    }
}
