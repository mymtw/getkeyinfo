package com.paypal.pyplcheckout.services.callbacks;

import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.p539ab.AbManager;
import p634np.C18290b;
import p740eq.C19011a;

public final class ApprovePaymentCallback_MembersInjector implements C18290b<ApprovePaymentCallback> {
    private final C19011a<AbManager> abManagerProvider;
    private final C19011a<Events> eventsProvider;

    public ApprovePaymentCallback_MembersInjector(C19011a<AbManager> aVar, C19011a<Events> aVar2) {
        this.abManagerProvider = aVar;
        this.eventsProvider = aVar2;
    }

    public static C18290b<ApprovePaymentCallback> create(C19011a<AbManager> aVar, C19011a<Events> aVar2) {
        return new ApprovePaymentCallback_MembersInjector(aVar, aVar2);
    }

    public void injectMembers(ApprovePaymentCallback approvePaymentCallback) {
        BaseCallback_MembersInjector.injectAbManager(approvePaymentCallback, this.abManagerProvider.get());
        BaseCallback_MembersInjector.injectEvents(approvePaymentCallback, this.eventsProvider.get());
    }
}
