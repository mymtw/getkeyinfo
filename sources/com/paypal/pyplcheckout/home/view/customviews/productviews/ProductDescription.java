package com.paypal.pyplcheckout.home.view.customviews.productviews;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;

public final class ProductDescription {
    private final String description;

    public ProductDescription(String str) {
        C19383o.m32797g(str, "description");
        this.description = str;
    }

    public static /* synthetic */ ProductDescription copy$default(ProductDescription productDescription, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productDescription.description;
        }
        return productDescription.copy(str);
    }

    public final String component1() {
        return this.description;
    }

    public final ProductDescription copy(String str) {
        C19383o.m32797g(str, "description");
        return new ProductDescription(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductDescription) && C19383o.m32792b(this.description, ((ProductDescription) obj).description);
    }

    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return this.description.hashCode();
    }

    public String toString() {
        return C0048b.m163a("ProductDescription(description=", this.description, ")");
    }
}
