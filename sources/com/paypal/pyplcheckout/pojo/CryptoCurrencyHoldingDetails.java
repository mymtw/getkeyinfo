package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;
import p650pn.C18417a;

public final class CryptoCurrencyHoldingDetails {
    private final CryptocurrencySymbol knownSymbol;
    @C18417a("quantity")
    private final String quantity;
    @C18417a("symbol")
    private final String symbol;

    public CryptoCurrencyHoldingDetails() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public CryptoCurrencyHoldingDetails(String str, String str2) {
        CryptocurrencySymbol cryptocurrencySymbol;
        this.symbol = str;
        this.quantity = str2;
        CryptocurrencySymbol[] values = CryptocurrencySymbol.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cryptocurrencySymbol = null;
                break;
            }
            cryptocurrencySymbol = values[i];
            i++;
            if (C19383o.m32792b(cryptocurrencySymbol.name(), getSymbol())) {
                break;
            }
        }
        this.knownSymbol = cryptocurrencySymbol;
    }

    public static /* synthetic */ CryptoCurrencyHoldingDetails copy$default(CryptoCurrencyHoldingDetails cryptoCurrencyHoldingDetails, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoCurrencyHoldingDetails.symbol;
        }
        if ((i & 2) != 0) {
            str2 = cryptoCurrencyHoldingDetails.quantity;
        }
        return cryptoCurrencyHoldingDetails.copy(str, str2);
    }

    public final String component1() {
        return this.symbol;
    }

    public final String component2() {
        return this.quantity;
    }

    public final CryptoCurrencyHoldingDetails copy(String str, String str2) {
        return new CryptoCurrencyHoldingDetails(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoCurrencyHoldingDetails)) {
            return false;
        }
        CryptoCurrencyHoldingDetails cryptoCurrencyHoldingDetails = (CryptoCurrencyHoldingDetails) obj;
        return C19383o.m32792b(this.symbol, cryptoCurrencyHoldingDetails.symbol) && C19383o.m32792b(this.quantity, cryptoCurrencyHoldingDetails.quantity);
    }

    public final CryptocurrencySymbol getKnownSymbol() {
        return this.knownSymbol;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.quantity;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return C0048b.m164c("CryptoCurrencyHoldingDetails(symbol=", this.symbol, ", quantity=", this.quantity, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CryptoCurrencyHoldingDetails(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
