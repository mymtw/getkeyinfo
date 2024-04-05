package com.paypal.pyplcheckout.pojo;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class Checkout {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("checkoutSession")
    private final CheckoutSession checkoutSession;
    @C18417a("user")
    private final User user;

    public Checkout() {
        this((User) null, (CheckoutSession) null, (Map) null, 7, (DefaultConstructorMarker) null);
    }

    public Checkout(User user2, CheckoutSession checkoutSession2, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.user = user2;
        this.checkoutSession = checkoutSession2;
        this.additionalProperties = map;
    }

    public static /* synthetic */ Checkout copy$default(Checkout checkout, User user2, CheckoutSession checkoutSession2, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            user2 = checkout.user;
        }
        if ((i & 2) != 0) {
            checkoutSession2 = checkout.checkoutSession;
        }
        if ((i & 4) != 0) {
            map = checkout.additionalProperties;
        }
        return checkout.copy(user2, checkoutSession2, map);
    }

    public final User component1() {
        return this.user;
    }

    public final CheckoutSession component2() {
        return this.checkoutSession;
    }

    public final Map<String, Object> component3() {
        return this.additionalProperties;
    }

    public final Checkout copy(User user2, CheckoutSession checkoutSession2, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new Checkout(user2, checkoutSession2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Checkout)) {
            return false;
        }
        Checkout checkout = (Checkout) obj;
        return C19383o.m32792b(this.user, checkout.user) && C19383o.m32792b(this.checkoutSession, checkout.checkoutSession) && C19383o.m32792b(this.additionalProperties, checkout.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final CheckoutSession getCheckoutSession() {
        return this.checkoutSession;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        User user2 = this.user;
        int i = 0;
        int hashCode = (user2 == null ? 0 : user2.hashCode()) * 31;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        if (checkoutSession2 != null) {
            i = checkoutSession2.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode + i) * 31);
    }

    public String toString() {
        User user2 = this.user;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        Map<String, Object> map = this.additionalProperties;
        return "Checkout(user=" + user2 + ", checkoutSession=" + checkoutSession2 + ", additionalProperties=" + map + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Checkout(User user2, CheckoutSession checkoutSession2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : user2, (i & 2) != 0 ? null : checkoutSession2, (i & 4) != 0 ? new HashMap() : map);
    }
}
