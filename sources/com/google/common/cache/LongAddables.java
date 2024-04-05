package com.google.common.cache;

import com.google.common.base.C15804s;
import java.util.concurrent.atomic.AtomicLong;

public final class LongAddables {

    /* renamed from: a */
    public static final C15804s<C15875g> f35712a;

    public static final class PureJavaLongAddable extends AtomicLong implements C15875g {
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

        public /* synthetic */ PureJavaLongAddable(C15860a aVar) {
            this();
        }
    }

    /* renamed from: com.google.common.cache.LongAddables$a */
    public static class C15860a implements C15804s<C15875g> {
        public final Object get() {
            return new LongAdder();
        }
    }

    /* renamed from: com.google.common.cache.LongAddables$b */
    public static class C15861b implements C15804s<C15875g> {
        public final Object get() {
            return new PureJavaLongAddable((C15860a) null);
        }
    }

    static {
        C15804s<C15875g> sVar;
        try {
            new LongAdder();
            sVar = new C15860a();
        } catch (Throwable unused) {
            sVar = new C15861b();
        }
        f35712a = sVar;
    }

    /* renamed from: a */
    public static C15875g m25698a() {
        return f35712a.get();
    }
}
