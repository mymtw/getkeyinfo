package com.google.common.primitives;

import com.google.common.base.C15794l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class Bytes$ByteArrayAsList extends AbstractList<Byte> implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    public final byte[] array;
    public final int end;
    public final int start;

    public Bytes$ByteArrayAsList(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public boolean contains(Object obj) {
        if (obj instanceof Byte) {
            byte[] bArr = this.array;
            byte byteValue = ((Byte) obj).byteValue();
            int i = this.start;
            int i2 = this.end;
            while (true) {
                if (i >= i2) {
                    i = -1;
                    break;
                } else if (bArr[i] == byteValue) {
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
        if (!(obj instanceof Bytes$ByteArrayAsList)) {
            return super.equals(obj);
        }
        Bytes$ByteArrayAsList bytes$ByteArrayAsList = (Bytes$ByteArrayAsList) obj;
        int size = size();
        if (bytes$ByteArrayAsList.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.array[this.start + i] != bytes$ByteArrayAsList.array[bytes$ByteArrayAsList.start + i]) {
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
        if (obj instanceof Byte) {
            byte[] bArr = this.array;
            byte byteValue = ((Byte) obj).byteValue();
            int i = this.start;
            int i2 = this.end;
            while (true) {
                if (i >= i2) {
                    i = -1;
                    break;
                } else if (bArr[i] == byteValue) {
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
        if (obj instanceof Byte) {
            byte[] bArr = this.array;
            byte byteValue = ((Byte) obj).byteValue();
            int i = this.start;
            int i2 = this.end - 1;
            while (true) {
                if (i2 < i) {
                    i2 = -1;
                    break;
                } else if (bArr[i2] == byteValue) {
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

    public List<Byte> subList(int i, int i2) {
        C15794l.m25619m(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        byte[] bArr = this.array;
        int i3 = this.start;
        return new Bytes$ByteArrayAsList(bArr, i + i3, i3 + i2);
    }

    public byte[] toByteArray() {
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

    public Bytes$ByteArrayAsList(byte[] bArr, int i, int i2) {
        this.array = bArr;
        this.start = i;
        this.end = i2;
    }

    public Byte get(int i) {
        C15794l.m25616j(i, size());
        return Byte.valueOf(this.array[this.start + i]);
    }

    public Byte set(int i, Byte b) {
        C15794l.m25616j(i, size());
        byte[] bArr = this.array;
        int i2 = this.start + i;
        byte b2 = bArr[i2];
        b.getClass();
        bArr[i2] = b.byteValue();
        return Byte.valueOf(b2);
    }
}
