package com.google.android.gms.common.api.internal;

import p605kk.C18119c;
import p605kk.C18123g;
import p605kk.C18124h;

final class zaw implements C18119c {
    private final /* synthetic */ C18124h zaa;
    private final /* synthetic */ zav zab;

    public zaw(zav zav, C18124h hVar) {
        this.zab = zav;
        this.zaa = hVar;
    }

    public final void onComplete(C18123g gVar) {
        this.zab.zab.remove(this.zaa);
    }
}
