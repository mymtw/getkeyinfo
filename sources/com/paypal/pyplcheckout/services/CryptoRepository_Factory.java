package com.paypal.pyplcheckout.services;

import dagger.internal.C17555d;
import p740eq.C19011a;

public final class CryptoRepository_Factory implements C17555d<CryptoRepository> {
    private final C19011a<Repository> repositoryProvider;

    public CryptoRepository_Factory(C19011a<Repository> aVar) {
        this.repositoryProvider = aVar;
    }

    public static CryptoRepository_Factory create(C19011a<Repository> aVar) {
        return new CryptoRepository_Factory(aVar);
    }

    public static CryptoRepository newInstance(Repository repository) {
        return new CryptoRepository(repository);
    }

    public CryptoRepository get() {
        return newInstance(this.repositoryProvider.get());
    }
}
