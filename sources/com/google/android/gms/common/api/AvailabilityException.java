package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.compose.animation.C0391c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import p193o.C7494b;
import p193o.C7500h;

public class AvailabilityException extends Exception {
    private final C7494b<ApiKey<?>, ConnectionResult> zaa;

    public AvailabilityException(@RecentlyNonNull C7494b<ApiKey<?>, ConnectionResult> bVar) {
        this.zaa = bVar;
    }

    public ConnectionResult getConnectionResult(@RecentlyNonNull GoogleApi<? extends Api.ApiOptions> googleApi) {
        ApiKey<? extends Api.ApiOptions> apiKey = googleApi.getApiKey();
        boolean z = this.zaa.getOrDefault(apiKey, null) != null;
        String zaa2 = apiKey.zaa();
        StringBuilder sb = new StringBuilder(C0391c.m1055a(zaa2, 58));
        sb.append("The given API (");
        sb.append(zaa2);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull(this.zaa.getOrDefault(apiKey, null));
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C7500h.C7503c) this.zaa.keySet()).iterator();
        boolean z = true;
        while (it.hasNext()) {
            ApiKey apiKey = (ApiKey) it.next();
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull(this.zaa.getOrDefault(apiKey, null));
            if (connectionResult.isSuccess()) {
                z = false;
            }
            String zaa2 = apiKey.zaa();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(valueOf.length() + C0391c.m1055a(zaa2, 2));
            sb.append(zaa2);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    public ConnectionResult getConnectionResult(@RecentlyNonNull HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        boolean z = this.zaa.getOrDefault(apiKey, null) != null;
        String zaa2 = apiKey.zaa();
        StringBuilder sb = new StringBuilder(C0391c.m1055a(zaa2, 58));
        sb.append("The given API (");
        sb.append(zaa2);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull(this.zaa.getOrDefault(apiKey, null));
    }
}
