package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiKey;

public interface HasApiKey<O extends Api.ApiOptions> {
    @RecentlyNonNull
    @KeepForSdk
    ApiKey<O> getApiKey();
}
