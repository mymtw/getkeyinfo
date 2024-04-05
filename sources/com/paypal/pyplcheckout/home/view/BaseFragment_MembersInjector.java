package com.paypal.pyplcheckout.home.view;

import com.paypal.pyplcheckout.events.Events;
import p634np.C18290b;
import p740eq.C19011a;

public final class BaseFragment_MembersInjector implements C18290b<BaseFragment> {
    private final C19011a<Events> eventsProvider;

    public BaseFragment_MembersInjector(C19011a<Events> aVar) {
        this.eventsProvider = aVar;
    }

    public static C18290b<BaseFragment> create(C19011a<Events> aVar) {
        return new BaseFragment_MembersInjector(aVar);
    }

    public static void injectEvents(BaseFragment baseFragment, Events events) {
        baseFragment.events = events;
    }

    public void injectMembers(BaseFragment baseFragment) {
        injectEvents(baseFragment, this.eventsProvider.get());
    }
}
