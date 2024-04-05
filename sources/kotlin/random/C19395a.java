package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.C19383o;

/* renamed from: kotlin.random.a */
public abstract class C19395a extends Random {
    public abstract Random getImpl();

    public int nextBits(int i) {
        return ((-i) >> 31) & (getImpl().nextInt() >>> (32 - i));
    }

    public boolean nextBoolean() {
        return getImpl().nextBoolean();
    }

    public byte[] nextBytes(byte[] bArr) {
        C19383o.m32797g(bArr, "array");
        getImpl().nextBytes(bArr);
        return bArr;
    }

    public double nextDouble() {
        return getImpl().nextDouble();
    }

    public float nextFloat() {
        return getImpl().nextFloat();
    }

    public int nextInt() {
        return getImpl().nextInt();
    }

    public long nextLong() {
        return getImpl().nextLong();
    }

    public int nextInt(int i) {
        return getImpl().nextInt(i);
    }
}
