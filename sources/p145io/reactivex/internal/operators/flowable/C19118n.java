package p145io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8054g;
import p248tp.C8056i;
import p248tp.C8071s;
import p248tp.C8073u;
import p503zp.C13966b;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.flowable.n */
public final class C19118n<T> extends C8071s<T> implements C13966b<T> {

    /* renamed from: b */
    public final C8054g<T> f42682b;

    /* renamed from: c */
    public final T f42683c = null;

    /* renamed from: io.reactivex.internal.operators.flowable.n$a */
    public static final class C19119a<T> implements C8056i<T>, Disposable {

        /* renamed from: b */
        public final C8073u<? super T> f42684b;

        /* renamed from: c */
        public final T f42685c;

        /* renamed from: d */
        public Subscription f42686d;

        /* renamed from: e */
        public boolean f42687e;

        /* renamed from: f */
        public T f42688f;

        public C19119a(C8073u<? super T> uVar, T t) {
            this.f42684b = uVar;
            this.f42685c = t;
        }

        public final void dispose() {
            this.f42686d.cancel();
            this.f42686d = SubscriptionHelper.CANCELLED;
        }

        public final boolean isDisposed() {
            return this.f42686d == SubscriptionHelper.CANCELLED;
        }

        public final void onComplete() {
            if (!this.f42687e) {
                this.f42687e = true;
                this.f42686d = SubscriptionHelper.CANCELLED;
                T t = this.f42688f;
                this.f42688f = null;
                if (t == null) {
                    t = this.f42685c;
                }
                if (t != null) {
                    this.f42684b.onSuccess(t);
                } else {
                    this.f42684b.onError(new NoSuchElementException());
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f42687e) {
                C18981a.m32123b(th);
                return;
            }
            this.f42687e = true;
            this.f42686d = SubscriptionHelper.CANCELLED;
            this.f42684b.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f42687e) {
                if (this.f42688f != null) {
                    this.f42687e = true;
                    this.f42686d.cancel();
                    this.f42686d = SubscriptionHelper.CANCELLED;
                    this.f42684b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f42688f = t;
            }
        }

        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f42686d, subscription)) {
                this.f42686d = subscription;
                this.f42684b.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public C19118n(FlowableRetryPredicate flowableRetryPredicate) {
        this.f42682b = flowableRetryPredicate;
    }

    /* renamed from: c */
    public final FlowableSingle mo46783c() {
        return new FlowableSingle(this.f42682b, this.f42683c);
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super T> uVar) {
        this.f42682b.mo20619c(new C19119a(uVar, this.f42683c));
    }
}
