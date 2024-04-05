package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import p605kk.C18124h;

final /* synthetic */ class zaca implements RemoteCall {
    private final RegistrationMethods.Builder zaa;

    public zaca(RegistrationMethods.Builder builder) {
        this.zaa = builder;
    }

    public final void accept(Object obj, Object obj2) {
        this.zaa.zaa((Api.AnyClient) obj, (C18124h) obj2);
    }
}
