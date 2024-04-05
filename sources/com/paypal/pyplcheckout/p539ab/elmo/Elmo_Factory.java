package com.paypal.pyplcheckout.p539ab.elmo;

import android.content.Context;
import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import p740eq.C19011a;

/* renamed from: com.paypal.pyplcheckout.ab.elmo.Elmo_Factory */
public final class Elmo_Factory implements C17555d<Elmo> {
    private final C19011a<Context> contextProvider;
    private final C19011a<CoroutineDispatcher> dispatcherProvider;
    private final C19011a<ElmoApi> elmoApiProvider;

    public Elmo_Factory(C19011a<Context> aVar, C19011a<ElmoApi> aVar2, C19011a<CoroutineDispatcher> aVar3) {
        this.contextProvider = aVar;
        this.elmoApiProvider = aVar2;
        this.dispatcherProvider = aVar3;
    }

    public static Elmo_Factory create(C19011a<Context> aVar, C19011a<ElmoApi> aVar2, C19011a<CoroutineDispatcher> aVar3) {
        return new Elmo_Factory(aVar, aVar2, aVar3);
    }

    public static Elmo newInstance(Context context, ElmoApi elmoApi, CoroutineDispatcher coroutineDispatcher) {
        return new Elmo(context, elmoApi, coroutineDispatcher);
    }

    public Elmo get() {
        return newInstance(this.contextProvider.get(), this.elmoApiProvider.get(), this.dispatcherProvider.get());
    }
}
