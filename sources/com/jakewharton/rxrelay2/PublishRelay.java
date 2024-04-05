package com.jakewharton.rxrelay2;

import java.util.concurrent.atomic.AtomicBoolean;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;

public final class PublishRelay<T> extends C17040c<T> {

    public static final class PublishDisposable<T> extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 3562861878281475070L;
        public final Observer<? super T> downstream;
        public final PublishRelay<T> parent;

        public PublishDisposable(Observer<? super T> observer, PublishRelay<T> publishRelay) {
            this.downstream = observer;
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        public boolean isDisposed() {
            return get();
        }

        public void onNext(T t) {
            if (!get()) {
                this.downstream.onNext(t);
            }
        }
    }
}
