package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.play.core.internal.C15681a;
import com.google.android.play.core.internal.zzp;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.appupdate.k */
public final class C15569k extends C15681a {

    /* renamed from: c */
    public final /* synthetic */ String f35039c;

    /* renamed from: d */
    public final /* synthetic */ C18614l f35040d;

    /* renamed from: e */
    public final /* synthetic */ C15574p f35041e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15569k(C15574p pVar, C18614l lVar, C18614l lVar2, String str) {
        super(lVar);
        this.f35041e = pVar;
        this.f35039c = str;
        this.f35040d = lVar2;
    }

    /* renamed from: a */
    public final void mo55347a() {
        try {
            C15574p pVar = this.f35041e;
            ((zzp) pVar.f35051a.f35474n).zzd(pVar.f35052b, C15574p.m25229a(pVar, this.f35039c), new C15573o(this.f35041e, this.f35040d, this.f35039c));
        } catch (RemoteException e) {
            C15574p.f35049e.mo52244d(e, "requestUpdateInfo(%s)", this.f35039c);
            this.f35040d.mo70125a(new RuntimeException(e));
        }
    }
}
