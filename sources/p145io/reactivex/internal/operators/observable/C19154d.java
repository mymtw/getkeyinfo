package p145io.reactivex.internal.operators.observable;

import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.Functions;
import p248tp.C8065q;
import p287xp.C8333a;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.d */
public final class C19154d<T> extends C19145a<T, T> {

    /* renamed from: c */
    public final Consumer<? super T> f42808c;

    /* renamed from: d */
    public final Consumer<? super Throwable> f42809d;

    /* renamed from: e */
    public final C8333a f42810e;

    /* renamed from: f */
    public final C8333a f42811f;

    /* renamed from: io.reactivex.internal.operators.observable.d$a */
    public static final class C19155a<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f42812b;

        /* renamed from: c */
        public final Consumer<? super T> f42813c;

        /* renamed from: d */
        public final Consumer<? super Throwable> f42814d;

        /* renamed from: e */
        public final C8333a f42815e;

        /* renamed from: f */
        public final C8333a f42816f;

        /* renamed from: g */
        public Disposable f42817g;

        /* renamed from: h */
        public boolean f42818h;

        public C19155a(Observer<? super T> observer, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C8333a aVar, C8333a aVar2) {
            this.f42812b = observer;
            this.f42813c = consumer;
            this.f42814d = consumer2;
            this.f42815e = aVar;
            this.f42816f = aVar2;
        }

        public final void dispose() {
            this.f42817g.dispose();
        }

        public final boolean isDisposed() {
            return this.f42817g.isDisposed();
        }

        public final void onComplete() {
            if (!this.f42818h) {
                try {
                    this.f42815e.run();
                    this.f42818h = true;
                    this.f42812b.onComplete();
                    try {
                        this.f42816f.run();
                    } catch (Throwable th) {
                        C19421p.m32940h0(th);
                        C18981a.m32123b(th);
                    }
                } catch (Throwable th2) {
                    C19421p.m32940h0(th2);
                    onError(th2);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f42818h) {
                C18981a.m32123b(th);
                return;
            }
            this.f42818h = true;
            try {
                this.f42814d.accept(th);
            } catch (Throwable th2) {
                C19421p.m32940h0(th2);
                th = new CompositeException(th, th2);
            }
            this.f42812b.onError(th);
            try {
                this.f42816f.run();
            } catch (Throwable th3) {
                C19421p.m32940h0(th3);
                C18981a.m32123b(th3);
            }
        }

        public final void onNext(T t) {
            if (!this.f42818h) {
                try {
                    this.f42813c.accept(t);
                    this.f42812b.onNext(t);
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    this.f42817g.dispose();
                    onError(th);
                }
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f42817g, disposable)) {
                this.f42817g = disposable;
                this.f42812b.onSubscribe(this);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19154d(C8065q qVar, Consumer consumer, Consumer consumer2) {
        super(qVar);
        Functions.C12958c cVar = Functions.f28539c;
        this.f42808c = consumer;
        this.f42809d = consumer2;
        this.f42810e = cVar;
        this.f42811f = cVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        this.f42793b.subscribe(new C19155a(observer, this.f42808c, this.f42809d, this.f42810e, this.f42811f));
    }
}
