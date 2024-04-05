package com.paypal.pyplcheckout.crypto.viewmodel;

import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState;
import com.paypal.pyplcheckout.fundingOptions.usecase.GetSelectedFundingOptionUseCase;
import com.paypal.pyplcheckout.p539ab.featureflag.Feature;
import com.paypal.pyplcheckout.p539ab.featureflag.FeatureFlagManager;
import com.paypal.pyplcheckout.pojo.FundingInstrument;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.services.CryptoRepository;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.services.api.CryptoQuoteTimer;
import com.paypal.pyplcheckout.services.api.ICryptoQuoteTimer;
import com.paypal.pyplcheckout.viewmodels.BaseViewModel;
import kotlin.jvm.internal.C19383o;

public final class CryptoViewModel extends BaseViewModel implements C2857f {
    private final CryptoQuoteTimer cryptoQuoteTimer;
    private final CryptoRepository cryptoRepo;
    private final Events events;
    private final GetSelectedFundingOptionUseCase getSelectedFundingOption;
    private final Repository repository;

    public CryptoViewModel(Repository repository2, CryptoRepository cryptoRepository, Events events2, CryptoQuoteTimer cryptoQuoteTimer2, GetSelectedFundingOptionUseCase getSelectedFundingOptionUseCase) {
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(cryptoRepository, "cryptoRepo");
        C19383o.m32797g(events2, "events");
        C19383o.m32797g(cryptoQuoteTimer2, "cryptoQuoteTimer");
        C19383o.m32797g(getSelectedFundingOptionUseCase, "getSelectedFundingOption");
        this.repository = repository2;
        this.cryptoRepo = cryptoRepository;
        this.events = events2;
        this.cryptoQuoteTimer = cryptoQuoteTimer2;
        this.getSelectedFundingOption = getSelectedFundingOptionUseCase;
    }

    public final String getCryptoLabel() {
        FundingInstrument fundingInstrument;
        FundingOption selectedFundingOption = this.repository.getSelectedFundingOption();
        String str = null;
        if (!(selectedFundingOption == null || (fundingInstrument = selectedFundingOption.getFundingInstrument()) == null)) {
            str = fundingInstrument.getLabel();
        }
        return str == null ? "" : str;
    }

    public final boolean isCryptoCurrencyConsentAccepted() {
        return this.cryptoRepo.isCryptoCurrencyConsentAccepted();
    }

    public final boolean isCryptoPayment() {
        return this.getSelectedFundingOption.invoke().getValue() instanceof SelectedOptionState.Crypto;
    }

    public /* bridge */ /* synthetic */ void onCreate(C2887s sVar) {
    }

    public /* bridge */ /* synthetic */ void onDestroy(C2887s sVar) {
    }

    public void onPause(C2887s sVar) {
        C19383o.m32797g(sVar, ResponseConstants.OWNER);
        if (FeatureFlagManager.isEnabled$default(Feature.CRYPTO_PAYMENTS, false, 2, (Object) null).isEnabled()) {
            this.cryptoQuoteTimer.stop();
        }
    }

    public void onResume(C2887s sVar) {
        C19383o.m32797g(sVar, ResponseConstants.OWNER);
        if (FeatureFlagManager.isEnabled$default(Feature.CRYPTO_PAYMENTS, false, 2, (Object) null).isEnabled()) {
            ICryptoQuoteTimer.DefaultImpls.start$default(this.cryptoQuoteTimer, 0, 1, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ void onStart(C2887s sVar) {
    }

    public /* bridge */ /* synthetic */ void onStop(C2887s sVar) {
    }
}
