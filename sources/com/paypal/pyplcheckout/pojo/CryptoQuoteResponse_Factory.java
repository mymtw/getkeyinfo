package com.paypal.pyplcheckout.pojo;

import dagger.internal.C17555d;
import p740eq.C19011a;

public final class CryptoQuoteResponse_Factory implements C17555d<CryptoQuoteResponse> {
    private final C19011a<CryptoData> dataProvider;

    public CryptoQuoteResponse_Factory(C19011a<CryptoData> aVar) {
        this.dataProvider = aVar;
    }

    public static CryptoQuoteResponse_Factory create(C19011a<CryptoData> aVar) {
        return new CryptoQuoteResponse_Factory(aVar);
    }

    public static CryptoQuoteResponse newInstance(CryptoData cryptoData) {
        return new CryptoQuoteResponse(cryptoData);
    }

    public CryptoQuoteResponse get() {
        return newInstance(this.dataProvider.get());
    }
}
