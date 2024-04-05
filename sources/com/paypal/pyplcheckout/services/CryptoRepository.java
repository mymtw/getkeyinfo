package com.paypal.pyplcheckout.services;

import com.paypal.pyplcheckout.pojo.CryptoCurrencyHoldingDetails;
import com.paypal.pyplcheckout.pojo.CryptoCurrencyQuote;
import com.paypal.pyplcheckout.pojo.FundingInstrument;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.services.api.CryptoCurrencyApi;
import com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory;
import com.paypal.pyplcheckout.services.callbacks.CryptoCurrencyQuoteCallback;
import com.paypal.pyplcheckout.utils.PaymentTypes;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;

public final class CryptoRepository {
    private List<CryptoCurrencyQuote> cryptoQuotes;
    private boolean isCryptoCurrencyConsentAccepted;
    private final Repository repository;

    public CryptoRepository(Repository repository2) {
        C19383o.m32797g(repository2, "repository");
        this.repository = repository2;
    }

    public final void fetchCryptoCurrencyQuotes(JSONArray jSONArray, String str, CryptoCurrencyQuoteCallback cryptoCurrencyQuoteCallback) {
        C19383o.m32797g(jSONArray, "symbols");
        C19383o.m32797g(cryptoCurrencyQuoteCallback, "cryptoCurrencyQuoteCallback");
        CryptoCurrencyApi create = AuthenticatedApiFactory.Companion.getCryptocurrencyApiFactory().create();
        create.setSymbols(jSONArray);
        if (str != null) {
            create.setCurrencyValue(str);
        }
        create.enqueueRequest(cryptoCurrencyQuoteCallback);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r0.getAssetPrice();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getCryptoQuote() {
        /*
            r6 = this;
            com.paypal.pyplcheckout.pojo.CryptoCurrencyQuote r0 = r6.getSelectedCryptoQuote()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            goto L_0x000e
        L_0x0008:
            com.paypal.pyplcheckout.pojo.Amount r2 = r0.getAssetPrice()
            if (r2 != 0) goto L_0x0010
        L_0x000e:
            r2 = r1
            goto L_0x0014
        L_0x0010:
            java.lang.String r2 = r2.getCurrencyFormat()
        L_0x0014:
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            if (r0 != 0) goto L_0x001b
            goto L_0x001f
        L_0x001b:
            java.lang.String r1 = r0.getSymbol()
        L_0x001f:
            r4[r5] = r1
            r0 = 1
            r4[r0] = r2
            java.lang.String r0 = "1 %s = %s"
            java.lang.String r1 = "format(format, *args)"
            java.lang.String r0 = androidx.compose.animation.C0388a.m1049e(r4, r3, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.CryptoRepository.getCryptoQuote():java.lang.String");
    }

    public final List<CryptoCurrencyQuote> getCryptoQuotes() {
        return this.cryptoQuotes;
    }

    public final String getCryptoSymbol() {
        FundingInstrument fundingInstrument;
        CryptoCurrencyHoldingDetails cryptocurrencyHoldingDetails;
        FundingOption selectedFundingOption = this.repository.getSelectedFundingOption();
        if (selectedFundingOption == null || (fundingInstrument = selectedFundingOption.getFundingInstrument()) == null || (cryptocurrencyHoldingDetails = fundingInstrument.getCryptocurrencyHoldingDetails()) == null) {
            return null;
        }
        return cryptocurrencyHoldingDetails.getSymbol();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r0 = (r0 = r0.getFundingInstrument()).getCryptocurrencyHoldingDetails();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.paypal.pyplcheckout.pojo.CryptoCurrencyQuote getSelectedCryptoQuote() {
        /*
            r5 = this;
            com.paypal.pyplcheckout.services.Repository r0 = r5.repository
            com.paypal.pyplcheckout.pojo.FundingOption r0 = r0.getSelectedFundingOption()
            r1 = 0
            if (r0 != 0) goto L_0x000b
        L_0x0009:
            r0 = r1
            goto L_0x001d
        L_0x000b:
            com.paypal.pyplcheckout.pojo.FundingInstrument r0 = r0.getFundingInstrument()
            if (r0 != 0) goto L_0x0012
            goto L_0x0009
        L_0x0012:
            com.paypal.pyplcheckout.pojo.CryptoCurrencyHoldingDetails r0 = r0.getCryptocurrencyHoldingDetails()
            if (r0 != 0) goto L_0x0019
            goto L_0x0009
        L_0x0019:
            java.lang.String r0 = r0.getSymbol()
        L_0x001d:
            java.util.List r2 = r5.getCryptoQuotes()
            if (r2 != 0) goto L_0x0024
            goto L_0x0042
        L_0x0024:
            java.util.Iterator r2 = r2.iterator()
        L_0x0028:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0040
            java.lang.Object r3 = r2.next()
            r4 = r3
            com.paypal.pyplcheckout.pojo.CryptoCurrencyQuote r4 = (com.paypal.pyplcheckout.pojo.CryptoCurrencyQuote) r4
            java.lang.String r4 = r4.getSymbol()
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r0)
            if (r4 == 0) goto L_0x0028
            r1 = r3
        L_0x0040:
            com.paypal.pyplcheckout.pojo.CryptoCurrencyQuote r1 = (com.paypal.pyplcheckout.pojo.CryptoCurrencyQuote) r1
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.CryptoRepository.getSelectedCryptoQuote():com.paypal.pyplcheckout.pojo.CryptoCurrencyQuote");
    }

    public final boolean isCryptoCurrencyConsentAccepted() {
        return this.isCryptoCurrencyConsentAccepted;
    }

    public final void setCryptoCurrencyConsentAccepted(boolean z) {
        this.isCryptoCurrencyConsentAccepted = z;
    }

    public final void setCryptoQuotes(List<CryptoCurrencyQuote> list) {
        C19383o.m32797g(list, "cryptoQuotes");
        this.cryptoQuotes = list;
    }

    public final boolean shouldShowCryptoCurrencyExchangeView() {
        FundingInstrument fundingInstrument;
        PaymentTypes paymentTypes = PaymentTypes.CRYPTOCURRENCY;
        FundingOption selectedFundingOption = this.repository.getSelectedFundingOption();
        String str = null;
        if (!(selectedFundingOption == null || (fundingInstrument = selectedFundingOption.getFundingInstrument()) == null)) {
            str = fundingInstrument.getType();
        }
        return paymentTypes.equals(str, true);
    }
}
