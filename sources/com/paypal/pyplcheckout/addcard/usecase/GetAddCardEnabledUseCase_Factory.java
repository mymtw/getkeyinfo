package com.paypal.pyplcheckout.addcard.usecase;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p539ab.AbManager;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class GetAddCardEnabledUseCase_Factory implements C17555d<GetAddCardEnabledUseCase> {
    private final C19011a<AbManager> abManagerProvider;
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;

    public GetAddCardEnabledUseCase_Factory(C19011a<AbManager> aVar, C19011a<DebugConfigManager> aVar2) {
        this.abManagerProvider = aVar;
        this.debugConfigManagerProvider = aVar2;
    }

    public static GetAddCardEnabledUseCase_Factory create(C19011a<AbManager> aVar, C19011a<DebugConfigManager> aVar2) {
        return new GetAddCardEnabledUseCase_Factory(aVar, aVar2);
    }

    public static GetAddCardEnabledUseCase newInstance(AbManager abManager, DebugConfigManager debugConfigManager) {
        return new GetAddCardEnabledUseCase(abManager, debugConfigManager);
    }

    public GetAddCardEnabledUseCase get() {
        return newInstance(this.abManagerProvider.get(), this.debugConfigManagerProvider.get());
    }
}
