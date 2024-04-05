package com.google.common.collect;

import com.google.common.base.C15794l;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class AbstractIterator<T> extends C16170f2<T> {

    /* renamed from: b */
    public State f35745b = State.NOT_READY;
    @NullableDecl

    /* renamed from: c */
    public T f35746c;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: com.google.common.collect.AbstractIterator$a */
    public static /* synthetic */ class C15884a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35747a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.collect.AbstractIterator$State[] r0 = com.google.common.collect.AbstractIterator.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35747a = r0
                com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35747a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.AbstractIterator.C15884a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public abstract T mo56053a();

    @CanIgnoreReturnValue
    public final boolean hasNext() {
        State state = this.f35745b;
        State state2 = State.FAILED;
        C15794l.m25623q(state != state2);
        int i = C15884a.f35747a[this.f35745b.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        this.f35745b = state2;
        this.f35746c = mo56053a();
        if (this.f35745b == State.DONE) {
            return false;
        }
        this.f35745b = State.READY;
        return true;
    }

    @CanIgnoreReturnValue
    public final T next() {
        if (hasNext()) {
            this.f35745b = State.NOT_READY;
            T t = this.f35746c;
            this.f35746c = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
