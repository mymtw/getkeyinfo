package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.BiConsumer;
import p605kk.C18124h;

final /* synthetic */ class zack implements RemoteCall {
    private final BiConsumer zaa;

    public zack(BiConsumer biConsumer) {
        this.zaa = biConsumer;
    }

    public final void accept(Object obj, Object obj2) {
        this.zaa.accept((Api.AnyClient) obj, (C18124h) obj2);
    }
}
