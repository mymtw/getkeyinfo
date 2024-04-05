package com.paypal.pyplcheckout.p539ab.elmo;

import dagger.internal.C17555d;
import okhttp3.C20009t;
import p740eq.C19011a;

/* renamed from: com.paypal.pyplcheckout.ab.elmo.ElmoApi_Factory */
public final class ElmoApi_Factory implements C17555d<ElmoApi> {
    private final C19011a<C20009t> okHttpClientProvider;

    public ElmoApi_Factory(C19011a<C20009t> aVar) {
        this.okHttpClientProvider = aVar;
    }

    public static ElmoApi_Factory create(C19011a<C20009t> aVar) {
        return new ElmoApi_Factory(aVar);
    }

    public static ElmoApi newInstance(C20009t tVar) {
        return new ElmoApi(tVar);
    }

    public ElmoApi get() {
        return newInstance(this.okHttpClientProvider.get());
    }
}
