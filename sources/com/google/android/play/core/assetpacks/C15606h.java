package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C15681a;
import com.google.android.play.core.internal.zzu;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.assetpacks.h */
public final class C15606h extends C15681a {

    /* renamed from: c */
    public final /* synthetic */ int f35161c;

    /* renamed from: d */
    public final /* synthetic */ String f35162d;

    /* renamed from: e */
    public final /* synthetic */ String f35163e;

    /* renamed from: f */
    public final /* synthetic */ int f35164f;

    /* renamed from: g */
    public final /* synthetic */ C18614l f35165g;

    /* renamed from: h */
    public final /* synthetic */ C15662v f35166h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15606h(C15662v vVar, C18614l lVar, int i, String str, String str2, int i2, C18614l lVar2) {
        super(lVar);
        this.f35166h = vVar;
        this.f35161c = i;
        this.f35162d = str;
        this.f35163e = str2;
        this.f35164f = i2;
        this.f35165g = lVar2;
    }

    /* renamed from: a */
    public final void mo55347a() {
        try {
            C15662v vVar = this.f35166h;
            String str = vVar.f35361a;
            int i = this.f35161c;
            String str2 = this.f35162d;
            String str3 = this.f35163e;
            int i2 = this.f35164f;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            bundle.putString("module_name", str2);
            bundle.putString("slice_id", str3);
            bundle.putInt("chunk_number", i2);
            ((zzu) vVar.f35364d.f35474n).zzg(str, bundle, C15662v.m25468h(), new C15646r(this.f35166h, this.f35165g));
        } catch (RemoteException e) {
            C15662v.f35359g.mo52244d(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
