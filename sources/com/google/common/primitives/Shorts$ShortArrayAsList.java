package com.google.common.primitives;

import com.google.common.base.C15794l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class Shorts$ShortArrayAsList extends AbstractList<Short> implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    public final short[] array;
    public final int end;
    public final int start;

    public Shorts$ShortArrayAsList(short[] sArr) {
        this(sArr, 0, sArr.length);
    }

    public boolean contains(@NullableDecl Object obj) {
        if (obj instanceof Short) {
            short[] sArr = this.array;
            short shortValue = ((Short) obj).shortValue();
            int i = this.start;
            int i2 = this.end;
            while (true) {
                if (i >= i2) {
                    i = -1;
                    break;
                } else if (sArr[i] == shortValue) {
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
        if (!(obj instanceof Shorts$ShortArrayAsList)) {
            return super.equals(obj);
        }
        Shorts$ShortArrayAsList shorts$ShortArrayAsList = (Shorts$ShortArrayAsList) obj;
        int size = size();
        if (shorts$ShortArrayAsList.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.array[this.start + i] != shorts$ShortArrayAsList.array[shorts$ShortArrayAsList.start + i]) {
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

    public int indexOf(@NullableDecl Object obj) {
        if (obj instanceof Short) {
            short[] sArr = this.array;
            short shortValue = ((Short) obj).shortValue();
            int i = this.start;
            int i2 = this.end;
            while (true) {
                if (i >= i2) {
                    i = -1;
                    break;
                } else if (sArr[i] == shortValue) {
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

    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj instanceof Short) {
            short[] sArr = this.array;
            short shortValue = ((Short) obj).shortValue();
            int i = this.start;
            int i2 = this.end - 1;
            while (true) {
                if (i2 < i) {
                    i2 = -1;
                    break;
                } else if (sArr[i2] == shortValue) {
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

    public List<Short> subList(int i, int i2) {
        C15794l.m25619m(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        short[] sArr = this.array;
        int i3 = this.start;
        return new Shorts$ShortArrayAsList(sArr, i + i3, i3 + i2);
    }

    public short[] toShortArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(size() * 6);
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

    public Shorts$ShortArrayAsList(short[] sArr, int i, int i2) {
        this.array = sArr;
        this.start = i;
        this.end = i2;
    }

    public Short get(int i) {
        C15794l.m25616j(i, size());
        return Short.valueOf(this.array[this.start + i]);
    }

    public Short set(int i, Short sh) {
        C15794l.m25616j(i, size());
        short[] sArr = this.array;
        int i2 = this.start + i;
        short s = sArr[i2];
        sh.getClass();
        sArr[i2] = sh.shortValue();
        return Short.valueOf(s);
    }
}
