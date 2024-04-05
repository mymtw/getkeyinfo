package com.paypal.pyplcheckout.auth.p541ui;

import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.flavorauth.ThirdPartyAuthPresenter;
import com.paypal.pyplcheckout.home.view.BaseFragment_MembersInjector;
import p634np.C18290b;
import p740eq.C19011a;

/* renamed from: com.paypal.pyplcheckout.auth.ui.NativeAuthParentFragment_MembersInjector */
public final class NativeAuthParentFragment_MembersInjector implements C18290b<NativeAuthParentFragment> {
    private final C19011a<Events> eventsProvider;
    private final C19011a<ThirdPartyAuthPresenter> thirdPartyAuthPresenterProvider;

    public NativeAuthParentFragment_MembersInjector(C19011a<Events> aVar, C19011a<ThirdPartyAuthPresenter> aVar2) {
        this.eventsProvider = aVar;
        this.thirdPartyAuthPresenterProvider = aVar2;
    }

    public static C18290b<NativeAuthParentFragment> create(C19011a<Events> aVar, C19011a<ThirdPartyAuthPresenter> aVar2) {
        return new NativeAuthParentFragment_MembersInjector(aVar, aVar2);
    }

    public static void injectThirdPartyAuthPresenter(NativeAuthParentFragment nativeAuthParentFragment, ThirdPartyAuthPresenter thirdPartyAuthPresenter) {
        nativeAuthParentFragment.thirdPartyAuthPresenter = thirdPartyAuthPresenter;
    }

    public void injectMembers(NativeAuthParentFragment nativeAuthParentFragment) {
        BaseFragment_MembersInjector.injectEvents(nativeAuthParentFragment, this.eventsProvider.get());
        injectThirdPartyAuthPresenter(nativeAuthParentFragment, this.thirdPartyAuthPresenterProvider.get());
    }
}
