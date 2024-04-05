package com.paypal.pyplcheckout.p543di;

import dagger.internal.C17555d;
import kotlin.coroutines.CoroutineContext;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.CoroutinesModule_ProvidesMainCoroutineContextChildFactory */
public final class CoroutinesModule_ProvidesMainCoroutineContextChildFactory implements C17555d<CoroutineContext> {
    private final CoroutinesModule module;

    public CoroutinesModule_ProvidesMainCoroutineContextChildFactory(CoroutinesModule coroutinesModule) {
        this.module = coroutinesModule;
    }

    public static CoroutinesModule_ProvidesMainCoroutineContextChildFactory create(CoroutinesModule coroutinesModule) {
        return new CoroutinesModule_ProvidesMainCoroutineContextChildFactory(coroutinesModule);
    }

    public static CoroutineContext providesMainCoroutineContextChild(CoroutinesModule coroutinesModule) {
        CoroutineContext providesMainCoroutineContextChild = coroutinesModule.providesMainCoroutineContextChild();
        C17782b.m29841G(providesMainCoroutineContextChild);
        return providesMainCoroutineContextChild;
    }

    public CoroutineContext get() {
        return providesMainCoroutineContextChild(this.module);
    }
}
