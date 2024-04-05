package com.paypal.checkout.order;

import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class Payments {
    private final List<Authorization> authorizations;
    private final List<Capture> captures;

    public Payments(List<Capture> list, List<Authorization> list2) {
        C19383o.m32797g(list, "captures");
        C19383o.m32797g(list2, "authorizations");
        this.captures = list;
        this.authorizations = list2;
    }

    public static /* synthetic */ Payments copy$default(Payments payments, List<Capture> list, List<Authorization> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = payments.captures;
        }
        if ((i & 2) != 0) {
            list2 = payments.authorizations;
        }
        return payments.copy(list, list2);
    }

    public final List<Capture> component1() {
        return this.captures;
    }

    public final List<Authorization> component2() {
        return this.authorizations;
    }

    public final Payments copy(List<Capture> list, List<Authorization> list2) {
        C19383o.m32797g(list, "captures");
        C19383o.m32797g(list2, "authorizations");
        return new Payments(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Payments)) {
            return false;
        }
        Payments payments = (Payments) obj;
        return C19383o.m32792b(this.captures, payments.captures) && C19383o.m32792b(this.authorizations, payments.authorizations);
    }

    public final List<Authorization> getAuthorizations() {
        return this.authorizations;
    }

    public final List<Capture> getCaptures() {
        return this.captures;
    }

    public int hashCode() {
        return this.authorizations.hashCode() + (this.captures.hashCode() * 31);
    }

    public String toString() {
        List<Capture> list = this.captures;
        List<Authorization> list2 = this.authorizations;
        return "Payments(captures=" + list + ", authorizations=" + list2 + ")";
    }
}
