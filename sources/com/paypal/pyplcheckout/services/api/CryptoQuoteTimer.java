package com.paypal.pyplcheckout.services.api;

import com.paypal.pyplcheckout.billingagreements.view.customview.C17198a;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.pojo.CryptoCheckoutSession;
import com.paypal.pyplcheckout.pojo.CryptoCurrencyHoldingDetails;
import com.paypal.pyplcheckout.pojo.CryptoCurrencyQuote;
import com.paypal.pyplcheckout.pojo.CryptoData;
import com.paypal.pyplcheckout.pojo.CryptoQuoteResponse;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.services.CryptoRepository;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.services.callbacks.CryptoCurrencyQuoteCallback;
import java.util.List;
import java.util.Timer;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;

public final class CryptoQuoteTimer implements ICryptoQuoteTimer {
    private final CryptoRepository cryptoRepo;
    private final Events events;
    private boolean firstCall = true;
    private final EventListener listener = new C17198a(this, 9);
    private final Repository repository;
    private Timer timer = new Timer(true);
    private boolean waiting;

    public CryptoQuoteTimer(Repository repository2, CryptoRepository cryptoRepository, Events events2) {
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(cryptoRepository, "cryptoRepo");
        C19383o.m32797g(events2, "events");
        this.repository = repository2;
        this.cryptoRepo = cryptoRepository;
        this.events = events2;
    }

    /* access modifiers changed from: private */
    /* renamed from: listener$lambda-0  reason: not valid java name */
    public static final void m35423listener$lambda0(CryptoQuoteTimer cryptoQuoteTimer, EventType eventType, ResultData resultData) {
        C19383o.m32797g(cryptoQuoteTimer, "this$0");
        CryptoQuoteResponse cryptoQuoteResponse = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        if (data instanceof CryptoQuoteResponse) {
            cryptoQuoteResponse = (CryptoQuoteResponse) data;
        }
        cryptoQuoteTimer.handleResponse(cryptoQuoteResponse);
    }

    public void fetchResponse() {
        if (!this.waiting) {
            JSONArray jSONArray = new JSONArray();
            List<FundingOption> fundingOptions = this.repository.getFundingOptions();
            if (fundingOptions != null) {
                for (FundingOption fundingInstrument : fundingOptions) {
                    CryptoCurrencyHoldingDetails cryptocurrencyHoldingDetails = fundingInstrument.getFundingInstrument().getCryptocurrencyHoldingDetails();
                    if (cryptocurrencyHoldingDetails != null) {
                        jSONArray.put(cryptocurrencyHoldingDetails.getSymbol());
                    }
                }
            }
            if (jSONArray.length() > 0) {
                this.cryptoRepo.fetchCryptoCurrencyQuotes(jSONArray, this.repository.getTotalCurrencyValue(), CryptoCurrencyQuoteCallback.Companion.get());
                this.waiting = true;
            }
        }
    }

    public final boolean getWaiting$pyplcheckout_externalThreedsRelease() {
        return this.waiting;
    }

    public void handleResponse(CryptoQuoteResponse cryptoQuoteResponse) {
        CryptoData data;
        CryptoCheckoutSession checkoutSession;
        List<CryptoCurrencyQuote> list = null;
        if ((cryptoQuoteResponse == null ? null : cryptoQuoteResponse.getErrors()) != null) {
            PEnums.ErrorType errorType = PEnums.ErrorType.WARNING;
            PEnums.EventCode eventCode = PEnums.EventCode.E649;
            String firstError = cryptoQuoteResponse.getFirstError();
            if (firstError == null) {
                firstError = "";
            }
            PLog.error$default(errorType, eventCode, "Crypto quote response failed", firstError, (Throwable) null, PEnums.TransitionName.CRYPTO_QUOTE_CALL, PEnums.StateName.PAY_WITH_CRYPTO, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1936, (Object) null);
        } else if (this.firstCall) {
            PLog.impression$default(PEnums.TransitionName.CRYPTO_QUOTE_CALL, PEnums.Outcome.SUCCESS, PEnums.EventCode.E650, PEnums.StateName.PAY_WITH_CRYPTO, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
        }
        if (!(cryptoQuoteResponse == null || (data = cryptoQuoteResponse.getData()) == null || (checkoutSession = data.getCheckoutSession()) == null)) {
            list = checkoutSession.getCryptocurrencyQuotes();
        }
        if (list != null) {
            this.cryptoRepo.setCryptoQuotes(list);
        }
        this.waiting = false;
        this.firstCall = false;
    }

    public final void setWaiting$pyplcheckout_externalThreedsRelease(boolean z) {
        this.waiting = z;
    }

    public void start(long j) {
        Timer timer2 = new Timer(true);
        this.timer = timer2;
        timer2.scheduleAtFixedRate(new CryptoQuoteTimer$start$1(this), 0, j);
        this.events.listen(PayPalEventTypes.FINISHED_CRYPTO_QUOTE_RESPONSE, this.listener);
    }

    public void stop() {
        this.timer.cancel();
        this.events.removeListener(PayPalEventTypes.FINISHED_CRYPTO_QUOTE_RESPONSE, this.listener);
        this.waiting = false;
    }
}
