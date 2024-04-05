package com.paypal.pyplcheckout.pojo;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class CryptoData {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("checkoutSession")
    private final CryptoCheckoutSession checkoutSession;

    public CryptoData() {
        this((CryptoCheckoutSession) null, (Map) null, 3, (DefaultConstructorMarker) null);
    }

    public CryptoData(CryptoCheckoutSession cryptoCheckoutSession, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.checkoutSession = cryptoCheckoutSession;
        this.additionalProperties = map;
    }

    public static /* synthetic */ CryptoData copy$default(CryptoData cryptoData, CryptoCheckoutSession cryptoCheckoutSession, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoCheckoutSession = cryptoData.checkoutSession;
        }
        if ((i & 2) != 0) {
            map = cryptoData.additionalProperties;
        }
        return cryptoData.copy(cryptoCheckoutSession, map);
    }

    public final CryptoCheckoutSession component1() {
        return this.checkoutSession;
    }

    public final Map<String, Object> component2() {
        return this.additionalProperties;
    }

    public final CryptoData copy(CryptoCheckoutSession cryptoCheckoutSession, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new CryptoData(cryptoCheckoutSession, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoData)) {
            return false;
        }
        CryptoData cryptoData = (CryptoData) obj;
        return C19383o.m32792b(this.checkoutSession, cryptoData.checkoutSession) && C19383o.m32792b(this.additionalProperties, cryptoData.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final CryptoCheckoutSession getCheckoutSession() {
        return this.checkoutSession;
    }

    public int hashCode() {
        CryptoCheckoutSession cryptoCheckoutSession = this.checkoutSession;
        return this.additionalProperties.hashCode() + ((cryptoCheckoutSession == null ? 0 : cryptoCheckoutSession.hashCode()) * 31);
    }

    public String toString() {
        CryptoCheckoutSession cryptoCheckoutSession = this.checkoutSession;
        Map<String, Object> map = this.additionalProperties;
        return "CryptoData(checkoutSession=" + cryptoCheckoutSession + ", additionalProperties=" + map + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CryptoData(CryptoCheckoutSession cryptoCheckoutSession, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoCheckoutSession, (i & 2) != 0 ? new HashMap() : map);
    }
}
