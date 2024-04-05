package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C15681a;
import com.google.android.play.core.internal.zzu;
import java.util.ArrayList;
import java.util.List;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.assetpacks.e */
public final class C15594e extends C15681a {

    /* renamed from: c */
    public final /* synthetic */ List f35117c;

    /* renamed from: d */
    public final /* synthetic */ C18614l f35118d;

    /* renamed from: e */
    public final /* synthetic */ C15662v f35119e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15594e(C15662v vVar, C18614l lVar, List list, C18614l lVar2) {
        super(lVar);
        this.f35119e = vVar;
        this.f35117c = list;
        this.f35118d = lVar2;
    }

    /* renamed from: a */
    public final void mo55347a() {
        ArrayList l = C15662v.m25471l(this.f35117c);
        try {
            C15662v vVar = this.f35119e;
            ((zzu) vVar.f35364d.f35474n).zzc(vVar.f35361a, l, C15662v.m25468h(), new C15630n(this.f35119e, this.f35118d));
        } catch (RemoteException e) {
            C15662v.f35359g.mo52244d(e, "cancelDownloads(%s)", this.f35117c);
        }
    }
}
