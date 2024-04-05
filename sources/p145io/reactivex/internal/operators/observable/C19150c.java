package p145io.reactivex.internal.operators.observable;

import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.functions.Functions;
import p248tp.C8065q;
import p287xp.C8336d;
import p287xp.C8339g;
import p313aq.C8536a;

/* renamed from: io.reactivex.internal.operators.observable.c */
public final class C19150c<T, K> extends C19145a<T, T> {

    /* renamed from: c */
    public final C8339g<? super T, K> f42798c;

    /* renamed from: d */
    public final C8336d<? super K, ? super K> f42799d;

    /* renamed from: io.reactivex.internal.operators.observable.c$a */
    public static final class C19151a<T, K> extends C8536a<T, T> {

        /* renamed from: g */
        public final C8339g<? super T, K> f42800g;

        /* renamed from: h */
        public final C8336d<? super K, ? super K> f42801h;

        /* renamed from: i */
        public K f42802i;

        /* renamed from: j */
        public boolean f42803j;

        public C19151a(Observer<? super T> observer, C8339g<? super T, K> gVar, C8336d<? super K, ? super K> dVar) {
            super(observer);
            this.f42800g = gVar;
            this.f42801h = dVar;
        }

        public final void onNext(T t) {
            if (!this.f18597e) {
                if (this.f18598f != 0) {
                    this.f18594b.onNext(t);
                    return;
                }
                try {
                    K apply = this.f42800g.apply(t);
                    if (this.f42803j) {
                        C8336d<? super K, ? super K> dVar = this.f42801h;
                        K k = this.f42802i;
                        ((C12965a.C12966a) dVar).getClass();
                        boolean a = C12965a.m20649a(k, apply);
                        this.f42802i = apply;
                        if (a) {
                            return;
                        }
                    } else {
                        this.f42803j = true;
                        this.f42802i = apply;
                    }
                    this.f18594b.onNext(t);
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    this.f18595c.dispose();
                    onError(th);
                }
            }
        }

        public final T poll() throws Exception {
            while (true) {
                T poll = this.f18596d.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f42800g.apply(poll);
                if (!this.f42803j) {
                    this.f42803j = true;
                    this.f42802i = apply;
                    return poll;
                }
                C8336d<? super K, ? super K> dVar = this.f42801h;
                K k = this.f42802i;
                ((C12965a.C12966a) dVar).getClass();
                if (!C12965a.m20649a(k, apply)) {
                    this.f42802i = apply;
                    return poll;
                }
                this.f42802i = apply;
            }
        }

        public final int requestFusion(int i) {
            return mo21062a(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19150c(C8065q qVar) {
        super(qVar);
        Functions.C12961f fVar = Functions.f28537a;
        C12965a.C12966a aVar = C12965a.f28546a;
        this.f42798c = fVar;
        this.f42799d = aVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        this.f42793b.subscribe(new C19151a(observer, this.f42798c, this.f42799d));
    }
}
