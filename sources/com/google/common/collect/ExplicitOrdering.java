package com.google.common.collect;

import android.support.p013v4.media.C0072d;
import com.google.common.collect.Ordering;
import java.io.Serializable;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class ExplicitOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final ImmutableMap<T, Integer> rankMap;

    public ExplicitOrdering(List<T> list) {
        this(Maps.m26055c(list));
    }

    public int compare(T t, T t2) {
        Integer num = this.rankMap.get(t);
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = this.rankMap.get(t2);
            if (num2 != null) {
                return intValue - num2.intValue();
            }
            throw new Ordering.IncomparableValueException(t2);
        }
        throw new Ordering.IncomparableValueException(t);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof ExplicitOrdering) {
            return this.rankMap.equals(((ExplicitOrdering) obj).rankMap);
        }
        return false;
    }

    public int hashCode() {
        return this.rankMap.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Ordering.explicit(");
        h.append(this.rankMap.keySet());
        h.append(")");
        return h.toString();
    }

    public ExplicitOrdering(ImmutableMap<T, Integer> immutableMap) {
        this.rankMap = immutableMap;
    }
}
