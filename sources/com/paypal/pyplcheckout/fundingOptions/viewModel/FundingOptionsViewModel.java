package com.paypal.pyplcheckout.fundingOptions.viewModel;

import androidx.lifecycle.C2866i0;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.pojo.CryptoCurrencyQuote;
import com.paypal.pyplcheckout.pojo.FundingInstrument;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.services.CryptoRepository;
import com.paypal.pyplcheckout.services.Repository;
import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class FundingOptionsViewModel extends C2866i0 {
    private final CryptoRepository cryptoRepo;
    private final Events events;
    private final Repository repository;

    public FundingOptionsViewModel(Events events2, Repository repository2, CryptoRepository cryptoRepository) {
        C19383o.m32797g(events2, "events");
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(cryptoRepository, "cryptoRepo");
        this.events = events2;
        this.repository = repository2;
        this.cryptoRepo = cryptoRepository;
    }

    public final List<FundingOption> fetchFundingOptionsList() {
        return this.repository.getFundingOptions();
    }

    public final FundingInstrument getBackupFundingOption() {
        return this.repository.getBackupFunding();
    }

    public final int getCarouselPosition() {
        return this.repository.getFundingOptionsCarouselPosition();
    }

    public final String getCryptoCurrencyCode() {
        return this.repository.getTotalCurrencyCode();
    }

    public final String getCryptoCurrencyExchangeRate() {
        return this.cryptoRepo.getCryptoQuote();
    }

    public final String getCryptoCurrencyValue() {
        CryptoCurrencyQuote selectedCryptoQuote = this.cryptoRepo.getSelectedCryptoQuote();
        if (selectedCryptoQuote == null) {
            return null;
        }
        return selectedCryptoQuote.getQuantity();
    }

    public final String getSelectedCryptoCurrencySymbol() {
        return this.cryptoRepo.getCryptoSymbol();
    }

    public final FundingOption getSelectedFundingOption() {
        return this.repository.getSelectedFundingOption();
    }

    public final String getSelectedFundingOptionType() {
        return this.repository.getSelectedFundingOptionType();
    }

    public final String getSelectingFILabel() {
        return this.repository.getCardLabel();
    }

    public final boolean isCryptoConsentAccepted() {
        return this.cryptoRepo.isCryptoCurrencyConsentAccepted();
    }

    public final void setCarouselPosition(int i) {
        this.repository.setFundingOptionsCarouselPosition(i);
    }

    public final void setCryptoConsentAccepted(boolean z) {
        this.cryptoRepo.setCryptoCurrencyConsentAccepted(z);
    }

    public final void setSelectedFundingOption(FundingOption fundingOption) {
        this.repository.setSelectedFundingOption(fundingOption);
    }

    public final boolean shouldShowCryptoCurrencyView() {
        return this.cryptoRepo.shouldShowCryptoCurrencyExchangeView();
    }

    public final void setSelectedFundingOption(int i) {
        this.repository.setSelectedFundingOption(i);
    }
}
