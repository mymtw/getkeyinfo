package com.google.common.collect;

import com.google.common.base.C15784e;
import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {
    private static final long serialVersionUID = 0;
    public final C15784e<F, ? extends T> function;
    public final Ordering<T> ordering;

    public ByFunctionOrdering(C15784e<F, ? extends T> eVar, Ordering<T> ordering2) {
        eVar.getClass();
        this.function = eVar;
        ordering2.getClass();
        this.ordering = ordering2;
    }

    public int compare(F f, F f2) {
        return this.ordering.compare(this.function.apply(f), this.function.apply(f2));
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByFunctionOrdering)) {
            return false;
        }
        ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
        return this.function.equals(byFunctionOrdering.function) && this.ordering.equals(byFunctionOrdering.ordering);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.function, this.ordering});
    }

    public String toString() {
        return this.ordering + ".onResultOf(" + this.function + ")";
    }
}
