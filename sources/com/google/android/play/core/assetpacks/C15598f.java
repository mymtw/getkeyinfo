package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C15681a;
import com.google.android.play.core.internal.zzu;
import java.util.HashMap;
import java.util.Map;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.assetpacks.f */
public final class C15598f extends C15681a {

    /* renamed from: c */
    public final /* synthetic */ Map f35127c;

    /* renamed from: d */
    public final /* synthetic */ C18614l f35128d;

    /* renamed from: e */
    public final /* synthetic */ C15662v f35129e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15598f(C15662v vVar, C18614l lVar, HashMap hashMap, C18614l lVar2) {
        super(lVar);
        this.f35129e = vVar;
        this.f35127c = hashMap;
        this.f35128d = lVar2;
    }

    /* renamed from: a */
    public final void mo55347a() {
        try {
            C15662v vVar = this.f35129e;
            ((zzu) vVar.f35364d.f35474n).zze(vVar.f35361a, C15662v.m25470k(this.f35127c), new C15638p(this.f35129e, this.f35128d));
        } catch (RemoteException e) {
            C15662v.f35359g.mo52244d(e, "syncPacks", new Object[0]);
            this.f35128d.mo70125a(new RuntimeException(e));
        }
    }
}
