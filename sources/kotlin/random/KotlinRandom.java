package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.C19383o;

final class KotlinRandom extends Random {
    @Deprecated
    private static final long serialVersionUID = 0;
    private final Random impl;
    private boolean seedInitialized;

    public KotlinRandom(Random random) {
        C19383o.m32797g(random, "impl");
        this.impl = random;
    }

    public final Random getImpl() {
        return this.impl;
    }

    public int next(int i) {
        return this.impl.nextBits(i);
    }

    public boolean nextBoolean() {
        return this.impl.nextBoolean();
    }

    public void nextBytes(byte[] bArr) {
        C19383o.m32797g(bArr, "bytes");
        this.impl.nextBytes(bArr);
    }

    public double nextDouble() {
        return this.impl.nextDouble();
    }

    public float nextFloat() {
        return this.impl.nextFloat();
    }

    public int nextInt() {
        return this.impl.nextInt();
    }

    public long nextLong() {
        return this.impl.nextLong();
    }

    public void setSeed(long j) {
        if (!this.seedInitialized) {
            this.seedInitialized = true;
            return;
        }
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }

    public int nextInt(int i) {
        return this.impl.nextInt(i);
    }
}
