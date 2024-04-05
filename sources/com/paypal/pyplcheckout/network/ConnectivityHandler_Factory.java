package com.paypal.pyplcheckout.network;

import android.content.Context;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.p543di.AndroidSDKVersionProvider;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class ConnectivityHandler_Factory implements C17555d<ConnectivityHandler> {
    private final C19011a<AndroidSDKVersionProvider> buildVersionProvider;
    private final C19011a<Context> contextProvider;
    private final C19011a<Events> eventsProvider;

    public ConnectivityHandler_Factory(C19011a<Context> aVar, C19011a<Events> aVar2, C19011a<AndroidSDKVersionProvider> aVar3) {
        this.contextProvider = aVar;
        this.eventsProvider = aVar2;
        this.buildVersionProvider = aVar3;
    }

    public static ConnectivityHandler_Factory create(C19011a<Context> aVar, C19011a<Events> aVar2, C19011a<AndroidSDKVersionProvider> aVar3) {
        return new ConnectivityHandler_Factory(aVar, aVar2, aVar3);
    }

    public static ConnectivityHandler newInstance(Context context, Events events, AndroidSDKVersionProvider androidSDKVersionProvider) {
        return new ConnectivityHandler(context, events, androidSDKVersionProvider);
    }

    public ConnectivityHandler get() {
        return newInstance(this.contextProvider.get(), this.eventsProvider.get(), this.buildVersionProvider.get());
    }
}
