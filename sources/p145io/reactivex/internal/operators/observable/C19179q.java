package p145io.reactivex.internal.operators.observable;

import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8065q;
import p287xp.C8339g;
import p313aq.C8536a;

/* renamed from: io.reactivex.internal.operators.observable.q */
public final class C19179q<T, U> extends C19145a<T, U> {

    /* renamed from: c */
    public final C8339g<? super T, ? extends U> f42860c;

    /* renamed from: io.reactivex.internal.operators.observable.q$a */
    public static final class C19180a<T, U> extends C8536a<T, U> {

        /* renamed from: g */
        public final C8339g<? super T, ? extends U> f42861g;

        public C19180a(Observer<? super U> observer, C8339g<? super T, ? extends U> gVar) {
            super(observer);
            this.f42861g = gVar;
        }

        public final void onNext(T t) {
            if (!this.f18597e) {
                if (this.f18598f != 0) {
                    this.f18594b.onNext(null);
                    return;
                }
                try {
                    Object apply = this.f42861g.apply(t);
                    C12965a.m20650b(apply, "The mapper function returned a null value.");
                    this.f18594b.onNext(apply);
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    this.f18595c.dispose();
                    onError(th);
                }
            }
        }

        public final U poll() throws Exception {
            T poll = this.f18596d.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.f42861g.apply(poll);
            C12965a.m20650b(apply, "The mapper function returned a null value.");
            return apply;
        }

        public final int requestFusion(int i) {
            return mo21062a(i);
        }
    }

    public C19179q(C8065q<T> qVar, C8339g<? super T, ? extends U> gVar) {
        super(qVar);
        this.f42860c = gVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super U> observer) {
        this.f42793b.subscribe(new C19180a(observer, this.f42860c));
    }
}
