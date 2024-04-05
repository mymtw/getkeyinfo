package com.paypal.pyplcheckout.addressvalidation;

import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.services.api.LocaleMetadataApi;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class AddressRepository_Factory implements C17555d<AddressRepository> {
    private final C19011a<Events> eventsProvider;
    private final C19011a<LocaleMetadataApi> localeMetadataApiProvider;
    private final C19011a<Repository> repositoryProvider;

    public AddressRepository_Factory(C19011a<Events> aVar, C19011a<Repository> aVar2, C19011a<LocaleMetadataApi> aVar3) {
        this.eventsProvider = aVar;
        this.repositoryProvider = aVar2;
        this.localeMetadataApiProvider = aVar3;
    }

    public static AddressRepository_Factory create(C19011a<Events> aVar, C19011a<Repository> aVar2, C19011a<LocaleMetadataApi> aVar3) {
        return new AddressRepository_Factory(aVar, aVar2, aVar3);
    }

    public static AddressRepository newInstance(Events events, Repository repository, LocaleMetadataApi localeMetadataApi) {
        return new AddressRepository(events, repository, localeMetadataApi);
    }

    public AddressRepository get() {
        return newInstance(this.eventsProvider.get(), this.repositoryProvider.get(), this.localeMetadataApiProvider.get());
    }
}
