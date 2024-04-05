package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import p506ak.C14019e;
import p703wj.C18700c;
import p703wj.C18708k;
import p703wj.C18715r;

public class LocationServices {

    /* renamed from: a */
    public static final Api<Api.ApiOptions.NoOptions> f33200a = new Api<>("LocationServices.API", new C14019e(), new Api.ClientKey());
    @Deprecated

    /* renamed from: b */
    public static final C18715r f33201b = new C18715r();
    @Deprecated

    /* renamed from: c */
    public static final C18700c f33202c = new C18700c();

    /* renamed from: com.google.android.gms.location.LocationServices$a */
    public static abstract class C14897a<R extends Result> extends BaseImplementation.ApiMethodImpl<R, C18708k> {
        public C14897a(GoogleApiClient googleApiClient) {
            super((Api<?>) LocationServices.f33200a, googleApiClient);
        }
    }

    private LocationServices() {
    }
}
