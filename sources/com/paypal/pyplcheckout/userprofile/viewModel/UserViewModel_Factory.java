package com.paypal.pyplcheckout.userprofile.viewModel;

import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class UserViewModel_Factory implements C17555d<UserViewModel> {
    private final C19011a<Events> eventsProvider;
    private final C19011a<PYPLCheckoutUtils> pyplCheckoutUtilsProvider;
    private final C19011a<Repository> repositoryProvider;

    public UserViewModel_Factory(C19011a<Events> aVar, C19011a<Repository> aVar2, C19011a<PYPLCheckoutUtils> aVar3) {
        this.eventsProvider = aVar;
        this.repositoryProvider = aVar2;
        this.pyplCheckoutUtilsProvider = aVar3;
    }

    public static UserViewModel_Factory create(C19011a<Events> aVar, C19011a<Repository> aVar2, C19011a<PYPLCheckoutUtils> aVar3) {
        return new UserViewModel_Factory(aVar, aVar2, aVar3);
    }

    public static UserViewModel newInstance(Events events, Repository repository, PYPLCheckoutUtils pYPLCheckoutUtils) {
        return new UserViewModel(events, repository, pYPLCheckoutUtils);
    }

    public UserViewModel get() {
        return newInstance(this.eventsProvider.get(), this.repositoryProvider.get(), this.pyplCheckoutUtilsProvider.get());
    }
}
