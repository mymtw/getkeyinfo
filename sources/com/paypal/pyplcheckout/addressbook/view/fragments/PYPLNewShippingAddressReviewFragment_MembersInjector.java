package com.paypal.pyplcheckout.addressbook.view.fragments;

import androidx.lifecycle.C2870k0;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.home.view.BaseFragment_MembersInjector;
import p634np.C18290b;
import p740eq.C19011a;

public final class PYPLNewShippingAddressReviewFragment_MembersInjector implements C18290b<PYPLNewShippingAddressReviewFragment> {
    private final C19011a<Events> eventsProvider;
    private final C19011a<C2870k0.C2872b> factoryProvider;

    public PYPLNewShippingAddressReviewFragment_MembersInjector(C19011a<Events> aVar, C19011a<C2870k0.C2872b> aVar2) {
        this.eventsProvider = aVar;
        this.factoryProvider = aVar2;
    }

    public static C18290b<PYPLNewShippingAddressReviewFragment> create(C19011a<Events> aVar, C19011a<C2870k0.C2872b> aVar2) {
        return new PYPLNewShippingAddressReviewFragment_MembersInjector(aVar, aVar2);
    }

    public static void injectFactory(PYPLNewShippingAddressReviewFragment pYPLNewShippingAddressReviewFragment, C2870k0.C2872b bVar) {
        pYPLNewShippingAddressReviewFragment.factory = bVar;
    }

    public void injectMembers(PYPLNewShippingAddressReviewFragment pYPLNewShippingAddressReviewFragment) {
        BaseFragment_MembersInjector.injectEvents(pYPLNewShippingAddressReviewFragment, this.eventsProvider.get());
        injectFactory(pYPLNewShippingAddressReviewFragment, this.factoryProvider.get());
    }
}
