package p761oq;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.C19383o;
import kotlin.random.C19395a;

/* renamed from: oq.a */
public final class C20021a extends C19395a {
    public final Random getImpl() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C19383o.m32796f(current, "current()");
        return current;
    }

    public final double nextDouble(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }

    public final int nextInt(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    public final long nextLong(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    public final long nextLong(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }
}
