package com.paypal.pyplcheckout.userprofile.usecase;

import com.paypal.pyplcheckout.userprofile.dao.ClientIdRepository;
import kotlin.jvm.internal.C19383o;

public final class CacheClientIdUseCase {
    private final ClientIdRepository clientIdRepository;

    public CacheClientIdUseCase(ClientIdRepository clientIdRepository2) {
        C19383o.m32797g(clientIdRepository2, "clientIdRepository");
        this.clientIdRepository = clientIdRepository2;
    }

    public final void invoke() {
        this.clientIdRepository.cacheClientIdChanged();
    }
}
