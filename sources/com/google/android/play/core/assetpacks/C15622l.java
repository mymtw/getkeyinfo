package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C15681a;
import com.google.android.play.core.internal.zzu;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.assetpacks.l */
public final class C15622l extends C15681a {

    /* renamed from: c */
    public final /* synthetic */ C18614l f35226c;

    /* renamed from: d */
    public final /* synthetic */ C15662v f35227d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15622l(C15662v vVar, C18614l lVar, C18614l lVar2) {
        super(lVar);
        this.f35227d = vVar;
        this.f35226c = lVar2;
    }

    /* renamed from: a */
    public final void mo55347a() {
        try {
            C15662v vVar = this.f35227d;
            ((zzu) vVar.f35365e.f35474n).zzf(vVar.f35361a, C15662v.m25468h(), new C15642q(this.f35227d, this.f35226c));
        } catch (RemoteException e) {
            C15662v.f35359g.mo52244d(e, "keepAlive", new Object[0]);
        }
    }
}
