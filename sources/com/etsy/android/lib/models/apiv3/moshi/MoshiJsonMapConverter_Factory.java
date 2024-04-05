package com.etsy.android.lib.models.apiv3.moshi;

import com.squareup.moshi.C17414y;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class MoshiJsonMapConverter_Factory implements C17555d<MoshiJsonMapConverter> {
    private final C19011a<C17414y> moshiProvider;

    public MoshiJsonMapConverter_Factory(C19011a<C17414y> aVar) {
        this.moshiProvider = aVar;
    }

    public static MoshiJsonMapConverter_Factory create(C19011a<C17414y> aVar) {
        return new MoshiJsonMapConverter_Factory(aVar);
    }

    public static MoshiJsonMapConverter newInstance(C17414y yVar) {
        return new MoshiJsonMapConverter(yVar);
    }

    public MoshiJsonMapConverter get() {
        return newInstance(this.moshiProvider.get());
    }
}
