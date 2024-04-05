package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C15681a;
import com.google.android.play.core.internal.zzu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.assetpacks.g */
public final class C15602g extends C15681a {

    /* renamed from: c */
    public final /* synthetic */ List f35142c;

    /* renamed from: d */
    public final /* synthetic */ Map f35143d;

    /* renamed from: e */
    public final /* synthetic */ C18614l f35144e;

    /* renamed from: f */
    public final /* synthetic */ C15579a0 f35145f;

    /* renamed from: g */
    public final /* synthetic */ C15662v f35146g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15602g(C15662v vVar, C18614l lVar, List list, HashMap hashMap, C18614l lVar2, C15676y1 y1Var) {
        super(lVar);
        this.f35146g = vVar;
        this.f35142c = list;
        this.f35143d = hashMap;
        this.f35144e = lVar2;
        this.f35145f = y1Var;
    }

    /* renamed from: a */
    public final void mo55347a() {
        ArrayList l = C15662v.m25471l(this.f35142c);
        try {
            C15662v vVar = this.f35146g;
            String str = vVar.f35361a;
            Bundle k = C15662v.m25470k(this.f35143d);
            C15662v vVar2 = this.f35146g;
            ((zzu) vVar.f35364d.f35474n).zzk(str, l, k, new C15658u(vVar2, this.f35144e, vVar2.f35362b, vVar2.f35363c, this.f35145f));
        } catch (RemoteException e) {
            C15662v.f35359g.mo52244d(e, "getPackStates(%s)", this.f35142c);
            this.f35144e.mo70125a(new RuntimeException(e));
        }
    }
}
