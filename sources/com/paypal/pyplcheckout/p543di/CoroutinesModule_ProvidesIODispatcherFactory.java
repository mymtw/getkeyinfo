package com.paypal.pyplcheckout.p543di;

import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.CoroutinesModule_ProvidesIODispatcherFactory */
public final class CoroutinesModule_ProvidesIODispatcherFactory implements C17555d<CoroutineDispatcher> {
    private final CoroutinesModule module;

    public CoroutinesModule_ProvidesIODispatcherFactory(CoroutinesModule coroutinesModule) {
        this.module = coroutinesModule;
    }

    public static CoroutinesModule_ProvidesIODispatcherFactory create(CoroutinesModule coroutinesModule) {
        return new CoroutinesModule_ProvidesIODispatcherFactory(coroutinesModule);
    }

    public static CoroutineDispatcher providesIODispatcher(CoroutinesModule coroutinesModule) {
        CoroutineDispatcher providesIODispatcher = coroutinesModule.providesIODispatcher();
        C17782b.m29841G(providesIODispatcher);
        return providesIODispatcher;
    }

    public CoroutineDispatcher get() {
        return providesIODispatcher(this.module);
    }
}
