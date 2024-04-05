package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C15681a;
import com.google.android.play.core.internal.zzu;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.assetpacks.i */
public final class C15610i extends C15681a {

    /* renamed from: c */
    public final /* synthetic */ int f35181c;

    /* renamed from: d */
    public final /* synthetic */ String f35182d;

    /* renamed from: e */
    public final /* synthetic */ C18614l f35183e;

    /* renamed from: f */
    public final /* synthetic */ int f35184f;

    /* renamed from: g */
    public final /* synthetic */ C15662v f35185g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15610i(C15662v vVar, C18614l lVar, int i, String str, C18614l lVar2, int i2) {
        super(lVar);
        this.f35185g = vVar;
        this.f35181c = i;
        this.f35182d = str;
        this.f35183e = lVar2;
        this.f35184f = i2;
    }

    /* renamed from: a */
    public final void mo55347a() {
        try {
            C15662v vVar = this.f35185g;
            String str = vVar.f35361a;
            int i = this.f35181c;
            String str2 = this.f35182d;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            bundle.putString("module_name", str2);
            ((zzu) vVar.f35364d.f35474n).zzh(str, bundle, C15662v.m25468h(), new C15650s(this.f35185g, this.f35183e, this.f35181c, this.f35182d, this.f35184f));
        } catch (RemoteException e) {
            C15662v.f35359g.mo52244d(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
