package com.paypal.pyplcheckout.services.api;

import dagger.internal.C17555d;
import java.util.Locale;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import okhttp3.C20011u;
import p740eq.C19011a;

public final class LocaleMetadataApi_Factory implements C17555d<LocaleMetadataApi> {
    private final C19011a<C20009t> authenticatedOkHttpClientProvider;
    private final C19011a<Locale> deviceLocaleProvider;
    private final C19011a<CoroutineDispatcher> dispatcherProvider;
    private final C19011a<C20011u.C20012a> requestBuilderProvider;

    public LocaleMetadataApi_Factory(C19011a<C20011u.C20012a> aVar, C19011a<CoroutineDispatcher> aVar2, C19011a<C20009t> aVar3, C19011a<Locale> aVar4) {
        this.requestBuilderProvider = aVar;
        this.dispatcherProvider = aVar2;
        this.authenticatedOkHttpClientProvider = aVar3;
        this.deviceLocaleProvider = aVar4;
    }

    public static LocaleMetadataApi_Factory create(C19011a<C20011u.C20012a> aVar, C19011a<CoroutineDispatcher> aVar2, C19011a<C20009t> aVar3, C19011a<Locale> aVar4) {
        return new LocaleMetadataApi_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static LocaleMetadataApi newInstance(C20011u.C20012a aVar, CoroutineDispatcher coroutineDispatcher, C20009t tVar, Locale locale) {
        return new LocaleMetadataApi(aVar, coroutineDispatcher, tVar, locale);
    }

    public LocaleMetadataApi get() {
        return newInstance(this.requestBuilderProvider.get(), this.dispatcherProvider.get(), this.authenticatedOkHttpClientProvider.get(), this.deviceLocaleProvider.get());
    }
}
