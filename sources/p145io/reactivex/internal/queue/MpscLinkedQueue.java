package p145io.reactivex.internal.queue;

import java.util.concurrent.atomic.AtomicReference;
import p503zp.C13972h;

/* renamed from: io.reactivex.internal.queue.MpscLinkedQueue */
public final class MpscLinkedQueue<T> implements C13972h<T> {

    /* renamed from: b */
    public final AtomicReference<LinkedQueueNode<T>> f42949b;

    /* renamed from: c */
    public final AtomicReference<LinkedQueueNode<T>> f42950c;

    /* renamed from: io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode */
    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        public LinkedQueueNode() {
        }

        public E getAndNullValue() {
            E lpValue = lpValue();
            spValue((Object) null);
            return lpValue;
        }

        public E lpValue() {
            return this.value;
        }

        public LinkedQueueNode<E> lvNext() {
            return (LinkedQueueNode) get();
        }

        public void soNext(LinkedQueueNode<E> linkedQueueNode) {
            lazySet(linkedQueueNode);
        }

        public void spValue(E e) {
            this.value = e;
        }

        public LinkedQueueNode(E e) {
            spValue(e);
        }
    }

    public MpscLinkedQueue() {
        AtomicReference<LinkedQueueNode<T>> atomicReference = new AtomicReference<>();
        this.f42949b = atomicReference;
        AtomicReference<LinkedQueueNode<T>> atomicReference2 = new AtomicReference<>();
        this.f42950c = atomicReference2;
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        atomicReference2.lazySet(linkedQueueNode);
        LinkedQueueNode andSet = atomicReference.getAndSet(linkedQueueNode);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.Object r0 = r1.poll()
            if (r0 == 0) goto L_0x000d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.queue.MpscLinkedQueue.clear():void");
    }

    public final boolean isEmpty() {
        return this.f42950c.get() == this.f42949b.get();
    }

    public final boolean offer(T t) {
        if (t != null) {
            LinkedQueueNode linkedQueueNode = new LinkedQueueNode(t);
            this.f42949b.getAndSet(linkedQueueNode).soNext(linkedQueueNode);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final T poll() {
        LinkedQueueNode lvNext;
        LinkedQueueNode linkedQueueNode = this.f42950c.get();
        LinkedQueueNode lvNext2 = linkedQueueNode.lvNext();
        if (lvNext2 != null) {
            T andNullValue = lvNext2.getAndNullValue();
            this.f42950c.lazySet(lvNext2);
            return andNullValue;
        } else if (linkedQueueNode == this.f42949b.get()) {
            return null;
        } else {
            do {
                lvNext = linkedQueueNode.lvNext();
            } while (lvNext == null);
            T andNullValue2 = lvNext.getAndNullValue();
            this.f42950c.lazySet(lvNext);
            return andNullValue2;
        }
    }
}
