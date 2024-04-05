package com.etsy.android.lib.requests;

import com.squareup.moshi.C17414y;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class LocaleRepository_Factory implements C17555d<LocaleRepository> {
    private final C19011a<LocaleEndpoint> endpointProvider;
    private final C19011a<C17414y> moshiProvider;

    public LocaleRepository_Factory(C19011a<LocaleEndpoint> aVar, C19011a<C17414y> aVar2) {
        this.endpointProvider = aVar;
        this.moshiProvider = aVar2;
    }

    public static LocaleRepository_Factory create(C19011a<LocaleEndpoint> aVar, C19011a<C17414y> aVar2) {
        return new LocaleRepository_Factory(aVar, aVar2);
    }

    public static LocaleRepository newInstance(LocaleEndpoint localeEndpoint, C17414y yVar) {
        return new LocaleRepository(localeEndpoint, yVar);
    }

    public LocaleRepository get() {
        return newInstance(this.endpointProvider.get(), this.moshiProvider.get());
    }
}
