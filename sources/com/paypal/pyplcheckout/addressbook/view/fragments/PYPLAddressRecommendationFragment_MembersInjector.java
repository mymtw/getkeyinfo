package com.paypal.pyplcheckout.addressbook.view.fragments;

import androidx.lifecycle.C2870k0;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.home.view.BaseFragment_MembersInjector;
import p634np.C18290b;
import p740eq.C19011a;

public final class PYPLAddressRecommendationFragment_MembersInjector implements C18290b<PYPLAddressRecommendationFragment> {
    private final C19011a<Events> eventsProvider;
    private final C19011a<C2870k0.C2872b> factoryProvider;

    public PYPLAddressRecommendationFragment_MembersInjector(C19011a<Events> aVar, C19011a<C2870k0.C2872b> aVar2) {
        this.eventsProvider = aVar;
        this.factoryProvider = aVar2;
    }

    public static C18290b<PYPLAddressRecommendationFragment> create(C19011a<Events> aVar, C19011a<C2870k0.C2872b> aVar2) {
        return new PYPLAddressRecommendationFragment_MembersInjector(aVar, aVar2);
    }

    public static void injectFactory(PYPLAddressRecommendationFragment pYPLAddressRecommendationFragment, C2870k0.C2872b bVar) {
        pYPLAddressRecommendationFragment.factory = bVar;
    }

    public void injectMembers(PYPLAddressRecommendationFragment pYPLAddressRecommendationFragment) {
        BaseFragment_MembersInjector.injectEvents(pYPLAddressRecommendationFragment, this.eventsProvider.get());
        injectFactory(pYPLAddressRecommendationFragment, this.factoryProvider.get());
    }
}
