package com.google.common.primitives;

import com.google.common.base.C15794l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class Chars$CharArrayAsList extends AbstractList<Character> implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    public final char[] array;
    public final int end;
    public final int start;

    public Chars$CharArrayAsList(char[] cArr) {
        this(cArr, 0, cArr.length);
    }

    public boolean contains(Object obj) {
        if (obj instanceof Character) {
            char[] cArr = this.array;
            char charValue = ((Character) obj).charValue();
            int i = this.start;
            int i2 = this.end;
            while (true) {
                if (i >= i2) {
                    i = -1;
                    break;
                } else if (cArr[i] == charValue) {
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
        if (!(obj instanceof Chars$CharArrayAsList)) {
            return super.equals(obj);
        }
        Chars$CharArrayAsList chars$CharArrayAsList = (Chars$CharArrayAsList) obj;
        int size = size();
        if (chars$CharArrayAsList.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.array[this.start + i] != chars$CharArrayAsList.array[chars$CharArrayAsList.start + i]) {
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
        if (obj instanceof Character) {
            char[] cArr = this.array;
            char charValue = ((Character) obj).charValue();
            int i = this.start;
            int i2 = this.end;
            while (true) {
                if (i >= i2) {
                    i = -1;
                    break;
                } else if (cArr[i] == charValue) {
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
        if (obj instanceof Character) {
            char[] cArr = this.array;
            char charValue = ((Character) obj).charValue();
            int i = this.start;
            int i2 = this.end - 1;
            while (true) {
                if (i2 < i) {
                    i2 = -1;
                    break;
                } else if (cArr[i2] == charValue) {
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

    public List<Character> subList(int i, int i2) {
        C15794l.m25619m(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        char[] cArr = this.array;
        int i3 = this.start;
        return new Chars$CharArrayAsList(cArr, i + i3, i3 + i2);
    }

    public char[] toCharArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(size() * 3);
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

    public Chars$CharArrayAsList(char[] cArr, int i, int i2) {
        this.array = cArr;
        this.start = i;
        this.end = i2;
    }

    public Character get(int i) {
        C15794l.m25616j(i, size());
        return Character.valueOf(this.array[this.start + i]);
    }

    public Character set(int i, Character ch) {
        C15794l.m25616j(i, size());
        char[] cArr = this.array;
        int i2 = this.start + i;
        char c = cArr[i2];
        ch.getClass();
        cArr[i2] = ch.charValue();
        return Character.valueOf(c);
    }
}
