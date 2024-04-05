package com.paypal.pyplcheckout.crypto.viewmodel;

import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.fundingOptions.usecase.GetSelectedFundingOptionUseCase;
import com.paypal.pyplcheckout.services.CryptoRepository;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.services.api.CryptoQuoteTimer;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class CryptoViewModel_Factory implements C17555d<CryptoViewModel> {
    private final C19011a<CryptoQuoteTimer> cryptoQuoteTimerProvider;
    private final C19011a<CryptoRepository> cryptoRepoProvider;
    private final C19011a<Events> eventsProvider;
    private final C19011a<GetSelectedFundingOptionUseCase> getSelectedFundingOptionProvider;
    private final C19011a<Repository> repositoryProvider;

    public CryptoViewModel_Factory(C19011a<Repository> aVar, C19011a<CryptoRepository> aVar2, C19011a<Events> aVar3, C19011a<CryptoQuoteTimer> aVar4, C19011a<GetSelectedFundingOptionUseCase> aVar5) {
        this.repositoryProvider = aVar;
        this.cryptoRepoProvider = aVar2;
        this.eventsProvider = aVar3;
        this.cryptoQuoteTimerProvider = aVar4;
        this.getSelectedFundingOptionProvider = aVar5;
    }

    public static CryptoViewModel_Factory create(C19011a<Repository> aVar, C19011a<CryptoRepository> aVar2, C19011a<Events> aVar3, C19011a<CryptoQuoteTimer> aVar4, C19011a<GetSelectedFundingOptionUseCase> aVar5) {
        return new CryptoViewModel_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static CryptoViewModel newInstance(Repository repository, CryptoRepository cryptoRepository, Events events, CryptoQuoteTimer cryptoQuoteTimer, GetSelectedFundingOptionUseCase getSelectedFundingOptionUseCase) {
        return new CryptoViewModel(repository, cryptoRepository, events, cryptoQuoteTimer, getSelectedFundingOptionUseCase);
    }

    public CryptoViewModel get() {
        return newInstance(this.repositoryProvider.get(), this.cryptoRepoProvider.get(), this.eventsProvider.get(), this.cryptoQuoteTimerProvider.get(), this.getSelectedFundingOptionProvider.get());
    }
}
