package p145io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p003a2.C0015b;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.EmptySubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8054g;
import p248tp.C8056i;
import p287xp.C8335c;
import p736cq.C18981a;
import p762or.C20024c;
import p764pq.C20057i;

/* renamed from: io.reactivex.internal.operators.flowable.u */
public final class C19126u<T, U, V> extends C19104a<T, V> {

    /* renamed from: d */
    public final Iterable<U> f42697d;

    /* renamed from: e */
    public final C8335c<? super T, ? super U, ? extends V> f42698e;

    /* renamed from: io.reactivex.internal.operators.flowable.u$a */
    public static final class C19127a<T, U, V> implements C8056i<T>, Subscription {

        /* renamed from: b */
        public final C20024c<? super V> f42699b;

        /* renamed from: c */
        public final Iterator<U> f42700c;

        /* renamed from: d */
        public final C8335c<? super T, ? super U, ? extends V> f42701d;

        /* renamed from: e */
        public Subscription f42702e;

        /* renamed from: f */
        public boolean f42703f;

        public C19127a(C20024c<? super V> cVar, Iterator<U> it, C8335c<? super T, ? super U, ? extends V> cVar2) {
            this.f42699b = cVar;
            this.f42700c = it;
            this.f42701d = cVar2;
        }

        /* renamed from: a */
        public final void mo70878a(Throwable th) {
            C19421p.m32940h0(th);
            this.f42703f = true;
            this.f42702e.cancel();
            this.f42699b.onError(th);
        }

        public final void cancel() {
            this.f42702e.cancel();
        }

        public final void onComplete() {
            if (!this.f42703f) {
                this.f42703f = true;
                this.f42699b.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (this.f42703f) {
                C18981a.m32123b(th);
                return;
            }
            this.f42703f = true;
            this.f42699b.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f42703f) {
                try {
                    U next = this.f42700c.next();
                    C12965a.m20650b(next, "The iterator returned a null value");
                    try {
                        Object apply = this.f42701d.apply(t, next);
                        C12965a.m20650b(apply, "The zipper function returned a null value");
                        this.f42699b.onNext(apply);
                        try {
                            if (!this.f42700c.hasNext()) {
                                this.f42703f = true;
                                this.f42702e.cancel();
                                this.f42699b.onComplete();
                            }
                        } catch (Throwable th) {
                            mo70878a(th);
                        }
                    } catch (Throwable th2) {
                        mo70878a(th2);
                    }
                } catch (Throwable th3) {
                    mo70878a(th3);
                }
            }
        }

        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f42702e, subscription)) {
                this.f42702e = subscription;
                this.f42699b.onSubscribe(this);
            }
        }

        public final void request(long j) {
            this.f42702e.request(j);
        }
    }

    public C19126u(C8054g gVar, C20057i iVar, C0015b bVar) {
        super(gVar);
        this.f42697d = iVar;
        this.f42698e = bVar;
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super V> cVar) {
        try {
            Iterator<U> it = this.f42697d.iterator();
            C12965a.m20650b(it, "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    EmptySubscription.complete(cVar);
                } else {
                    this.f42671c.mo20619c(new C19127a(cVar, it, this.f42698e));
                }
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                EmptySubscription.error(th, cVar);
            }
        } catch (Throwable th2) {
            C19421p.m32940h0(th2);
            EmptySubscription.error(th2, cVar);
        }
    }
}
