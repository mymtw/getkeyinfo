package com.etsy.android.lib.requests;

import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.logger.C8694h;
import dagger.internal.C17555d;
import p456ua.C13461f;
import p486y9.C13888d;
import p740eq.C19011a;

public final class LocaleRequest_Factory implements C17555d<LocaleRequest> {
    private final C19011a<C8629a> appCurrencyProvider;
    private final C19011a<C13888d> currentLocaleProvider;
    private final C19011a<LocaleRepository> localeRepositoryProvider;
    private final C19011a<C8694h> logcatProvider;
    private final C19011a<C13461f> schedulersProvider;

    public LocaleRequest_Factory(C19011a<C8629a> aVar, C19011a<C13888d> aVar2, C19011a<LocaleRepository> aVar3, C19011a<C13461f> aVar4, C19011a<C8694h> aVar5) {
        this.appCurrencyProvider = aVar;
        this.currentLocaleProvider = aVar2;
        this.localeRepositoryProvider = aVar3;
        this.schedulersProvider = aVar4;
        this.logcatProvider = aVar5;
    }

    public static LocaleRequest_Factory create(C19011a<C8629a> aVar, C19011a<C13888d> aVar2, C19011a<LocaleRepository> aVar3, C19011a<C13461f> aVar4, C19011a<C8694h> aVar5) {
        return new LocaleRequest_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static LocaleRequest newInstance(C8629a aVar, C13888d dVar, LocaleRepository localeRepository, C13461f fVar, C8694h hVar) {
        return new LocaleRequest(aVar, dVar, localeRepository, fVar, hVar);
    }

    public LocaleRequest get() {
        return newInstance(this.appCurrencyProvider.get(), this.currentLocaleProvider.get(), this.localeRepositoryProvider.get(), this.schedulersProvider.get(), this.logcatProvider.get());
    }
}
