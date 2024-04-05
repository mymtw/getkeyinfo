package com.paypal.pyplcheckout.services.api;

import java.util.TimerTask;

public final class CryptoQuoteTimer$start$1 extends TimerTask {
    public final /* synthetic */ CryptoQuoteTimer this$0;

    public CryptoQuoteTimer$start$1(CryptoQuoteTimer cryptoQuoteTimer) {
        this.this$0 = cryptoQuoteTimer;
    }

    public void run() {
        this.this$0.fetchResponse();
    }
}
