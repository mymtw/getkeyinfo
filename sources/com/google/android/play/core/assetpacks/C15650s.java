package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.assetpacks.s */
public final class C15650s extends C15626m {

    /* renamed from: c */
    public final int f35324c;

    /* renamed from: d */
    public final String f35325d;

    /* renamed from: e */
    public final int f35326e;

    /* renamed from: f */
    public final /* synthetic */ C15662v f35327f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15650s(C15662v vVar, C18614l lVar, int i, String str, int i2) {
        super(vVar, lVar);
        this.f35327f = vVar;
        this.f35324c = i;
        this.f35325d = str;
        this.f35326e = i2;
    }

    public final void zzd(Bundle bundle) {
        this.f35327f.f35364d.mo55524c(this.f35237a);
        int i = bundle.getInt("error_code");
        C15662v.f35359g.mo52243c("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f35326e;
        if (i2 > 0) {
            this.f35327f.mo55492j(this.f35324c, i2 - 1, this.f35325d);
        }
    }
}
