package com.etsy.android.lib.requests;

import com.etsy.android.lib.network.C8731g;
import dagger.internal.C17555d;
import p568fn.C17782b;
import p740eq.C19011a;

public final class SaveLocaleModule_ProvidesLocaleEndpointFactory implements C17555d<LocaleEndpoint> {
    private final SaveLocaleModule module;
    private final C19011a<C8731g> retrofitProvider;

    public SaveLocaleModule_ProvidesLocaleEndpointFactory(SaveLocaleModule saveLocaleModule, C19011a<C8731g> aVar) {
        this.module = saveLocaleModule;
        this.retrofitProvider = aVar;
    }

    public static SaveLocaleModule_ProvidesLocaleEndpointFactory create(SaveLocaleModule saveLocaleModule, C19011a<C8731g> aVar) {
        return new SaveLocaleModule_ProvidesLocaleEndpointFactory(saveLocaleModule, aVar);
    }

    public static LocaleEndpoint providesLocaleEndpoint(SaveLocaleModule saveLocaleModule, C8731g gVar) {
        LocaleEndpoint providesLocaleEndpoint = saveLocaleModule.providesLocaleEndpoint(gVar);
        C17782b.m29841G(providesLocaleEndpoint);
        return providesLocaleEndpoint;
    }

    public LocaleEndpoint get() {
        return providesLocaleEndpoint(this.module, this.retrofitProvider.get());
    }
}
