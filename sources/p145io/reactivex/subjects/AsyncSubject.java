package p145io.reactivex.subjects;

import p145io.reactivex.Observer;
import p145io.reactivex.internal.observers.DeferredScalarDisposable;
import p736cq.C18981a;

/* renamed from: io.reactivex.subjects.AsyncSubject */
public final class AsyncSubject<T> extends C19257c<T> {

    /* renamed from: io.reactivex.subjects.AsyncSubject$AsyncDisposable */
    public static final class AsyncDisposable<T> extends DeferredScalarDisposable<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        public final AsyncSubject<T> parent;

        public AsyncDisposable(Observer<? super T> observer, AsyncSubject<T> asyncSubject) {
            super(observer);
        }

        public void dispose() {
            if (super.tryDispose()) {
                throw null;
            }
        }

        public void onComplete() {
            if (!isDisposed()) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (isDisposed()) {
                C18981a.m32123b(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }
}
