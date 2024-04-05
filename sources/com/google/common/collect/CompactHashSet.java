package com.google.common.collect;

import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.google.android.gms.common.api.Api;
import com.google.common.base.C15791j;
import com.google.common.base.C15794l;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    public static final int UNSET = -1;
    @MonotonicNonNullDecl

    /* renamed from: b */
    public transient int[] f35820b;
    @MonotonicNonNullDecl

    /* renamed from: c */
    public transient long[] f35821c;

    /* renamed from: d */
    public transient int f35822d;

    /* renamed from: e */
    public transient int f35823e;
    @MonotonicNonNullDecl
    public transient Object[] elements;
    public transient float loadFactor;
    public transient int modCount;

    /* renamed from: com.google.common.collect.CompactHashSet$a */
    public class C15924a implements Iterator<E> {

        /* renamed from: b */
        public int f35824b;

        /* renamed from: c */
        public int f35825c;

        /* renamed from: d */
        public int f35826d = -1;

        public C15924a() {
            this.f35824b = CompactHashSet.this.modCount;
            this.f35825c = CompactHashSet.this.firstEntryIndex();
        }

        public final boolean hasNext() {
            return this.f35825c >= 0;
        }

        public final E next() {
            if (CompactHashSet.this.modCount != this.f35824b) {
                throw new ConcurrentModificationException();
            } else if (hasNext()) {
                int i = this.f35825c;
                this.f35826d = i;
                CompactHashSet compactHashSet = CompactHashSet.this;
                E e = compactHashSet.elements[i];
                this.f35825c = compactHashSet.getSuccessor(i);
                return e;
            } else {
                throw new NoSuchElementException();
            }
        }

        public final void remove() {
            if (CompactHashSet.this.modCount == this.f35824b) {
                C16203o.m26218e(this.f35826d >= 0);
                this.f35824b++;
                CompactHashSet compactHashSet = CompactHashSet.this;
                boolean unused = compactHashSet.mo56356a(CompactHashSet.access$100(compactHashSet.f35821c[this.f35826d]), compactHashSet.elements[this.f35826d]);
                this.f35825c = CompactHashSet.this.adjustAfterRemove(this.f35825c, this.f35826d);
                this.f35826d = -1;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    public CompactHashSet() {
        init(3, 1.0f);
    }

    public static int access$100(long j) {
        return (int) (j >>> 32);
    }

    public static <E> CompactHashSet<E> create() {
        return new CompactHashSet<>();
    }

    public static <E> CompactHashSet<E> createWithExpectedSize(int i) {
        return new CompactHashSet<>(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        init(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                add(objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f35823e);
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public final boolean mo56356a(int i, Object obj) {
        int[] iArr = this.f35820b;
        int length = (iArr.length - 1) & i;
        int i2 = iArr[length];
        if (i2 == -1) {
            return false;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.f35821c[i2] >>> 32)) != i || !C15791j.m25606a(obj, this.elements[i2])) {
                int i4 = (int) this.f35821c[i2];
                if (i4 == -1) {
                    return false;
                }
                int i5 = i4;
                i3 = i2;
                i2 = i5;
            } else {
                if (i3 == -1) {
                    this.f35820b[length] = (int) this.f35821c[i2];
                } else {
                    long[] jArr = this.f35821c;
                    jArr[i3] = (jArr[i3] & -4294967296L) | (((long) ((int) jArr[i2])) & UnsignedInteger.INT_MASK);
                }
                moveEntry(i2);
                this.f35823e--;
                this.modCount++;
                return true;
            }
        }
    }

    @CanIgnoreReturnValue
    public boolean add(@NullableDecl E e) {
        long[] jArr = this.f35821c;
        Object[] objArr = this.elements;
        int c = C16184i0.m26180c(e);
        int[] iArr = this.f35820b;
        int length = (iArr.length - 1) & c;
        int i = this.f35823e;
        int i2 = iArr[length];
        if (i2 == -1) {
            iArr[length] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (((int) (j >>> 32)) == c && C15791j.m25606a(e, objArr[i2])) {
                    return false;
                }
                int i3 = (int) j;
                if (i3 == -1) {
                    jArr[i2] = (j & -4294967296L) | (((long) i) & UnsignedInteger.INT_MASK);
                    break;
                }
                i2 = i3;
            }
        }
        int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i != Integer.MAX_VALUE) {
            int i5 = i + 1;
            int length2 = this.f35821c.length;
            if (i5 > length2) {
                int max = Math.max(1, length2 >>> 1) + length2;
                if (max >= 0) {
                    i4 = max;
                }
                if (i4 != length2) {
                    resizeEntries(i4);
                }
            }
            insertEntry(i, e, c);
            this.f35823e = i5;
            if (i >= this.f35822d) {
                mo56359c(this.f35820b.length * 2);
            }
            this.modCount++;
            return true;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    /* renamed from: c */
    public final void mo56359c(int i) {
        if (this.f35820b.length >= 1073741824) {
            this.f35822d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            return;
        }
        int i2 = ((int) (((float) i) * this.loadFactor)) + 1;
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        long[] jArr = this.f35821c;
        int i3 = i - 1;
        for (int i4 = 0; i4 < this.f35823e; i4++) {
            int i5 = (int) (jArr[i4] >>> 32);
            int i6 = i5 & i3;
            int i7 = iArr[i6];
            iArr[i6] = i4;
            jArr[i4] = (((long) i5) << 32) | (((long) i7) & UnsignedInteger.INT_MASK);
        }
        this.f35822d = i2;
        this.f35820b = iArr;
    }

    public void clear() {
        this.modCount++;
        Arrays.fill(this.elements, 0, this.f35823e, (Object) null);
        Arrays.fill(this.f35820b, -1);
        Arrays.fill(this.f35821c, -1);
        this.f35823e = 0;
    }

    public boolean contains(@NullableDecl Object obj) {
        int c = C16184i0.m26180c(obj);
        int[] iArr = this.f35820b;
        int i = iArr[(iArr.length - 1) & c];
        while (i != -1) {
            long j = this.f35821c[i];
            if (((int) (j >>> 32)) == c && C15791j.m25606a(obj, this.elements[i])) {
                return true;
            }
            i = (int) j;
        }
        return false;
    }

    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    public int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 < this.f35823e) {
            return i2;
        }
        return -1;
    }

    public void init(int i, float f) {
        boolean z = false;
        C15794l.m25614h(i >= 0, "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z = true;
        }
        C15794l.m25614h(z, "Illegal load factor");
        int a = C16184i0.m26178a(i, (double) f);
        int[] iArr = new int[a];
        Arrays.fill(iArr, -1);
        this.f35820b = iArr;
        this.loadFactor = f;
        this.elements = new Object[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        this.f35821c = jArr;
        this.f35822d = Math.max(1, (int) (((float) a) * f));
    }

    public void insertEntry(int i, E e, int i2) {
        this.f35821c[i] = (((long) i2) << 32) | UnsignedInteger.INT_MASK;
        this.elements[i] = e;
    }

    public boolean isEmpty() {
        return this.f35823e == 0;
    }

    public Iterator<E> iterator() {
        return new C15924a();
    }

    public void moveEntry(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.elements;
            objArr[i] = objArr[size];
            objArr[size] = null;
            long[] jArr = this.f35821c;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int[] iArr = this.f35820b;
            int length = ((int) (j >>> 32)) & (iArr.length - 1);
            int i2 = iArr[length];
            if (i2 == size) {
                iArr[length] = i;
                return;
            }
            while (true) {
                long[] jArr2 = this.f35821c;
                long j2 = jArr2[i2];
                int i3 = (int) j2;
                if (i3 == size) {
                    jArr2[i2] = (j2 & -4294967296L) | (((long) i) & UnsignedInteger.INT_MASK);
                    return;
                }
                i2 = i3;
            }
        } else {
            this.elements[i] = null;
            this.f35821c[i] = -1;
        }
    }

    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj) {
        return mo56356a(C16184i0.m26180c(obj), obj);
    }

    public void resizeEntries(int i) {
        this.elements = Arrays.copyOf(this.elements, i);
        long[] jArr = this.f35821c;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f35821c = copyOf;
    }

    public int size() {
        return this.f35823e;
    }

    public Object[] toArray() {
        return Arrays.copyOf(this.elements, this.f35823e);
    }

    public void trimToSize() {
        int i = this.f35823e;
        if (i < this.f35821c.length) {
            resizeEntries(i);
        }
        int max = Math.max(1, Integer.highestOneBit((int) (((float) i) / this.loadFactor)));
        if (max < 1073741824 && ((double) i) / ((double) max) > ((double) this.loadFactor)) {
            max <<= 1;
        }
        if (max < this.f35820b.length) {
            mo56359c(max);
        }
    }

    public static <E> CompactHashSet<E> create(Collection<? extends E> collection) {
        CompactHashSet<E> createWithExpectedSize = createWithExpectedSize(collection.size());
        createWithExpectedSize.addAll(collection);
        return createWithExpectedSize;
    }

    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        Object[] objArr = this.elements;
        int i = this.f35823e;
        C15794l.m25619m(0, i + 0, objArr.length);
        if (tArr.length < i) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
        } else if (tArr.length > i) {
            tArr[i] = null;
        }
        System.arraycopy(objArr, 0, tArr, 0, i);
        return tArr;
    }

    public CompactHashSet(int i) {
        init(i, 1.0f);
    }

    public static <E> CompactHashSet<E> create(E... eArr) {
        CompactHashSet<E> createWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(createWithExpectedSize, eArr);
        return createWithExpectedSize;
    }
}
