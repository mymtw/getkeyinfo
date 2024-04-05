package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import java.util.Map;
import java.util.Set;
import p193o.C7494b;
import p193o.C7500h;
import p605kk.C18123g;
import p605kk.C18124h;

public final class zaj {
    private final C7494b<ApiKey<?>, ConnectionResult> zaa = new C7494b<>();
    private final C7494b<ApiKey<?>, String> zab = new C7494b<>();
    private final C18124h<Map<ApiKey<?>, String>> zac = new C18124h<>();
    private int zad;
    private boolean zae = false;

    public zaj(Iterable<? extends HasApiKey<?>> iterable) {
        for (HasApiKey apiKey : iterable) {
            this.zaa.put(apiKey.getApiKey(), null);
        }
        this.zad = ((C7500h.C7503c) this.zaa.keySet()).size();
    }

    public final Set<ApiKey<?>> zaa() {
        return this.zaa.keySet();
    }

    public final C18123g<Map<ApiKey<?>, String>> zab() {
        return this.zac.f39566a;
    }

    public final void zaa(ApiKey<?> apiKey, ConnectionResult connectionResult, String str) {
        this.zaa.put(apiKey, connectionResult);
        this.zab.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad != 0) {
            return;
        }
        if (this.zae) {
            this.zac.mo69677a(new AvailabilityException(this.zaa));
            return;
        }
        this.zac.mo69678b(this.zab);
    }
}
