package com.google.common.primitives;

import com.google.android.gms.common.api.Api;
import com.google.common.base.C15794l;
import com.google.common.primitives.Doubles;
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
public final class ImmutableDoubleArray implements Serializable {

    /* renamed from: c */
    public static final ImmutableDoubleArray f36388c = new ImmutableDoubleArray(new double[0], 0, 0);
    /* access modifiers changed from: private */
    public final double[] array;

    /* renamed from: b */
    public final transient int f36389b;
    private final int end;

    public static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private final ImmutableDoubleArray parent;

        public AsList(ImmutableDoubleArray immutableDoubleArray, C16291a aVar) {
            this.parent = immutableDoubleArray;
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
            int access$100 = this.parent.f36389b;
            for (Object next : list) {
                if (next instanceof Double) {
                    int i = access$100 + 1;
                    if (ImmutableDoubleArray.m26355a(this.parent.array[access$100], ((Double) next).doubleValue())) {
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
            if (obj instanceof Double) {
                return this.parent.indexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return this.parent.lastIndexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        public int size() {
            return this.parent.length();
        }

        public List<Double> subList(int i, int i2) {
            return this.parent.subArray(i, i2).asList();
        }

        public String toString() {
            return this.parent.toString();
        }

        public Double get(int i) {
            return Double.valueOf(this.parent.get(i));
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: com.google.common.primitives.ImmutableDoubleArray$b */
    public static final class C16292b {

        /* renamed from: a */
        public double[] f36390a;

        /* renamed from: b */
        public int f36391b = 0;

        public C16292b(int i) {
            this.f36390a = new double[i];
        }

        /* renamed from: a */
        public final void mo58054a(int i) {
            int i2 = this.f36391b + i;
            double[] dArr = this.f36390a;
            if (i2 > dArr.length) {
                int length = dArr.length;
                if (i2 >= 0) {
                    int i3 = length + (length >> 1) + 1;
                    if (i3 < i2) {
                        i3 = Integer.highestOneBit(i2 - 1) << 1;
                    }
                    if (i3 < 0) {
                        i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    }
                    double[] dArr2 = new double[i3];
                    System.arraycopy(this.f36390a, 0, dArr2, 0, this.f36391b);
                    this.f36390a = dArr2;
                    return;
                }
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
    }

    /* renamed from: a */
    public static boolean m26355a(double d, double d2) {
        return Double.doubleToLongBits(d) == Double.doubleToLongBits(d2);
    }

    public static C16292b builder(int i) {
        C15794l.m25609c(i, "Invalid initialCapacity: %s", i >= 0);
        return new C16292b(i);
    }

    public static ImmutableDoubleArray copyOf(double[] dArr) {
        if (dArr.length == 0) {
            return f36388c;
        }
        return new ImmutableDoubleArray(Arrays.copyOf(dArr, dArr.length));
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m26356of() {
        return f36388c;
    }

    public List<Double> asList() {
        return new AsList(this, (C16291a) null);
    }

    public boolean contains(double d) {
        return indexOf(d) >= 0;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
        if (length() != immutableDoubleArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (!m26355a(get(i), immutableDoubleArray.get(i))) {
                return false;
            }
        }
        return true;
    }

    public double get(int i) {
        C15794l.m25616j(i, length());
        return this.array[this.f36389b + i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.f36389b; i2 < this.end; i2++) {
            double d = this.array[i2];
            int i3 = Doubles.f36387a;
            i = (i * 31) + Double.valueOf(d).hashCode();
        }
        return i;
    }

    public int indexOf(double d) {
        for (int i = this.f36389b; i < this.end; i++) {
            if (m26355a(this.array[i], d)) {
                return i - this.f36389b;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.f36389b;
    }

    public int lastIndexOf(double d) {
        int i = this.end;
        while (true) {
            i--;
            if (i < this.f36389b) {
                return -1;
            }
            if (m26355a(this.array[i], d)) {
                return i - this.f36389b;
            }
        }
    }

    public int length() {
        return this.end - this.f36389b;
    }

    public Object readResolve() {
        return isEmpty() ? f36388c : this;
    }

    public ImmutableDoubleArray subArray(int i, int i2) {
        C15794l.m25619m(i, i2, length());
        if (i == i2) {
            return f36388c;
        }
        double[] dArr = this.array;
        int i3 = this.f36389b;
        return new ImmutableDoubleArray(dArr, i + i3, i3 + i2);
    }

    public double[] toArray() {
        return Arrays.copyOfRange(this.array, this.f36389b, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(length() * 5);
        sb.append('[');
        sb.append(this.array[this.f36389b]);
        int i = this.f36389b;
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

    public ImmutableDoubleArray trimmed() {
        return this.f36389b > 0 || this.end < this.array.length ? new ImmutableDoubleArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    public ImmutableDoubleArray(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m26357of(double d) {
        return new ImmutableDoubleArray(new double[]{d}, 0, 1);
    }

    public ImmutableDoubleArray(double[] dArr, int i, int i2) {
        this.array = dArr;
        this.f36389b = i;
        this.end = i2;
    }

    public static C16292b builder() {
        return new C16292b(10);
    }

    public static ImmutableDoubleArray copyOf(Collection<Double> collection) {
        double[] dArr;
        if (collection.isEmpty()) {
            return f36388c;
        }
        int i = Doubles.f36387a;
        if (collection instanceof Doubles.DoubleArrayAsList) {
            dArr = ((Doubles.DoubleArrayAsList) collection).toDoubleArray();
        } else {
            Object[] array2 = collection.toArray();
            int length = array2.length;
            double[] dArr2 = new double[length];
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = array2[i2];
                obj.getClass();
                dArr2[i2] = ((Number) obj).doubleValue();
            }
            dArr = dArr2;
        }
        return new ImmutableDoubleArray(dArr);
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m26358of(double d, double d2) {
        return new ImmutableDoubleArray(new double[]{d, d2}, 0, 2);
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m26359of(double d, double d2, double d3) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3}, 0, 3);
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m26360of(double d, double d2, double d3, double d4) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3, d4}, 0, 4);
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m26361of(double d, double d2, double d3, double d4, double d5) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3, d4, d5}, 0, 5);
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m26362of(double d, double d2, double d3, double d4, double d5, double d6) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3, d4, d5, d6}, 0, 6);
    }

    public static ImmutableDoubleArray copyOf(Iterable<Double> iterable) {
        boolean z = iterable instanceof Collection;
        if (z) {
            return copyOf((Collection<Double>) (Collection) iterable);
        }
        C16292b builder = builder();
        builder.getClass();
        if (z) {
            Collection<Double> collection = (Collection) iterable;
            builder.mo58054a(collection.size());
            for (Double doubleValue : collection) {
                double[] dArr = builder.f36390a;
                int i = builder.f36391b;
                builder.f36391b = i + 1;
                dArr[i] = doubleValue.doubleValue();
            }
        } else {
            for (Double doubleValue2 : iterable) {
                double doubleValue3 = doubleValue2.doubleValue();
                builder.mo58054a(1);
                double[] dArr2 = builder.f36390a;
                int i2 = builder.f36391b;
                dArr2[i2] = doubleValue3;
                builder.f36391b = i2 + 1;
            }
        }
        int i3 = builder.f36391b;
        return i3 == 0 ? f36388c : new ImmutableDoubleArray(builder.f36390a, 0, i3);
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m26363of(double d, double... dArr) {
        C15794l.m25614h(dArr.length <= 2147483646, "the total number of elements must fit in an int");
        int length = dArr.length + 1;
        double[] dArr2 = new double[length];
        dArr2[0] = d;
        System.arraycopy(dArr, 0, dArr2, 1, dArr.length);
        return new ImmutableDoubleArray(dArr2, 0, length);
    }
}
