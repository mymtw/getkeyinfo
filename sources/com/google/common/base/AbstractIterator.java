package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class AbstractIterator<T> implements Iterator<T> {

    /* renamed from: b */
    public State f35540b = State.NOT_READY;
    @NullableDecl

    /* renamed from: c */
    public T f35541c;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: com.google.common.base.AbstractIterator$a */
    public static /* synthetic */ class C15758a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35542a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.base.AbstractIterator$State[] r0 = com.google.common.base.AbstractIterator.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35542a = r0
                com.google.common.base.AbstractIterator$State r1 = com.google.common.base.AbstractIterator.State.READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35542a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.base.AbstractIterator$State r1 = com.google.common.base.AbstractIterator.State.DONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.AbstractIterator.C15758a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public abstract T mo55654a();

    public final boolean hasNext() {
        State state = this.f35540b;
        State state2 = State.FAILED;
        C15794l.m25623q(state != state2);
        int i = C15758a.f35542a[this.f35540b.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        this.f35540b = state2;
        this.f35541c = mo55654a();
        if (this.f35540b == State.DONE) {
            return false;
        }
        this.f35540b = State.READY;
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f35540b = State.NOT_READY;
            T t = this.f35541c;
            this.f35541c = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
