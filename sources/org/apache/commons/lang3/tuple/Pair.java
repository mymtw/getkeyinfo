package org.apache.commons.lang3.tuple;

import androidx.appcompat.widget.C0326j;
import java.io.Serializable;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.builder.CompareToBuilder;

public abstract class Pair<L, R> implements Map.Entry<L, R>, Comparable<Pair<L, R>>, Serializable {
    private static final long serialVersionUID = 4954918890077093841L;

    /* renamed from: of */
    public static <L, R> Pair<L, R> m34305of(L l, R r) {
        return new ImmutablePair(l, r);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ObjectUtils.equals(getKey(), entry.getKey()) && ObjectUtils.equals(getValue(), entry.getValue());
    }

    public final L getKey() {
        return getLeft();
    }

    public abstract L getLeft();

    public abstract R getRight();

    public R getValue() {
        return getRight();
    }

    public int hashCode() {
        int i = 0;
        int hashCode = getKey() == null ? 0 : getKey().hashCode();
        if (getValue() != null) {
            i = getValue().hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder k = C0326j.m866k('(');
        k.append(getLeft());
        k.append(',');
        k.append(getRight());
        k.append(')');
        return k.toString();
    }

    public int compareTo(Pair<L, R> pair) {
        return new CompareToBuilder().append(getLeft(), (Object) pair.getLeft()).append(getRight(), (Object) pair.getRight()).toComparison();
    }

    public String toString(String str) {
        return String.format(str, new Object[]{getLeft(), getRight()});
    }
}
