package com.paypal.pyplcheckout.addshipping;

import com.google.gson.C16708i;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p539ab.AbManager;
import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class AddressAutoCompleteViewModel_Factory implements C17555d<AddressAutoCompleteViewModel> {
    private final C19011a<AbManager> abManagerProvider;
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<Events> eventsProvider;
    private final C19011a<C16708i> gsonProvider;
    private final C19011a<Repository> repositoryProvider;

    public AddressAutoCompleteViewModel_Factory(C19011a<Repository> aVar, C19011a<AbManager> aVar2, C19011a<Events> aVar3, C19011a<C16708i> aVar4, C19011a<DebugConfigManager> aVar5) {
        this.repositoryProvider = aVar;
        this.abManagerProvider = aVar2;
        this.eventsProvider = aVar3;
        this.gsonProvider = aVar4;
        this.debugConfigManagerProvider = aVar5;
    }

    public static AddressAutoCompleteViewModel_Factory create(C19011a<Repository> aVar, C19011a<AbManager> aVar2, C19011a<Events> aVar3, C19011a<C16708i> aVar4, C19011a<DebugConfigManager> aVar5) {
        return new AddressAutoCompleteViewModel_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static AddressAutoCompleteViewModel newInstance(Repository repository, AbManager abManager, Events events, C16708i iVar, DebugConfigManager debugConfigManager) {
        return new AddressAutoCompleteViewModel(repository, abManager, events, iVar, debugConfigManager);
    }

    public AddressAutoCompleteViewModel get() {
        return newInstance(this.repositoryProvider.get(), this.abManagerProvider.get(), this.eventsProvider.get(), this.gsonProvider.get(), this.debugConfigManagerProvider.get());
    }
}
