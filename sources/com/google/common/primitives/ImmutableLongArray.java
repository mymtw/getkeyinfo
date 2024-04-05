package com.google.common.primitives;

import com.google.android.gms.common.api.Api;
import com.google.common.base.C15794l;
import com.google.common.primitives.Longs;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
public final class ImmutableLongArray implements Serializable {

    /* renamed from: c */
    public static final ImmutableLongArray f36396c = new ImmutableLongArray(new long[0], 0, 0);
    /* access modifiers changed from: private */
    public final long[] array;

    /* renamed from: b */
    public final transient int f36397b;
    private final int end;

    public static class AsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private final ImmutableLongArray parent;

        public AsList(ImmutableLongArray immutableLongArray, C16295a aVar) {
            this.parent = immutableLongArray;
        }

        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof AsList) {
                return this.parent.equals(((AsList) obj).parent);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int access$100 = this.parent.f36397b;
            for (Object next : list) {
                if (next instanceof Long) {
                    int i = access$100 + 1;
                    if (this.parent.array[access$100] == ((Long) next).longValue()) {
                        access$100 = i;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.parent.hashCode();
        }

        public int indexOf(Object obj) {
            if (obj instanceof Long) {
                return this.parent.indexOf(((Long) obj).longValue());
            }
            return -1;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return this.parent.lastIndexOf(((Long) obj).longValue());
            }
            return -1;
        }

        public int size() {
            return this.parent.length();
        }

        public List<Long> subList(int i, int i2) {
            return this.parent.subArray(i, i2).asList();
        }

        public String toString() {
            return this.parent.toString();
        }

        public Long get(int i) {
            return Long.valueOf(this.parent.get(i));
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: com.google.common.primitives.ImmutableLongArray$b */
    public static final class C16296b {

        /* renamed from: a */
        public long[] f36398a;

        /* renamed from: b */
        public int f36399b = 0;

        public C16296b(int i) {
            this.f36398a = new long[i];
        }

        /* renamed from: a */
        public final void mo58104a(int i) {
            int i2 = this.f36399b + i;
            long[] jArr = this.f36398a;
            if (i2 > jArr.length) {
                int length = jArr.length;
                if (i2 >= 0) {
                    int i3 = length + (length >> 1) + 1;
                    if (i3 < i2) {
                        i3 = Integer.highestOneBit(i2 - 1) << 1;
                    }
                    if (i3 < 0) {
                        i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    }
                    long[] jArr2 = new long[i3];
                    System.arraycopy(this.f36398a, 0, jArr2, 0, this.f36399b);
                    this.f36398a = jArr2;
                    return;
                }
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
    }

    public static C16296b builder(int i) {
        C15794l.m25609c(i, "Invalid initialCapacity: %s", i >= 0);
        return new C16296b(i);
    }

    public static ImmutableLongArray copyOf(long[] jArr) {
        if (jArr.length == 0) {
            return f36396c;
        }
        return new ImmutableLongArray(Arrays.copyOf(jArr, jArr.length));
    }

    /* renamed from: of */
    public static ImmutableLongArray m26374of() {
        return f36396c;
    }

    public List<Long> asList() {
        return new AsList(this, (C16295a) null);
    }

    public boolean contains(long j) {
        return indexOf(j) >= 0;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableLongArray)) {
            return false;
        }
        ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
        if (length() != immutableLongArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != immutableLongArray.get(i)) {
                return false;
            }
        }
        return true;
    }

    public long get(int i) {
        C15794l.m25616j(i, length());
        return this.array[this.f36397b + i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.f36397b; i2 < this.end; i2++) {
            i = (i * 31) + Longs.m26387b(this.array[i2]);
        }
        return i;
    }

    public int indexOf(long j) {
        for (int i = this.f36397b; i < this.end; i++) {
            if (this.array[i] == j) {
                return i - this.f36397b;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.f36397b;
    }

    public int lastIndexOf(long j) {
        int i = this.end;
        while (true) {
            i--;
            int i2 = this.f36397b;
            if (i < i2) {
                return -1;
            }
            if (this.array[i] == j) {
                return i - i2;
            }
        }
    }

    public int length() {
        return this.end - this.f36397b;
    }

    public Object readResolve() {
        return isEmpty() ? f36396c : this;
    }

    public ImmutableLongArray subArray(int i, int i2) {
        C15794l.m25619m(i, i2, length());
        if (i == i2) {
            return f36396c;
        }
        long[] jArr = this.array;
        int i3 = this.f36397b;
        return new ImmutableLongArray(jArr, i + i3, i3 + i2);
    }

    public long[] toArray() {
        return Arrays.copyOfRange(this.array, this.f36397b, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(length() * 5);
        sb.append('[');
        sb.append(this.array[this.f36397b]);
        int i = this.f36397b;
        while (true) {
            i++;
            if (i < this.end) {
                sb.append(", ");
                sb.append(this.array[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public ImmutableLongArray trimmed() {
        return this.f36397b > 0 || this.end < this.array.length ? new ImmutableLongArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    public ImmutableLongArray(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    /* renamed from: of */
    public static ImmutableLongArray m26375of(long j) {
        return new ImmutableLongArray(new long[]{j}, 0, 1);
    }

    public ImmutableLongArray(long[] jArr, int i, int i2) {
        this.array = jArr;
        this.f36397b = i;
        this.end = i2;
    }

    public static C16296b builder() {
        return new C16296b(10);
    }

    public static ImmutableLongArray copyOf(Collection<Long> collection) {
        long[] jArr;
        if (collection.isEmpty()) {
            return f36396c;
        }
        if (collection instanceof Longs.LongArrayAsList) {
            jArr = ((Longs.LongArrayAsList) collection).toLongArray();
        } else {
            Object[] array2 = collection.toArray();
            int length = array2.length;
            long[] jArr2 = new long[length];
            for (int i = 0; i < length; i++) {
                Object obj = array2[i];
                obj.getClass();
                jArr2[i] = ((Number) obj).longValue();
            }
            jArr = jArr2;
        }
        return new ImmutableLongArray(jArr);
    }

    /* renamed from: of */
    public static ImmutableLongArray m26376of(long j, long j2) {
        return new ImmutableLongArray(new long[]{j, j2}, 0, 2);
    }

    /* renamed from: of */
    public static ImmutableLongArray m26377of(long j, long j2, long j3) {
        return new ImmutableLongArray(new long[]{j, j2, j3}, 0, 3);
    }

    /* renamed from: of */
    public static ImmutableLongArray m26378of(long j, long j2, long j3, long j4) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4}, 0, 4);
    }

    /* renamed from: of */
    public static ImmutableLongArray m26379of(long j, long j2, long j3, long j4, long j5) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4, j5}, 0, 5);
    }

    /* renamed from: of */
    public static ImmutableLongArray m26380of(long j, long j2, long j3, long j4, long j5, long j6) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4, j5, j6}, 0, 6);
    }

    public static ImmutableLongArray copyOf(Iterable<Long> iterable) {
        boolean z = iterable instanceof Collection;
        if (z) {
            return copyOf((Collection<Long>) (Collection) iterable);
        }
        C16296b builder = builder();
        builder.getClass();
        if (z) {
            Collection<Long> collection = (Collection) iterable;
            builder.mo58104a(collection.size());
            for (Long longValue : collection) {
                long[] jArr = builder.f36398a;
                int i = builder.f36399b;
                builder.f36399b = i + 1;
                jArr[i] = longValue.longValue();
            }
        } else {
            for (Long longValue2 : iterable) {
                long longValue3 = longValue2.longValue();
                builder.mo58104a(1);
                long[] jArr2 = builder.f36398a;
                int i2 = builder.f36399b;
                jArr2[i2] = longValue3;
                builder.f36399b = i2 + 1;
            }
        }
        int i3 = builder.f36399b;
        return i3 == 0 ? f36396c : new ImmutableLongArray(builder.f36398a, 0, i3);
    }

    /* renamed from: of */
    public static ImmutableLongArray m26381of(long j, long... jArr) {
        C15794l.m25614h(jArr.length <= 2147483646, "the total number of elements must fit in an int");
        int length = jArr.length + 1;
        long[] jArr2 = new long[length];
        jArr2[0] = j;
        System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        return new ImmutableLongArray(jArr2, 0, length);
    }
}
