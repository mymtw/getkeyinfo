package com.google.common.primitives;

import com.google.android.material.badge.BadgeDrawable;
import com.google.common.base.C15794l;
import com.google.common.base.Converter;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class Doubles {

    /* renamed from: a */
    public static final /* synthetic */ int f36387a = 0;

    public static class DoubleArrayAsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final double[] array;
        public final int end;
        public final int start;

        public DoubleArrayAsList(double[] dArr) {
            this(dArr, 0, dArr.length);
        }

        public boolean contains(Object obj) {
            if (obj instanceof Double) {
                double[] dArr = this.array;
                double doubleValue = ((Double) obj).doubleValue();
                int i = this.start;
                int i2 = this.end;
                int i3 = Doubles.f36387a;
                while (true) {
                    if (i >= i2) {
                        i = -1;
                        break;
                    } else if (dArr[i] == doubleValue) {
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
            if (!(obj instanceof DoubleArrayAsList)) {
                return super.equals(obj);
            }
            DoubleArrayAsList doubleArrayAsList = (DoubleArrayAsList) obj;
            int size = size();
            if (doubleArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != doubleArrayAsList.array[doubleArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                double d = this.array[i2];
                int i3 = Doubles.f36387a;
                i = (i * 31) + Double.valueOf(d).hashCode();
            }
            return i;
        }

        public int indexOf(Object obj) {
            if (obj instanceof Double) {
                double[] dArr = this.array;
                double doubleValue = ((Double) obj).doubleValue();
                int i = this.start;
                int i2 = this.end;
                int i3 = Doubles.f36387a;
                while (true) {
                    if (i >= i2) {
                        i = -1;
                        break;
                    } else if (dArr[i] == doubleValue) {
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
            if (obj instanceof Double) {
                double[] dArr = this.array;
                double doubleValue = ((Double) obj).doubleValue();
                int i = this.start;
                int i2 = this.end;
                int i3 = Doubles.f36387a;
                int i4 = i2 - 1;
                while (true) {
                    if (i4 < i) {
                        i4 = -1;
                        break;
                    } else if (dArr[i4] == doubleValue) {
                        break;
                    } else {
                        i4--;
                    }
                }
                if (i4 >= 0) {
                    return i4 - this.start;
                }
            }
            return -1;
        }

        public int size() {
            return this.end - this.start;
        }

        public List<Double> subList(int i, int i2) {
            C15794l.m25619m(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            double[] dArr = this.array;
            int i3 = this.start;
            return new DoubleArrayAsList(dArr, i + i3, i3 + i2);
        }

        public double[] toDoubleArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
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

        public DoubleArrayAsList(double[] dArr, int i, int i2) {
            this.array = dArr;
            this.start = i;
            this.end = i2;
        }

        public Double get(int i) {
            C15794l.m25616j(i, size());
            return Double.valueOf(this.array[this.start + i]);
        }

        public Double set(int i, Double d) {
            C15794l.m25616j(i, size());
            double[] dArr = this.array;
            int i2 = this.start + i;
            double d2 = dArr[i2];
            d.getClass();
            dArr[i2] = d.doubleValue();
            return Double.valueOf(d2);
        }
    }

    public static final class DoubleConverter extends Converter<String, Double> implements Serializable {
        public static final DoubleConverter INSTANCE = new DoubleConverter();
        private static final long serialVersionUID = 1;

        private DoubleConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }

        public String doBackward(Double d) {
            return d.toString();
        }

        public Double doForward(String str) {
            return Double.valueOf(str);
        }
    }

    public enum LexicographicalComparator implements Comparator<double[]> {
        INSTANCE;

        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }

        public int compare(double[] dArr, double[] dArr2) {
            int min = Math.min(dArr.length, dArr2.length);
            for (int i = 0; i < min; i++) {
                int compare = Double.compare(dArr[i], dArr2[i]);
                if (compare != 0) {
                    return compare;
                }
            }
            return dArr.length - dArr2.length;
        }
    }

    static {
        Pattern.compile("[+-]?(?:NaN|Infinity|(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?|0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?)".replace("#", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX));
    }

    /* renamed from: a */
    public static boolean m26354a(double d) {
        return Double.NEGATIVE_INFINITY < d && d < Double.POSITIVE_INFINITY;
    }
}
