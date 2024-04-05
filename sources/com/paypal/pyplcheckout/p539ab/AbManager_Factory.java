package com.paypal.pyplcheckout.p539ab;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import dagger.internal.C17555d;
import p740eq.C19011a;

/* renamed from: com.paypal.pyplcheckout.ab.AbManager_Factory */
public final class AbManager_Factory implements C17555d<AbManager> {
    private final C19011a<C17172Ab> abProvider;
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;

    public AbManager_Factory(C19011a<C17172Ab> aVar, C19011a<DebugConfigManager> aVar2) {
        this.abProvider = aVar;
        this.debugConfigManagerProvider = aVar2;
    }

    public static AbManager_Factory create(C19011a<C17172Ab> aVar, C19011a<DebugConfigManager> aVar2) {
        return new AbManager_Factory(aVar, aVar2);
    }

    public static AbManager newInstance(C17172Ab ab, DebugConfigManager debugConfigManager) {
        return new AbManager(ab, debugConfigManager);
    }

    public AbManager get() {
        return newInstance(this.abProvider.get(), this.debugConfigManagerProvider.get());
    }
}
