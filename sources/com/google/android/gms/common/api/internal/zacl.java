package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import p605kk.C18116a;
import p605kk.C18123g;

final class zacl implements C18116a<Boolean, Void> {
    public final /* synthetic */ Object then(C18123g gVar) throws Exception {
        if (((Boolean) gVar.mo69664k()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
