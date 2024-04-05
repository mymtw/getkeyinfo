package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

public final class zaj {
    private final SparseIntArray zaa;
    private GoogleApiAvailabilityLight zab;

    public zaj() {
        this(GoogleApiAvailability.getInstance());
    }

    public final int zaa(Context context, Api.Client client) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        int i = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int zaa2 = zaa(context, minApkVersion);
        if (zaa2 != -1) {
            return zaa2;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.zaa.size()) {
                i = zaa2;
                break;
            }
            int keyAt = this.zaa.keyAt(i2);
            if (keyAt > minApkVersion && this.zaa.get(keyAt) == 0) {
                break;
            }
            i2++;
        }
        if (i == -1) {
            i = this.zab.isGooglePlayServicesAvailable(context, minApkVersion);
        }
        this.zaa.put(minApkVersion, i);
        return i;
    }

    public zaj(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zaa = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zab = googleApiAvailabilityLight;
    }

    public final int zaa(Context context, int i) {
        return this.zaa.get(i, -1);
    }

    public final void zaa() {
        this.zaa.clear();
    }
}
