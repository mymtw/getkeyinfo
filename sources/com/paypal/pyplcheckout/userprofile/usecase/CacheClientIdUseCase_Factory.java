package com.paypal.pyplcheckout.userprofile.usecase;

import com.paypal.pyplcheckout.userprofile.dao.ClientIdRepository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class CacheClientIdUseCase_Factory implements C17555d<CacheClientIdUseCase> {
    private final C19011a<ClientIdRepository> clientIdRepositoryProvider;

    public CacheClientIdUseCase_Factory(C19011a<ClientIdRepository> aVar) {
        this.clientIdRepositoryProvider = aVar;
    }

    public static CacheClientIdUseCase_Factory create(C19011a<ClientIdRepository> aVar) {
        return new CacheClientIdUseCase_Factory(aVar);
    }

    public static CacheClientIdUseCase newInstance(ClientIdRepository clientIdRepository) {
        return new CacheClientIdUseCase(clientIdRepository);
    }

    public CacheClientIdUseCase get() {
        return newInstance(this.clientIdRepositoryProvider.get());
    }
}
