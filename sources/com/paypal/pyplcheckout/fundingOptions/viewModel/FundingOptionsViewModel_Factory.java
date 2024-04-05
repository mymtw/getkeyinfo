package com.paypal.pyplcheckout.fundingOptions.viewModel;

import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.services.CryptoRepository;
import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class FundingOptionsViewModel_Factory implements C17555d<FundingOptionsViewModel> {
    private final C19011a<CryptoRepository> cryptoRepoProvider;
    private final C19011a<Events> eventsProvider;
    private final C19011a<Repository> repositoryProvider;

    public FundingOptionsViewModel_Factory(C19011a<Events> aVar, C19011a<Repository> aVar2, C19011a<CryptoRepository> aVar3) {
        this.eventsProvider = aVar;
        this.repositoryProvider = aVar2;
        this.cryptoRepoProvider = aVar3;
    }

    public static FundingOptionsViewModel_Factory create(C19011a<Events> aVar, C19011a<Repository> aVar2, C19011a<CryptoRepository> aVar3) {
        return new FundingOptionsViewModel_Factory(aVar, aVar2, aVar3);
    }

    public static FundingOptionsViewModel newInstance(Events events, Repository repository, CryptoRepository cryptoRepository) {
        return new FundingOptionsViewModel(events, repository, cryptoRepository);
    }

    public FundingOptionsViewModel get() {
        return newInstance(this.eventsProvider.get(), this.repositoryProvider.get(), this.cryptoRepoProvider.get());
    }
}
