package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p650pn.C18417a;

public final class SepaMandateAcceptanceNeeded {
    @C18417a("id")

    /* renamed from: id */
    private final String f37794id;

    public SepaMandateAcceptanceNeeded(String str) {
        this.f37794id = str;
    }

    public static /* synthetic */ SepaMandateAcceptanceNeeded copy$default(SepaMandateAcceptanceNeeded sepaMandateAcceptanceNeeded, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sepaMandateAcceptanceNeeded.f37794id;
        }
        return sepaMandateAcceptanceNeeded.copy(str);
    }

    public final String component1() {
        return this.f37794id;
    }

    public final SepaMandateAcceptanceNeeded copy(String str) {
        return new SepaMandateAcceptanceNeeded(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SepaMandateAcceptanceNeeded) && C19383o.m32792b(this.f37794id, ((SepaMandateAcceptanceNeeded) obj).f37794id);
    }

    public final String getId() {
        return this.f37794id;
    }

    public int hashCode() {
        String str = this.f37794id;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return C0048b.m163a("SepaMandateAcceptanceNeeded(id=", this.f37794id, ")");
    }
}
