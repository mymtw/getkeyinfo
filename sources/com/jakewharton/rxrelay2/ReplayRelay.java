package com.jakewharton.rxrelay2;

import android.support.p013v4.media.C0073e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p003a2.C0015b;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8066r;

public final class ReplayRelay<T> extends C17040c<T> {

    public static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final T value;

        public Node(T t) {
            this.value = t;
        }
    }

    public static final class ReplayDisposable<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 466549804534799122L;
        public volatile boolean cancelled;
        public final Observer<? super T> downstream;
        public Object index;
        public final ReplayRelay<T> state;

        public ReplayDisposable(Observer<? super T> observer, ReplayRelay<T> replayRelay) {
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

    public static final class SizeAndTimeBoundReplayBuffer<T> extends AtomicReference<Object> {
        private static final long serialVersionUID = -8056260896137901749L;
        public volatile TimedNode<T> head;
        public final long maxAge;
        public final int maxSize;
        public final C8066r scheduler;
        public int size;
        public TimedNode<T> tail;
        public final TimeUnit unit;

        public SizeAndTimeBoundReplayBuffer(int i, long j, TimeUnit timeUnit, C8066r rVar) {
            if (i <= 0) {
                throw new IllegalArgumentException(C0015b.m88g("maxSize > 0 required but it was ", i));
            } else if (j <= 0) {
                throw new IllegalArgumentException(C0073e.m205e("maxAge > 0 required but it was ", j));
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (rVar != null) {
                this.maxSize = i;
                this.maxAge = j;
                this.unit = timeUnit;
                this.scheduler = rVar;
                TimedNode<T> timedNode = new TimedNode<>(null, 0);
                this.tail = timedNode;
                this.head = timedNode;
            } else {
                throw new NullPointerException("scheduler == null");
            }
        }

        public void add(T t) {
            C8066r rVar = this.scheduler;
            TimeUnit timeUnit = this.unit;
            rVar.getClass();
            TimedNode<T> timedNode = new TimedNode<>(t, C8066r.m16244a(timeUnit));
            TimedNode<T> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.set(timedNode);
            trim();
        }

        public TimedNode<T> getHead() {
            TimedNode<T> timedNode;
            TimedNode<T> timedNode2 = this.head;
            C8066r rVar = this.scheduler;
            TimeUnit timeUnit = this.unit;
            rVar.getClass();
            long a = C8066r.m16244a(timeUnit) - this.maxAge;
            Object obj = timedNode2.get();
            while (true) {
                TimedNode<T> timedNode3 = (TimedNode) obj;
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
            TimedNode<T> timedNode = this.head;
            while (true) {
                TimedNode<T> timedNode2 = (TimedNode) timedNode.get();
                if (timedNode2 == null) {
                    break;
                }
                timedNode = timedNode2;
            }
            C8066r rVar = this.scheduler;
            TimeUnit timeUnit = this.unit;
            rVar.getClass();
            if (timedNode.time < C8066r.m16244a(timeUnit) - this.maxAge) {
                return null;
            }
            return timedNode.value;
        }

        public T[] getValues(T[] tArr) {
            TimedNode head2 = getHead();
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
                int i = 1;
                Observer<? super T> observer = replayDisposable.downstream;
                TimedNode timedNode = (TimedNode) replayDisposable.index;
                if (timedNode == null) {
                    timedNode = getHead();
                }
                while (!replayDisposable.cancelled) {
                    while (!replayDisposable.cancelled) {
                        TimedNode timedNode2 = (TimedNode) timedNode.get();
                        if (timedNode2 != null) {
                            observer.onNext(timedNode2.value);
                            timedNode = timedNode2;
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
            TimedNode<T> timedNode = this.head;
            while (this.size > 1) {
                TimedNode<T> timedNode2 = (TimedNode) timedNode.get();
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

        public void trimHead() {
            TimedNode<T> timedNode = this.head;
            if (timedNode.value != null) {
                TimedNode<T> timedNode2 = new TimedNode<>(null, 0);
                timedNode2.lazySet(timedNode.get());
                this.head = timedNode2;
            }
        }

        public int size(TimedNode<T> timedNode) {
            int i = 0;
            while (i != Integer.MAX_VALUE && (timedNode = (TimedNode) timedNode.get()) != null) {
                i++;
            }
            return i;
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends AtomicReference<Object> {
        private static final long serialVersionUID = 1107649250281456395L;
        public volatile Node<T> head;
        public final int maxSize;
        public int size;
        public Node<T> tail;

        public SizeBoundReplayBuffer(int i) {
            if (i > 0) {
                this.maxSize = i;
                Node<T> node = new Node<>(null);
                this.tail = node;
                this.head = node;
                return;
            }
            throw new IllegalArgumentException(C0015b.m88g("maxSize > 0 required but it was ", i));
        }

        public void add(T t) {
            Node<T> node = new Node<>(t);
            Node<T> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.set(node);
            trim();
        }

        public T getValue() {
            Node<T> node = this.head;
            while (true) {
                Node<T> node2 = (Node) node.get();
                if (node2 == null) {
                    return node.value;
                }
                node = node2;
            }
        }

        public T[] getValues(T[] tArr) {
            Node<T> node = this.head;
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
                int i = 1;
                Observer<? super T> observer = replayDisposable.downstream;
                Node<T> node = (Node) replayDisposable.index;
                if (node == null) {
                    node = this.head;
                }
                while (!replayDisposable.cancelled) {
                    Node<T> node2 = (Node) node.get();
                    if (node2 != null) {
                        observer.onNext(node2.value);
                        node = node2;
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
            Node<T> node = this.head;
            int i = 0;
            while (i != Integer.MAX_VALUE && (node = (Node) node.get()) != null) {
                i++;
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
            Node<T> node = this.head;
            if (node.value != null) {
                Node<T> node2 = new Node<>(null);
                node2.lazySet(node.get());
                this.head = node2;
            }
        }
    }

    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final long time;
        public final T value;

        public TimedNode(T t, long j) {
            this.value = t;
            this.time = j;
        }
    }

    public static final class UnboundedReplayBuffer<T> extends AtomicReference<Object> {
        private static final long serialVersionUID = -733876083048047795L;
        public final List<T> buffer;
        public volatile int size;

        public UnboundedReplayBuffer(int i) {
            if (i > 0) {
                this.buffer = new ArrayList(i);
                return;
            }
            throw new IllegalArgumentException("capacityHint <= 0");
        }

        public void add(T t) {
            this.buffer.add(t);
            this.size++;
        }

        public T getValue() {
            int i = this.size;
            if (i != 0) {
                return this.buffer.get(i - 1);
            }
            return null;
        }

        public T[] getValues(T[] tArr) {
            int i = this.size;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < i) {
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
            }
            List<T> list = this.buffer;
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = list.get(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        public void replay(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() == 0) {
                List<T> list = this.buffer;
                Observer<? super T> observer = replayDisposable.downstream;
                Integer num = (Integer) replayDisposable.index;
                int i = 0;
                int i2 = 1;
                if (num != null) {
                    i = num.intValue();
                } else {
                    replayDisposable.index = 0;
                }
                while (!replayDisposable.cancelled) {
                    int i3 = this.size;
                    while (i3 != i) {
                        if (replayDisposable.cancelled) {
                            replayDisposable.index = null;
                            return;
                        } else {
                            observer.onNext(list.get(i));
                            i++;
                        }
                    }
                    if (i == this.size) {
                        replayDisposable.index = Integer.valueOf(i);
                        i2 = replayDisposable.addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                }
                replayDisposable.index = null;
            }
        }

        public int size() {
            return this.size;
        }

        public void trimHead() {
        }
    }
}
