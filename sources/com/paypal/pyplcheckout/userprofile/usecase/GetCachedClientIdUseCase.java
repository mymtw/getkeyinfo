package com.paypal.pyplcheckout.userprofile.usecase;

import com.paypal.pyplcheckout.userprofile.dao.ClientIdRepository;
import kotlin.jvm.internal.C19383o;

public final class GetCachedClientIdUseCase {
    private final ClientIdRepository clientIdRepository;

    public GetCachedClientIdUseCase(ClientIdRepository clientIdRepository2) {
        C19383o.m32797g(clientIdRepository2, "clientIdRepository");
        this.clientIdRepository = clientIdRepository2;
    }

    public final boolean invoke() {
        return this.clientIdRepository.getCachedClientId();
    }
}
