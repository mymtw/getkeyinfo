package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C15681a;
import com.google.android.play.core.internal.zzp;
import p614ll.C18199a;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.appupdate.l */
public final class C15570l extends C15681a {

    /* renamed from: c */
    public final /* synthetic */ C18614l f35042c;

    /* renamed from: d */
    public final /* synthetic */ String f35043d;

    /* renamed from: e */
    public final /* synthetic */ C15574p f35044e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15570l(C15574p pVar, C18614l lVar, C18614l lVar2, String str) {
        super(lVar);
        this.f35044e = pVar;
        this.f35042c = lVar2;
        this.f35043d = str;
    }

    /* renamed from: a */
    public final void mo55347a() {
        try {
            C15574p pVar = this.f35044e;
            String str = pVar.f35052b;
            Bundle bundle = new Bundle();
            bundle.putAll(C18199a.m30698a("app_update"));
            bundle.putInt("playcore.version.code", 11003);
            ((zzp) pVar.f35051a.f35474n).zzc(str, bundle, new C15572n(this.f35044e, this.f35042c));
        } catch (RemoteException e) {
            C15574p.f35049e.mo52244d(e, "completeUpdate(%s)", this.f35043d);
            this.f35042c.mo70125a(new RuntimeException(e));
        }
    }
}
