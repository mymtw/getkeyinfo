package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C15681a;
import com.google.android.play.core.internal.zzu;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.assetpacks.k */
public final class C15618k extends C15681a {

    /* renamed from: c */
    public final /* synthetic */ int f35217c;

    /* renamed from: d */
    public final /* synthetic */ String f35218d;

    /* renamed from: e */
    public final /* synthetic */ String f35219e;

    /* renamed from: f */
    public final /* synthetic */ int f35220f;

    /* renamed from: g */
    public final /* synthetic */ C18614l f35221g;

    /* renamed from: h */
    public final /* synthetic */ C15662v f35222h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15618k(C15662v vVar, C18614l lVar, int i, String str, String str2, int i2, C18614l lVar2) {
        super(lVar);
        this.f35222h = vVar;
        this.f35217c = i;
        this.f35218d = str;
        this.f35219e = str2;
        this.f35220f = i2;
        this.f35221g = lVar2;
    }

    /* renamed from: a */
    public final void mo55347a() {
        try {
            C15662v vVar = this.f35222h;
            String str = vVar.f35361a;
            int i = this.f35217c;
            String str2 = this.f35218d;
            String str3 = this.f35219e;
            int i2 = this.f35220f;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            bundle.putString("module_name", str2);
            bundle.putString("slice_id", str3);
            bundle.putInt("chunk_number", i2);
            ((zzu) vVar.f35364d.f35474n).zzd(str, bundle, C15662v.m25468h(), new C15634o(this.f35222h, this.f35221g));
        } catch (RemoteException e) {
            C15662v.f35359g.mo52243c("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f35218d, this.f35219e, Integer.valueOf(this.f35220f), Integer.valueOf(this.f35217c));
            this.f35221g.mo70125a(new RuntimeException(e));
        }
    }
}
