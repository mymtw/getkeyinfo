package com.google.common.util.concurrent;

import com.google.common.primitives.ImmutableLongArray;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicDoubleArray implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    public transient AtomicLongArray f36479b;

    public AtomicDoubleArray(int i) {
        this.f36479b = new AtomicLongArray(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        ImmutableLongArray.C16296b builder = ImmutableLongArray.builder();
        for (int i = 0; i < readInt; i++) {
            long doubleToRawLongBits = Double.doubleToRawLongBits(objectInputStream.readDouble());
            builder.mo58104a(1);
            long[] jArr = builder.f36398a;
            int i2 = builder.f36399b;
            jArr[i2] = doubleToRawLongBits;
            builder.f36399b = i2 + 1;
        }
        int i3 = builder.f36399b;
        this.f36479b = new AtomicLongArray((i3 == 0 ? ImmutableLongArray.f36396c : new ImmutableLongArray(builder.f36398a, 0, i3)).toArray());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int length = length();
        objectOutputStream.writeInt(length);
        for (int i = 0; i < length; i++) {
            objectOutputStream.writeDouble(get(i));
        }
    }

    @CanIgnoreReturnValue
    public double addAndGet(int i, double d) {
        long j;
        double longBitsToDouble;
        do {
            j = this.f36479b.get(i);
            longBitsToDouble = Double.longBitsToDouble(j) + d;
        } while (!this.f36479b.compareAndSet(i, j, Double.doubleToRawLongBits(longBitsToDouble)));
        return longBitsToDouble;
    }

    public final boolean compareAndSet(int i, double d, double d2) {
        return this.f36479b.compareAndSet(i, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    public final double get(int i) {
        return Double.longBitsToDouble(this.f36479b.get(i));
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(int i, double d) {
        long j;
        double longBitsToDouble;
        do {
            j = this.f36479b.get(i);
            longBitsToDouble = Double.longBitsToDouble(j);
        } while (!this.f36479b.compareAndSet(i, j, Double.doubleToRawLongBits(longBitsToDouble + d)));
        return longBitsToDouble;
    }

    public final double getAndSet(int i, double d) {
        return Double.longBitsToDouble(this.f36479b.getAndSet(i, Double.doubleToRawLongBits(d)));
    }

    public final void lazySet(int i, double d) {
        this.f36479b.lazySet(i, Double.doubleToRawLongBits(d));
    }

    public final int length() {
        return this.f36479b.length();
    }

    public final void set(int i, double d) {
        this.f36479b.set(i, Double.doubleToRawLongBits(d));
    }

    public String toString() {
        int length = length() - 1;
        if (length == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder((length + 1) * 19);
        sb.append('[');
        int i = 0;
        while (true) {
            sb.append(Double.longBitsToDouble(this.f36479b.get(i)));
            if (i == length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(',');
            sb.append(' ');
            i++;
        }
    }

    public final boolean weakCompareAndSet(int i, double d, double d2) {
        return this.f36479b.weakCompareAndSet(i, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    public AtomicDoubleArray(double[] dArr) {
        int length = dArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = Double.doubleToRawLongBits(dArr[i]);
        }
        this.f36479b = new AtomicLongArray(jArr);
    }
}
