package com.paypal.pyplcheckout.addcard.usecase;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p539ab.AbManager;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;

public final class GetAddCardEnabledUseCase {
    /* access modifiers changed from: private */
    public final AbManager abManager;
    private final DebugConfigManager debugConfigManager;
    private final C19285c enabled$delegate = C19350d.m32677b(new GetAddCardEnabledUseCase$enabled$2(this));

    public GetAddCardEnabledUseCase(AbManager abManager2, DebugConfigManager debugConfigManager2) {
        C19383o.m32797g(abManager2, "abManager");
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        this.abManager = abManager2;
        this.debugConfigManager = debugConfigManager2;
    }

    private final boolean getEnabled() {
        return ((Boolean) this.enabled$delegate.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final boolean isAddCardSupported() {
        return !this.debugConfigManager.isSmartPaymentCheckout() || this.debugConfigManager.isNativeAddCardEnabled();
    }

    public final boolean invoke() {
        return getEnabled();
    }
}
