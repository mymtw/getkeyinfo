package p145io.reactivex.internal.operators.observable;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.internal.util.NotificationLite;

/* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$BoundedReplayBuffer */
abstract class ObservableReplay$BoundedReplayBuffer<T> extends AtomicReference<ObservableReplay$Node> implements C19183t<T> {
    private static final long serialVersionUID = 2346567790059478686L;
    public int size;
    public ObservableReplay$Node tail;

    public ObservableReplay$BoundedReplayBuffer() {
        ObservableReplay$Node observableReplay$Node = new ObservableReplay$Node((Object) null);
        this.tail = observableReplay$Node;
        set(observableReplay$Node);
    }

    public final void addLast(ObservableReplay$Node observableReplay$Node) {
        this.tail.set(observableReplay$Node);
        this.tail = observableReplay$Node;
        this.size++;
    }

    public final void collect(Collection<? super T> collection) {
        ObservableReplay$Node head = getHead();
        while (true) {
            head = (ObservableReplay$Node) head.get();
            if (head != null) {
                Object leaveTransform = leaveTransform(head.value);
                if (!NotificationLite.isComplete(leaveTransform) && !NotificationLite.isError(leaveTransform)) {
                    collection.add(NotificationLite.getValue(leaveTransform));
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void complete() {
        addLast(new ObservableReplay$Node(enterTransform(NotificationLite.complete())));
        truncateFinal();
    }

    public Object enterTransform(Object obj) {
        return obj;
    }

    public final void error(Throwable th) {
        addLast(new ObservableReplay$Node(enterTransform(NotificationLite.error(th))));
        truncateFinal();
    }

    public ObservableReplay$Node getHead() {
        return (ObservableReplay$Node) get();
    }

    public boolean hasCompleted() {
        Object obj = this.tail.value;
        return obj != null && NotificationLite.isComplete(leaveTransform(obj));
    }

    public boolean hasError() {
        Object obj = this.tail.value;
        return obj != null && NotificationLite.isError(leaveTransform(obj));
    }

    public Object leaveTransform(Object obj) {
        return obj;
    }

    public final void next(T t) {
        addLast(new ObservableReplay$Node(enterTransform(NotificationLite.next(t))));
        truncate();
    }

    public final void removeFirst() {
        this.size--;
        setFirst((ObservableReplay$Node) ((ObservableReplay$Node) get()).get());
    }

    public final void removeSome(int i) {
        ObservableReplay$Node observableReplay$Node = (ObservableReplay$Node) get();
        while (i > 0) {
            observableReplay$Node = (ObservableReplay$Node) observableReplay$Node.get();
            i--;
            this.size--;
        }
        setFirst(observableReplay$Node);
        ObservableReplay$Node observableReplay$Node2 = (ObservableReplay$Node) get();
        if (observableReplay$Node2.get() == null) {
            this.tail = observableReplay$Node2;
        }
    }

    public final void replay(ObservableReplay$InnerDisposable<T> observableReplay$InnerDisposable) {
        if (observableReplay$InnerDisposable.getAndIncrement() == 0) {
            int i = 1;
            do {
                ObservableReplay$Node observableReplay$Node = (ObservableReplay$Node) observableReplay$InnerDisposable.index();
                if (observableReplay$Node == null) {
                    observableReplay$Node = getHead();
                    observableReplay$InnerDisposable.index = observableReplay$Node;
                }
                while (!observableReplay$InnerDisposable.isDisposed()) {
                    ObservableReplay$Node observableReplay$Node2 = (ObservableReplay$Node) observableReplay$Node.get();
                    if (observableReplay$Node2 == null) {
                        observableReplay$InnerDisposable.index = observableReplay$Node;
                        i = observableReplay$InnerDisposable.addAndGet(-i);
                    } else if (NotificationLite.accept(leaveTransform(observableReplay$Node2.value), observableReplay$InnerDisposable.child)) {
                        observableReplay$InnerDisposable.index = null;
                        return;
                    } else {
                        observableReplay$Node = observableReplay$Node2;
                    }
                }
                observableReplay$InnerDisposable.index = null;
                return;
            } while (i != 0);
        }
    }

    public final void setFirst(ObservableReplay$Node observableReplay$Node) {
        set(observableReplay$Node);
    }

    public final void trimHead() {
        ObservableReplay$Node observableReplay$Node = (ObservableReplay$Node) get();
        if (observableReplay$Node.value != null) {
            ObservableReplay$Node observableReplay$Node2 = new ObservableReplay$Node((Object) null);
            observableReplay$Node2.lazySet(observableReplay$Node.get());
            set(observableReplay$Node2);
        }
    }

    public abstract void truncate();

    public void truncateFinal() {
        trimHead();
    }
}
