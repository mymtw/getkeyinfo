package com.google.common.util.concurrent;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicDouble extends Number {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    public transient AtomicLong f36478b;

    public AtomicDouble(double d) {
        this.f36478b = new AtomicLong(Double.doubleToRawLongBits(d));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f36478b = new AtomicLong();
        set(objectInputStream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(get());
    }

    @CanIgnoreReturnValue
    public final double addAndGet(double d) {
        long j;
        double longBitsToDouble;
        do {
            j = this.f36478b.get();
            longBitsToDouble = Double.longBitsToDouble(j) + d;
        } while (!this.f36478b.compareAndSet(j, Double.doubleToRawLongBits(longBitsToDouble)));
        return longBitsToDouble;
    }

    public final boolean compareAndSet(double d, double d2) {
        return this.f36478b.compareAndSet(Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    public double doubleValue() {
        return get();
    }

    public float floatValue() {
        return (float) get();
    }

    public final double get() {
        return Double.longBitsToDouble(this.f36478b.get());
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(double d) {
        long j;
        double longBitsToDouble;
        do {
            j = this.f36478b.get();
            longBitsToDouble = Double.longBitsToDouble(j);
        } while (!this.f36478b.compareAndSet(j, Double.doubleToRawLongBits(longBitsToDouble + d)));
        return longBitsToDouble;
    }

    public final double getAndSet(double d) {
        return Double.longBitsToDouble(this.f36478b.getAndSet(Double.doubleToRawLongBits(d)));
    }

    public int intValue() {
        return (int) get();
    }

    public final void lazySet(double d) {
        this.f36478b.lazySet(Double.doubleToRawLongBits(d));
    }

    public long longValue() {
        return (long) get();
    }

    public final void set(double d) {
        this.f36478b.set(Double.doubleToRawLongBits(d));
    }

    public String toString() {
        return Double.toString(get());
    }

    public final boolean weakCompareAndSet(double d, double d2) {
        return this.f36478b.weakCompareAndSet(Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    public AtomicDouble() {
        this(ShadowDrawableWrapper.COS_45);
    }
}
