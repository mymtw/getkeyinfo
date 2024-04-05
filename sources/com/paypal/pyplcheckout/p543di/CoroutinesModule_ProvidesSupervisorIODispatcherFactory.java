package com.paypal.pyplcheckout.p543di;

import dagger.internal.C17555d;
import kotlinx.coroutines.C19525d0;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.CoroutinesModule_ProvidesSupervisorIODispatcherFactory */
public final class CoroutinesModule_ProvidesSupervisorIODispatcherFactory implements C17555d<C19525d0> {
    private final CoroutinesModule module;

    public CoroutinesModule_ProvidesSupervisorIODispatcherFactory(CoroutinesModule coroutinesModule) {
        this.module = coroutinesModule;
    }

    public static CoroutinesModule_ProvidesSupervisorIODispatcherFactory create(CoroutinesModule coroutinesModule) {
        return new CoroutinesModule_ProvidesSupervisorIODispatcherFactory(coroutinesModule);
    }

    public static C19525d0 providesSupervisorIODispatcher(CoroutinesModule coroutinesModule) {
        C19525d0 providesSupervisorIODispatcher = coroutinesModule.providesSupervisorIODispatcher();
        C17782b.m29841G(providesSupervisorIODispatcher);
        return providesSupervisorIODispatcher;
    }

    public C19525d0 get() {
        return providesSupervisorIODispatcher(this.module);
    }
}
