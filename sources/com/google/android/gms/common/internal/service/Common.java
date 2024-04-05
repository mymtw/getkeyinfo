package com.google.android.gms.common.internal.service;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

public final class Common {
    @RecentlyNonNull
    @KeepForSdk
    public static final Api<Api.ApiOptions.NoOptions> API;
    @RecentlyNonNull
    @KeepForSdk
    public static final Api.ClientKey<zah> CLIENT_KEY;
    public static final zab zaa = new zae();
    private static final Api.AbstractClientBuilder<zah, Api.ApiOptions.NoOptions> zab;

    static {
        Api.ClientKey<zah> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        zac zac = new zac();
        zab = zac;
        API = new Api<>("Common.API", zac, clientKey);
    }
}
