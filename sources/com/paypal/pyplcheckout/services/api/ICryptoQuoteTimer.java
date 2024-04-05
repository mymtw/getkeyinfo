package com.paypal.pyplcheckout.services.api;

import com.paypal.pyplcheckout.pojo.CryptoQuoteResponse;

public interface ICryptoQuoteTimer {

    public static final class DefaultImpls {
        public static /* synthetic */ void start$default(ICryptoQuoteTimer iCryptoQuoteTimer, long j, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    j = 3000;
                }
                iCryptoQuoteTimer.start(j);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
        }
    }

    void fetchResponse();

    void handleResponse(CryptoQuoteResponse cryptoQuoteResponse);

    void start(long j);

    void stop();
}
