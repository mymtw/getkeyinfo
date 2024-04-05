package p145io.reactivex.internal.operators.observable;

import kotlin.reflect.C19421p;
import p003a2.C0015b;
import p145io.reactivex.Observer;
import p145io.reactivex.subjects.PublishSubject;
import p287xp.C8340h;
import p313aq.C8536a;

/* renamed from: io.reactivex.internal.operators.observable.h */
public final class C19165h<T> extends C19145a<T, T> {

    /* renamed from: c */
    public final C8340h<? super T> f42840c;

    /* renamed from: io.reactivex.internal.operators.observable.h$a */
    public static final class C19166a<T> extends C8536a<T, T> {

        /* renamed from: g */
        public final C8340h<? super T> f42841g;

        public C19166a(Observer<? super T> observer, C8340h<? super T> hVar) {
            super(observer);
            this.f42841g = hVar;
        }

        public final void onNext(T t) {
            if (this.f18598f == 0) {
                try {
                    if (this.f42841g.test(t)) {
                        this.f18594b.onNext(t);
                    }
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    this.f18595c.dispose();
                    onError(th);
                }
            } else {
                this.f18594b.onNext(null);
            }
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public final T poll() throws java.lang.Exception {
            /*
                r2 = this;
            L_0x0000:
                zp.d<T> r0 = r2.f18596d
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto L_0x0010
                xp.h<? super T> r1 = r2.f42841g
                boolean r1 = r1.test(r0)
                if (r1 == 0) goto L_0x0000
            L_0x0010:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.observable.C19165h.C19166a.poll():java.lang.Object");
        }

        public final int requestFusion(int i) {
            return mo21062a(i);
        }
    }

    public C19165h(PublishSubject publishSubject, C0015b bVar) {
        super(publishSubject);
        this.f42840c = bVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        this.f42793b.subscribe(new C19166a(observer, this.f42840c));
    }
}
