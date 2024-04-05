package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.assetpacks.q */
public final class C15642q extends C15626m {

    /* renamed from: c */
    public final /* synthetic */ C15662v f35284c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15642q(C15662v vVar, C18614l lVar) {
        super(vVar, lVar);
        this.f35284c = vVar;
    }

    public final void zzd(Bundle bundle) {
        this.f35284c.f35365e.mo55524c(this.f35237a);
        int i = bundle.getInt("error_code");
        C15662v.f35359g.mo52243c("onError(%d)", Integer.valueOf(i));
        this.f35237a.mo70125a(new AssetPackException(i));
    }

    public final void zzh(Bundle bundle, Bundle bundle2) {
        super.zzh(bundle, bundle2);
        if (!this.f35284c.f35366f.compareAndSet(true, false)) {
            C15662v.f35359g.mo52246f("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f35284c.zzf();
        }
    }
}
