package p145io.reactivex.internal.operators.observable;

import java.util.ArrayList;
import p145io.reactivex.Observer;
import p145io.reactivex.internal.util.NotificationLite;

/* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$UnboundedReplayBuffer */
final class ObservableReplay$UnboundedReplayBuffer<T> extends ArrayList<Object> implements C19183t<T> {
    private static final long serialVersionUID = 7063189396499112664L;
    public volatile int size;

    public ObservableReplay$UnboundedReplayBuffer(int i) {
        super(i);
    }

    public void complete() {
        add(NotificationLite.complete());
        this.size++;
    }

    public void error(Throwable th) {
        add(NotificationLite.error(th));
        this.size++;
    }

    public void next(T t) {
        add(NotificationLite.next(t));
        this.size++;
    }

    public void replay(ObservableReplay$InnerDisposable<T> observableReplay$InnerDisposable) {
        if (observableReplay$InnerDisposable.getAndIncrement() == 0) {
            Observer<? super T> observer = observableReplay$InnerDisposable.child;
            int i = 1;
            while (!observableReplay$InnerDisposable.isDisposed()) {
                int i2 = this.size;
                Integer num = (Integer) observableReplay$InnerDisposable.index();
                int intValue = num != null ? num.intValue() : 0;
                while (intValue < i2) {
                    if (!NotificationLite.accept(get(intValue), observer) && !observableReplay$InnerDisposable.isDisposed()) {
                        intValue++;
                    } else {
                        return;
                    }
                }
                observableReplay$InnerDisposable.index = Integer.valueOf(intValue);
                i = observableReplay$InnerDisposable.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }
}
