package com.google.common.primitives;

import com.google.android.gms.common.api.Api;
import com.google.common.base.C15794l;
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
public final class ImmutableIntArray implements Serializable {

    /* renamed from: c */
    public static final ImmutableIntArray f36392c = new ImmutableIntArray(new int[0], 0, 0);
    /* access modifiers changed from: private */
    public final int[] array;

    /* renamed from: b */
    public final transient int f36393b;
    private final int end;

    public static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private final ImmutableIntArray parent;

        public AsList(ImmutableIntArray immutableIntArray, C16293a aVar) {
            this.parent = immutableIntArray;
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
            int access$100 = this.parent.f36393b;
            for (Object next : list) {
                if (next instanceof Integer) {
                    int i = access$100 + 1;
                    if (this.parent.array[access$100] == ((Integer) next).intValue()) {
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
            if (obj instanceof Integer) {
                return this.parent.indexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.parent.lastIndexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        public int size() {
            return this.parent.length();
        }

        public List<Integer> subList(int i, int i2) {
            return this.parent.subArray(i, i2).asList();
        }

        public String toString() {
            return this.parent.toString();
        }

        public Integer get(int i) {
            return Integer.valueOf(this.parent.get(i));
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: com.google.common.primitives.ImmutableIntArray$b */
    public static final class C16294b {

        /* renamed from: a */
        public int[] f36394a;

        /* renamed from: b */
        public int f36395b = 0;

        public C16294b(int i) {
            this.f36394a = new int[i];
        }

        /* renamed from: a */
        public final void mo58079a(int i) {
            int i2 = this.f36395b + i;
            int[] iArr = this.f36394a;
            if (i2 > iArr.length) {
                int length = iArr.length;
                if (i2 >= 0) {
                    int i3 = length + (length >> 1) + 1;
                    if (i3 < i2) {
                        i3 = Integer.highestOneBit(i2 - 1) << 1;
                    }
                    if (i3 < 0) {
                        i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    }
                    int[] iArr2 = new int[i3];
                    System.arraycopy(this.f36394a, 0, iArr2, 0, this.f36395b);
                    this.f36394a = iArr2;
                    return;
                }
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
    }

    public static C16294b builder(int i) {
        C15794l.m25609c(i, "Invalid initialCapacity: %s", i >= 0);
        return new C16294b(i);
    }

    public static ImmutableIntArray copyOf(int[] iArr) {
        return iArr.length == 0 ? f36392c : new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
    }

    /* renamed from: of */
    public static ImmutableIntArray m26365of() {
        return f36392c;
    }

    public List<Integer> asList() {
        return new AsList(this, (C16293a) null);
    }

    public boolean contains(int i) {
        return indexOf(i) >= 0;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (length() != immutableIntArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != immutableIntArray.get(i)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i) {
        C15794l.m25616j(i, length());
        return this.array[this.f36393b + i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.f36393b; i2 < this.end; i2++) {
            i = (i * 31) + this.array[i2];
        }
        return i;
    }

    public int indexOf(int i) {
        for (int i2 = this.f36393b; i2 < this.end; i2++) {
            if (this.array[i2] == i) {
                return i2 - this.f36393b;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.f36393b;
    }

    public int lastIndexOf(int i) {
        int i2 = this.end;
        while (true) {
            i2--;
            int i3 = this.f36393b;
            if (i2 < i3) {
                return -1;
            }
            if (this.array[i2] == i) {
                return i2 - i3;
            }
        }
    }

    public int length() {
        return this.end - this.f36393b;
    }

    public Object readResolve() {
        return isEmpty() ? f36392c : this;
    }

    public ImmutableIntArray subArray(int i, int i2) {
        C15794l.m25619m(i, i2, length());
        if (i == i2) {
            return f36392c;
        }
        int[] iArr = this.array;
        int i3 = this.f36393b;
        return new ImmutableIntArray(iArr, i + i3, i3 + i2);
    }

    public int[] toArray() {
        return Arrays.copyOfRange(this.array, this.f36393b, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(length() * 5);
        sb.append('[');
        sb.append(this.array[this.f36393b]);
        int i = this.f36393b;
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

    public ImmutableIntArray trimmed() {
        return this.f36393b > 0 || this.end < this.array.length ? new ImmutableIntArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    public ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static ImmutableIntArray copyOf(Collection<Integer> collection) {
        return collection.isEmpty() ? f36392c : new ImmutableIntArray(Ints.m26385c(collection));
    }

    /* renamed from: of */
    public static ImmutableIntArray m26366of(int i) {
        return new ImmutableIntArray(new int[]{i}, 0, 1);
    }

    public ImmutableIntArray(int[] iArr, int i, int i2) {
        this.array = iArr;
        this.f36393b = i;
        this.end = i2;
    }

    public static C16294b builder() {
        return new C16294b(10);
    }

    public static ImmutableIntArray copyOf(Iterable<Integer> iterable) {
        boolean z = iterable instanceof Collection;
        if (z) {
            return copyOf((Collection<Integer>) (Collection) iterable);
        }
        C16294b builder = builder();
        builder.getClass();
        if (z) {
            Collection<Integer> collection = (Collection) iterable;
            builder.mo58079a(collection.size());
            for (Integer intValue : collection) {
                int[] iArr = builder.f36394a;
                int i = builder.f36395b;
                builder.f36395b = i + 1;
                iArr[i] = intValue.intValue();
            }
        } else {
            for (Integer intValue2 : iterable) {
                int intValue3 = intValue2.intValue();
                builder.mo58079a(1);
                int[] iArr2 = builder.f36394a;
                int i2 = builder.f36395b;
                iArr2[i2] = intValue3;
                builder.f36395b = i2 + 1;
            }
        }
        int i3 = builder.f36395b;
        return i3 == 0 ? f36392c : new ImmutableIntArray(builder.f36394a, 0, i3);
    }

    /* renamed from: of */
    public static ImmutableIntArray m26367of(int i, int i2) {
        return new ImmutableIntArray(new int[]{i, i2}, 0, 2);
    }

    /* renamed from: of */
    public static ImmutableIntArray m26368of(int i, int i2, int i3) {
        return new ImmutableIntArray(new int[]{i, i2, i3}, 0, 3);
    }

    /* renamed from: of */
    public static ImmutableIntArray m26369of(int i, int i2, int i3, int i4) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4}, 0, 4);
    }

    /* renamed from: of */
    public static ImmutableIntArray m26370of(int i, int i2, int i3, int i4, int i5) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4, i5}, 0, 5);
    }

    /* renamed from: of */
    public static ImmutableIntArray m26371of(int i, int i2, int i3, int i4, int i5, int i6) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4, i5, i6}, 0, 6);
    }

    /* renamed from: of */
    public static ImmutableIntArray m26372of(int i, int... iArr) {
        C15794l.m25614h(iArr.length <= 2147483646, "the total number of elements must fit in an int");
        int length = iArr.length + 1;
        int[] iArr2 = new int[length];
        iArr2[0] = i;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new ImmutableIntArray(iArr2, 0, length);
    }
}
