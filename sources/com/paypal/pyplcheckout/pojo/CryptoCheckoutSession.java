package com.paypal.pyplcheckout.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class CryptoCheckoutSession {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("cryptocurrencyQuotes")
    private final List<CryptoCurrencyQuote> cryptocurrencyQuotes;

    public CryptoCheckoutSession() {
        this((List) null, (Map) null, 3, (DefaultConstructorMarker) null);
    }

    public CryptoCheckoutSession(List<CryptoCurrencyQuote> list, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.cryptocurrencyQuotes = list;
        this.additionalProperties = map;
    }

    public static /* synthetic */ CryptoCheckoutSession copy$default(CryptoCheckoutSession cryptoCheckoutSession, List<CryptoCurrencyQuote> list, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cryptoCheckoutSession.cryptocurrencyQuotes;
        }
        if ((i & 2) != 0) {
            map = cryptoCheckoutSession.additionalProperties;
        }
        return cryptoCheckoutSession.copy(list, map);
    }

    public final List<CryptoCurrencyQuote> component1() {
        return this.cryptocurrencyQuotes;
    }

    public final Map<String, Object> component2() {
        return this.additionalProperties;
    }

    public final CryptoCheckoutSession copy(List<CryptoCurrencyQuote> list, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new CryptoCheckoutSession(list, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoCheckoutSession)) {
            return false;
        }
        CryptoCheckoutSession cryptoCheckoutSession = (CryptoCheckoutSession) obj;
        return C19383o.m32792b(this.cryptocurrencyQuotes, cryptoCheckoutSession.cryptocurrencyQuotes) && C19383o.m32792b(this.additionalProperties, cryptoCheckoutSession.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final List<CryptoCurrencyQuote> getCryptocurrencyQuotes() {
        return this.cryptocurrencyQuotes;
    }

    public int hashCode() {
        List<CryptoCurrencyQuote> list = this.cryptocurrencyQuotes;
        return this.additionalProperties.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public String toString() {
        List<CryptoCurrencyQuote> list = this.cryptocurrencyQuotes;
        Map<String, Object> map = this.additionalProperties;
        return "CryptoCheckoutSession(cryptocurrencyQuotes=" + list + ", additionalProperties=" + map + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CryptoCheckoutSession(List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? new HashMap() : map);
    }
}
