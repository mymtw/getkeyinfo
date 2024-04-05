package com.paypal.pyplcheckout.fundingOptions.dao;

import android.content.Context;
import com.google.gson.C16708i;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class SharedPrefsFundingOptionsDao_Factory implements C17555d<SharedPrefsFundingOptionsDao> {
    private final C19011a<Context> contextProvider;
    private final C19011a<C16708i> gsonProvider;

    public SharedPrefsFundingOptionsDao_Factory(C19011a<Context> aVar, C19011a<C16708i> aVar2) {
        this.contextProvider = aVar;
        this.gsonProvider = aVar2;
    }

    public static SharedPrefsFundingOptionsDao_Factory create(C19011a<Context> aVar, C19011a<C16708i> aVar2) {
        return new SharedPrefsFundingOptionsDao_Factory(aVar, aVar2);
    }

    public static SharedPrefsFundingOptionsDao newInstance(Context context, C16708i iVar) {
        return new SharedPrefsFundingOptionsDao(context, iVar);
    }

    public SharedPrefsFundingOptionsDao get() {
        return newInstance(this.contextProvider.get(), this.gsonProvider.get());
    }
}
