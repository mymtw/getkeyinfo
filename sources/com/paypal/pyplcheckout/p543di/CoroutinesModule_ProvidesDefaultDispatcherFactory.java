package com.paypal.pyplcheckout.p543di;

import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.CoroutinesModule_ProvidesDefaultDispatcherFactory */
public final class CoroutinesModule_ProvidesDefaultDispatcherFactory implements C17555d<CoroutineDispatcher> {
    private final CoroutinesModule module;

    public CoroutinesModule_ProvidesDefaultDispatcherFactory(CoroutinesModule coroutinesModule) {
        this.module = coroutinesModule;
    }

    public static CoroutinesModule_ProvidesDefaultDispatcherFactory create(CoroutinesModule coroutinesModule) {
        return new CoroutinesModule_ProvidesDefaultDispatcherFactory(coroutinesModule);
    }

    public static CoroutineDispatcher providesDefaultDispatcher(CoroutinesModule coroutinesModule) {
        CoroutineDispatcher providesDefaultDispatcher = coroutinesModule.providesDefaultDispatcher();
        C17782b.m29841G(providesDefaultDispatcher);
        return providesDefaultDispatcher;
    }

    public CoroutineDispatcher get() {
        return providesDefaultDispatcher(this.module);
    }
}
