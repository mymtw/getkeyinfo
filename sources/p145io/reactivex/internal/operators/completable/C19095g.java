package p145io.reactivex.internal.operators.completable;

import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p145io.reactivex.internal.functions.Functions;
import p248tp.C8048a;
import p248tp.C8050c;
import p248tp.C8052e;
import p287xp.C8333a;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.completable.g */
public final class C19095g extends C8048a {

    /* renamed from: b */
    public final C8052e f42615b;

    /* renamed from: c */
    public final Consumer<? super Disposable> f42616c;

    /* renamed from: d */
    public final Consumer<? super Throwable> f42617d;

    /* renamed from: e */
    public final C8333a f42618e;

    /* renamed from: f */
    public final C8333a f42619f;

    /* renamed from: g */
    public final C8333a f42620g;

    /* renamed from: h */
    public final C8333a f42621h;

    /* renamed from: io.reactivex.internal.operators.completable.g$a */
    public final class C19096a implements C8050c, Disposable {

        /* renamed from: b */
        public final C8050c f42622b;

        /* renamed from: c */
        public Disposable f42623c;

        public C19096a(C8050c cVar) {
            this.f42622b = cVar;
        }

        public final void dispose() {
            try {
                C19095g.this.f42621h.run();
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                C18981a.m32123b(th);
            }
            this.f42623c.dispose();
        }

        public final boolean isDisposed() {
            return this.f42623c.isDisposed();
        }

        public final void onComplete() {
            if (this.f42623c != DisposableHelper.DISPOSED) {
                try {
                    C19095g.this.f42618e.run();
                    C19095g.this.f42619f.run();
                    this.f42622b.onComplete();
                    try {
                        C19095g.this.f42620g.run();
                    } catch (Throwable th) {
                        C19421p.m32940h0(th);
                        C18981a.m32123b(th);
                    }
                } catch (Throwable th2) {
                    C19421p.m32940h0(th2);
                    this.f42622b.onError(th2);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f42623c == DisposableHelper.DISPOSED) {
                C18981a.m32123b(th);
                return;
            }
            try {
                C19095g.this.f42617d.accept(th);
                C19095g.this.f42619f.run();
            } catch (Throwable th2) {
                C19421p.m32940h0(th2);
                th = new CompositeException(th, th2);
            }
            this.f42622b.onError(th);
            try {
                C19095g.this.f42620g.run();
            } catch (Throwable th3) {
                C19421p.m32940h0(th3);
                C18981a.m32123b(th3);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            try {
                C19095g.this.f42616c.accept(disposable);
                if (DisposableHelper.validate(this.f42623c, disposable)) {
                    this.f42623c = disposable;
                    this.f42622b.onSubscribe(this);
                }
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                disposable.dispose();
                this.f42623c = DisposableHelper.DISPOSED;
                EmptyDisposable.error(th, this.f42622b);
            }
        }
    }

    public C19095g(C8052e eVar, Consumer consumer, C8333a aVar) {
        Functions.C12959d dVar = Functions.f28540d;
        Functions.C12958c cVar = Functions.f28539c;
        this.f42615b = eVar;
        this.f42616c = dVar;
        this.f42617d = consumer;
        this.f42618e = aVar;
        this.f42619f = cVar;
        this.f42620g = cVar;
        this.f42621h = cVar;
    }

    /* renamed from: d */
    public final void mo20609d(C8050c cVar) {
        this.f42615b.mo20607a(new C19096a(cVar));
    }
}
