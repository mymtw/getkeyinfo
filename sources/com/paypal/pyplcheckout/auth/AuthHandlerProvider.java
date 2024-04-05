package com.paypal.pyplcheckout.auth;

import com.paypal.pyplcheckout.data.repositories.AuthRepository;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import kotlin.jvm.internal.C19383o;

public final class AuthHandlerProvider {
    private final AuthRepository authRepository;
    private final PYPLCheckoutUtils pyplCheckoutUtils;
    private final Repository repository;

    public AuthHandlerProvider(Repository repository2, AuthRepository authRepository2, PYPLCheckoutUtils pYPLCheckoutUtils) {
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(authRepository2, "authRepository");
        C19383o.m32797g(pYPLCheckoutUtils, "pyplCheckoutUtils");
        this.repository = repository2;
        this.authRepository = authRepository2;
        this.pyplCheckoutUtils = pYPLCheckoutUtils;
    }

    public final AuthHandler create() {
        return new AuthHandler(this.repository, this.authRepository, this.pyplCheckoutUtils);
    }
}
