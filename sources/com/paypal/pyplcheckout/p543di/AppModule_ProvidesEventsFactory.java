package com.paypal.pyplcheckout.p543di;

import com.paypal.pyplcheckout.events.Events;
import dagger.internal.C17555d;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.AppModule_ProvidesEventsFactory */
public final class AppModule_ProvidesEventsFactory implements C17555d<Events> {
    private final AppModule module;

    public AppModule_ProvidesEventsFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvidesEventsFactory create(AppModule appModule) {
        return new AppModule_ProvidesEventsFactory(appModule);
    }

    public static Events providesEvents(AppModule appModule) {
        Events providesEvents = appModule.providesEvents();
        C17782b.m29841G(providesEvents);
        return providesEvents;
    }

    public Events get() {
        return providesEvents(this.module);
    }
}
