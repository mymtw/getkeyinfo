package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C15681a;
import com.google.android.play.core.internal.zzu;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.assetpacks.j */
public final class C15614j extends C15681a {

    /* renamed from: c */
    public final /* synthetic */ int f35196c;

    /* renamed from: d */
    public final /* synthetic */ C18614l f35197d;

    /* renamed from: e */
    public final /* synthetic */ C15662v f35198e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15614j(C15662v vVar, C18614l lVar, int i, C18614l lVar2) {
        super(lVar);
        this.f35198e = vVar;
        this.f35196c = i;
        this.f35197d = lVar2;
    }

    /* renamed from: a */
    public final void mo55347a() {
        try {
            C15662v vVar = this.f35198e;
            String str = vVar.f35361a;
            int i = this.f35196c;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            ((zzu) vVar.f35364d.f35474n).zzi(str, bundle, C15662v.m25468h(), new C15654t(this.f35198e, this.f35197d));
        } catch (RemoteException e) {
            C15662v.f35359g.mo52244d(e, "notifySessionFailed", new Object[0]);
        }
    }
}
