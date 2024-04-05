package com.paypal.pyplcheckout.userprofile.usecase;

import com.paypal.pyplcheckout.userprofile.dao.ClientIdRepository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class GetCachedClientIdUseCase_Factory implements C17555d<GetCachedClientIdUseCase> {
    private final C19011a<ClientIdRepository> clientIdRepositoryProvider;

    public GetCachedClientIdUseCase_Factory(C19011a<ClientIdRepository> aVar) {
        this.clientIdRepositoryProvider = aVar;
    }

    public static GetCachedClientIdUseCase_Factory create(C19011a<ClientIdRepository> aVar) {
        return new GetCachedClientIdUseCase_Factory(aVar);
    }

    public static GetCachedClientIdUseCase newInstance(ClientIdRepository clientIdRepository) {
        return new GetCachedClientIdUseCase(clientIdRepository);
    }

    public GetCachedClientIdUseCase get() {
        return newInstance(this.clientIdRepositoryProvider.get());
    }
}
