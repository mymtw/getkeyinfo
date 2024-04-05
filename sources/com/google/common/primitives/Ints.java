package com.google.common.primitives;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.gms.common.api.Api;
import com.google.common.base.C15794l;
import com.google.common.base.Converter;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class Ints {

    public static class IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final int[] array;
        public final int end;
        public final int start;

        public IntArrayAsList(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        public boolean contains(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.array;
                int intValue = ((Integer) obj).intValue();
                int i = this.start;
                int i2 = this.end;
                while (true) {
                    if (i >= i2) {
                        i = -1;
                        break;
                    } else if (iArr[i] == intValue) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IntArrayAsList)) {
                return super.equals(obj);
            }
            IntArrayAsList intArrayAsList = (IntArrayAsList) obj;
            int size = size();
            if (intArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != intArrayAsList.array[intArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                i = (i * 31) + this.array[i2];
            }
            return i;
        }

        public int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.array;
                int intValue = ((Integer) obj).intValue();
                int i = this.start;
                int i2 = this.end;
                while (true) {
                    if (i >= i2) {
                        i = -1;
                        break;
                    } else if (iArr[i] == intValue) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    return i - this.start;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.array;
                int intValue = ((Integer) obj).intValue();
                int i = this.start;
                int i2 = this.end - 1;
                while (true) {
                    if (i2 < i) {
                        i2 = -1;
                        break;
                    } else if (iArr[i2] == intValue) {
                        break;
                    } else {
                        i2--;
                    }
                }
                if (i2 >= 0) {
                    return i2 - this.start;
                }
            }
            return -1;
        }

        public int size() {
            return this.end - this.start;
        }

        public List<Integer> subList(int i, int i2) {
            C15794l.m25619m(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.array;
            int i3 = this.start;
            return new IntArrayAsList(iArr, i + i3, i3 + i2);
        }

        public int[] toIntArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.array[this.start]);
            int i = this.start;
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

        public IntArrayAsList(int[] iArr, int i, int i2) {
            this.array = iArr;
            this.start = i;
            this.end = i2;
        }

        public Integer get(int i) {
            C15794l.m25616j(i, size());
            return Integer.valueOf(this.array[this.start + i]);
        }

        public Integer set(int i, Integer num) {
            C15794l.m25616j(i, size());
            int[] iArr = this.array;
            int i2 = this.start + i;
            int i3 = iArr[i2];
            num.getClass();
            iArr[i2] = num.intValue();
            return Integer.valueOf(i3);
        }
    }

    public static final class IntConverter extends Converter<String, Integer> implements Serializable {
        public static final IntConverter INSTANCE = new IntConverter();
        private static final long serialVersionUID = 1;

        private IntConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Ints.stringConverter()";
        }

        public String doBackward(Integer num) {
            return num.toString();
        }

        public Integer doForward(String str) {
            return Integer.decode(str);
        }
    }

    public enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        public String toString() {
            return "Ints.lexicographicalComparator()";
        }

        public int compare(int[] iArr, int[] iArr2) {
            int min = Math.min(iArr.length, iArr2.length);
            for (int i = 0; i < min; i++) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                int i4 = i2 < i3 ? -1 : i2 > i3 ? 1 : 0;
                if (i4 != 0) {
                    return i4;
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    /* renamed from: a */
    public static int m26383a(long j) {
        int i = (int) j;
        C15794l.m25610d(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    /* renamed from: b */
    public static int m26384b(long j) {
        if (j > ParserMinimalBase.MAX_INT_L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (j < ParserMinimalBase.MIN_INT_L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: c */
    public static int[] m26385c(Collection<? extends Number> collection) {
        if (collection instanceof IntArrayAsList) {
            return ((IntArrayAsList) collection).toIntArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
