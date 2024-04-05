package com.paypal.pyplcheckout.services.api;

import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.services.CryptoRepository;
import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class CryptoQuoteTimer_Factory implements C17555d<CryptoQuoteTimer> {
    private final C19011a<CryptoRepository> cryptoRepoProvider;
    private final C19011a<Events> eventsProvider;
    private final C19011a<Repository> repositoryProvider;

    public CryptoQuoteTimer_Factory(C19011a<Repository> aVar, C19011a<CryptoRepository> aVar2, C19011a<Events> aVar3) {
        this.repositoryProvider = aVar;
        this.cryptoRepoProvider = aVar2;
        this.eventsProvider = aVar3;
    }

    public static CryptoQuoteTimer_Factory create(C19011a<Repository> aVar, C19011a<CryptoRepository> aVar2, C19011a<Events> aVar3) {
        return new CryptoQuoteTimer_Factory(aVar, aVar2, aVar3);
    }

    public static CryptoQuoteTimer newInstance(Repository repository, CryptoRepository cryptoRepository, Events events) {
        return new CryptoQuoteTimer(repository, cryptoRepository, events);
    }

    public CryptoQuoteTimer get() {
        return newInstance(this.repositoryProvider.get(), this.cryptoRepoProvider.get(), this.eventsProvider.get());
    }
}
