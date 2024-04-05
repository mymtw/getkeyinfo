package p145io.reactivex.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.util.NotificationLite;
import p248tp.C8066r;

/* renamed from: io.reactivex.subjects.ReplaySubject */
public final class ReplaySubject<T> extends C19257c<T> {

    /* renamed from: io.reactivex.subjects.ReplaySubject$Node */
    public static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final T value;

        public Node(T t) {
            this.value = t;
        }
    }

    /* renamed from: io.reactivex.subjects.ReplaySubject$ReplayDisposable */
    public static final class ReplayDisposable<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 466549804534799122L;
        public volatile boolean cancelled;
        public final Observer<? super T> downstream;
        public Object index;
        public final ReplaySubject<T> state;

        public ReplayDisposable(Observer<? super T> observer, ReplaySubject<T> replaySubject) {
            this.downstream = observer;
        }

        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                throw null;
            }
        }

        public boolean isDisposed() {
            return this.cancelled;
        }
    }

    /* renamed from: io.reactivex.subjects.ReplaySubject$SizeAndTimeBoundReplayBuffer */
    public static final class SizeAndTimeBoundReplayBuffer<T> extends AtomicReference<Object> {
        private static final long serialVersionUID = -8056260896137901749L;
        public volatile boolean done;
        public volatile TimedNode<Object> head;
        public final long maxAge;
        public final int maxSize;
        public final C8066r scheduler;
        public int size;
        public TimedNode<Object> tail;
        public final TimeUnit unit;

        public SizeAndTimeBoundReplayBuffer(int i, long j, TimeUnit timeUnit, C8066r rVar) {
            C12965a.m20651c(i, "maxSize");
            this.maxSize = i;
            if (j > 0) {
                this.maxAge = j;
                if (timeUnit != null) {
                    this.unit = timeUnit;
                    if (rVar != null) {
                        this.scheduler = rVar;
                        TimedNode<Object> timedNode = new TimedNode<>(null, 0);
                        this.tail = timedNode;
                        this.head = timedNode;
                        return;
                    }
                    throw new NullPointerException("scheduler is null");
                }
                throw new NullPointerException("unit is null");
            }
            throw new IllegalArgumentException("maxAge" + " > 0 required but it was " + j);
        }

        public void add(T t) {
            C8066r rVar = this.scheduler;
            TimeUnit timeUnit = this.unit;
            rVar.getClass();
            TimedNode<Object> timedNode = new TimedNode<>(t, C8066r.m16244a(timeUnit));
            TimedNode<Object> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.set(timedNode);
            trim();
        }

        public void addFinal(Object obj) {
            TimedNode<Object> timedNode = new TimedNode<>(obj, Long.MAX_VALUE);
            TimedNode<Object> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.lazySet(timedNode);
            trimFinal();
            this.done = true;
        }

        public TimedNode<Object> getHead() {
            TimedNode<Object> timedNode;
            TimedNode<Object> timedNode2 = this.head;
            C8066r rVar = this.scheduler;
            TimeUnit timeUnit = this.unit;
            rVar.getClass();
            long a = C8066r.m16244a(timeUnit) - this.maxAge;
            Object obj = timedNode2.get();
            while (true) {
                TimedNode<Object> timedNode3 = (TimedNode) obj;
                timedNode = timedNode2;
                timedNode2 = timedNode3;
                if (timedNode2 == null || timedNode2.time > a) {
                    return timedNode;
                }
                obj = timedNode2.get();
            }
            return timedNode;
        }

        public T getValue() {
            T t;
            TimedNode<Object> timedNode = this.head;
            TimedNode<Object> timedNode2 = null;
            while (true) {
                TimedNode<Object> timedNode3 = (TimedNode) timedNode.get();
                if (timedNode3 == null) {
                    break;
                }
                timedNode2 = timedNode;
                timedNode = timedNode3;
            }
            C8066r rVar = this.scheduler;
            TimeUnit timeUnit = this.unit;
            rVar.getClass();
            if (timedNode.time >= C8066r.m16244a(timeUnit) - this.maxAge && (t = timedNode.value) != null) {
                return (NotificationLite.isComplete(t) || NotificationLite.isError(t)) ? timedNode2.value : t;
            }
            return null;
        }

        public T[] getValues(T[] tArr) {
            TimedNode<Object> head2 = getHead();
            int size2 = size(head2);
            if (size2 != 0) {
                if (tArr.length < size2) {
                    tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size2);
                }
                for (int i = 0; i != size2; i++) {
                    head2 = (TimedNode) head2.get();
                    tArr[i] = head2.value;
                }
                if (tArr.length > size2) {
                    tArr[size2] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        public void replay(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() == 0) {
                Observer<? super T> observer = replayDisposable.downstream;
                TimedNode<Object> timedNode = (TimedNode) replayDisposable.index;
                if (timedNode == null) {
                    timedNode = getHead();
                }
                int i = 1;
                while (!replayDisposable.cancelled) {
                    while (!replayDisposable.cancelled) {
                        TimedNode<Object> timedNode2 = (TimedNode) timedNode.get();
                        if (timedNode2 != null) {
                            T t = timedNode2.value;
                            if (!this.done || timedNode2.get() != null) {
                                observer.onNext(t);
                                timedNode = timedNode2;
                            } else {
                                if (NotificationLite.isComplete(t)) {
                                    observer.onComplete();
                                } else {
                                    observer.onError(NotificationLite.getError(t));
                                }
                                replayDisposable.index = null;
                                replayDisposable.cancelled = true;
                                return;
                            }
                        } else if (timedNode.get() == null) {
                            replayDisposable.index = timedNode;
                            i = replayDisposable.addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    }
                    replayDisposable.index = null;
                    return;
                }
                replayDisposable.index = null;
            }
        }

        public int size() {
            return size(getHead());
        }

        public void trim() {
            int i = this.size;
            if (i > this.maxSize) {
                this.size = i - 1;
                this.head = (TimedNode) this.head.get();
            }
            C8066r rVar = this.scheduler;
            TimeUnit timeUnit = this.unit;
            rVar.getClass();
            long a = C8066r.m16244a(timeUnit) - this.maxAge;
            TimedNode<Object> timedNode = this.head;
            while (this.size > 1) {
                TimedNode<Object> timedNode2 = (TimedNode) timedNode.get();
                if (timedNode2 == null) {
                    this.head = timedNode;
                    return;
                } else if (timedNode2.time > a) {
                    this.head = timedNode;
                    return;
                } else {
                    this.size--;
                    timedNode = timedNode2;
                }
            }
            this.head = timedNode;
        }

        public void trimFinal() {
            C8066r rVar = this.scheduler;
            TimeUnit timeUnit = this.unit;
            rVar.getClass();
            long a = C8066r.m16244a(timeUnit) - this.maxAge;
            TimedNode<Object> timedNode = this.head;
            while (true) {
                TimedNode<Object> timedNode2 = (TimedNode) timedNode.get();
                if (timedNode2.get() == null) {
                    if (timedNode.value != null) {
                        TimedNode<Object> timedNode3 = new TimedNode<>(null, 0);
                        timedNode3.lazySet(timedNode.get());
                        this.head = timedNode3;
                        return;
                    }
                    this.head = timedNode;
                    return;
                } else if (timedNode2.time <= a) {
                    timedNode = timedNode2;
                } else if (timedNode.value != null) {
                    TimedNode<Object> timedNode4 = new TimedNode<>(null, 0);
                    timedNode4.lazySet(timedNode.get());
                    this.head = timedNode4;
                    return;
                } else {
                    this.head = timedNode;
                    return;
                }
            }
        }

        public void trimHead() {
            TimedNode<Object> timedNode = this.head;
            if (timedNode.value != null) {
                TimedNode<Object> timedNode2 = new TimedNode<>(null, 0);
                timedNode2.lazySet(timedNode.get());
                this.head = timedNode2;
            }
        }

        public int size(TimedNode<Object> timedNode) {
            int i = 0;
            while (i != Integer.MAX_VALUE) {
                TimedNode<Object> timedNode2 = (TimedNode) timedNode.get();
                if (timedNode2 == null) {
                    T t = timedNode.value;
                    return (NotificationLite.isComplete(t) || NotificationLite.isError(t)) ? i - 1 : i;
                }
                i++;
                timedNode = timedNode2;
            }
            return i;
        }
    }

    /* renamed from: io.reactivex.subjects.ReplaySubject$SizeBoundReplayBuffer */
    public static final class SizeBoundReplayBuffer<T> extends AtomicReference<Object> {
        private static final long serialVersionUID = 1107649250281456395L;
        public volatile boolean done;
        public volatile Node<Object> head;
        public final int maxSize;
        public int size;
        public Node<Object> tail;

        public SizeBoundReplayBuffer(int i) {
            C12965a.m20651c(i, "maxSize");
            this.maxSize = i;
            Node<Object> node = new Node<>(null);
            this.tail = node;
            this.head = node;
        }

        public void add(T t) {
            Node<Object> node = new Node<>(t);
            Node<Object> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.set(node);
            trim();
        }

        public void addFinal(Object obj) {
            Node<Object> node = new Node<>(obj);
            Node<Object> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.lazySet(node);
            trimHead();
            this.done = true;
        }

        public T getValue() {
            Node<Object> node = this.head;
            Node<Object> node2 = null;
            while (true) {
                Node<Object> node3 = (Node) node.get();
                if (node3 == null) {
                    break;
                }
                node2 = node;
                node = node3;
            }
            T t = node.value;
            if (t == null) {
                return null;
            }
            return (NotificationLite.isComplete(t) || NotificationLite.isError(t)) ? node2.value : t;
        }

        public T[] getValues(T[] tArr) {
            Node<Object> node = this.head;
            int size2 = size();
            if (size2 != 0) {
                if (tArr.length < size2) {
                    tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size2);
                }
                for (int i = 0; i != size2; i++) {
                    node = (Node) node.get();
                    tArr[i] = node.value;
                }
                if (tArr.length > size2) {
                    tArr[size2] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        public void replay(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() == 0) {
                Observer<? super T> observer = replayDisposable.downstream;
                Node<Object> node = (Node) replayDisposable.index;
                if (node == null) {
                    node = this.head;
                }
                int i = 1;
                while (!replayDisposable.cancelled) {
                    Node<Object> node2 = (Node) node.get();
                    if (node2 != null) {
                        T t = node2.value;
                        if (!this.done || node2.get() != null) {
                            observer.onNext(t);
                            node = node2;
                        } else {
                            if (NotificationLite.isComplete(t)) {
                                observer.onComplete();
                            } else {
                                observer.onError(NotificationLite.getError(t));
                            }
                            replayDisposable.index = null;
                            replayDisposable.cancelled = true;
                            return;
                        }
                    } else if (node.get() != null) {
                        continue;
                    } else {
                        replayDisposable.index = node;
                        i = replayDisposable.addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                replayDisposable.index = null;
            }
        }

        public int size() {
            Node<Object> node = this.head;
            int i = 0;
            while (i != Integer.MAX_VALUE) {
                Node<Object> node2 = (Node) node.get();
                if (node2 == null) {
                    T t = node.value;
                    return (NotificationLite.isComplete(t) || NotificationLite.isError(t)) ? i - 1 : i;
                }
                i++;
                node = node2;
            }
            return i;
        }

        public void trim() {
            int i = this.size;
            if (i > this.maxSize) {
                this.size = i - 1;
                this.head = (Node) this.head.get();
            }
        }

        public void trimHead() {
            Node<Object> node = this.head;
            if (node.value != null) {
                Node<Object> node2 = new Node<>(null);
                node2.lazySet(node.get());
                this.head = node2;
            }
        }
    }

    /* renamed from: io.reactivex.subjects.ReplaySubject$TimedNode */
    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final long time;
        public final T value;

        public TimedNode(T t, long j) {
            this.value = t;
            this.time = j;
        }
    }

    /* renamed from: io.reactivex.subjects.ReplaySubject$UnboundedReplayBuffer */
    public static final class UnboundedReplayBuffer<T> extends AtomicReference<Object> {
        private static final long serialVersionUID = -733876083048047795L;
        public final List<Object> buffer;
        public volatile boolean done;
        public volatile int size;

        public UnboundedReplayBuffer(int i) {
            C12965a.m20651c(i, "capacityHint");
            this.buffer = new ArrayList(i);
        }

        public void add(T t) {
            this.buffer.add(t);
            this.size++;
        }

        public void addFinal(Object obj) {
            this.buffer.add(obj);
            trimHead();
            this.size++;
            this.done = true;
        }

        public T getValue() {
            int i = this.size;
            if (i == 0) {
                return null;
            }
            List<Object> list = this.buffer;
            T t = list.get(i - 1);
            if (!NotificationLite.isComplete(t) && !NotificationLite.isError(t)) {
                return t;
            }
            if (i == 1) {
                return null;
            }
            return list.get(i - 2);
        }

        public T[] getValues(T[] tArr) {
            int i = this.size;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List list = this.buffer;
            Object obj = list.get(i - 1);
            if ((NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) && i - 1 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < i) {
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = list.get(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        public void replay(ReplayDisposable<T> replayDisposable) {
            int i;
            if (replayDisposable.getAndIncrement() == 0) {
                List<Object> list = this.buffer;
                Observer<? super T> observer = replayDisposable.downstream;
                Integer num = (Integer) replayDisposable.index;
                int i2 = 0;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    replayDisposable.index = 0;
                }
                int i3 = 1;
                while (!replayDisposable.cancelled) {
                    int i4 = this.size;
                    while (i4 != i2) {
                        if (replayDisposable.cancelled) {
                            replayDisposable.index = null;
                            return;
                        }
                        Object obj = list.get(i2);
                        if (this.done && (i = i2 + 1) == i4 && i == (i4 = this.size)) {
                            if (NotificationLite.isComplete(obj)) {
                                observer.onComplete();
                            } else {
                                observer.onError(NotificationLite.getError(obj));
                            }
                            replayDisposable.index = null;
                            replayDisposable.cancelled = true;
                            return;
                        }
                        observer.onNext(obj);
                        i2++;
                    }
                    if (i2 == this.size) {
                        replayDisposable.index = Integer.valueOf(i2);
                        i3 = replayDisposable.addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    }
                }
                replayDisposable.index = null;
            }
        }

        public int size() {
            int i = this.size;
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            Object obj = this.buffer.get(i2);
            return (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? i2 : i;
        }

        public void trimHead() {
        }
    }
}
