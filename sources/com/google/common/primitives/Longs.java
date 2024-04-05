package com.google.common.primitives;

import com.google.common.base.C15794l;
import com.google.common.base.Converter;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class Longs {

    public enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        public String toString() {
            return "Longs.lexicographicalComparator()";
        }

        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i = 0; i < min; i++) {
                int i2 = (jArr[i] > jArr2[i] ? 1 : (jArr[i] == jArr2[i] ? 0 : -1));
                int i3 = i2 < 0 ? -1 : i2 > 0 ? 1 : 0;
                if (i3 != 0) {
                    return i3;
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    public static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final long[] array;
        public final int end;
        public final int start;

        public LongArrayAsList(long[] jArr) {
            this(jArr, 0, jArr.length);
        }

        public boolean contains(Object obj) {
            if (obj instanceof Long) {
                long[] jArr = this.array;
                long longValue = ((Long) obj).longValue();
                int i = this.start;
                int i2 = this.end;
                while (true) {
                    if (i >= i2) {
                        i = -1;
                        break;
                    } else if (jArr[i] == longValue) {
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
            if (!(obj instanceof LongArrayAsList)) {
                return super.equals(obj);
            }
            LongArrayAsList longArrayAsList = (LongArrayAsList) obj;
            int size = size();
            if (longArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != longArrayAsList.array[longArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                i = (i * 31) + Longs.m26387b(this.array[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            if (obj instanceof Long) {
                long[] jArr = this.array;
                long longValue = ((Long) obj).longValue();
                int i = this.start;
                int i2 = this.end;
                while (true) {
                    if (i >= i2) {
                        i = -1;
                        break;
                    } else if (jArr[i] == longValue) {
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
            if (obj instanceof Long) {
                long[] jArr = this.array;
                long longValue = ((Long) obj).longValue();
                int i = this.start;
                int i2 = this.end - 1;
                while (true) {
                    if (i2 < i) {
                        i2 = -1;
                        break;
                    } else if (jArr[i2] == longValue) {
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

        public List<Long> subList(int i, int i2) {
            C15794l.m25619m(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            long[] jArr = this.array;
            int i3 = this.start;
            return new LongArrayAsList(jArr, i + i3, i3 + i2);
        }

        public long[] toLongArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
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

        public LongArrayAsList(long[] jArr, int i, int i2) {
            this.array = jArr;
            this.start = i;
            this.end = i2;
        }

        public Long get(int i) {
            C15794l.m25616j(i, size());
            return Long.valueOf(this.array[this.start + i]);
        }

        public Long set(int i, Long l) {
            C15794l.m25616j(i, size());
            long[] jArr = this.array;
            int i2 = this.start + i;
            long j = jArr[i2];
            l.getClass();
            jArr[i2] = l.longValue();
            return Long.valueOf(j);
        }
    }

    public static final class LongConverter extends Converter<String, Long> implements Serializable {
        public static final LongConverter INSTANCE = new LongConverter();
        private static final long serialVersionUID = 1;

        private LongConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Longs.stringConverter()";
        }

        public String doBackward(Long l) {
            return l.toString();
        }

        public Long doForward(String str) {
            return Long.decode(str);
        }
    }

    /* renamed from: a */
    public static long m26386a(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) b8) & 255);
    }

    /* renamed from: b */
    public static int m26387b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
