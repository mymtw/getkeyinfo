package com.paypal.pyplcheckout.home.view.fragments;

import androidx.lifecycle.C2870k0;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.home.view.BaseFragment_MembersInjector;
import com.paypal.pyplcheckout.shippingcallbacks.ShippingCallbackHandler;
import p634np.C18290b;
import p740eq.C19011a;

public final class HomeFragment_MembersInjector implements C18290b<HomeFragment> {
    private final C19011a<Events> eventsProvider;
    private final C19011a<C2870k0.C2872b> factoryProvider;
    private final C19011a<ShippingCallbackHandler> shippingCallbackHandlerProvider;

    public HomeFragment_MembersInjector(C19011a<Events> aVar, C19011a<C2870k0.C2872b> aVar2, C19011a<ShippingCallbackHandler> aVar3) {
        this.eventsProvider = aVar;
        this.factoryProvider = aVar2;
        this.shippingCallbackHandlerProvider = aVar3;
    }

    public static C18290b<HomeFragment> create(C19011a<Events> aVar, C19011a<C2870k0.C2872b> aVar2, C19011a<ShippingCallbackHandler> aVar3) {
        return new HomeFragment_MembersInjector(aVar, aVar2, aVar3);
    }

    public static void injectFactory(HomeFragment homeFragment, C2870k0.C2872b bVar) {
        homeFragment.factory = bVar;
    }

    public static void injectShippingCallbackHandler(HomeFragment homeFragment, ShippingCallbackHandler shippingCallbackHandler) {
        homeFragment.shippingCallbackHandler = shippingCallbackHandler;
    }

    public void injectMembers(HomeFragment homeFragment) {
        BaseFragment_MembersInjector.injectEvents(homeFragment, this.eventsProvider.get());
        injectFactory(homeFragment, this.factoryProvider.get());
        injectShippingCallbackHandler(homeFragment, this.shippingCallbackHandlerProvider.get());
    }
}
