package com.google.common.hash;

import com.google.common.base.C15804s;
import java.util.concurrent.atomic.AtomicLong;

public final class LongAddables {

    /* renamed from: a */
    public static final C15804s<C16275i> f36345a;

    public static final class PureJavaLongAddable extends AtomicLong implements C16275i {
        private PureJavaLongAddable() {
        }

        public void add(long j) {
            getAndAdd(j);
        }

        public void increment() {
            getAndIncrement();
        }

        public long sum() {
            return get();
        }

        public /* synthetic */ PureJavaLongAddable(C16258a aVar) {
            this();
        }
    }

    /* renamed from: com.google.common.hash.LongAddables$a */
    public static class C16258a implements C15804s<C16275i> {
        public final Object get() {
            return new LongAdder();
        }
    }

    /* renamed from: com.google.common.hash.LongAddables$b */
    public static class C16259b implements C15804s<C16275i> {
        public final Object get() {
            return new PureJavaLongAddable((C16258a) null);
        }
    }

    static {
        C15804s<C16275i> sVar;
        try {
            new LongAdder();
            sVar = new C16258a();
        } catch (Throwable unused) {
            sVar = new C16259b();
        }
        f36345a = sVar;
    }
}
