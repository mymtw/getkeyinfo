package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p650pn.C18417a;

public final class Resolution {
    @C18417a("name")
    private final String name;

    public Resolution(String str) {
        this.name = str;
    }

    public static /* synthetic */ Resolution copy$default(Resolution resolution, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resolution.name;
        }
        return resolution.copy(str);
    }

    public final String component1() {
        return this.name;
    }

    public final Resolution copy(String str) {
        return new Resolution(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Resolution) && C19383o.m32792b(this.name, ((Resolution) obj).name);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return C0048b.m163a("Resolution(name=", this.name, ")");
    }
}
