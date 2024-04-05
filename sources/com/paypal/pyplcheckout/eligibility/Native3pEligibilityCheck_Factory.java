package com.paypal.pyplcheckout.eligibility;

import com.paypal.pyplcheckout.p539ab.AbManager;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class Native3pEligibilityCheck_Factory implements C17555d<Native3pEligibilityCheck> {
    private final C19011a<AbManager> abManagerProvider;

    public Native3pEligibilityCheck_Factory(C19011a<AbManager> aVar) {
        this.abManagerProvider = aVar;
    }

    public static Native3pEligibilityCheck_Factory create(C19011a<AbManager> aVar) {
        return new Native3pEligibilityCheck_Factory(aVar);
    }

    public static Native3pEligibilityCheck newInstance(AbManager abManager) {
        return new Native3pEligibilityCheck(abManager);
    }

    public Native3pEligibilityCheck get() {
        return newInstance(this.abManagerProvider.get());
    }
}
