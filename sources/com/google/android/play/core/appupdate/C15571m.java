package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.internal.zzq;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.appupdate.m */
public class C15571m extends zzq {

    /* renamed from: a */
    public final C15032m3 f35045a;

    /* renamed from: b */
    public final C18614l f35046b;

    /* renamed from: c */
    public final /* synthetic */ C15574p f35047c;

    public C15571m(C15574p pVar, C15032m3 m3Var, C18614l lVar) {
        this.f35047c = pVar;
        this.f35045a = m3Var;
        this.f35046b = lVar;
    }

    public void zzb(Bundle bundle) throws RemoteException {
        this.f35047c.f35051a.mo55524c(this.f35046b);
        this.f35045a.mo52245e("onCompleteUpdate", new Object[0]);
    }

    public void zzc(Bundle bundle) throws RemoteException {
        this.f35047c.f35051a.mo55524c(this.f35046b);
        this.f35045a.mo52245e("onRequestInfo", new Object[0]);
    }
}
