package com.google.common.base;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class Functions$FunctionComposition<A, B, C> implements C15784e<A, C>, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: f */
    private final C15784e<A, ? extends B> f35548f;

    /* renamed from: g */
    private final C15784e<B, C> f35549g;

    public Functions$FunctionComposition(C15784e<B, C> eVar, C15784e<A, ? extends B> eVar2) {
        eVar.getClass();
        this.f35549g = eVar;
        eVar2.getClass();
        this.f35548f = eVar2;
    }

    public C apply(@NullableDecl A a) {
        return this.f35549g.apply(this.f35548f.apply(a));
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof Functions$FunctionComposition)) {
            return false;
        }
        Functions$FunctionComposition functions$FunctionComposition = (Functions$FunctionComposition) obj;
        return this.f35548f.equals(functions$FunctionComposition.f35548f) && this.f35549g.equals(functions$FunctionComposition.f35549g);
    }

    public int hashCode() {
        return this.f35548f.hashCode() ^ this.f35549g.hashCode();
    }

    public String toString() {
        return this.f35549g + "(" + this.f35548f + ")";
    }
}
